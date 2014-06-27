/*
 * Copyright 2014 OpenEstate.
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;
import org.openestate.is24.restapi.xml.common.Message;
import org.openestate.is24.restapi.xml.common.MessageCode;
import org.openestate.is24.restapi.xml.common.Messages;

/**
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class Resource
{
  //private final static Logger LOGGER = LoggerFactory.getLogger( Resource.class );
  private static Pattern CREATED_PATTERN = null;
  public final String type;
  public final long id;

  public Resource( String type, long id )
  {
    this.type = type;
    this.id = id;
  }

  public static Resource getCreatedResource( Messages messages )
  {
    return (messages!=null && !messages.getMessage().isEmpty())?
      getCreatedResource( messages.getMessage().get( 0 ) ): null;

  }

  public static Resource getCreatedResource( Message message )
  {
    if (message==null)
      return null;
    if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( message.getMessageCode() ))
      return null;

    String txt = StringUtils.trimToNull( message.getMessage() );
    if (txt==null)
      return null;

    //LOGGER.debug( "Parse response message after creation." );
    //LOGGER.debug( "> " + txt );

    // parse resource type and ID from a text like:
    // Resource [REALESTATE] with id [123456] has been created.
    if (CREATED_PATTERN==null)
      CREATED_PATTERN = Pattern.compile( "^.*\\[([\\w]+)\\].*\\[([\\d]+)\\].*" );
    Matcher m = CREATED_PATTERN.matcher( txt );
    if (!m.find()) return null;
    return new Resource(
      StringUtils.trimToNull( m.group( 1 ) ),
      Long.valueOf( StringUtils.defaultIfBlank( StringUtils.trimToNull( m.group( 2 ) ), "0" ) )
    );
  }
}