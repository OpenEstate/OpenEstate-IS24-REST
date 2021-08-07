
package org.openestate.is24.restapi.xml.realtorbadges;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.realtorbadges package. 
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

    private final static QName _Badge_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", "badge");
    private final static QName _VirtualBadge_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", "virtualBadge");
    private final static QName _RealtorBadges_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", "realtorBadges");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.realtorbadges
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RealtorBadges }
     * 
     */
    public RealtorBadges createRealtorBadges() {
        return new RealtorBadges();
    }

    /**
     * Create an instance of {@link Badge }
     * 
     */
    public Badge createBadge() {
        return new Badge();
    }

    /**
     * Create an instance of {@link VirtualBadge }
     * 
     */
    public VirtualBadge createVirtualBadge() {
        return new VirtualBadge();
    }

    /**
     * Create an instance of {@link RealtorBadges.Badges }
     * 
     */
    public RealtorBadges.Badges createRealtorBadgesBadges() {
        return new RealtorBadges.Badges();
    }

    /**
     * Create an instance of {@link RealtorBadges.VirtualBadges }
     * 
     */
    public RealtorBadges.VirtualBadges createRealtorBadgesVirtualBadges() {
        return new RealtorBadges.VirtualBadges();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Badge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Badge }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", name = "badge")
    public JAXBElement<Badge> createBadge(Badge value) {
        return new JAXBElement<Badge>(_Badge_QNAME, Badge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirtualBadge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirtualBadge }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", name = "virtualBadge")
    public JAXBElement<VirtualBadge> createVirtualBadge(VirtualBadge value) {
        return new JAXBElement<VirtualBadge>(_VirtualBadge_QNAME, VirtualBadge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealtorBadges }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealtorBadges }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0", name = "realtorBadges")
    public JAXBElement<RealtorBadges> createRealtorBadges(RealtorBadges value) {
        return new JAXBElement<RealtorBadges>(_RealtorBadges_QNAME, RealtorBadges.class, null, value);
    }

}
