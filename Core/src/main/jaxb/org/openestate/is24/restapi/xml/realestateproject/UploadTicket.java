
package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * <p>Java class for UploadTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UploadTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri"/&gt;
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fields"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="field" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadTicket", propOrder = {
    "url",
    "attachmentId",
    "fields"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
public class UploadTicket implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected URI url;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected String attachmentId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    protected UploadTicket.Fields fields;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public URI getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setUrl(URI value) {
        this.url = value;
    }

    /**
     * Gets the value of the attachmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Sets the value of the attachmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setAttachmentId(String value) {
        this.attachmentId = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link UploadTicket.Fields }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public UploadTicket.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadTicket.Fields }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public void setFields(UploadTicket.Fields value) {
        this.fields = value;
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
            URI theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            String theAttachmentId;
            theAttachmentId = this.getAttachmentId();
            strategy.appendField(locator, this, "attachmentId", buffer, theAttachmentId, (this.attachmentId!= null));
        }
        {
            UploadTicket.Fields theFields;
            theFields = this.getFields();
            strategy.appendField(locator, this, "fields", buffer, theFields, (this.fields!= null));
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
        if (draftCopy instanceof UploadTicket) {
            final UploadTicket copy = ((UploadTicket) draftCopy);
            {
                Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceUrl;
                    sourceUrl = this.getUrl();
                    URI copyUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean attachmentIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attachmentId!= null));
                if (attachmentIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAttachmentId;
                    sourceAttachmentId = this.getAttachmentId();
                    String copyAttachmentId = ((String) strategy.copy(LocatorUtils.property(locator, "attachmentId", sourceAttachmentId), sourceAttachmentId, (this.attachmentId!= null)));
                    copy.setAttachmentId(copyAttachmentId);
                } else {
                    if (attachmentIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attachmentId = null;
                    }
                }
            }
            {
                Boolean fieldsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fields!= null));
                if (fieldsShouldBeCopiedAndSet == Boolean.TRUE) {
                    UploadTicket.Fields sourceFields;
                    sourceFields = this.getFields();
                    UploadTicket.Fields copyFields = ((UploadTicket.Fields) strategy.copy(LocatorUtils.property(locator, "fields", sourceFields), sourceFields, (this.fields!= null)));
                    copy.setFields(copyFields);
                } else {
                    if (fieldsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fields = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public Object createNewInstance() {
        return new UploadTicket();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UploadTicket that = ((UploadTicket) object);
        {
            URI lhsUrl;
            lhsUrl = this.getUrl();
            URI rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            String lhsAttachmentId;
            lhsAttachmentId = this.getAttachmentId();
            String rhsAttachmentId;
            rhsAttachmentId = that.getAttachmentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentId", lhsAttachmentId), LocatorUtils.property(thatLocator, "attachmentId", rhsAttachmentId), lhsAttachmentId, rhsAttachmentId, (this.attachmentId!= null), (that.attachmentId!= null))) {
                return false;
            }
        }
        {
            UploadTicket.Fields lhsFields;
            lhsFields = this.getFields();
            UploadTicket.Fields rhsFields;
            rhsFields = that.getFields();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fields", lhsFields), LocatorUtils.property(thatLocator, "fields", rhsFields), lhsFields, rhsFields, (this.fields!= null), (that.fields!= null))) {
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
     *         &lt;element name="field" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "field"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
    public static class Fields implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
        protected List<UploadTicket.Fields.Field> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UploadTicket.Fields.Field }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
        public List<UploadTicket.Fields.Field> getField() {
            if (field == null) {
                field = new ArrayList<UploadTicket.Fields.Field>();
            }
            return this.field;
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
                List<UploadTicket.Fields.Field> theField;
                theField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
                strategy.appendField(locator, this, "field", buffer, theField, ((this.field!= null)&&(!this.field.isEmpty())));
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
            if (draftCopy instanceof UploadTicket.Fields) {
                final UploadTicket.Fields copy = ((UploadTicket.Fields) draftCopy);
                {
                    Boolean fieldShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.field!= null)&&(!this.field.isEmpty())));
                    if (fieldShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<UploadTicket.Fields.Field> sourceField;
                        sourceField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
                        @SuppressWarnings("unchecked")
                        List<UploadTicket.Fields.Field> copyField = ((List<UploadTicket.Fields.Field> ) strategy.copy(LocatorUtils.property(locator, "field", sourceField), sourceField, ((this.field!= null)&&(!this.field.isEmpty()))));
                        copy.field = null;
                        if (copyField!= null) {
                            List<UploadTicket.Fields.Field> uniqueFieldl = copy.getField();
                            uniqueFieldl.addAll(copyField);
                        }
                    } else {
                        if (fieldShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.field = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
        public Object createNewInstance() {
            return new UploadTicket.Fields();
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final UploadTicket.Fields that = ((UploadTicket.Fields) object);
            {
                List<UploadTicket.Fields.Field> lhsField;
                lhsField = (((this.field!= null)&&(!this.field.isEmpty()))?this.getField():null);
                List<UploadTicket.Fields.Field> rhsField;
                rhsField = (((that.field!= null)&&(!that.field.isEmpty()))?that.getField():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "field", lhsField), LocatorUtils.property(thatLocator, "field", rhsField), lhsField, rhsField, ((this.field!= null)&&(!this.field.isEmpty())), ((that.field!= null)&&(!that.field.isEmpty())))) {
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
        public static class Field implements Serializable, Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlAttribute(name = "key")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            protected String key;
            @XmlAttribute(name = "value")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public void setValue(String value) {
                this.value = value;
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
                    String theKey;
                    theKey = this.getKey();
                    strategy.appendField(locator, this, "key", buffer, theKey, (this.key!= null));
                }
                {
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
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
                if (draftCopy instanceof UploadTicket.Fields.Field) {
                    final UploadTicket.Fields.Field copy = ((UploadTicket.Fields.Field) draftCopy);
                    {
                        Boolean keyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.key!= null));
                        if (keyShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceKey;
                            sourceKey = this.getKey();
                            String copyKey = ((String) strategy.copy(LocatorUtils.property(locator, "key", sourceKey), sourceKey, (this.key!= null)));
                            copy.setKey(copyKey);
                        } else {
                            if (keyShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.key = null;
                            }
                        }
                    }
                    {
                        Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                        if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceValue;
                            sourceValue = this.getValue();
                            String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                            copy.setValue(copyValue);
                        } else {
                            if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.value = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public Object createNewInstance() {
                return new UploadTicket.Fields.Field();
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:38:24+02:00", comments = "JAXB RI v2.2.11")
            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final UploadTicket.Fields.Field that = ((UploadTicket.Fields.Field) object);
                {
                    String lhsKey;
                    lhsKey = this.getKey();
                    String rhsKey;
                    rhsKey = that.getKey();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "key", lhsKey), LocatorUtils.property(thatLocator, "key", rhsKey), lhsKey, rhsKey, (this.key!= null), (that.key!= null))) {
                        return false;
                    }
                }
                {
                    String lhsValue;
                    lhsValue = this.getValue();
                    String rhsValue;
                    rhsValue = that.getValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
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

    }

}
