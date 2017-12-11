/*
 * Copyright 2014-2017 OpenEstate.org.
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
package org.openestate.is24.restapi.hc42;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An implementation of {@link AbstractClient}, that makes use of
 * <a href="http://hc.apache.org/httpcomponents-client-4.2.x/">Apache HttpComponents 4.2</a>
 * for HTTP transfers.
 *
 * @since 0.1
 * @see <a href="http://hc.apache.org/httpcomponents-client-4.2.x/">Apache HttpComponents 4.2</a>
 * @author Andreas Rudolph
 */
public class HttpComponents42Client extends AbstractClient
{
  private final static Logger LOGGER = LoggerFactory.getLogger( HttpComponents42Client.class );
  private transient HttpClient httpClient = null;

  /**
   * Creates an instance of {@link HttpComponents42Client}.
   *
   * @param apiBaseUrl
   * base URL of the IS24-Webservice (see {@link AbstractClient#LIVE_API} and
   * {@link AbstractClient#SANDBOX_API})
   *
   * @param consumerToken
   * consumer token, that identifies the application at the IS24-Webservice
   *
   * @param consumerSecret
   * consumer secret, that identifies the application at the IS24-Webservice
   */
  public HttpComponents42Client( String apiBaseUrl, String consumerToken, String consumerSecret )
  {
    this( apiBaseUrl, consumerToken, consumerSecret, null );
  }

  /**
   * Creates an instance of {@link HttpComponents42Client}.
   *
   * @param apiBaseUrl
   * base URL of the IS24-Webservice (see {@link AbstractClient#LIVE_API} and
   * {@link AbstractClient#SANDBOX_API})
   *
   * @param consumerToken
   * consumer token, that identifies the application at the IS24-Webservice
   *
   * @param consumerSecret
   * consumer secret, that identifies the application at the IS24-Webservice
   *
   * @param httpClient
   * {@link HttpClient}, that is used for HTTP transfers
   */
  public HttpComponents42Client( String apiBaseUrl, String consumerToken, String consumerSecret, HttpClient httpClient )
  {
    super( apiBaseUrl, consumerToken, consumerSecret );
    this.httpClient = httpClient;
  }

  @Override
  protected OAuthConsumer buildOAuthConsumer( String apiAccessKey, String apiAccessSecret )
  {
    return new CommonsHttpOAuthConsumer( apiAccessKey, apiAccessSecret );
  }

  @Override
  protected OAuthProvider buildOAuthProvider( String apiBaseUrl )
  {
    if (httpClient==null) setDefaultHttpClient();
    return new CommonsHttpOAuthProvider(
      apiBaseUrl + "/security/oauth/request_token",
      apiBaseUrl + "/security/oauth/access_token",
      apiBaseUrl + "/security/oauth/confirm_access",
      httpClient );
  }

  @Override
  public void close() throws IOException
  {
    super.close();
    if (this.httpClient instanceof Closeable)
    {
      ((Closeable) httpClient).close();
    }
  }

  /**
   * Retrieves a {@link Response} from a {@link HttpResponse}.
   *
   * @param response
   * {@link HttpResponse}, that was received by the client
   *
   * @return
   * {@link Response} of the request
   *
   * @throws IOException
   * if the {@link Response} can't be obtained
   */
  protected Response createResponse( HttpResponse response ) throws IOException
  {
    HttpEntity responseEntity = null;
    try
    {
      StatusLine responseStatus = response.getStatusLine();
      responseEntity = response.getEntity();

      // get charset of the response
      String contentTypeHeader = (responseEntity.getContentType()!=null)?
        StringUtils.trimToNull( responseEntity.getContentType().getValue() ): null;
      ContentType contentType = (contentTypeHeader!=null)?
        ContentType.parse( contentTypeHeader ): null;
      String charset = (contentType!=null && contentType.getCharset()!=null)?
        contentType.getCharset().name(): null;
      if (charset==null) charset = getEncoding();

      // get encoding of the response
      String encoding = (responseEntity.getContentEncoding()!=null)?
        responseEntity.getContentEncoding().getValue(): null;

      // get L-IS24-RequestRefnum header of the response
      Header requestRefNum = response.getFirstHeader( RESPONSE_HEADER_REQUEST_REFNUM );

      // read response body and possibly decompress response body from gzip
      try (InputStream responseInput = ("gzip".equalsIgnoreCase( encoding ))?
        new GZIPInputStream( new BufferedInputStream( responseEntity.getContent() ) ):
        new BufferedInputStream( responseEntity.getContent() ) )
      {
        // create response
        return new Response(
          responseStatus.getStatusCode(),
          responseStatus.getReasonPhrase(),
          (requestRefNum!=null)? requestRefNum.getValue(): null,
          IOUtils.toString( responseInput, charset ) );
      }
    }
    finally
    {
      EntityUtils.consume( responseEntity );
    }
  }

