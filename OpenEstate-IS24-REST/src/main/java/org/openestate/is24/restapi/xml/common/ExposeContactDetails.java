//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.24 at 03:30:52 PM CEST 
//


package org.openestate.is24.restapi.xml.common;

import java.net.URL;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openestate.is24.restapi.xml.Adapter1;


/**
 * Die Kontaktdaten eines Exposes
 * 
 * <p>Java class for ExposeContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExposeContactDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails">
 *       &lt;sequence>
 *         &lt;element name="realtorLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExposeContactDetails", propOrder = {
    "realtorLogo"
})
public class ExposeContactDetails
    extends ContactDetails
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "anyURI")
    protected URL realtorLogo;

    /**
     * Gets the value of the realtorLogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public URL getRealtorLogo() {
        return realtorLogo;
    }

    /**
     * Sets the value of the realtorLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealtorLogo(URL value) {
        this.realtorLogo = value;
    }

}
