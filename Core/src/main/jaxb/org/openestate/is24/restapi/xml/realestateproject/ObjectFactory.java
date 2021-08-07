
package org.openestate.is24.restapi.xml.realestateproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.realestateproject package. 
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

    private final static QName _RealEstateProjects_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjects");
    private final static QName _RealEstateProject_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProject");
    private final static QName _RealEstateProjectEntries_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjectEntries");
    private final static QName _RealEstateProjectEntry_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjectEntry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.realestateproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RealEstateProjects }
     * 
     */
    public RealEstateProjects createRealEstateProjects() {
        return new RealEstateProjects();
    }

    /**
     * Create an instance of {@link RealEstateProject }
     * 
     */
    public RealEstateProject createRealEstateProject() {
        return new RealEstateProject();
    }

    /**
     * Create an instance of {@link RealEstateProjectEntries }
     * 
     */
    public RealEstateProjectEntries createRealEstateProjectEntries() {
        return new RealEstateProjectEntries();
    }

    /**
     * Create an instance of {@link RealEstateProjectEntry }
     * 
     */
    public RealEstateProjectEntry createRealEstateProjectEntry() {
        return new RealEstateProjectEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjects")
    public JAXBElement<RealEstateProjects> createRealEstateProjects(RealEstateProjects value) {
        return new JAXBElement<RealEstateProjects>(_RealEstateProjects_QNAME, RealEstateProjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProject }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProject")
    public JAXBElement<RealEstateProject> createRealEstateProject(RealEstateProject value) {
        return new JAXBElement<RealEstateProject>(_RealEstateProject_QNAME, RealEstateProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntries }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntries }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjectEntries")
    public JAXBElement<RealEstateProjectEntries> createRealEstateProjectEntries(RealEstateProjectEntries value) {
        return new JAXBElement<RealEstateProjectEntries>(_RealEstateProjectEntries_QNAME, RealEstateProjectEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjectEntry")
    public JAXBElement<RealEstateProjectEntry> createRealEstateProjectEntry(RealEstateProjectEntry value) {
        return new JAXBElement<RealEstateProjectEntry>(_RealEstateProjectEntry_QNAME, RealEstateProjectEntry.class, null, value);
    }

}
