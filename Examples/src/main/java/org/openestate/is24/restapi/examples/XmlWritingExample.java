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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.bind.JAXBException;
import org.openestate.is24.restapi.utils.RandomRealEstateFactory;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.common.RealtorContactDetails;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates writing of XML, that is used by the Webservice.
 *
 * @author Andreas Rudolph
 */
public class XmlWritingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlWritingExample.class);
    private final static String ENCODING = "UTF-8";
    private final static boolean PRETTY_PRINT = true;

    /**
     * Main function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final RandomRealEstateFactory factory = new RandomRealEstateFactory();

        // writing an example contact person
        try {
            // generate random contact person
            RealtorContactDetails contact = factory.createRandomContact();

            // write contact person into a temporary file
            File file = File.createTempFile("example-contact-", ".xml");
            try (OutputStream output = new FileOutputStream(file)) {
                XmlUtils.writeXml(contact, ENCODING, PRETTY_PRINT, output);
            }
        } catch (JAXBException ex) {
            throw new RuntimeException("Can't build XML file!", ex);
        } catch (IOException ex) {
            throw new RuntimeException("Can't write XML file!", ex);
        }

        // writing an example real estate
        try {
            // generate random real estate
            RealEstate object = factory.createRandomObject();

            // write real estate into a temporary file
            File file = File.createTempFile("example-object-", ".xml");
            try (OutputStream output = new FileOutputStream(file)) {
                XmlUtils.writeXml(object, ENCODING, PRETTY_PRINT, output);
            }
        } catch (JAXBException ex) {
            throw new RuntimeException("Can't build XML file!", ex);
        } catch (IOException ex) {
            throw new RuntimeException("Can't write XML file!", ex);
        }
    }
}