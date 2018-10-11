/*
 * Copyright 2014-2018 OpenEstate.org.
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

import java.io.Serializable;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A message, that was returned during a bulk export.
 * <p>
 * The {@link ExportMessage} is part of the high level API for bulk exports of
 * real estate data.
 *
 * @author Andreas Rudolph
 * @since 0.2
 */
@SuppressWarnings("WeakerAccess")
public class ExportMessage implements Serializable {
    private final static long serialVersionUID = -390150486485853025L;
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(ExportMessage.class);
    private final Code code;
    private final String message;
    private final String objectId;
    private final String contactId;
    private final String errorRequestRefNumber;

    private ExportMessage(Code code, String message, String objectId, String contactId, String errorRequestRefNumber) {
        this.code = code;
        this.message = StringUtils.trimToNull(message);
        this.objectId = StringUtils.trimToNull(objectId);
        this.contactId = StringUtils.trimToNull(contactId);
        this.errorRequestRefNumber = StringUtils.trimToNull(errorRequestRefNumber);
    }

    /**
     * Return message code.
     *
     * @return message code
     */
    public Code getCode() {
        return this.code;
    }

    /**
     * Return the contact ID, that this message is assigned to.
     *
     * @return contact ID or null, if no contact is assigned to the message
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * Return the unique identifier of the failed HTTP request.
     * <p>
     * This values was passed through the <em>L-IS24-RequestRefnum</em> header
     * of the HTTP response.
     *
     * @return unique identifier
     * @since 0.2.2
     */
    @SuppressWarnings("unused")
    public String getErrorRequestRefNumber() {
        return this.errorRequestRefNumber;
    }

    /**
     * Return message level.
     *
     * @return message level
     */
    public Level getLevel() {
        return this.code.getLevel();
    }

    /**
     * Return message text.
     *
     * @return message text
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Return the real estate ID, that this message is assigned to.
     *
     * @return real estate ID or null, if no real estate is assigned to the message
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * Check, if the message is an error.
     *
     * @return true, if the message is an error
     */
    public boolean isError() {
        return Level.ERROR.equals(this.getLevel());
    }

    /**
     * Check, if the message is assigned to a certain object.
     *
     * @return true, if the message is assigned to a contact or real estate
     */
    public boolean isGeneral() {
        return StringUtils.isBlank(this.objectId)
                && StringUtils.isBlank(this.contactId);
    }

    /**
     * Check, if the message is a notice.
     *
     * @return true, if the message is a notice
     */
    @SuppressWarnings("unused")
    public boolean isNotice() {
        return Level.NOTICE.equals(this.getLevel());
    }

    /**
     * Check, if the message is a warning.
     *
     * @return true, if the message is a warning
     */
    @SuppressWarnings("unused")
    public boolean isWarning() {
        return Level.WARNING.equals(this.getLevel());
    }

    /**
     * Create a message for a contact person.
     *
     * @param contactId contact ID
     * @param code      message code
     * @param message   message text
     * @return message
     */
    @SuppressWarnings("unused")
    public static ExportMessage newContactMessage(String contactId, Code code, String message) {
        return newContactMessage(contactId, code, message, null);
    }

    /**
     * Create a message for a contact person.
     *
     * @param contactId             contact ID
     * @param code                  message code
     * @param message               message text
     * @param errorRequestRefNumber unique identifier of the failed HTTP request
     * @return message
     * @since 0.2.2
     */
    public static ExportMessage newContactMessage(String contactId, Code code, String message, String errorRequestRefNumber) {
        return new ExportMessage(code, message, null, contactId, errorRequestRefNumber);
    }

    /**
     * Create a general message.
     *
     * @param code    message code
     * @param message message text
     * @return message
     */
    @SuppressWarnings("unused")
    public static ExportMessage newGeneralMessage(String message, Code code) {
        return newGeneralMessage(message, code, null);
    }

    /**
     * Create a general message.
     *
     * @param code                  message code
     * @param message               message text
     * @param errorRequestRefNumber unique identifier of the failed HTTP request
     * @return message
     * @since 0.2.2
     */
    public static ExportMessage newGeneralMessage(String message, Code code, String errorRequestRefNumber) {
        return new ExportMessage(code, message, null, null, errorRequestRefNumber);
    }

    /**
     * Create a message for a real estate.
     *
     * @param objectId real estate ID
     * @param code     message code
     * @param message  message text
     * @return message
     */
    @SuppressWarnings("unused")
    public static ExportMessage newObjectMessage(String objectId, Code code, String message) {
        return newObjectMessage(objectId, code, message, null);
    }

    /**
     * Create a message for a real estate.
     *
     * @param objectId              real estate ID
     * @param code                  message code
     * @param message               message text
     * @param errorRequestRefNumber unique identifier of the failed HTTP request
     * @return message
     * @since 0.2.2
     */
    public static ExportMessage newObjectMessage(String objectId, Code code, String message, String errorRequestRefNumber) {
        return new ExportMessage(code, message, objectId, null, errorRequestRefNumber);
    }

    /**
     * Supported message codes.
     */
    public enum Code {
        // error codes for contacts
        CONTACT_NOT_FOUND(Level.ERROR),
        CONTACT_NOT_SAVED(Level.ERROR),

        // error codes for objects
        OBJECTS_NOT_FOUND(Level.ERROR),
        OBJECT_NOT_FOUND(Level.ERROR),
        OBJECT_NOT_FOUND_FOR_ARCHIVING(Level.WARNING),
        OBJECT_NOT_FOUND_FOR_REMOVING(Level.WARNING),
        OBJECT_NOT_SAVED(Level.ERROR),
        OBJECT_NOT_REMOVED(Level.ERROR),
        OBJECT_NOT_PUBLISHED(Level.WARNING),
        OBJECT_NOT_UNPUBLISHED(Level.ERROR),
        OBJECT_NOT_DISABLED(Level.WARNING),
        OBJECT_PUBLISHINGS_NOT_FOUND(Level.WARNING),
        OBJECT_WITHOUT_ATTACHMENTS(Level.WARNING),
        OBJECT_WITHOUT_CONTACT(Level.WARNING),
        OBJECT_UNORDERED_ATTACHMENTS(Level.WARNING),
        OBJECT_OLD_ATTACHMENT_NOT_REMOVED(Level.WARNING),
        OBJECT_ATTACHMENT_NOT_SAVED(Level.WARNING),

        // further error codes
        PUBLISH_CHANNELS_NOT_FOUND(Level.WARNING),
        XML_NOT_READABLE(Level.ERROR);

        private final Level level;

        Code(Level level) {
            this.level = level;
        }

        /**
         * Return the corresponding severity level of the message code.
         *
         * @return severity level of the message code
         */
        public Level getLevel() {
            return this.level;
        }

        /**
         * Check, if the current code is an error.
         *
         * @return true, if the current code is an error
         */
        @SuppressWarnings("unused")
        public boolean isError() {
            return Level.ERROR.equals(this.level);
        }

        /**
         * Check, if the current code is a notice.
         *
         * @return true, if the current code is a notice
         */
        @SuppressWarnings("unused")
        public boolean isNotice() {
            return Level.NOTICE.equals(this.level);
        }

        /**
         * Check, if the current code is a warning.
         *
         * @return true, if the current code is a warning
         */
        @SuppressWarnings("unused")
        public boolean isWarning() {
            return Level.WARNING.equals(this.level);
        }
    }

    /**
     * Supported message levels.
     */
    public enum Level {
        NOTICE, WARNING, ERROR
    }
}