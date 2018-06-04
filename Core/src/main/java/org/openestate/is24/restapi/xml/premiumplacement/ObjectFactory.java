
package org.openestate.is24.restapi.xml.premiumplacement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.premiumplacement package. 
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

    private final static QName _Premiumplacements_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0", "premiumplacements");
    private final static QName _Premiumplacement_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0", "premiumplacement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.premiumplacement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Premiumplacements }
     * 
     */
    public Premiumplacements createPremiumplacements() {
        return new Premiumplacements();
    }

    /**
     * Create an instance of {@link Premiumplacement }
     * 
     */
    public Premiumplacement createPremiumplacement() {
        return new Premiumplacement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Premiumplacements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0", name = "premiumplacements")
    public JAXBElement<Premiumplacements> createPremiumplacements(Premiumplacements value) {
        return new JAXBElement<Premiumplacements>(_Premiumplacements_QNAME, Premiumplacements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Premiumplacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0", name = "premiumplacement")
    public JAXBElement<Premiumplacement> createPremiumplacement(Premiumplacement value) {
        return new JAXBElement<Premiumplacement>(_Premiumplacement_QNAME, Premiumplacement.class, null, value);
    }

}
