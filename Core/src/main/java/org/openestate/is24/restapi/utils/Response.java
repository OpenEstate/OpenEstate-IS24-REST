/*
 * Copyright 2014-2021 OpenEstate.org.
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Information about a Webservice response.
 *
 * @author Andreas Rudolph
 * @since 0.1
 */
@SuppressWarnings("WeakerAccess")
public final class Response {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(Response.class);
    @SuppressWarnings("unused")
    public final static int OK = 200;
    @SuppressWarnings("unused")
    public final static int CREATED = 201;
    @SuppressWarnings("unused")
    public final static int AUTHENTICATION_REQUIRED = 401;
    @SuppressWarnings("unused")
    public final static int ACCESS_DENIED = 403;
    @SuppressWarnings("unused")
    public final static int NOT_FOUND = 404;
    @SuppressWarnings("unused")
    public final static int METHOD_NOT_ALLOWED = 405;
    @SuppressWarnings("unused")
    public final static int NOT_ACCEPTABLE = 406;
    @SuppressWarnings("unused")
    public final static int CONFLICT = 409;
    @SuppressWarnings("unused")
    public final static int PRECONDITION = 412;
    @SuppressWarnings("unused")
    public final static int UNSUPPORTED_MEDIA_TYPE = 415;
    @SuppressWarnings("unused")
    public final static int INTERNAL_SERVER_ERROR = 500;
    @SuppressWarnings("unused")
    public final static int NOT_IMPLEMENTED = 501;
    @SuppressWarnings("unused")
    public final static int TEMPORARILY_NOT_AVAILABLE = 503;

    /**
     * Status code of the HTTP response.
     */
    public final int statusCode;

    /**
     * Status message of the HTTP response.
     */
    public final String statusMessage;

    /**
     * Unique identifier of the request, that the response is referred to.
     *
     * @since 0.2.2
     */
    public final String requestRefNumber;

    /**
     * Body text of the HTTP response.
     */
    public final String body;

    /**
     * Create a response.
     *
     * @param statusCode       HTTP status code
     * @param statusMessage    HTTP status message
     * @param requestRefNumber value of the <em>L-IS24-RequestRefnum</em> response header
     * @param body             response body
     * @since 0.2.2
     */
    public Response(int statusCode, String statusMessage, String requestRefNumber, String body) {
        this.statusCode = statusCode;
        this.statusMessage = StringUtils.trimToNull(statusMessage);
        this.requestRefNumber = StringUtils.trimToNull(requestRefNumber);
        this.body = StringUtils.trimToNull(body);
    }

    /**
     * Return the body of the HTTP response.
     *
     * @return body
     * @since 0.2.2
     */
    public String getBody() {
        return body;
    }

    /**
     * Return the unique identifier of the referring HTTP request.
     * <p>
     * This values was passed through the <em>L-IS24-RequestRefnum</em> header
     * of the HTTP response.
     *
     * @return unique identifier
     * @since 0.2.2
     */
    @SuppressWarnings("unused")
    public String getRequestRefNumber() {
        return requestRefNumber;
    }

    /**
     * Return the status code of the HTTP response.
     *
     * @return status code
     * @since 0.2.2
     */
    @SuppressWarnings("unused")
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Return the status message of the HTTP response.
     *
     * @return status message
     * @since 0.2.2
     */
    @SuppressWarnings("unused")
    public String getStatusMessage() {
        return statusMessage;
    }
}