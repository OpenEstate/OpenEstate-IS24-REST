
package org.openestate.is24.restapi.xml.common;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import org.openestate.is24.restapi.xml.Adapter1;


/**
 * Datum von bis
 * 
 * <p>Java class for DateRange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange", propOrder = {

})
public class DateRange
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateFrom;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateTo;

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(Calendar value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(Calendar value) {
        this.dateTo = value;
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
            Calendar theDateFrom;
            theDateFrom = this.getDateFrom();
            strategy.appendField(locator, this, "dateFrom", buffer, theDateFrom);
        }
        {
            Calendar theDateTo;
            theDateTo = this.getDateTo();
            strategy.appendField(locator, this, "dateTo", buffer, theDateTo);
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
        if (draftCopy instanceof DateRange) {
            final DateRange copy = ((DateRange) draftCopy);
            if (this.dateFrom!= null) {
                Calendar sourceDateFrom;
                sourceDateFrom = this.getDateFrom();
                Calendar copyDateFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateFrom", sourceDateFrom), sourceDateFrom));
                copy.setDateFrom(copyDateFrom);
            } else {
                copy.dateFrom = null;
            }
            if (this.dateTo!= null) {
                Calendar sourceDateTo;
                sourceDateTo = this.getDateTo();
                Calendar copyDateTo = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateTo", sourceDateTo), sourceDateTo));
                copy.setDateTo(copyDateTo);
            } else {
                copy.dateTo = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DateRange();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DateRange)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DateRange that = ((DateRange) object);
        {
            Calendar lhsDateFrom;
            lhsDateFrom = this.getDateFrom();
            Calendar rhsDateFrom;
            rhsDateFrom = that.getDateFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateFrom", lhsDateFrom), LocatorUtils.property(thatLocator, "dateFrom", rhsDateFrom), lhsDateFrom, rhsDateFrom)) {
                return false;
            }
        }
        {
            Calendar lhsDateTo;
            lhsDateTo = this.getDateTo();
            Calendar rhsDateTo;
            rhsDateTo = that.getDateTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTo", lhsDateTo), LocatorUtils.property(thatLocator, "dateTo", rhsDateTo), lhsDateTo, rhsDateTo)) {
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
