
package org.openestate.is24.restapi.xml.gis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.gis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Continent_QNAME = new QName("http://rest.immobilienscout24.de/schema/platform/gis/1.0", "continent");
    private final static QName _Country_QNAME = new QName("http://rest.immobilienscout24.de/schema/platform/gis/1.0", "country");
    private final static QName _Region_QNAME = new QName("http://rest.immobilienscout24.de/schema/platform/gis/1.0", "region");
    private final static QName _City_QNAME = new QName("http://rest.immobilienscout24.de/schema/platform/gis/1.0", "city");
    private final static QName _Quarter_QNAME = new QName("http://rest.immobilienscout24.de/schema/platform/gis/1.0", "quarter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.gis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Continents }
     * 
     */
    public Continents createContinents() {
        return new Continents();
    }

    /**
     * Create an instance of {@link Countries }
     * 
     */
    public Countries createCountries() {
        return new Countries();
    }

    /**
     * Create an instance of {@link Regions }
     * 
     */
    public Regions createRegions() {
        return new Regions();
    }

    /**
     * Create an instance of {@link Cities }
     * 
     */
    public Cities createCities() {
        return new Cities();
    }

    /**
     * Create an instance of {@link Quarters }
     * 
     */
    public Quarters createQuarters() {
        return new Quarters();
    }

    /**
     * Create an instance of {@link Continents.Continent }
     * 
     */
    public Continents.Continent createContinentsContinent() {
        return new Continents.Continent();
    }

    /**
     * Create an instance of {@link Countries.Country }
     * 
     */
    public Countries.Country createCountriesCountry() {
        return new Countries.Country();
    }

    /**
     * Create an instance of {@link Regions.Region }
     * 
     */
    public Regions.Region createRegionsRegion() {
        return new Regions.Region();
    }

    /**
     * Create an instance of {@link Cities.City }
     * 
     */
    public Cities.City createCitiesCity() {
        return new Cities.City();
    }

    /**
     * Create an instance of {@link Quarters.Quarter }
     * 
     */
    public Quarters.Quarter createQuartersQuarter() {
        return new Quarters.Quarter();
    }

    /**
     * Create an instance of {@link GeoCodedAddressList }
     * 
     */
    public GeoCodedAddressList createGeoCodedAddressList() {
        return new GeoCodedAddressList();
    }

    /**
     * Create an instance of {@link GeoCodedAddress }
     * 
     */
    public GeoCodedAddress createGeoCodedAddress() {
        return new GeoCodedAddress();
    }

    /**
     * Create an instance of {@link GeoHierarchyInfo }
     * 
     */
    public GeoHierarchyInfo createGeoHierarchyInfo() {
        return new GeoHierarchyInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Continent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Continent }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/platform/gis/1.0", name = "continent")
    public JAXBElement<org.openestate.is24.restapi.xml.common.Continent> createContinent(org.openestate.is24.restapi.xml.common.Continent value) {
        return new JAXBElement<org.openestate.is24.restapi.xml.common.Continent>(_Continent_QNAME, org.openestate.is24.restapi.xml.common.Continent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Country }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Country }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/platform/gis/1.0", name = "country")
    public JAXBElement<org.openestate.is24.restapi.xml.common.Country> createCountry(org.openestate.is24.restapi.xml.common.Country value) {
        return new JAXBElement<org.openestate.is24.restapi.xml.common.Country>(_Country_QNAME, org.openestate.is24.restapi.xml.common.Country.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Region }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Region }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/platform/gis/1.0", name = "region")
    public JAXBElement<org.openestate.is24.restapi.xml.common.Region> createRegion(org.openestate.is24.restapi.xml.common.Region value) {
        return new JAXBElement<org.openestate.is24.restapi.xml.common.Region>(_Region_QNAME, org.openestate.is24.restapi.xml.common.Region.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.City }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.City }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/platform/gis/1.0", name = "city")
    public JAXBElement<org.openestate.is24.restapi.xml.common.City> createCity(org.openestate.is24.restapi.xml.common.City value) {
        return new JAXBElement<org.openestate.is24.restapi.xml.common.City>(_City_QNAME, org.openestate.is24.restapi.xml.common.City.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Quarter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.openestate.is24.restapi.xml.common.Quarter }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/platform/gis/1.0", name = "quarter")
    public JAXBElement<org.openestate.is24.restapi.xml.common.Quarter> createQuarter(org.openestate.is24.restapi.xml.common.Quarter value) {
        return new JAXBElement<org.openestate.is24.restapi.xml.common.Quarter>(_Quarter_QNAME, org.openestate.is24.restapi.xml.common.Quarter.class, null, value);
    }

}
