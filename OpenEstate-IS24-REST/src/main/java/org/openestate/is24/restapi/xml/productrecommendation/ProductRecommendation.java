
package org.openestate.is24.restapi.xml.productrecommendation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for productRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productRecommendation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}product" maxOccurs="unbounded"/&gt;
 *         &lt;element name="recommendedProduct" type="{http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0}product"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productRecommendation", propOrder = {
    "product",
    "recommendedProduct"
})
public class ProductRecommendation
    implements Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    protected List<Product> product;
    @XmlElement(required = true, nillable = true)
    protected Product recommendedProduct;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Product>();
        }
        return this.product;
    }

    /**
     * Gets the value of the recommendedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getRecommendedProduct() {
        return recommendedProduct;
    }

    /**
     * Sets the value of the recommendedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setRecommendedProduct(Product value) {
        this.recommendedProduct = value;
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
            List<Product> theProduct;
            theProduct = (((this.product!= null)&&(!this.product.isEmpty()))?this.getProduct():null);
            strategy.appendField(locator, this, "product", buffer, theProduct);
        }
        {
            Product theRecommendedProduct;
            theRecommendedProduct = this.getRecommendedProduct();
            strategy.appendField(locator, this, "recommendedProduct", buffer, theRecommendedProduct);
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
        if (draftCopy instanceof ProductRecommendation) {
            final ProductRecommendation copy = ((ProductRecommendation) draftCopy);
            if ((this.product!= null)&&(!this.product.isEmpty())) {
                List<Product> sourceProduct;
                sourceProduct = (((this.product!= null)&&(!this.product.isEmpty()))?this.getProduct():null);
                @SuppressWarnings("unchecked")
                List<Product> copyProduct = ((List<Product> ) strategy.copy(LocatorUtils.property(locator, "product", sourceProduct), sourceProduct));
                copy.product = null;
                if (copyProduct!= null) {
                    List<Product> uniqueProductl = copy.getProduct();
                    uniqueProductl.addAll(copyProduct);
                }
            } else {
                copy.product = null;
            }
            if (this.recommendedProduct!= null) {
                Product sourceRecommendedProduct;
                sourceRecommendedProduct = this.getRecommendedProduct();
                Product copyRecommendedProduct = ((Product) strategy.copy(LocatorUtils.property(locator, "recommendedProduct", sourceRecommendedProduct), sourceRecommendedProduct));
                copy.setRecommendedProduct(copyRecommendedProduct);
            } else {
                copy.recommendedProduct = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProductRecommendation();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ProductRecommendation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ProductRecommendation that = ((ProductRecommendation) object);
        {
            List<Product> lhsProduct;
            lhsProduct = (((this.product!= null)&&(!this.product.isEmpty()))?this.getProduct():null);
            List<Product> rhsProduct;
            rhsProduct = (((that.product!= null)&&(!that.product.isEmpty()))?that.getProduct():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "product", lhsProduct), LocatorUtils.property(thatLocator, "product", rhsProduct), lhsProduct, rhsProduct)) {
                return false;
            }
        }
        {
            Product lhsRecommendedProduct;
            lhsRecommendedProduct = this.getRecommendedProduct();
            Product rhsRecommendedProduct;
            rhsRecommendedProduct = that.getRecommendedProduct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recommendedProduct", lhsRecommendedProduct), LocatorUtils.property(thatLocator, "recommendedProduct", rhsRecommendedProduct), lhsRecommendedProduct, rhsRecommendedProduct)) {
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
