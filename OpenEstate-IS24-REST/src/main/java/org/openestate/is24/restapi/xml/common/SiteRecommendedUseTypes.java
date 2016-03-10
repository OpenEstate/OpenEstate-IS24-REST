
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Empfohlene Nutzungsarten eines Wohngrundstuecks
 * 
 * <p>Java class for SiteRecommendedUseTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteRecommendedUseTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteRecommendedUseType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseType" maxOccurs="13" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseTypes", propOrder = {
    "siteRecommendedUseType"
})
public class SiteRecommendedUseTypes implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected List<SiteRecommendedUseType> siteRecommendedUseType;

    /**
     * Gets the value of the siteRecommendedUseType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRecommendedUseType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRecommendedUseType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseType }
     * 
     * 
     */
    public List<SiteRecommendedUseType> getSiteRecommendedUseType() {
        if (siteRecommendedUseType == null) {
            siteRecommendedUseType = new ArrayList<SiteRecommendedUseType>();
        }
        return this.siteRecommendedUseType;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<SiteRecommendedUseType> theSiteRecommendedUseType;
            theSiteRecommendedUseType = (((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty()))?this.getSiteRecommendedUseType():null);
            strategy.appendField(locator, this, "siteRecommendedUseType", buffer, theSiteRecommendedUseType, ((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty())));
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof SiteRecommendedUseTypes) {
            final SiteRecommendedUseTypes copy = ((SiteRecommendedUseTypes) draftCopy);
            {
                Boolean siteRecommendedUseTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty())));
                if (siteRecommendedUseTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SiteRecommendedUseType> sourceSiteRecommendedUseType;
                    sourceSiteRecommendedUseType = (((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty()))?this.getSiteRecommendedUseType():null);
                    @SuppressWarnings("unchecked")
                    List<SiteRecommendedUseType> copySiteRecommendedUseType = ((List<SiteRecommendedUseType> ) strategy.copy(LocatorUtils.property(locator, "siteRecommendedUseType", sourceSiteRecommendedUseType), sourceSiteRecommendedUseType, ((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty()))));
                    copy.siteRecommendedUseType = null;
                    if (copySiteRecommendedUseType!= null) {
                        List<SiteRecommendedUseType> uniqueSiteRecommendedUseTypel = copy.getSiteRecommendedUseType();
                        uniqueSiteRecommendedUseTypel.addAll(copySiteRecommendedUseType);
                    }
                } else {
                    if (siteRecommendedUseTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.siteRecommendedUseType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SiteRecommendedUseTypes();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SiteRecommendedUseTypes that = ((SiteRecommendedUseTypes) object);
        {
            List<SiteRecommendedUseType> lhsSiteRecommendedUseType;
            lhsSiteRecommendedUseType = (((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty()))?this.getSiteRecommendedUseType():null);
            List<SiteRecommendedUseType> rhsSiteRecommendedUseType;
            rhsSiteRecommendedUseType = (((that.siteRecommendedUseType!= null)&&(!that.siteRecommendedUseType.isEmpty()))?that.getSiteRecommendedUseType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteRecommendedUseType", lhsSiteRecommendedUseType), LocatorUtils.property(thatLocator, "siteRecommendedUseType", rhsSiteRecommendedUseType), lhsSiteRecommendedUseType, rhsSiteRecommendedUseType, ((this.siteRecommendedUseType!= null)&&(!this.siteRecommendedUseType.isEmpty())), ((that.siteRecommendedUseType!= null)&&(!that.siteRecommendedUseType.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
