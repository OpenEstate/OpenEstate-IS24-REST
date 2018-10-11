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
package org.openestate.is24.restapi.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import oauth.signpost.exception.OAuthException;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.utils.ExportHandler;
import org.openestate.is24.restapi.utils.ExportMessage;
import org.openestate.is24.restapi.utils.ExportPool;
import org.openestate.is24.restapi.utils.RandomRealEstateFactory;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates a bulk upload of multiple real estates and contact
 * persons.
 *
 * @author Andreas Rudolph
 */
public class BulkUploadExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(BulkUploadExample.class);
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
        RandomRealEstateFactory factory = new RandomRealEstateFactory();

        // create an export pool, that holds the objects for export
        ExportPool pool = new ExportPool();
        try {
            try {
                // create some random contact persons
                List<String> contactIds = new ArrayList<>();
                int contactCount = RandomUtils.nextInt(1, 5);
                for (int i = 0; i < contactCount; i++) {
                    RealtorContactDetails contact = factory.createRandomContact();
                    contact.setExternalId("TEST_" + i);
                    contactIds.add(contact.getExternalId());

                    // add randomly created contact person to the export pool
                    pool.putContact(contact);
                }

                // create some random real estates
                for (RandomRealEstateFactory.Type type : RandomRealEstateFactory.Type.values()) {
                    RealEstate object = factory.createRandomObject(type);
                    object.setExternalId("TEST_" + type.name());

                    // assign one of the randomly created contacts to the real estate
                    object.setContact(new RealEstate.Contact());
                    object.getContact().setExternalId(contactIds.get(
                            RandomUtils.nextInt(0, contactIds.size())));

                    // add randomly created real estate to the export pool
                    pool.putObject(object);
                }
            } catch (IOException ex) {
                throw new RuntimeException("Can't build export pool!", ex);
            }

            // create a client, that communicates with the Webservice
            AbstractClient client = new DefaultClient(
                    WEBSERVICE_URL, CONSUMER_KEY, CONSUMER_SECRET);

            // authorize the client with the access token
            try {
                client.authorize(ACCESS_KEY, ACCESS_SECRET);
            } catch (OAuthException ex) {
                throw new RuntimeException("Authorization failed!", ex);
            }

            // send export pool to the Webservice
            try {
                ExportHandler handler = new ExportHandler();

                // start the export process
                ExportMessage[] messages = handler.export(client, pool, true, false);

                // process messages, that occurred during the export process
                if (ArrayUtils.isEmpty(messages)) {
                    System.out.println("No messages were received.");
                } else {
                    // print messages to console
                    System.out.println(messages.length + " messages received.");
                    for (ExportMessage message : messages) {
                        String level = message.getLevel().name();
                        String code = message.getCode().name();
                        if (!StringUtils.isBlank(message.getObjectId())) {
                            System.out.println(level + " for real estate "
                                    + "'" + message.getObjectId() + "'");
                        } else if (!StringUtils.isBlank(message.getContactId())) {
                            System.out.println(level + " for contact person "
                                    + "'" + message.getContactId() + "'");
                        } else {
                            System.out.println("general " + level);
                        }
                        System.out.println("> " + code);
                        System.out.println("> " + message.getMessage());
                    }
                }
            } catch (IOException ex) {
                throw new RuntimeException("Can't send export pool to the Webservice!", ex);
            }
        } finally {
            pool.cleanup();
        }
    }
}