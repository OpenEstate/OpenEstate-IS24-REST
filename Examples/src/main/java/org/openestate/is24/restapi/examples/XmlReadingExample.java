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

import java.io.File;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.lang3.ArrayUtils;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates reading of XML, that is used by the Webservice.
 *
 * @author Andreas Rudolph
 */
public class XmlReadingExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(XmlReadingExample.class);
    private final static String ENCODING = "UTF-8";
    private final static boolean PRETTY_PRINT = true;

    /**
     * Main function.
     *
     * @param args command line arguments with XML files to read
     */
    public static void main(String[] args) {
        if (ArrayUtils.isEmpty(args)) {
            System.out.println("No files were specified for reading.");
        }

        // create an unmarshaller
        Unmarshaller unmarshaller;
        try {
            unmarshaller = XmlUtils.createUnmarshaller();
        } catch (JAXBException ex) {
            throw new RuntimeException("Can't build unmarshaller!", ex);
        }

        for (String arg : args) {
            // get path of the XML file from command line arguments
            File file = new File(arg);
            if (!file.isFile()) {
                System.out.println("The provided file '" + arg + "' does not exist!");
                continue;
            }

            // read XML at the provided location into a JAXB object
            RealEstate object;
            try {
                JAXBElement<RealEstate> xml = (JAXBElement<RealEstate>)
                        unmarshaller.unmarshal(file);
                object = xml.getValue();
            } catch (JAXBException ex) {
                throw new RuntimeException(
                        "Can't read XML file '" + file.getAbsolutePath() + "'!", ex);
            }
            if (object == null) {
                throw new RuntimeException(
                        "Can't read XML file '" + file.getAbsolutePath() + "'!");
            }

            // write the parsed JAXB object back into a XML string
            try {
                String xml = XmlUtils.marshal(object, ENCODING, PRETTY_PRINT);
                System.out.println("-----------------------------------");
                System.out.println("processed content of " + file.getAbsolutePath());
                System.out.println(xml);
            } catch (JAXBException | IOException ex) {
                throw new RuntimeException(
                        "Can't process XML file '" + file.getAbsolutePath() + "'!", ex);
            }
        }
    }
}