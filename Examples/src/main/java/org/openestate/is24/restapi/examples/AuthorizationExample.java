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
package org.openestate.is24.restapi.examples;

import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates the authorization of the client at the Webservice.
 *
 * @author Andreas Rudolph
 */
public class AuthorizationExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationExample.class);
    private final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
    private final static String CONSUMER_KEY = "my consumer key";
    private final static String CONSUMER_SECRET = "my consumer secret";
    private final static String ACCESS_KEY = "user's access key";
    private final static String ACCESS_SECRET = "user's access secret";

    /**
     * Main function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        AbstractClient client = new DefaultClient(
                WEBSERVICE_URL, CONSUMER_KEY, CONSUMER_SECRET);

        // authorize at the webservice with the access token
        try {
            client.authorize(ACCESS_KEY, ACCESS_SECRET);
        } catch (OAuthException ex) {
            throw new RuntimeException("Authorization failed!", ex);
        }

        // from now on the webservice is accessible for the client
    }
}