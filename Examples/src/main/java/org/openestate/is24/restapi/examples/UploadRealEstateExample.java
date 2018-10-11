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
import java.math.BigDecimal;
import javax.xml.bind.JAXBException;
import oauth.signpost.exception.OAuthException;
import org.openestate.is24.restapi.AbstractClient;
import org.openestate.is24.restapi.DefaultClient;
import org.openestate.is24.restapi.ImportExport.RealEstateService;
import org.openestate.is24.restapi.utils.RequestFailedException;
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.BuildingType;
import org.openestate.is24.restapi.xml.common.ConstructionPhaseType;
import org.openestate.is24.restapi.xml.common.Currency;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.InteriorQuality;
import org.openestate.is24.restapi.xml.common.MarketingType;
import org.openestate.is24.restapi.xml.common.PriceIntervalType;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;
import org.openestate.is24.restapi.xml.common.YesNoNotApplicableType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;
import org.openestate.is24.restapi.xml.realestates.HouseBuy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This example illustrates the upload of a single real estate to the
 * Webservice through the low level methods of {@link RealEstateService}.
 *
 * @author Andreas Rudolph
 */
public class UploadRealEstateExample {
    @SuppressWarnings("unused")
    private final static Logger LOGGER = LoggerFactory.getLogger(UploadRealEstateExample.class);
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

        // create a real estate object
        final org.openestate.is24.restapi.xml.common.ObjectFactory commonFactory =
                new org.openestate.is24.restapi.xml.common.ObjectFactory();
        final org.openestate.is24.restapi.xml.realestates.ObjectFactory realEstatesFactory =
                new org.openestate.is24.restapi.xml.realestates.ObjectFactory();

        // in this case we're creating a house for purchase
        HouseBuy object = realEstatesFactory.createHouseBuy();
        object.setExternalId("123");
        object.setGroupNumber(1);

        // set object's address
        object.setShowAddress(true);
        object.setAddress(commonFactory.createWgs84Address());
        object.getAddress().setStreet("Friedrichstraße");
        object.getAddress().setHouseNumber("123");
        object.getAddress().setPostcode("12345");
        object.getAddress().setCity("Berlin");
        object.getAddress().setQuarter("Mitte");
        object.getAddress().setPreciseHouseNumber(true);
        object.getAddress().setWgs84Coordinate(commonFactory.createWgs84Coordinate());
        object.getAddress().getWgs84Coordinate().setLatitude(new BigDecimal("52.519444"));
        object.getAddress().getWgs84Coordinate().setLongitude(new BigDecimal("13.406667"));

        // set object's notes
        object.setTitle("a descriptive title for the object");
        object.setFurnishingNote("some notes about furnishing");
        object.setLocationNote("some notes about the location");
        object.setOtherNote("some more notes");

        // set price attributes
        object.setPrice(commonFactory.createPrice());
        object.getPrice().setCurrency(Currency.EUR);
        object.getPrice().setMarketingType(MarketingType.PURCHASE);
        object.getPrice().setPriceIntervalType(PriceIntervalType.ONE_TIME_CHARGE);
        object.getPrice().setValue(new BigDecimal("749999.99"));

        // set courtage attributes
        object.setCourtage(commonFactory.createCourtageInfo());
        object.getCourtage().setCourtage("74999,99 EUR");
        object.getCourtage().setCourtageNote("10% of the purchase price");
        object.getCourtage().setHasCourtage(YesNoNotApplicableType.YES);

        // set contact attributes
        object.setContact(realEstatesFactory.createRealEstateContact());
        object.getContact().setExternalId("example-contact-123");

        // set some more attributes
        object.setBuildingEnergyRatingType(BuildingEnergyRatingType.NO_INFORMATION);
        object.setBuildingType(BuildingType.MULTI_FAMILY_HOUSE);
        object.setCellar(YesNotApplicableType.YES);
        object.setCondition(RealEstateCondition.FIRST_TIME_USE_AFTER_REFURBISHMENT);
        object.setConstructionPhase(ConstructionPhaseType.NO_INFORMATION);
        object.setConstructionYear(1973);
        object.setFreeFrom("from now on");
        object.setGuestToilet(YesNotApplicableType.YES);
        object.setHandicappedAccessible(YesNotApplicableType.NOT_APPLICABLE);
        object.setHeatingTypeEnev2014(HeatingTypeEnev2014.SOLAR_HEATING);
        object.setInteriorQuality(InteriorQuality.LUXURY);
        object.setLastRefurbishment(1995);
        object.setListed(YesNotApplicableType.YES);
        object.setLivingSpace(new BigDecimal("123.45"));
        object.setNumberOfBathRooms(2);
        object.setNumberOfBedRooms(2);
        object.setNumberOfFloors(3);
        object.setNumberOfParkingSpaces(5);
        object.setNumberOfRooms(new BigDecimal("6"));
        object.setParkingSpacePrice(new BigDecimal("423"));
        object.setPlotArea(new BigDecimal("456.78"));
        object.setRentalIncome(new BigDecimal("54223.41"));
        object.setRented(YesNotApplicableType.YES);
        object.setSummerResidencePractical(YesNotApplicableType.YES);
        object.setUsableFloorSpace(new BigDecimal("456.78"));

        try {
            // send as new object to IS24
            System.out.println("Send as new object to IS24");
            long is24ObjectId = RealEstateService.post(client, object);
            System.out.println("Object was created with IS24-ID #" + is24ObjectId);

            // update object at IS24
            System.out.println("Send again as update to IS24");
            RealEstateService.putByIs24Id(client, object, is24ObjectId);

            // remove object from IS24
            System.out.println("Remove object from IS24");
            RealEstateService.deleteByIs24Id(client, is24ObjectId);
        } catch (RequestFailedException ex) {
            throw new RuntimeException("Request failed with "
                    + "'" + ex.statusMessage + "' (" + ex.statusCode + ")!", ex);
        } catch (OAuthException ex) {
            throw new RuntimeException("Authorization failed!", ex);
        } catch (JAXBException ex) {
            throw new RuntimeException("XML processing failed!", ex);
        } catch (IOException ex) {
            throw new RuntimeException("Communication failed!", ex);
        }
    }
}