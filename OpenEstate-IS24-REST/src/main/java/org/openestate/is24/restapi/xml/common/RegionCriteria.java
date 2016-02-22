
package org.openestate.is24.restapi.xml.common;

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
 * Kriterien f\u00fcr die Regionssuche
 * 
 * Generelles Element f\u00fcr die Geo Criterias
 * 
 * <p>Java class for RegionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geoInfoNodeCriteria" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoInfoNodeCriteria" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCriteria", propOrder = {
    "geoInfoNodeCriteria"
})
public class RegionCriteria
    extends AbstractGeoCriteria
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true)
    protected List<GeoInfoNodeCriteria> geoInfoNodeCriteria;

    /**
     * Gets the value of the geoInfoNodeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoInfoNodeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoInfoNodeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoInfoNodeCriteria }
     * 
     * 
     */
    public List<GeoInfoNodeCriteria> getGeoInfoNodeCriteria() {
        if (geoInfoNodeCriteria == null) {
            geoInfoNodeCriteria = new ArrayList<GeoInfoNodeCriteria>();
        }
        return this.geoInfoNodeCriteria;
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
        super.appendFields(locator, buffer, strategy);
        {
            List<GeoInfoNodeCriteria> theGeoInfoNodeCriteria;
            theGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            strategy.appendField(locator, this, "geoInfoNodeCriteria", buffer, theGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof RegionCriteria) {
            final RegionCriteria copy = ((RegionCriteria) draftCopy);
            {
                Boolean geoInfoNodeCriteriaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())));
                if (geoInfoNodeCriteriaShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoInfoNodeCriteria> sourceGeoInfoNodeCriteria;
                    sourceGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
                    @SuppressWarnings("unchecked")
                    List<GeoInfoNodeCriteria> copyGeoInfoNodeCriteria = ((List<GeoInfoNodeCriteria> ) strategy.copy(LocatorUtils.property(locator, "geoInfoNodeCriteria", sourceGeoInfoNodeCriteria), sourceGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))));
                    copy.geoInfoNodeCriteria = null;
                    if (copyGeoInfoNodeCriteria!= null) {
                        List<GeoInfoNodeCriteria> uniqueGeoInfoNodeCriterial = copy.getGeoInfoNodeCriteria();
                        uniqueGeoInfoNodeCriterial.addAll(copyGeoInfoNodeCriteria);
                    }
                } else {
                    if (geoInfoNodeCriteriaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoInfoNodeCriteria = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new RegionCriteria();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegionCriteria that = ((RegionCriteria) object);
        {
            List<GeoInfoNodeCriteria> lhsGeoInfoNodeCriteria;
            lhsGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            List<GeoInfoNodeCriteria> rhsGeoInfoNodeCriteria;
            rhsGeoInfoNodeCriteria = (((that.geoInfoNodeCriteria!= null)&&(!that.geoInfoNodeCriteria.isEmpty()))?that.getGeoInfoNodeCriteria():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoInfoNodeCriteria", lhsGeoInfoNodeCriteria), LocatorUtils.property(thatLocator, "geoInfoNodeCriteria", rhsGeoInfoNodeCriteria), lhsGeoInfoNodeCriteria, rhsGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())), ((that.geoInfoNodeCriteria!= null)&&(!that.geoInfoNodeCriteria.isEmpty())))) {
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
