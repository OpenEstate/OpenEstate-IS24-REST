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
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.openestate.is24.restapi.utils.RequestMethod;
import org.openestate.is24.restapi.utils.Response;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class DefaultClient extends AbstractClient
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( DefaultClient.class );

  public DefaultClient( String apiBaseUrl, String apiAccessKey, String apiAccessSecret )
  {
    super( apiBaseUrl, apiAccessKey, apiAccessSecret );
  }

  protected Response createResponse( HttpURLConnection connection ) throws IOException
  {
    InputStream responseInput = null;
    try
    {
      // read response into string
      //String encoding = StringUtils.trimToNull( connection.getContentEncoding() );
      //if (encoding==null) encoding = getEncoding();
      String encoding = getEncoding();
      responseInput = new BufferedInputStream( connection.getInputStream() );
      if ("gzip".equalsIgnoreCase( connection.getContentEncoding() ))
        responseInput = new GZIPInputStream( responseInput );

      String responseBody = IOUtils.toString( responseInput, encoding );
      return new Response( connection.getResponseCode(), connection.getResponseMessage(), responseBody );
    }
    finally
    {
      IOUtils.closeQuietly( responseInput );
      IOUtils.close( connection );
    }
  }

  @Override
  protected Response sendXmlRequest( URL url, RequestMethod method, String xml ) throws IOException, OAuthException
  {
    if (method==null) method = RequestMethod.GET;
    xml = (RequestMethod.POST.equals( method ) || RequestMethod.PUT.equals( method ))?
      StringUtils.trimToNull( xml ): null;

    HttpURLConnection connection = null;
    DataOutputStream output = null;
    try
    {
      // create connection
      connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod( method.name() );
      if (xml!=null)
      {
        connection.setRequestProperty( "Content-Type", "application/xml; charset="+getEncoding().toLowerCase() );
        connection.setRequestProperty( "Content-Length", String.valueOf( xml.getBytes( getEncoding() ).length ) );
        connection.setRequestProperty( "Content-Language", "en-US" );
      }
      connection.setRequestProperty( "Accept", "application/xml" );
      connection.setUseCaches( false );
      connection.setDoInput( true );
      connection.setDoOutput( true );
      getAuthConsumer().sign( connection );

      // send request
      if (xml!=null)
      {
        output = new DataOutputStream( connection.getOutputStream() );
        output.writeBytes( xml );
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
}