  @Override
  protected Response sendJsonRequest( URL url, RequestMethod method, String json ) throws IOException, OAuthException
  {
    return _sendRequest( url, method, json, JSON_CONTENT_TYPE );
  }

  @Override
  protected Response sendXmlRequest( URL url, RequestMethod method, String xml ) throws IOException, OAuthException
  {
    return _sendRequest( url, method, xml, XML_CONTENT_TYPE );
  }

  @Override
  protected Response sendXmlAttachmentRequest( URL url, RequestMethod method, String xml, InputStream input, String fileName, String mimeType ) throws IOException, OAuthException
  {
    if (method==null) method = RequestMethod.POST;
    if (!RequestMethod.POST.equals( method ) && !RequestMethod.PUT.equals( method ))
      throw new IllegalArgumentException( "Invalid request method!" );
    xml = (RequestMethod.POST.equals( method ) || RequestMethod.PUT.equals( method ))?
      StringUtils.trimToNull( xml ): null;

    HttpUriRequest request = null;
    if (RequestMethod.POST.equals( method ))
    {
      request = new HttpPost( url.toString() );
    }
    else if (RequestMethod.PUT.equals( method ))
    {
      request = new HttpPut( url.toString() );
    }
    else
    {
      throw new IOException( "Unsupported request method '" + method + "'!" );
    }

    MultipartEntity requestMultipartEntity = new MultipartEntity();
    request.addHeader( requestMultipartEntity.getContentType() );
    request.setHeader( "Content-Language", "en-US" );
    request.setHeader( "Accept", "application/xml" );

    // add xml part to the multipart entity
    if (xml!=null)
    {
      //StringBody xmlPart = new StringBody(
      //  xml, "application/xml; name=body.xml", Charset.forName( getEncoding() ) );
      InputStreamBody xmlPart = new InputStreamBody(
        new ByteArrayInputStream( xml.getBytes( getEncoding() ) ), "application/xml", "body.xml" );
      requestMultipartEntity.addPart( "metadata", xmlPart );
    }

    // add file part to the multipart entity
    if (input!=null)
    {
      mimeType = StringUtils.trimToNull( mimeType );
      if (mimeType==null) mimeType = "application/octet-stream";

      fileName = StringUtils.trimToNull( fileName );
      if (fileName==null) fileName = "upload.bin";

      InputStreamBody filePart = new InputStreamBody(
        input, mimeType, fileName );
      requestMultipartEntity.addPart( "attachment", filePart );
    }

    // add multipart entity to the request
    ((HttpEntityEnclosingRequest) request).setEntity( requestMultipartEntity );

    // sign request
    getAuthConsumer().sign( request );

    // send request
    HttpResponse response = httpClient.execute( request );

    // create response
    return createResponse( response );
  }

  @Override
  protected Response sendVideoUploadRequest( URL url, RequestMethod method, String auth, InputStream input, String fileName, final long fileSize ) throws IOException, OAuthException
  {
    if (method==null) method = RequestMethod.POST;
    if (!RequestMethod.POST.equals( method ) && !RequestMethod.PUT.equals( method ))
      throw new IllegalArgumentException( "Invalid request method!" );

    HttpUriRequest request = null;
    if (RequestMethod.POST.equals( method ))
    {
      request = new HttpPost( url.toString() );
    }
    else if (RequestMethod.PUT.equals( method ))
    {
      request = new HttpPut( url.toString() );
    }
    else
    {
      throw new IOException( "Unsupported request method '" + method + "'!" );
    }

    MultipartEntity requestMultipartEntity = new MultipartEntity();
    request.setHeader( "MIME-Version", "1.0" );
    request.addHeader( requestMultipartEntity.getContentType() );
    request.setHeader( "Content-Language", "en-US" );
    request.setHeader( "Accept-Charset", "UTF-8" );
    request.setHeader( "Accept-Encoding", "gzip,deflate" );
    request.setHeader( "Connection", "close" );

    // add auth part to the multipart entity
    auth = StringUtils.trimToNull( auth );
    if (auth!=null)
    {
      StringBody authPart = new StringBody(
        auth, Charset.forName( getEncoding() ) );
      requestMultipartEntity.addPart( "auth", authPart );
    }

    // add file part to the multipart entity
    if (input!=null)
    {
      fileName = StringUtils.trimToNull( fileName );
      if (fileName==null) fileName = "upload.bin";
      //InputStreamBody filePart = new InputStreamBody( input, fileName );
      InputStreamBody filePart = new InputStreamBodyWithLength(
        input, fileName, fileSize );
      requestMultipartEntity.addPart( "videofile", filePart );
    }

    // add multipart entity to the request
    ((HttpEntityEnclosingRequest) request).setEntity( requestMultipartEntity );

    // sign request
    //getAuthConsumer().sign( request );

    // send request
    HttpResponse response = httpClient.execute( request );

    // create response
    return createResponse( response );
  }

