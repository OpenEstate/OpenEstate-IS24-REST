
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
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
 * Empfohlene Nutzungsarten eines Gewerbegrundstuecks
 * 
 * <p>Java class for SiteRecommendedUseForTradeTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteRecommendedUseForTradeTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="siteRecommendedUseForTradeType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseForTradeType" maxOccurs="22" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseForTradeTypes", propOrder = {
    "siteRecommendedUseForTradeType"
})
public class SiteRecommendedUseForTradeTypes implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlSchemaType(name = "string")
    protected List<SiteRecommendedUseForTradeType> siteRecommendedUseForTradeType;

    /**
     * Gets the value of the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteRecommendedUseForTradeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteRecommendedUseForTradeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseForTradeType }
     * 
     * 
     */
    public List<SiteRecommendedUseForTradeType> getSiteRecommendedUseForTradeType() {
        if (siteRecommendedUseForTradeType == null) {
            siteRecommendedUseForTradeType = new ArrayList<SiteRecommendedUseForTradeType>();
        }
        return this.siteRecommendedUseForTradeType;
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
            List<SiteRecommendedUseForTradeType> theSiteRecommendedUseForTradeType;
            theSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            strategy.appendField(locator, this, "siteRecommendedUseForTradeType", buffer, theSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())));
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
        if (draftCopy instanceof SiteRecommendedUseForTradeTypes) {
            final SiteRecommendedUseForTradeTypes copy = ((SiteRecommendedUseForTradeTypes) draftCopy);
            {
                Boolean siteRecommendedUseForTradeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())));
                if (siteRecommendedUseForTradeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SiteRecommendedUseForTradeType> sourceSiteRecommendedUseForTradeType;
                    sourceSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
                    @SuppressWarnings("unchecked")
                    List<SiteRecommendedUseForTradeType> copySiteRecommendedUseForTradeType = ((List<SiteRecommendedUseForTradeType> ) strategy.copy(LocatorUtils.property(locator, "siteRecommendedUseForTradeType", sourceSiteRecommendedUseForTradeType), sourceSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))));
                    copy.siteRecommendedUseForTradeType = null;
                    if (copySiteRecommendedUseForTradeType!= null) {
                        List<SiteRecommendedUseForTradeType> uniqueSiteRecommendedUseForTradeTypel = copy.getSiteRecommendedUseForTradeType();
                        uniqueSiteRecommendedUseForTradeTypel.addAll(copySiteRecommendedUseForTradeType);
                    }
                } else {
                    if (siteRecommendedUseForTradeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.siteRecommendedUseForTradeType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SiteRecommendedUseForTradeTypes();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SiteRecommendedUseForTradeTypes that = ((SiteRecommendedUseForTradeTypes) object);
        {
            List<SiteRecommendedUseForTradeType> lhsSiteRecommendedUseForTradeType;
            lhsSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            List<SiteRecommendedUseForTradeType> rhsSiteRecommendedUseForTradeType;
            rhsSiteRecommendedUseForTradeType = (((that.siteRecommendedUseForTradeType!= null)&&(!that.siteRecommendedUseForTradeType.isEmpty()))?that.getSiteRecommendedUseForTradeType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteRecommendedUseForTradeType", lhsSiteRecommendedUseForTradeType), LocatorUtils.property(thatLocator, "siteRecommendedUseForTradeType", rhsSiteRecommendedUseForTradeType), lhsSiteRecommendedUseForTradeType, rhsSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())), ((that.siteRecommendedUseForTradeType!= null)&&(!that.siteRecommendedUseForTradeType.isEmpty())))) {
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
