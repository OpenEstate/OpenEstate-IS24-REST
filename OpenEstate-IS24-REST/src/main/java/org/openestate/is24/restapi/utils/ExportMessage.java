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
 * A message, that was returned during a bulk export.
 * <p>
 * The {@link ExportMessage} is part of the high level API for bulk exports of
 * real estate data.
 *
 * @since 0.2
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

  /**
   * Returns message code.
   *
   * @return
   * message code
   */
  public Code getCode()
  {
    return this.code;
  }

  /**
   * Returns the contact ID, that this message is assigned to.
   *
   * @return
   * contact ID or null, if no contact is assigned to the message
   */
  public String getContactId()
  {
    return this.contactId;
  }

  /**
   * Returns message level.
   *
   * @return
   * message level
   */
  public Level getLevel()
  {
    return this.code.getLevel();
  }

  /**
   * Returns message text.
   *
   * @return
   * message text
   */
  public String getMessage()
  {
    return this.message;
  }

  /**
   * Returns the real estate ID, that this message is assigned to.
   *
   * @return
   * real estate ID or null, if no real estate is assigned to the message
   */
  public String getObjectId()
  {
    return this.objectId;
  }

  /**
   * Checks, if the message is an error.
   *
   * @return
   * true, if the message is an error
   */
  public boolean isError()
  {
    return Level.ERROR.equals( this.getLevel() );
  }

  /**
   * Checks, if the message is assigned to a certain object.
   *
   * @return
   * true, if the message is assigned to a contact or real estate
   */
  public boolean isGeneral()
  {
    return StringUtils.isBlank( this.objectId )
      && StringUtils.isBlank( this.contactId );
  }

  /**
   * Checks, if the message is a notice.
   *
   * @return
   * true, if the message is a notice
   */
  public boolean isNotice()
  {
    return Level.NOTICE.equals( this.getLevel() );
  }

  /**
   * Checks, if the message is a warning.
   *
   * @return
   * true, if the message is a warning
   */
  public boolean isWarning()
  {
    return Level.WARNING.equals( this.getLevel() );
  }

  /**
   * Creates a message for a contact person.
   *
   * @param contactId
   * contact ID
   *
   * @param code
   * message code
   *
   * @param message
   * message text
   *
   * @return
   * message
   */
  public static ExportMessage newContactMessage( String contactId, Code code, String message )
  {
    return new ExportMessage( code, message, null, contactId );
  }

  /**
   * Creates a general message.
   *
   * @param code
   * message code
   *
   * @param message
   * message text
   *
   * @return
   * message
   */
  public static ExportMessage newGeneralMessage( String message, Code code )
  {
    return new ExportMessage( code, message, null, null );
  }

  /**
   * Creates a message for a real estate.
   *
   * @param objectId
   * real estate ID
   *
   * @param code
   * message code
   *
   * @param message
   * message text
   *
   * @return
   * message
   */
  public static ExportMessage newObjectMessage( String objectId, Code code, String message )
  {
    return new ExportMessage( code, message, objectId, null );
  }

  /**
   * Supported message codes.
   */
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

    /**
     * Returns the corresponding severity level of the message code.
     *
     * @return
     * severity level of the message code
     */
    public Level getLevel()
    {
      return this.level;
    }
  }

  /**
   * Supported message levels.
   */
  public static enum Level
  {
    NOTICE, WARNING, ERROR;
  }
}