  private Response _sendRequest( URL url, RequestMethod method, String content, String contentType ) throws IOException, OAuthException
  {
    if (httpClient==null) throw new IOException( "No HTTP client was specified!" );

    if (method==null) method = RequestMethod.GET;
    content = (RequestMethod.POST.equals( method ) || RequestMethod.PUT.equals( method ))?
      StringUtils.trimToNull( content ): null;

    HttpUriRequest request = null;
    if (RequestMethod.GET.equals( method ))
    {
      request = new HttpGet( url.toString() );
    }
    else if (RequestMethod.POST.equals( method ))
    {
      request = new HttpPost( url.toString() );
    }
    else if (RequestMethod.PUT.equals( method ))
    {
      request = new HttpPut( url.toString() );
    }
    else if (RequestMethod.DELETE.equals( method ))
    {
      request = new HttpDelete( url.toString() );
    }
    else
    {
      throw new IOException( "Unsupported request method '" + method + "'!" );
    }

    if (content!=null && request instanceof HttpEntityEnclosingRequest)
    {
      ContentType type = ContentType.create( contentType, getEncoding() );

      request.setHeader( "Content-Type", type.toString() );
      request.setHeader( "Content-Language", "en-US" );

      StringEntity xmlEntity = new StringEntity( content, type );
      ((HttpEntityEnclosingRequest) request).setEntity( xmlEntity );
    }
    request.setHeader( "Accept", contentType );

    // sign request
    getAuthConsumer().sign( request );

    // send request
    HttpResponse response = httpClient.execute( request );

    // create response
    return createResponse( response );
  }

  /**
   * Use a default {@link HttpClient} for HTTP traffic.
   */
  public void setDefaultHttpClient()
  {
    setDefaultHttpClient( 30000 );
  }

  /**
   * Use a default {@link HttpClient} for HTTP traffic.
   *
   * @param timeout
   * timeout for HTTP communication (in milliseconds)
   */
  public void setDefaultHttpClient( int timeout )
  {
    if (timeout<0) timeout = 0;
    HttpParams params = new BasicHttpParams();
    HttpProtocolParams.setVersion( params, HttpVersion.HTTP_1_1 );
    HttpProtocolParams.setContentCharset( params, getEncoding() );
    HttpProtocolParams.setUseExpectContinue( params, true );
    HttpConnectionParams.setConnectionTimeout( params, timeout );
    HttpConnectionParams.setSoTimeout( params, timeout );

    // Register the "http" and "https" protocol schemes, they are
    // required by the default operator to look up socket factories.
    //SchemeRegistry supportedSchemes = new SchemeRegistry();
    //supportedSchemes.register( new Scheme( "http", PlainSocketFactory.getSocketFactory(), 80 ) );
    //supportedSchemes.register( new Scheme( "https", SSLSocketFactory.getSocketFactory(), 443 ) );

    // create http-client
    //setHttpClient( new DefaultHttpClient( new ThreadSafeClientConnManager( params, supportedSchemes ), params ) );
    setHttpClient( new DefaultHttpClient( params ) );
  }

  /**
   * Use a specific {@link HttpClient} for HTTP traffic.
   *
   * @param httpClient
   * {@link HttpClient}, that is used for HTTP communication
   */
  public synchronized void setHttpClient( HttpClient httpClient )
  {
    this.httpClient = httpClient;

    // register HTTP client in the OAuth provider
    try
    {
      OAuthProvider p = getAuthProvider();
      if (p instanceof CommonsHttpOAuthProvider)
      {
        ((CommonsHttpOAuthProvider) p).setHttpClient( httpClient );
      }
    }
    catch (OAuthNotAuthorizedException ex)
    {
    }
  }
}