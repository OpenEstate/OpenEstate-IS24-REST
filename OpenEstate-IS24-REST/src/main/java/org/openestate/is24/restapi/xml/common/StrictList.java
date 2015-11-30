
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


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
 *         &lt;element name="paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging" minOccurs="0"/&gt;
 *         &lt;element name="matchCountList" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCountList" minOccurs="0"/&gt;
 *         &lt;element name="strictEntry" type="{http://rest.immobilienscout24.de/schema/common/1.0}StrictEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "matchCountList",
    "strictEntry"
})
@XmlRootElement(name = "strictList")
public class StrictList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected Paging paging;
    protected MatchCountList matchCountList;
    protected List<StrictEntry> strictEntry;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
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
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the matchCountList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchCountList }
     *     
     */
    public MatchCountList getMatchCountList() {
        return matchCountList;
    }

    /**
     * Sets the value of the matchCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchCountList }
     *     
     */
    public void setMatchCountList(MatchCountList value) {
        this.matchCountList = value;
    }

    /**
     * Gets the value of the strictEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strictEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrictEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrictEntry }
     * 
     * 
     */
    public List<StrictEntry> getStrictEntry() {
        if (strictEntry == null) {
            strictEntry = new ArrayList<StrictEntry>();
        }
        return this.strictEntry;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            Paging thePaging;
            thePaging = this.getPaging();
            strategy.appendField(locator, this, "paging", buffer, thePaging);
        }
        {
            MatchCountList theMatchCountList;
            theMatchCountList = this.getMatchCountList();
            strategy.appendField(locator, this, "matchCountList", buffer, theMatchCountList);
        }
        {
            List<StrictEntry> theStrictEntry;
            theStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
            strategy.appendField(locator, this, "strictEntry", buffer, theStrictEntry);
        }
        return buffer;
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof StrictList) {
            final StrictList copy = ((StrictList) draftCopy);
            if (this.paging!= null) {
                Paging sourcePaging;
                sourcePaging = this.getPaging();
                Paging copyPaging = ((Paging) strategy.copy(LocatorUtils.property(locator, "paging", sourcePaging), sourcePaging));
                copy.setPaging(copyPaging);
            } else {
                copy.paging = null;
            }
            if (this.matchCountList!= null) {
                MatchCountList sourceMatchCountList;
                sourceMatchCountList = this.getMatchCountList();
                MatchCountList copyMatchCountList = ((MatchCountList) strategy.copy(LocatorUtils.property(locator, "matchCountList", sourceMatchCountList), sourceMatchCountList));
                copy.setMatchCountList(copyMatchCountList);
            } else {
                copy.matchCountList = null;
            }
            if ((this.strictEntry!= null)&&(!this.strictEntry.isEmpty())) {
                List<StrictEntry> sourceStrictEntry;
                sourceStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
                @SuppressWarnings("unchecked")
                List<StrictEntry> copyStrictEntry = ((List<StrictEntry> ) strategy.copy(LocatorUtils.property(locator, "strictEntry", sourceStrictEntry), sourceStrictEntry));
                copy.strictEntry = null;
                if (copyStrictEntry!= null) {
                    List<StrictEntry> uniqueStrictEntryl = copy.getStrictEntry();
                    uniqueStrictEntryl.addAll(copyStrictEntry);
                }
            } else {
                copy.strictEntry = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new StrictList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final StrictList that = ((StrictList) object);
        {
            Paging lhsPaging;
            lhsPaging = this.getPaging();
            Paging rhsPaging;
            rhsPaging = that.getPaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paging", lhsPaging), LocatorUtils.property(thatLocator, "paging", rhsPaging), lhsPaging, rhsPaging)) {
                return false;
            }
        }
        {
            MatchCountList lhsMatchCountList;
            lhsMatchCountList = this.getMatchCountList();
            MatchCountList rhsMatchCountList;
            rhsMatchCountList = that.getMatchCountList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchCountList", lhsMatchCountList), LocatorUtils.property(thatLocator, "matchCountList", rhsMatchCountList), lhsMatchCountList, rhsMatchCountList)) {
                return false;
            }
        }
        {
            List<StrictEntry> lhsStrictEntry;
            lhsStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
            List<StrictEntry> rhsStrictEntry;
            rhsStrictEntry = (((that.strictEntry!= null)&&(!that.strictEntry.isEmpty()))?that.getStrictEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strictEntry", lhsStrictEntry), LocatorUtils.property(thatLocator, "strictEntry", rhsStrictEntry), lhsStrictEntry, rhsStrictEntry)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
