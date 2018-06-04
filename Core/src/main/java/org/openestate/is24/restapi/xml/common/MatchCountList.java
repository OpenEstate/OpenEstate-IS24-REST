
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * Liste der Trefferzahlen zu den Verfeinerungskriterien.
 * 
 * <p>Java class for MatchCountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchCountList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchCount" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchCountList", propOrder = {
    "matchCount"
})
public class MatchCountList implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
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
            List<MatchCount> theMatchCount;
            theMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
            strategy.appendField(locator, this, "matchCount", buffer, theMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())));
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
        if (draftCopy instanceof MatchCountList) {
            final MatchCountList copy = ((MatchCountList) draftCopy);
            {
                Boolean matchCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())));
                if (matchCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MatchCount> sourceMatchCount;
                    sourceMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
                    @SuppressWarnings("unchecked")
                    List<MatchCount> copyMatchCount = ((List<MatchCount> ) strategy.copy(LocatorUtils.property(locator, "matchCount", sourceMatchCount), sourceMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty()))));
                    copy.matchCount = null;
                    if (copyMatchCount!= null) {
                        List<MatchCount> uniqueMatchCountl = copy.getMatchCount();
                        uniqueMatchCountl.addAll(copyMatchCount);
                    }
                } else {
                    if (matchCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.matchCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MatchCountList();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
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
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchCount", lhsMatchCount), LocatorUtils.property(thatLocator, "matchCount", rhsMatchCount), lhsMatchCount, rhsMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())), ((that.matchCount!= null)&&(!that.matchCount.isEmpty())))) {
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
