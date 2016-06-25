
package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 * Enth\u00e4lt die Informationen f\u00fcr die API Suche einer Immobilie.
 *       
 * 
 * <p>Java class for ApiSearchData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApiSearchData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchField1" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/&gt;
 *         &lt;element name="searchField2" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/&gt;
 *         &lt;element name="searchField3" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSearchData", propOrder = {
    "searchField1",
    "searchField2",
    "searchField3"
})
public class ApiSearchData implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField1;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField2;
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected String searchField3;

    /**
     * Gets the value of the searchField1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField1() {
        return searchField1;
    }

    /**
     * Sets the value of the searchField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField1(String value) {
        this.searchField1 = value;
    }

    /**
     * Gets the value of the searchField2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField2() {
        return searchField2;
    }

    /**
     * Sets the value of the searchField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField2(String value) {
        this.searchField2 = value;
    }

    /**
     * Gets the value of the searchField3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchField3() {
        return searchField3;
    }

    /**
     * Sets the value of the searchField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchField3(String value) {
        this.searchField3 = value;
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
            String theSearchField1;
            theSearchField1 = this.getSearchField1();
            strategy.appendField(locator, this, "searchField1", buffer, theSearchField1, (this.searchField1 != null));
        }
        {
            String theSearchField2;
            theSearchField2 = this.getSearchField2();
            strategy.appendField(locator, this, "searchField2", buffer, theSearchField2, (this.searchField2 != null));
        }
        {
            String theSearchField3;
            theSearchField3 = this.getSearchField3();
            strategy.appendField(locator, this, "searchField3", buffer, theSearchField3, (this.searchField3 != null));
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
        if (draftCopy instanceof ApiSearchData) {
            final ApiSearchData copy = ((ApiSearchData) draftCopy);
            {
                Boolean searchField1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField1 != null));
                if (searchField1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField1;
                    sourceSearchField1 = this.getSearchField1();
                    String copySearchField1 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField1", sourceSearchField1), sourceSearchField1, (this.searchField1 != null)));
                    copy.setSearchField1(copySearchField1);
                } else {
                    if (searchField1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField1 = null;
                    }
                }
            }
            {
                Boolean searchField2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField2 != null));
                if (searchField2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField2;
                    sourceSearchField2 = this.getSearchField2();
                    String copySearchField2 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField2", sourceSearchField2), sourceSearchField2, (this.searchField2 != null)));
                    copy.setSearchField2(copySearchField2);
                } else {
                    if (searchField2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField2 = null;
                    }
                }
            }
            {
                Boolean searchField3ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField3 != null));
                if (searchField3ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField3;
                    sourceSearchField3 = this.getSearchField3();
                    String copySearchField3 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField3", sourceSearchField3), sourceSearchField3, (this.searchField3 != null)));
                    copy.setSearchField3(copySearchField3);
                } else {
                    if (searchField3ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField3 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ApiSearchData();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ApiSearchData that = ((ApiSearchData) object);
        {
            String lhsSearchField1;
            lhsSearchField1 = this.getSearchField1();
            String rhsSearchField1;
            rhsSearchField1 = that.getSearchField1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField1", lhsSearchField1), LocatorUtils.property(thatLocator, "searchField1", rhsSearchField1), lhsSearchField1, rhsSearchField1, (this.searchField1 != null), (that.searchField1 != null))) {
                return false;
            }
        }
        {
            String lhsSearchField2;
            lhsSearchField2 = this.getSearchField2();
            String rhsSearchField2;
            rhsSearchField2 = that.getSearchField2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField2", lhsSearchField2), LocatorUtils.property(thatLocator, "searchField2", rhsSearchField2), lhsSearchField2, rhsSearchField2, (this.searchField2 != null), (that.searchField2 != null))) {
                return false;
            }
        }
        {
            String lhsSearchField3;
            lhsSearchField3 = this.getSearchField3();
            String rhsSearchField3;
            rhsSearchField3 = that.getSearchField3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField3", lhsSearchField3), LocatorUtils.property(thatLocator, "searchField3", rhsSearchField3), lhsSearchField3, rhsSearchField3, (this.searchField3 != null), (that.searchField3 != null))) {
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
