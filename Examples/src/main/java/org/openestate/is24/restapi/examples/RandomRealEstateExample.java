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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.xml.bind.JAXBException;
import org.openestate.is24.restapi.utils.RandomRealEstateFactory;
import org.openestate.is24.restapi.utils.XmlUtils;
import org.openestate.is24.restapi.xml.realestates.RealEstate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates the creation of random real estate data.
 *
 * @author Andreas Rudolph
 */
public class RandomRealEstateExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(RandomRealEstateExample.class);

    /**
     * Main function.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try {
            final RandomRealEstateFactory factory = new RandomRealEstateFactory();
            final Charset charset = Charset.forName("UTF-8");
            for (RandomRealEstateFactory.Type type : RandomRealEstateFactory.Type.values()) {
                System.out.println("----------------------------------------");
                System.out.println("example for " + type + ":");
                RealEstate realEstate = factory.createRandomObject(type);
                try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
                    XmlUtils.writeXml(realEstate, charset.name(), true, output);
                    ByteBuffer buffer = ByteBuffer.wrap(output.toByteArray());
                    String xml = charset.decode(buffer).toString();
                    System.out.println(xml.trim());
                }
            }
        } catch (IOException | JAXBException ex) {
            System.err.println("XML error!");
            ex.printStackTrace(System.err);
        }
    }
}