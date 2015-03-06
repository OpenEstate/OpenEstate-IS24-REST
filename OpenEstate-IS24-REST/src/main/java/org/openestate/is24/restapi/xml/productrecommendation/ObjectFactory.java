
package org.openestate.is24.restapi.xml.productrecommendation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.productrecommendation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProductRecommendation_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0", "productRecommendation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.productrecommendation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductRecommendation }
     * 
     */
    public ProductRecommendation createProductRecommendation() {
        return new ProductRecommendation();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductRecommendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/productrecommondation/1.0", name = "productRecommendation")
    public JAXBElement<ProductRecommendation> createProductRecommendation(ProductRecommendation value) {
        return new JAXBElement<ProductRecommendation>(_ProductRecommendation_QNAME, ProductRecommendation.class, null, value);
    }

}
