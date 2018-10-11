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

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.xml.common.Message;
import org.openestate.is24.restapi.xml.common.MessageCode;
import org.openestate.is24.restapi.xml.common.Messages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Informations about a modified resource.
 *
 * @author Andreas Rudolph
 * @since 0.1
 */
public class Resource {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Resource.class);
    private static Pattern CREATED_PATTERN = null;
    private static Pattern MESSAGE_PATTERN = null;

    /**
     * resource type
     */
    public final String type;

    /**
     * resource ID
     */
    public final long id;

    public Resource(String type, long id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Load resource informations from the response {@link Messages} of a created
     * object.
     *
     * @param messages messages from the body of the HTTP response
     * @return resource informations
     */
    public static Resource getCreatedResource(Messages messages) {
        return (messages != null && !messages.getMessage().isEmpty()) ?
                getCreatedResource(messages.getMessage().get(0)) : null;
    }

    /**
     * Load resource informations from the response {@link Message} of a created
     * object.
     *
     * @param message message from the body of the HTTP response
     * @return resource informations
     */
    public static Resource getCreatedResource(Message message) {
        if (message == null)
            return null;
        if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals(message.getMessageCode()))
            return null;

        String txt = StringUtils.trimToNull(message.getMessage());
        if (txt == null)
            return null;

        //LOGGER.debug( "Parse response message after creation." );
        //LOGGER.debug( "> " + txt );

        // parse resource type and ID from a text like:
        // Resource [REALESTATE] with id [123456] has been created.
        if (CREATED_PATTERN == null)
            CREATED_PATTERN = Pattern.compile("^.*\\[([\\w]+)\\].*\\[([\\d]+)\\].*");
        Matcher m = CREATED_PATTERN.matcher(txt);
        if (!m.find()) return null;
        return new Resource(
                StringUtils.trimToNull(m.group(1)),
                Long.parseLong(StringUtils.defaultIfBlank(StringUtils.trimToNull(m.group(2)), "0"))
        );
    }

    /**
     * Load resource informations from the response {@link Messages}.
     *
     * @param messages messages from the body of the HTTP response
     * @return resource informations
     */
    public static Resource getMessageResource(Messages messages) {
        return (messages != null && !messages.getMessage().isEmpty()) ?
                getMessageResource(messages.getMessage().get(0)) : null;

    }

    /**
     * Load resource informations from the response {@link Message}.
     *
     * @param message message from the body of the HTTP response
     * @return resource informations
     */
    public static Resource getMessageResource(Message message) {
        if (message == null)
            return null;
        //if (!MessageCode.MESSAGE_RESOURCE_CREATED.equals( message.getMessageCode() ))
        //  return null;

        String txt = StringUtils.trimToNull(message.getMessage());
        if (txt == null)
            return null;

        //LOGGER.debug( "Parse response message after creation." );
        //LOGGER.debug( "> " + txt );

        // parse resource type and ID from a text like:
        // The operation for your request causes a conflict. [MESSAGE: duplicated contactDetails:59476923]
        if (MESSAGE_PATTERN == null)
            MESSAGE_PATTERN = Pattern.compile("^.*\\[MESSAGE:([^\\]]*):([\\d]+)\\].*");
        Matcher m = MESSAGE_PATTERN.matcher(txt);
        if (!m.find()) return null;
        return new Resource(
                StringUtils.trimToNull(m.group(1)),
                Long.parseLong(StringUtils.defaultIfBlank(StringUtils.trimToNull(m.group(2)), "0"))
        );
    }
}