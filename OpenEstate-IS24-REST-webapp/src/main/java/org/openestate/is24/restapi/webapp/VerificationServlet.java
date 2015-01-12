/*
 * Copyright 2014-2015 OpenEstate.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openestate.is24.restapi.webapp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.utils.Authorization;
import org.openestate.is24.restapi.utils.SslUtils;
import org.openestate.is24.restapi.utils.Verification;

/**
 * A servlet for verification at the REST-Webservice of ImmobilienScout24.de.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class VerificationServlet extends HttpServlet
{
  /**
   * A mapping that holds currently started verifications in memory.
   * <p>
   * By default the created verification credentials are stored in memory. You
   * should replace this method in productive systems - e.g. with a database
   * backend.
   */
  private final VerificationMap verifications = new VerificationMap();

  /**
   * Holds the webservice URL, that is configured in 'web.xml'.
   */
  private String webserviceUrl = null;

  /**
   * Holds the consumer key, that is configured in 'web.xml'.
   */
  private String consumerKey = null;

  /**
   * Holds the consumer secret, that is configured in 'web.xml'.
   */
  private String consumerSecret = null;

  /**
   * A GET request was received for this servlet.
   * <p>
   * The functions decides according to the request parameters, if a
   * verification is requested or if the response of a verification is
   * processed.
   *
   * @param req incoming GET request
   * @param resp outgoing response
   * @throws IOException
   * @throws ServletException
   */
  @Override
  protected void doGet( HttpServletRequest req, HttpServletResponse resp ) throws IOException, ServletException
  {
    String state = StringUtils.trimToNull( req.getParameter( "state" ) );
    String token = StringUtils.trimToNull( req.getParameter( "oauth_token" ) );
    String verifier = StringUtils.trimToNull( req.getParameter( "oauth_verifier" ) );
    if (state==null && token==null && verifier==null)
    {
      doVerificationRequest( req, resp );
    }
    else
    {
      doVerificationResponse( state, token, verifier, req, resp );
    }
  }

  /**
   * Create a verification request and show a page with the verification link.
   *
   * @param req incoming GET request
   * @param resp outgoing response
   * @throws IOException
   * @throws ServletException
   */
  protected void doVerificationRequest( HttpServletRequest req, HttpServletResponse resp ) throws IOException, ServletException
  {
    Verification verification = null;
    try
    {
      verification = this.getWebserviceVerification( req );
    }
    catch (OAuthException ex)
    {
      throw new IOExceptionWithCause( "Can't fetch verification!", ex );
    }

    // store verification informations
    this.storeVerification( verification );

    // put verification informations into request attributes
    req.setAttribute( "url", verification.verificationUrl );
    req.setAttribute( "token", verification.requestToken );
    req.setAttribute( "secret", verification.requestTokenSecret );

    // show JSP view
    resp.setCharacterEncoding( "UTF-8" );
    RequestDispatcher d = req.getRequestDispatcher( "/WEB-INF/views/verification-request.jsp" );
    d.include( req, resp );
  }

  /**
   * Creates access credentials after the verification was passed.
   * <p>
   * The generated access token and secret is shown to the user by default.
   *
   * @param state the state of verification, that was received as request
   *        parameter by the webservice
   *
   * @param token the verification token, that was received as request parameter
   *        by the webservice
   *
   * @param verifier the verification code, that was received as request
   *        parameter by the webservice
   *
   * @param req incoming GET request
   * @param resp outgoing response
   * @throws IOException
   * @throws ServletException
   */
  protected void doVerificationResponse( String state, String token, String verifier, HttpServletRequest req, HttpServletResponse resp ) throws IOException, ServletException
  {
    try
    {
      if (!"authorized".equalsIgnoreCase( state ))
      {
        req.setAttribute( "authorized", false );
      }
      else
      {
        req.setAttribute( "authorized", true );

        String secret = this.fetchVerificationSecret( token );
        if (token==null || secret==null)
        {
          req.setAttribute( "valid", false );
        }
        else
        {
          Authorization authorization = null;
          try
          {
            authorization = getWebserviceAuthorization( token, secret, verifier, req );
          }
          catch (OAuthException ex)
          {
            throw new IOExceptionWithCause( "Can't fetch authorization!", ex );
          }
          req.setAttribute( "valid", true );
          req.setAttribute( "token", authorization.accessToken );
          req.setAttribute( "secret", authorization.accessTokenSecret );
        }
      }

      // show JSP view
      resp.setCharacterEncoding( "UTF-8" );
      RequestDispatcher dispatcher = req.getRequestDispatcher( "/WEB-INF/views/verification-response.jsp" );
      dispatcher.include( req, resp );
    }
    finally
    {
      this.removeVerificationSecret( token );
    }
  }

  /**
   * Returns the secret for a previously created verification token.
   * <p>
   * By default the created verification credentials are stored in memory. You
   * should replace this method in productive systems - e.g. with a database
   * backend.
   *
   * @param token verification token
   * @return verification secret
   */
  protected String fetchVerificationSecret( String token )
  {
    // keep verification secret from local memory
    return this.verifications.get( token );
  }

  /**
   * Create a client for communication with the IS24-Webservice.
   *
   * @return client
   */
  protected AbstractClient getClient()
  {
    return new DefaultClient( this.webserviceUrl, this.consumerKey, this.consumerSecret );
  }

  /**
   * Generates credentials for permanent authoriation at the IS24-Webservice.
   *
   * @param token verification token
   * @param secret verification secret
   * @param verifier verification code
   * @param req incoming GET request
   * @return credentials for authorization
   * @throws OAuthException
   */
  protected Authorization getWebserviceAuthorization( String token, String secret, String verifier, HttpServletRequest req ) throws OAuthException
  {
    final AbstractClient client = this.getClient();
    return client.authorizeAfterVerification( token, secret, verifier );
  }

  /**
   * Generates credentials for a verification process at the IS24-Webservice.
   *
   * @param req incoming GET request
   * @return credentials for verification
   * @throws OAuthException
   */
  protected Verification getWebserviceVerification( HttpServletRequest req ) throws OAuthException
  {
    final AbstractClient client = this.getClient();
    return client.fetchVerification( req.getRequestURL().toString() );
  }

  /**
   * Servlet is initialized by the servlet engine.
   *
   * @throws ServletException
   */
  @Override
  public void init() throws ServletException
  {
    super.init();
    final ServletContext context = this.getServletContext();
    List<String> errors = new ArrayList<String>();

    this.webserviceUrl = StringUtils.trimToNull( context.getInitParameter( "WebserviceUrl" ) );
    if (this.webserviceUrl==null)
    {
      errors.add( "No 'WebserviceUrl' is configured." );
    }

    this.consumerKey = StringUtils.trimToNull( context.getInitParameter( "ConsumerKey" ) );
    if (this.consumerKey==null)
    {
      errors.add( "No 'ConsumerKey' is configured." );
    }

    this.consumerSecret = StringUtils.trimToNull( context.getInitParameter( "ConsumerSecret" ) );
    if (this.consumerSecret==null)
    {
      errors.add( "No 'ConsumerSecret' is configured." );
    }

    if (!errors.isEmpty())
    {
      throw new ServletException( "Can't init servlet: " + StringUtils.join( errors, ", " ) );
    }

    // trust all SSL certificates / disable host name verification
    String trustAllCertificates = StringUtils.trimToNull( context.getInitParameter( "TrustAllCertificates" ) );
    if ("1".equals( trustAllCertificates ) || "true".equalsIgnoreCase( trustAllCertificates ))
    {
      try
      {
        // install all-trusting trust manager
        SslUtils.disableCertificateChecks();

        // install all-trusting host verifier
        SslUtils.disableHostnameVerification();
      }
      catch (Exception ex)
      {
        throw new ServletException( "Can't setup insecure SSL context!", ex );
      }
    }
  }

  /**
   * Remove a previously created verification token from the local store.
   * <p>
   * By default the created verification credentials are stored in memory. You
   * should replace this method in productive systems - e.g. with a database
   * backend.
   *
   * @param token verification token
   */
  protected void removeVerificationSecret( String token )
  {
    // remove verification secret from local memory
    this.verifications.remove( token );
  }

  /**
   * Store newly created verification credentials to the local store.
   * <p>
   * By default the created verification credentials are stored in memory. You
   * should replace this method in productive systems - e.g. with a database
   * backend.
   *
   * @param verification verification credentials
   */
  protected void storeVerification( Verification verification )
  {
    // keep verification informations in local memory
    this.verifications.put( verification );
  }

  /**
   * A local store, that holds the last 50 created verification credentials.
   * <p>
   * By default the created verification credentials are stored in memory. You
   * should replace this method in productive systems - e.g. with a database
   * backend.
   */
  private final static class VerificationMap extends LinkedHashMap<String, String>
  {
    private static final int MAX_ENTRIES = 50;

    public void put( Verification verification )
    {
      this.put( verification.requestToken, verification.requestTokenSecret );
    }

    @Override
    protected boolean removeEldestEntry( Map.Entry<String, String> eldest )
    {
      return this.size() > MAX_ENTRIES;
    }
  }
}