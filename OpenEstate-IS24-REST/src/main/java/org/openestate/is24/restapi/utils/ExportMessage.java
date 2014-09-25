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

import org.apache.commons.lang.StringUtils;

/**
 * ExportMessage.
 *
 * @author Andreas Rudolph <andy@openindex.de>
 */
public class ExportMessage
{
  private final Code code;
  private final String message;
  private final String objectId;
  private final String contactId;

  private ExportMessage( Code code, String message, String objectId, String contactId )
  {
    this.code = code;
    this.message = StringUtils.trimToNull( message );
    this.objectId = StringUtils.trimToNull( objectId );
    this.contactId = StringUtils.trimToNull( contactId );
  }

  public Code getCode()
  {
    return this.code;
  }

  public String getContactId()
  {
    return this.contactId;
  }

  public Level getLevel()
  {
    return this.code.getLevel();
  }

  public String getMessage()
  {
    return this.message;
  }

  public String getObjectId()
  {
    return this.objectId;
  }

  public boolean isGeneral()
  {
    return StringUtils.isBlank( this.objectId )
      && StringUtils.isBlank( this.contactId );
  }

  public static ExportMessage newContactMessage( String contactId, Code code, String message )
  {
    return new ExportMessage( code, message, null, contactId );
  }

  public static ExportMessage newGeneralMessage( String message, Code code )
  {
    return new ExportMessage( code, message, null, null );
  }

  public static ExportMessage newObjectMessage( String objectId, Code code, String message )
  {
    return new ExportMessage( code, message, objectId, null );
  }

  public static enum Code
  {
    // error codes for contacts
    CONTACT_NOT_FOUND( Level.ERROR ),
    CONTACT_NOT_SAVED( Level.ERROR ),

    // error codes for objects
    OBJECTS_NOT_FOUND( Level.ERROR ),
    OBJECT_NOT_FOUND( Level.ERROR ),
    OBJECT_NOT_SAVED( Level.ERROR ),
    OBJECT_NOT_REMOVED( Level.ERROR ),
    OBJECT_NOT_PUBLISHED( Level.WARNING ),
    OBJECT_NOT_UNPUBLISHED( Level.WARNING ),
    OBJECT_NOT_DISABLED( Level.WARNING ),
    OBJECT_PUBLISHINGS_NOT_FOUND( Level.WARNING ),
    OBJECT_WITHOUT_ATTACHMENTS( Level.WARNING ),
    OBJECT_WITHOUT_CONTACT( Level.WARNING ),
    OBJECT_UNORDERED_ATTACHMENTS( Level.WARNING ),
    OBJECT_OLD_ATTACHMENT_NOT_REMOVED( Level.WARNING ),
    OBJECT_ATTACHMENT_NOT_SAVED( Level.WARNING ),

    // further error codes
    PUBLISH_CHANNELS_NOT_FOUND( Level.WARNING ),

    ;

    private final Level level;

    private Code( Level level )
    {
      this.level = level;
    }

    public Level getLevel()
    {
      return this.level;
    }
  }

  public static enum Level
  {
    NOTICE, WARNING, ERROR;
  }
}