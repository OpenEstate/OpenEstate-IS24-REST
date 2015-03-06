
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Liste der Trefferzahlen zu den Verfeinerungskriterien.
 * 
 * <p>Java class for MatchCountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchCountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchCount" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchCountList", propOrder = {
    "matchCount"
})
public class MatchCountList
    implements Cloneable, CopyTo, Equals, ToString
{

    protected List<MatchCount> matchCount;

    /**
     * Gets the value of the matchCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchCount }
     * 
     * 
     */
    public List<MatchCount> getMatchCount() {
        if (matchCount == null) {
            matchCount = new ArrayList<MatchCount>();
        }
        return this.matchCount;
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
            List<MatchCount> theMatchCount;
            theMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
            strategy.appendField(locator, this, "matchCount", buffer, theMatchCount);
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
        if (draftCopy instanceof MatchCountList) {
            final MatchCountList copy = ((MatchCountList) draftCopy);
            if ((this.matchCount!= null)&&(!this.matchCount.isEmpty())) {
                List<MatchCount> sourceMatchCount;
                sourceMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
                @SuppressWarnings("unchecked")
                List<MatchCount> copyMatchCount = ((List<MatchCount> ) strategy.copy(LocatorUtils.property(locator, "matchCount", sourceMatchCount), sourceMatchCount));
                copy.matchCount = null;
                if (copyMatchCount!= null) {
                    List<MatchCount> uniqueMatchCountl = copy.getMatchCount();
                    uniqueMatchCountl.addAll(copyMatchCount);
                }
            } else {
                copy.matchCount = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MatchCountList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MatchCountList)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MatchCountList that = ((MatchCountList) object);
        {
            List<MatchCount> lhsMatchCount;
            lhsMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
            List<MatchCount> rhsMatchCount;
            rhsMatchCount = (((that.matchCount!= null)&&(!that.matchCount.isEmpty()))?that.getMatchCount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchCount", lhsMatchCount), LocatorUtils.property(thatLocator, "matchCount", rhsMatchCount), lhsMatchCount, rhsMatchCount)) {
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
