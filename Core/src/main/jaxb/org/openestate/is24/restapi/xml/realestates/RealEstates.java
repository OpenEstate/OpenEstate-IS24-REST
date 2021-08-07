
package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
import org.openestate.is24.restapi.xml.common.Paging;
import org.openestate.is24.restapi.xml.offerlistelement.RealEstateList;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging"/&gt;
 *         &lt;element name="realEstateList" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}realEstateList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paging",
    "realEstateList"
})
@XmlRootElement(name = "realEstates")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class RealEstates implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(name = "Paging", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected Paging paging;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected RealEstateList realEstateList;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the realEstateList property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public RealEstateList getRealEstateList() {
        return realEstateList;
    }

    /**
     * Sets the value of the realEstateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setRealEstateList(RealEstateList value) {
        this.realEstateList = value;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Paging thePaging;
            thePaging = this.getPaging();
            strategy.appendField(locator, this, "paging", buffer, thePaging, (this.paging!= null));
        }
        {
            RealEstateList theRealEstateList;
            theRealEstateList = this.getRealEstateList();
            strategy.appendField(locator, this, "realEstateList", buffer, theRealEstateList, (this.realEstateList!= null));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof RealEstates) {
            final RealEstates copy = ((RealEstates) draftCopy);
            {
                Boolean pagingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.paging!= null));
                if (pagingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Paging sourcePaging;
                    sourcePaging = this.getPaging();
                    Paging copyPaging = ((Paging) strategy.copy(LocatorUtils.property(locator, "paging", sourcePaging), sourcePaging, (this.paging!= null)));
                    copy.setPaging(copyPaging);
                } else {
                    if (pagingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paging = null;
                    }
                }
            }
            {
                Boolean realEstateListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateList!= null));
                if (realEstateListShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateList sourceRealEstateList;
                    sourceRealEstateList = this.getRealEstateList();
                    RealEstateList copyRealEstateList = ((RealEstateList) strategy.copy(LocatorUtils.property(locator, "realEstateList", sourceRealEstateList), sourceRealEstateList, (this.realEstateList!= null)));
                    copy.setRealEstateList(copyRealEstateList);
                } else {
                    if (realEstateListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateList = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new RealEstates();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstates that = ((RealEstates) object);
        {
            Paging lhsPaging;
            lhsPaging = this.getPaging();
            Paging rhsPaging;
            rhsPaging = that.getPaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paging", lhsPaging), LocatorUtils.property(thatLocator, "paging", rhsPaging), lhsPaging, rhsPaging, (this.paging!= null), (that.paging!= null))) {
                return false;
            }
        }
        {
            RealEstateList lhsRealEstateList;
            lhsRealEstateList = this.getRealEstateList();
            RealEstateList rhsRealEstateList;
            rhsRealEstateList = that.getRealEstateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateList", lhsRealEstateList), LocatorUtils.property(thatLocator, "realEstateList", rhsRealEstateList), lhsRealEstateList, rhsRealEstateList, (this.realEstateList!= null), (that.realEstateList!= null))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
