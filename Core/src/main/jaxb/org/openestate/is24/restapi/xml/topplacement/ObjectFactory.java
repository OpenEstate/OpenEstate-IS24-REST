
package org.openestate.is24.restapi.xml.topplacement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.topplacement package. 
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

    private final static QName _Topplacements_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", "topplacements");
    private final static QName _Topplacement_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", "topplacement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.topplacement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Topplacements }
     * 
     */
    public Topplacements createTopplacements() {
        return new Topplacements();
    }

    /**
     * Create an instance of {@link Topplacement }
     * 
     */
    public Topplacement createTopplacement() {
        return new Topplacement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topplacements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Topplacements }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", name = "topplacements")
    public JAXBElement<Topplacements> createTopplacements(Topplacements value) {
        return new JAXBElement<Topplacements>(_Topplacements_QNAME, Topplacements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topplacement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Topplacement }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/topplacement/1.0", name = "topplacement")
    public JAXBElement<Topplacement> createTopplacement(Topplacement value) {
        return new JAXBElement<Topplacement>(_Topplacement_QNAME, Topplacement.class, null, value);
    }

}
