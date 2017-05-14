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
package org.openestate.is24.restapi;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;

/**
 * An implementation of {@link AbstractClient}, that makes use of
 * {@link HttpURLConnection} for HTTP transfers.
 *
 * @since 0.1
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class DefaultClient extends AbstractClient
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( DefaultClient.class );

  /**
   * Create an instance of {@link DefaultClient}.
   *
   * @param apiBaseUrl
   * URL of the IS24-Webservice
   *
   * @param consumerToken
   * consumer token, that identifies the application at the IS24-Webservice
   *
   * @param consumerSecret
   * consumer secret, that identifies the application at the IS24-Webservice
   */
  public DefaultClient( String apiBaseUrl, String consumerToken, String consumerSecret )
  {
    super( apiBaseUrl, consumerToken, consumerSecret );
  }

  /**
   * Retrieve a {@link Response} from a request, that was sent through
   * {@link HttpURLConnection}.
   *
   * @param connection
   * {@link HttpURLConnection}, that contains the server response
   *
   * @return
   * {@link Response} of the request
   *
   * @throws IOException
   * if the {@link Response} can't be obtained
   */
  protected Response createResponse( HttpURLConnection connection ) throws IOException
  {
    InputStream responseInput = null;
    try
    {
      //String encoding = StringUtils.trimToNull( connection.getContentEncoding() );
      //if (encoding==null) encoding = getEncoding();
      String encoding = getEncoding();

      // read response body
      responseInput = new BufferedInputStream( connection.getInputStream() );

      // possibly decompress response body from gzip
      if ("gzip".equalsIgnoreCase( connection.getContentEncoding() ))
        responseInput = new GZIPInputStream( responseInput );

      // create response
      return new Response(
        connection.getResponseCode(),
        connection.getResponseMessage(),
        connection.getHeaderField( RESPONSE_HEADER_REQUEST_REFNUM ),
        IOUtils.toString( responseInput, encoding ) );
    }
    finally
    {
      IOUtils.closeQuietly( responseInput );
      IOUtils.close( connection );
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

    final String twoHyphens = "--";
    final String lineEnd = "\r\n";
    final String boundary =  "*****" + RandomStringUtils.random( 25, true, true ) + "*****";

    HttpURLConnection connection = null;
    DataOutputStream output = null;
    try
    {
      // create connection
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod( method.name() );
      connection.setRequestProperty( "Content-Type", "multipart/form-data; boundary=" + boundary );
      connection.setRequestProperty( "Content-Language", "en-US" );
      connection.setRequestProperty( "Accept", "application/xml" );
      connection.setUseCaches( false );
      connection.setDoInput( true );
      connection.setDoOutput( true );
      getAuthConsumer().sign( connection );

      output = (xml!=null || input!=null)?
        new DataOutputStream( connection.getOutputStream() ): null;

      // send xml part
      if (xml!=null && output!=null)
      {
        output.writeBytes( twoHyphens + boundary + lineEnd );
        output.writeBytes( "Content-Type: application/xml; name=body.xml" + lineEnd );
        output.writeBytes( "Content-Transfer-Encoding: binary" + lineEnd );
        output.writeBytes( "Content-Disposition: form-data; name=\"metadata\"; filename=\"body.xml\"" + lineEnd );
        output.writeBytes( lineEnd );
        output.writeBytes( xml );
        output.writeBytes( lineEnd );
        output.flush();
      }

      // send file part
      if (input!=null && output!=null)
      {
        mimeType = StringUtils.trimToNull( mimeType );
        if (mimeType!=null) mimeType = "application/octet-stream";

        fileName = StringUtils.trimToNull( fileName );
        if (fileName==null) fileName = "upload.bin";


        output.writeBytes( twoHyphens + boundary + lineEnd );
        output.writeBytes( "Content-Type: " + mimeType + "; name=\"" + fileName + "\"" + lineEnd );
        output.writeBytes( "Content-Transfer-Encoding: binary" + lineEnd );
        output.writeBytes( "Content-Disposition: form-data; name=\"attachment\"; filename=\"" + fileName + "\"" + lineEnd );
        output.writeBytes( lineEnd );

        byte[] buffer = new byte[4096];
        int i = input.read( buffer, 0, buffer.length );
        while (i>0)
        {
          output.write( buffer, 0, i );
          i = input.read( buffer, 0, buffer.length );
        }
        output.writeBytes( lineEnd );
      }

      if (output!=null)
      {
        output.writeBytes( twoHyphens + boundary + lineEnd );
      }

      if (output!=null) output.flush();
      connection.connect();

      // read response into string
      return createResponse( connection );
    }
    finally
    {
      IOUtils.closeQuietly( output );
      IOUtils.close( connection );
    }
  }

  @Override
  protected Response sendVideoUploadRequest( URL url, RequestMethod method, String auth, InputStream input, String fileName, long fileSize ) throws IOException, OAuthException
  {
    if (method==null) method = RequestMethod.POST;
    if (!RequestMethod.POST.equals( method ) && !RequestMethod.PUT.equals( method ))
      throw new IllegalArgumentException( "Invalid request method!" );
    auth = StringUtils.trimToNull( auth );

    final String twoHyphens = "--";
    final String lineEnd = "\r\n";
    final String boundary =  "*****" + RandomStringUtils.random( 25, true, true ) + "*****";

    HttpURLConnection connection = null;
    DataOutputStream output = null;
    try
    {
      // create connection
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod( method.name() );
      connection.setRequestProperty( "MIME-Version", "1.0" );
      connection.setRequestProperty( "Content-Type", "multipart/form-data; boundary=" + boundary );
      connection.setRequestProperty( "Content-Language", "en-US" );
      connection.setRequestProperty( "Accept-Encoding", "gzip,deflate" );
      connection.setRequestProperty( "Connection", "close" );
      connection.setUseCaches( false );
      connection.setDoInput( true );
      connection.setDoOutput( true );
      //getAuthConsumer().sign( connection );

      output = (auth!=null || input!=null)?
        new DataOutputStream( connection.getOutputStream() ): null;

      // send auth part
      if (auth!=null && output!=null)
      {
        output.writeBytes( twoHyphens + boundary + lineEnd );
        output.writeBytes( "Content-Type: text/plain; charset=" + getEncoding() + lineEnd );
        output.writeBytes( "Content-Transfer-Encoding: binary" + lineEnd );
        output.writeBytes( "Content-Disposition: form-data; name=\"auth\"" + lineEnd );
        output.writeBytes( lineEnd );
        output.writeBytes( auth );
        output.writeBytes( lineEnd );
        output.flush();
      }

      // send file part
      if (input!=null && output!=null)
      {
        fileName = StringUtils.trimToNull( fileName );
        if (fileName==null) fileName = "upload.bin";

        output.writeBytes( twoHyphens + boundary + lineEnd );
        output.writeBytes( "Content-Type: application/octet-stream; name=\"" + fileName + "\"" + lineEnd );
        output.writeBytes( "Content-Transfer-Encoding: binary" + lineEnd );
        output.writeBytes( "Content-Length: " + String.valueOf( fileSize ) + lineEnd );
        output.writeBytes( "Content-Disposition: form-data; name=\"videofile\"; filename=\"" + fileName + "\"" + lineEnd );
        output.writeBytes( lineEnd );

        byte[] buffer = new byte[4096];
        int i = input.read( buffer, 0, buffer.length );
        while (i>0)
        {
          output.write( buffer, 0, i );
          i = input.read( buffer, 0, buffer.length );
        }
        output.writeBytes( lineEnd );
      }

      if (output!=null)
      {
        output.writeBytes( twoHyphens + boundary + lineEnd );
      }

      if (output!=null) output.flush();
      connection.connect();

      // read response into string
      return createResponse( connection );
    }
    finally
    {
      IOUtils.closeQuietly( output );
      IOUtils.close( connection );
    }
  }

  private Response _sendRequest( URL url, RequestMethod method, String content, String contentType ) throws IOException, OAuthException
  {
    if (method==null) method = RequestMethod.GET;
    content = (RequestMethod.POST.equals( method ) || RequestMethod.PUT.equals( method ))?
      StringUtils.trimToNull( content ): null;

    HttpURLConnection connection = null;
    DataOutputStream output = null;
    try
    {
      // create connection
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod( method.name() );
      if (content!=null)
      {
        connection.setRequestProperty( "Content-Type", contentType + "; charset=" + getEncoding().toLowerCase() );
        connection.setRequestProperty( "Content-Length", String.valueOf( content.getBytes( getEncoding() ).length ) );
        connection.setRequestProperty( "Content-Language", "en-US" );
      }
      connection.setRequestProperty( "Accept", contentType );
      connection.setUseCaches( false );
      connection.setDoInput( true );
      connection.setDoOutput( true );
      getAuthConsumer().sign( connection );

      // send request
      if (content!=null)
      {
        output = new DataOutputStream( connection.getOutputStream() );
        output.writeBytes( content );
        output.flush();
      }
      connection.connect();

      // read response into string
      return createResponse( connection );
    }
    finally
    {
      IOUtils.closeQuietly( output );
      IOUtils.close( connection );
    }
  }
}