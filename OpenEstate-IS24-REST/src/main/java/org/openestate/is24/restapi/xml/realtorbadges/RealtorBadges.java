
package org.openestate.is24.restapi.xml.realtorbadges;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for RealtorBadges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealtorBadges"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="badges"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="badge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}Badge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorBadges", propOrder = {

})
public class RealtorBadges implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected RealtorBadges.Badges badges;

    /**
     * Gets the value of the badges property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorBadges.Badges }
     *     
     */
    public RealtorBadges.Badges getBadges() {
        return badges;
    }

    /**
     * Sets the value of the badges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorBadges.Badges }
     *     
     */
    public void setBadges(RealtorBadges.Badges value) {
        this.badges = value;
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
            RealtorBadges.Badges theBadges;
            theBadges = this.getBadges();
            strategy.appendField(locator, this, "badges", buffer, theBadges, (this.badges!= null));
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
        if (draftCopy instanceof RealtorBadges) {
            final RealtorBadges copy = ((RealtorBadges) draftCopy);
            {
                Boolean badgesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.badges!= null));
                if (badgesShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorBadges.Badges sourceBadges;
                    sourceBadges = this.getBadges();
                    RealtorBadges.Badges copyBadges = ((RealtorBadges.Badges) strategy.copy(LocatorUtils.property(locator, "badges", sourceBadges), sourceBadges, (this.badges!= null)));
                    copy.setBadges(copyBadges);
                } else {
                    if (badgesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.badges = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RealtorBadges();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealtorBadges that = ((RealtorBadges) object);
        {
            RealtorBadges.Badges lhsBadges;
            lhsBadges = this.getBadges();
            RealtorBadges.Badges rhsBadges;
            rhsBadges = that.getBadges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "badges", lhsBadges), LocatorUtils.property(thatLocator, "badges", rhsBadges), lhsBadges, rhsBadges, (this.badges!= null), (that.badges!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }


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
     *         &lt;element name="badge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}Badge" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "badge"
    })
    public static class Badges implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        protected List<Badge> badge;

        /**
         * Gets the value of the badge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the badge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBadge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Badge }
         * 
         * 
         */
        public List<Badge> getBadge() {
            if (badge == null) {
                badge = new ArrayList<Badge>();
            }
            return this.badge;
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
                List<Badge> theBadge;
                theBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                strategy.appendField(locator, this, "badge", buffer, theBadge, ((this.badge!= null)&&(!this.badge.isEmpty())));
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
            if (draftCopy instanceof RealtorBadges.Badges) {
                final RealtorBadges.Badges copy = ((RealtorBadges.Badges) draftCopy);
                {
                    Boolean badgeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.badge!= null)&&(!this.badge.isEmpty())));
                    if (badgeShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Badge> sourceBadge;
                        sourceBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                        @SuppressWarnings("unchecked")
                        List<Badge> copyBadge = ((List<Badge> ) strategy.copy(LocatorUtils.property(locator, "badge", sourceBadge), sourceBadge, ((this.badge!= null)&&(!this.badge.isEmpty()))));
                        copy.badge = null;
                        if (copyBadge!= null) {
                            List<Badge> uniqueBadgel = copy.getBadge();
                            uniqueBadgel.addAll(copyBadge);
                        }
                    } else {
                        if (badgeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.badge = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new RealtorBadges.Badges();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final RealtorBadges.Badges that = ((RealtorBadges.Badges) object);
            {
                List<Badge> lhsBadge;
                lhsBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                List<Badge> rhsBadge;
                rhsBadge = (((that.badge!= null)&&(!that.badge.isEmpty()))?that.getBadge():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "badge", lhsBadge), LocatorUtils.property(thatLocator, "badge", rhsBadge), lhsBadge, rhsBadge, ((this.badge!= null)&&(!this.badge.isEmpty())), ((that.badge!= null)&&(!that.badge.isEmpty())))) {
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

}
