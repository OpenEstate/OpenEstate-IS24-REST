
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
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
 * Liste von Bauprojekte
 * 
 * <p>Java class for RealEstateProjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealEstateProjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realEstateProject" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjects", propOrder = {
    "realEstateProject"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
public class RealEstateProjects implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    protected List<RealEstateProject> realEstateProject;

    /**
     * Gets the value of the realEstateProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEstateProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealEstateProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateProject }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public List<RealEstateProject> getRealEstateProject() {
        if (realEstateProject == null) {
            realEstateProject = new ArrayList<RealEstateProject>();
        }
        return this.realEstateProject;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<RealEstateProject> theRealEstateProject;
            theRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
            strategy.appendField(locator, this, "realEstateProject", buffer, theRealEstateProject, ((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty())));
        }
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE2;
        return copyTo(null, target, strategy);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof RealEstateProjects) {
            final RealEstateProjects copy = ((RealEstateProjects) draftCopy);
            {
                Boolean realEstateProjectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty())));
                if (realEstateProjectShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<RealEstateProject> sourceRealEstateProject;
                    sourceRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
                    @SuppressWarnings("unchecked")
                    List<RealEstateProject> copyRealEstateProject = ((List<RealEstateProject> ) strategy.copy(LocatorUtils.property(locator, "realEstateProject", sourceRealEstateProject), sourceRealEstateProject, ((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))));
                    copy.realEstateProject = null;
                    if (copyRealEstateProject!= null) {
                        List<RealEstateProject> uniqueRealEstateProjectl = copy.getRealEstateProject();
                        uniqueRealEstateProjectl.addAll(copyRealEstateProject);
                    }
                } else {
                    if (realEstateProjectShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateProject = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public Object createNewInstance() {
        return new RealEstateProjects();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RealEstateProjects that = ((RealEstateProjects) object);
        {
            List<RealEstateProject> lhsRealEstateProject;
            lhsRealEstateProject = (((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty()))?this.getRealEstateProject():null);
            List<RealEstateProject> rhsRealEstateProject;
            rhsRealEstateProject = (((that.realEstateProject!= null)&&(!that.realEstateProject.isEmpty()))?that.getRealEstateProject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProject", lhsRealEstateProject), LocatorUtils.property(thatLocator, "realEstateProject", rhsRealEstateProject), lhsRealEstateProject, rhsRealEstateProject, ((this.realEstateProject!= null)&&(!this.realEstateProject.isEmpty())), ((that.realEstateProject!= null)&&(!that.realEstateProject.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE2;
        return equals(null, null, object, strategy);
    }

}
