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
package org.openestate.is24.restapi.utils;

import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.xml.common.Message;
import org.openestate.is24.restapi.xml.common.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exception for failed Webservice requests.
 * <p>
 * This exception is thrown, when a request to the Webservice failed. The
 * exception holds further informations about the failed request.
 *
 * @since 0.1
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class RequestFailedException extends Exception
{
  private final static Logger LOGGER = LoggerFactory.getLogger( RequestFailedException.class );

  /**
   * Status code of the failed HTTP request.
   */
  public final int statusCode;

  /**
   * Status message of the failed HTTP request.
   */
  public final String statusMessage;

  /**
   * {@link Messages}, that were received in the body of the HTTP response.
   */
  public final Messages responseMessages;

  public RequestFailedException( Response response, String message )
  {
    super( message );
    this.statusCode = response.statusCode;
    this.statusMessage = StringUtils.trimToNull( response.statusMessage );

    Messages messages = null;
    String body = StringUtils.trimToNull( response.body );

    // parse messages from XML response
    if (body!=null && body.startsWith( "<?xml" ))
    {
      try
      {
        messages = (Messages) XmlUtils.unmarshal( body );
      }
      catch (Exception ex)
      {
        LOGGER.error( "WARNING: Can't read error messages from response body!" );
        LOGGER.error( StringUtils.repeat( "-", 40 ) );
        LOGGER.error( body );
        LOGGER.error( StringUtils.repeat( "-", 40 ) );
        LOGGER.error( ex.getLocalizedMessage(), ex );
      }
    }

    // create messages from plain text response
    if (messages==null)
    {
      final org.openestate.is24.restapi.xml.common.ObjectFactory factory =
        new org.openestate.is24.restapi.xml.common.ObjectFactory();

      Message msg = factory.createMessage();
      msg.setMessage( (body!=null)? body: this.statusMessage );
      msg.setMessageCode( null );
      messages = factory.createMessages();
      messages.getMessage().add( msg );
    }

    this.responseMessages = messages;
  }

  public RequestFailedException( Response response, String message, Throwable cause )
  {
    super( message, cause );
    this.statusCode = response.statusCode;
    this.statusMessage = StringUtils.trimToNull( response.statusMessage );

    // parse messages from response body
    Messages messages = null;
    try
    {
      messages = (!StringUtils.isBlank( response.body ))?
        (Messages) XmlUtils.unmarshal( response.body ): null;
    }
    catch (Exception ex)
    {
      LOGGER.error( "Can't parse response messages!", ex );
    }
    this.responseMessages = messages;
  }
}