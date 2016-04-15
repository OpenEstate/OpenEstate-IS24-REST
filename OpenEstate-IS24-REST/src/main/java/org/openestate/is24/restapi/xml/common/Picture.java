
package org.openestate.is24.restapi.xml.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * Ein Bild
 * 
 * <p>Java class for Picture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Picture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="floorplan" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="titlePicture" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="urls" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="url" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" /&gt;
 *                           &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Picture", propOrder = {
    "floorplan",
    "titlePicture",
    "urls"
})
public class Picture
    extends Attachment
    implements Cloneable, CopyTo2, Equals2, ToString2
{

    @XmlElement(defaultValue = "false")
    protected boolean floorplan;
    @XmlElement(defaultValue = "false")
    protected boolean titlePicture;
    protected Picture.Urls urls;

    /**
     * Gets the value of the floorplan property.
     * 
     */
    public boolean isFloorplan() {
        return floorplan;
    }

    /**
     * Sets the value of the floorplan property.
     * 
     */
    public void setFloorplan(boolean value) {
        this.floorplan = value;
    }

    /**
     * Gets the value of the titlePicture property.
     * 
     */
    public boolean isTitlePicture() {
        return titlePicture;
    }

    /**
     * Sets the value of the titlePicture property.
     * 
     */
    public void setTitlePicture(boolean value) {
        this.titlePicture = value;
    }

    /**
     * Gets the value of the urls property.
     * 
     * @return
     *     possible object is
     *     {@link Picture.Urls }
     *     
     */
    public Picture.Urls getUrls() {
        return urls;
    }

    /**
     * Sets the value of the urls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture.Urls }
     *     
     */
    public void setUrls(Picture.Urls value) {
        this.urls = value;
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
            boolean theFloorplan;
            theFloorplan = this.isFloorplan();
            strategy.appendField(locator, this, "floorplan", buffer, theFloorplan, true);
        }
        {
            boolean theTitlePicture;
            theTitlePicture = this.isTitlePicture();
            strategy.appendField(locator, this, "titlePicture", buffer, theTitlePicture, true);
        }
        {
            Picture.Urls theUrls;
            theUrls = this.getUrls();
            strategy.appendField(locator, this, "urls", buffer, theUrls, (this.urls!= null));
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
        if (draftCopy instanceof Picture) {
            final Picture copy = ((Picture) draftCopy);
            {
                Boolean floorplanShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (floorplanShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceFloorplan;
                    sourceFloorplan = this.isFloorplan();
                    boolean copyFloorplan = strategy.copy(LocatorUtils.property(locator, "floorplan", sourceFloorplan), sourceFloorplan, true);
                    copy.setFloorplan(copyFloorplan);
                } else {
                    if (floorplanShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean titlePictureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (titlePictureShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceTitlePicture;
                    sourceTitlePicture = this.isTitlePicture();
                    boolean copyTitlePicture = strategy.copy(LocatorUtils.property(locator, "titlePicture", sourceTitlePicture), sourceTitlePicture, true);
                    copy.setTitlePicture(copyTitlePicture);
                } else {
                    if (titlePictureShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean urlsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.urls!= null));
                if (urlsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Picture.Urls sourceUrls;
                    sourceUrls = this.getUrls();
                    Picture.Urls copyUrls = ((Picture.Urls) strategy.copy(LocatorUtils.property(locator, "urls", sourceUrls), sourceUrls, (this.urls!= null)));
                    copy.setUrls(copyUrls);
                } else {
                    if (urlsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.urls = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Picture();
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
        final Picture that = ((Picture) object);
        {
            boolean lhsFloorplan;
            lhsFloorplan = this.isFloorplan();
            boolean rhsFloorplan;
            rhsFloorplan = that.isFloorplan();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorplan", lhsFloorplan), LocatorUtils.property(thatLocator, "floorplan", rhsFloorplan), lhsFloorplan, rhsFloorplan, true, true)) {
                return false;
            }
        }
        {
            boolean lhsTitlePicture;
            lhsTitlePicture = this.isTitlePicture();
            boolean rhsTitlePicture;
            rhsTitlePicture = that.isTitlePicture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titlePicture", lhsTitlePicture), LocatorUtils.property(thatLocator, "titlePicture", rhsTitlePicture), lhsTitlePicture, rhsTitlePicture, true, true)) {
                return false;
            }
        }
        {
            Picture.Urls lhsUrls;
            lhsUrls = this.getUrls();
            Picture.Urls rhsUrls;
            rhsUrls = that.getUrls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urls", lhsUrls), LocatorUtils.property(thatLocator, "urls", rhsUrls), lhsUrls, rhsUrls, (this.urls!= null), (that.urls!= null))) {
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
     *         &lt;element name="url" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" /&gt;
     *                 &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        "url"
    })
    public static class Urls implements Cloneable, CopyTo2, Equals2, ToString2
    {

        @XmlElement(required = true)
        protected List<Picture.Urls.Url> url;

        /**
         * Gets the value of the url property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the url property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Picture.Urls.Url }
         * 
         * 
         */
        public List<Picture.Urls.Url> getUrl() {
            if (url == null) {
                url = new ArrayList<Picture.Urls.Url>();
            }
            return this.url;
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
                List<Picture.Urls.Url> theUrl;
                theUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                strategy.appendField(locator, this, "url", buffer, theUrl, ((this.url!= null)&&(!this.url.isEmpty())));
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
            if (draftCopy instanceof Picture.Urls) {
                final Picture.Urls copy = ((Picture.Urls) draftCopy);
                {
                    Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.url!= null)&&(!this.url.isEmpty())));
                    if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Picture.Urls.Url> sourceUrl;
                        sourceUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                        @SuppressWarnings("unchecked")
                        List<Picture.Urls.Url> copyUrl = ((List<Picture.Urls.Url> ) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, ((this.url!= null)&&(!this.url.isEmpty()))));
                        copy.url = null;
                        if (copyUrl!= null) {
                            List<Picture.Urls.Url> uniqueUrll = copy.getUrl();
                            uniqueUrll.addAll(copyUrl);
                        }
                    } else {
                        if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.url = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new Picture.Urls();
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Picture.Urls that = ((Picture.Urls) object);
            {
                List<Picture.Urls.Url> lhsUrl;
                lhsUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                List<Picture.Urls.Url> rhsUrl;
                rhsUrl = (((that.url!= null)&&(!that.url.isEmpty()))?that.getUrl():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, ((this.url!= null)&&(!this.url.isEmpty())), ((that.url!= null)&&(!that.url.isEmpty())))) {
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
         *       &lt;attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" /&gt;
         *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Url implements Cloneable, CopyTo2, Equals2, ToString2
        {

            @XmlAttribute(name = "scale")
            protected PictureScaleType scale;
            @XmlAttribute(name = "href")
            protected String href;

            /**
             * Gets the value of the scale property.
             * 
             * @return
             *     possible object is
             *     {@link PictureScaleType }
             *     
             */
            public PictureScaleType getScale() {
                return scale;
            }

            /**
             * Sets the value of the scale property.
             * 
             * @param value
             *     allowed object is
             *     {@link PictureScaleType }
             *     
             */
            public void setScale(PictureScaleType value) {
                this.scale = value;
            }

            /**
             * Gets the value of the href property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHref() {
                return href;
            }

            /**
             * Sets the value of the href property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHref(String value) {
                this.href = value;
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
                    PictureScaleType theScale;
                    theScale = this.getScale();
                    strategy.appendField(locator, this, "scale", buffer, theScale, (this.scale!= null));
                }
                {
                    String theHref;
                    theHref = this.getHref();
                    strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
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
                if (draftCopy instanceof Picture.Urls.Url) {
                    final Picture.Urls.Url copy = ((Picture.Urls.Url) draftCopy);
                    {
                        Boolean scaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scale!= null));
                        if (scaleShouldBeCopiedAndSet == Boolean.TRUE) {
                            PictureScaleType sourceScale;
                            sourceScale = this.getScale();
                            PictureScaleType copyScale = ((PictureScaleType) strategy.copy(LocatorUtils.property(locator, "scale", sourceScale), sourceScale, (this.scale!= null)));
                            copy.setScale(copyScale);
                        } else {
                            if (scaleShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.scale = null;
                            }
                        }
                    }
                    {
                        Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                        if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceHref;
                            sourceHref = this.getHref();
                            String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
                            copy.setHref(copyHref);
                        } else {
                            if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.href = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new Picture.Urls.Url();
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final Picture.Urls.Url that = ((Picture.Urls.Url) object);
                {
                    PictureScaleType lhsScale;
                    lhsScale = this.getScale();
                    PictureScaleType rhsScale;
                    rhsScale = that.getScale();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "scale", lhsScale), LocatorUtils.property(thatLocator, "scale", rhsScale), lhsScale, rhsScale, (this.scale!= null), (that.scale!= null))) {
                        return false;
                    }
                }
                {
                    String lhsHref;
                    lhsHref = this.getHref();
                    String rhsHref;
                    rhsHref = that.getHref();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
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

}
