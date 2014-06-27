/*
 * Copyright 2014 OpenEstate.org.
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

package org.openestate.is24.restapi.hc43;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class HttpComponents43Client extends AbstractClient
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( HttpComponents43Client.class );
  private transient HttpClient httpClient = null;

  public HttpComponents43Client( String apiBaseUrl, String apiAccessKey, String apiAccessSecret )
  {
    this( apiBaseUrl, apiAccessKey, apiAccessSecret, null );
  }

  public HttpComponents43Client( String apiBaseUrl, String apiAccessKey, String apiAccessSecret, HttpClient httpClient )
  {
    super( apiBaseUrl, apiAccessKey, apiAccessSecret );
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

  protected Response createResponse( HttpResponse response ) throws IOException
  {
    HttpEntity responseEntity = null;
    InputStream responseInput = null;
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

      // read response into string
      responseInput = new BufferedInputStream( responseEntity.getContent() );

      // possibly decompress string from gzip
      String encoding = (responseEntity.getContentEncoding()!=null)?
        responseEntity.getContentEncoding().getValue(): null;
      if ("gzip".equalsIgnoreCase( encoding ))
        responseInput = new GZIPInputStream( responseInput );

      String responseBody = IOUtils.toString( responseInput, charset );
      return new Response( responseStatus.getStatusCode(), responseStatus.getReasonPhrase(), responseBody );
    }
    finally
    {
      IOUtils.closeQuietly( responseInput );
      EntityUtils.consume( responseEntity );
    }
  }

  @Override
  protected Response sendXmlRequest( URL url, RequestMethod method, String xml ) throws IOException, OAuthException
  {
    if (httpClient==null) throw new IOException( "No HTTP client was specified!" );

    if (method==null) method = RequestMethod.GET;
    xml = (RequestMethod.POST.equals( method ) || RequestMethod.PUT.equals( method ))?
      StringUtils.trimToNull( xml ): null;

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

    if (xml!=null && request instanceof HttpEntityEnclosingRequest)
    {
      ContentType xmlType = ContentType.create( "application/xml", getEncoding() );

      request.setHeader( "Content-Type", xmlType.toString() );
      request.setHeader( "Content-Language", "en-US" );

      StringEntity xmlEntity = new StringEntity( xml, xmlType );
      ((HttpEntityEnclosingRequest) request).setEntity( xmlEntity );
    }
    request.setHeader( "Accept", "application/xml" );

    // sign request
    getAuthConsumer().sign( request );

    // send request
    HttpResponse response = httpClient.execute( request );

    // create response
    return createResponse( response );
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

    MultipartEntityBuilder b = MultipartEntityBuilder.create();

    // add xml part to the multipart entity
    if (xml!=null)
    {
      //InputStreamBody xmlPart = new InputStreamBody(
      //  new ByteArrayInputStream( xml.getBytes( getEncoding() ) ),
      //  ContentType.parse( "application/xml" ),
      //  "body.xml" );
      //b.addPart( "metadata", xmlPart );
      b.addTextBody(
        "metadata", xml, ContentType.create( "application/xml", getEncoding() ) );
    }

    // add file part to the multipart entity
    if (input!=null)
    {
      mimeType = StringUtils.trimToNull( mimeType );
      if (mimeType==null) mimeType = "application/octet-stream";

      fileName = StringUtils.trimToNull( fileName );
      if (fileName==null) fileName = "upload.bin";

      //InputStreamBody filePart = new InputStreamBody(
      //  input, ContentType.create( mimeType ), fileName );
      //b.addPart( "attachment", filePart );
      b.addBinaryBody(
        "attachment", input, ContentType.create( mimeType ), fileName );
    }

    // add multipart entity to the request
    HttpEntity requestMultipartEntity = b.build();
    request.addHeader( requestMultipartEntity.getContentType() );
    request.setHeader( "Content-Language", "en-US" );
    request.setHeader( "Accept", "application/xml" );
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

    MultipartEntityBuilder b = MultipartEntityBuilder.create();

    // add auth part to the multipart entity
    auth = StringUtils.trimToNull( auth );
    if (auth!=null)
    {
      //StringBody authPart = new StringBody(
      //  auth, ContentType.create( "text/plain", getEncoding() ) );
      //b.addPart( "auth", authPart );
      b.addTextBody(
        "auth", auth, ContentType.create( "text/plain", getEncoding() ) );
    }

    // add file part to the multipart entity
    if (input!=null)
    {
      fileName = StringUtils.trimToNull( fileName );
      if (fileName==null) fileName = "upload.bin";
      //InputStreamBody filePart = new InputStreamBody( input, fileName );
      InputStreamBody filePart = new InputStreamBodyWithLength(
        input, fileName, fileSize );
      b.addPart( "videofile", filePart );
    }

    // add multipart entity to the request
    HttpEntity requestMultipartEntity = b.build();
    request.setHeader( "MIME-Version", "1.0" );
    request.addHeader( requestMultipartEntity.getContentType() );
    request.setHeader( "Content-Language", "en-US" );
    request.setHeader( "Accept-Charset", "UTF-8" );
    request.setHeader( "Accept-Encoding", "gzip,deflate" );
    request.setHeader( "Connection", "close" );
    ((HttpEntityEnclosingRequest) request).setEntity( requestMultipartEntity );

    // sign request
    //getAuthConsumer().sign( request );

    // send request
    HttpResponse response = httpClient.execute( request );

    // create response
    return createResponse( response );
  }

  public void setDefaultHttpClient()
  {
    setDefaultHttpClient( 30000 );
  }

  public void setDefaultHttpClient( int timeout )
  {
    if (timeout<0) timeout = 0;
    //HttpParams params = new BasicHttpParams();
    //HttpProtocolParams.setVersion( params, HttpVersion.HTTP_1_1 );
    //HttpProtocolParams.setContentCharset( params, getEncoding() );
    //HttpProtocolParams.setUseExpectContinue( params, true );
    //HttpConnectionParams.setConnectionTimeout( params, timeout );
    //HttpConnectionParams.setSoTimeout( params, timeout );

    // Register the "http" and "https" protocol schemes, they are
    // required by the default operator to look up socket factories.
    //SchemeRegistry supportedSchemes = new SchemeRegistry();
    //supportedSchemes.register( new Scheme( "http", PlainSocketFactory.getSocketFactory(), 80 ) );
    //supportedSchemes.register( new Scheme( "https", SSLSocketFactory.getSocketFactory(), 443 ) );

    // create http-client
    //setHttpClient( new DefaultHttpClient( new ThreadSafeClientConnManager( params, supportedSchemes ), params ) );
    //setHttpClient( new DefaultHttpClient( params ) );

    HttpClientBuilder b = HttpClientBuilder.create();

    b.setDefaultRequestConfig( RequestConfig.custom()
      .setConnectTimeout( timeout )
      .setConnectionRequestTimeout( timeout )
      .setSocketTimeout( timeout )
      .build() );

    //b.setDefaultSocketConfig( SocketConfig.custom()
    //  .setSoTimeout( timeout )
    //  .build() );

    setHttpClient( b.build() );
  }

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