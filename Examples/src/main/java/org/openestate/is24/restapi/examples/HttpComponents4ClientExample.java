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

import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.hc4.HttpComponents4Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates the creation of a {@link HttpComponents4Client} for
 * HTTP transfers via Apache HttpComponents 4.3.
 *
 * @author Andreas Rudolph
 */
public class HttpComponents4ClientExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpComponents4ClientExample.class);
    private final static String WEBSERVICE_URL = AbstractClient.LIVE_API;
    private final static String CONSUMER_KEY = "my consumer key";
    private final static String CONSUMER_SECRET = "my consumer secret";

    /**
     * Main function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //noinspection unused
        AbstractClient client = new HttpComponents4Client(
                WEBSERVICE_URL, CONSUMER_KEY, CONSUMER_SECRET);

        // do something useful with the client
    }
}