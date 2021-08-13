
package org.openestate.is24.restapi.xml.realtor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.realtor package. 
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

    private final static QName _Realtor_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realtor/1.0", "realtor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.realtor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Realtor }
     * 
     */
    public Realtor createRealtor() {
        return new Realtor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Realtor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Realtor }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realtor/1.0", name = "realtor")
    public JAXBElement<Realtor> createRealtor(Realtor value) {
        return new JAXBElement<Realtor>(_Realtor_QNAME, Realtor.class, null, value);
    }

}
