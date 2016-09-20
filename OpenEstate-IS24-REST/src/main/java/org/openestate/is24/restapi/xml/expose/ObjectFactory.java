
package org.openestate.is24.restapi.xml.expose;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.Imprint;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.expose package. 
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

    private final static QName _Expose_QNAME = new QName("http://rest.immobilienscout24.de/schema/search/expose/1.0", "expose");
    private final static QName _ContactForm_QNAME = new QName("http://rest.immobilienscout24.de/schema/search/expose/1.0", "contactForm");
    private final static QName _SendAFriendForm_QNAME = new QName("http://rest.immobilienscout24.de/schema/search/expose/1.0", "sendAFriendForm");
    private final static QName _Imprint_QNAME = new QName("http://rest.immobilienscout24.de/schema/search/expose/1.0", "imprint");
    private final static QName _Address_QNAME = new QName("http://rest.immobilienscout24.de/schema/search/expose/1.0", "address");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.expose
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Expose }
     * 
     */
    public Expose createExpose() {
        return new Expose();
    }

    /**
     * Create an instance of {@link WebContent }
     * 
     */
    public WebContent createWebContent() {
        return new WebContent();
    }

    /**
     * Create an instance of {@link ContactForm }
     * 
     */
    public ContactForm createContactForm() {
        return new ContactForm();
    }

    /**
     * Create an instance of {@link SendAFriendForm }
     * 
     */
    public SendAFriendForm createSendAFriendForm() {
        return new SendAFriendForm();
    }

    /**
     * Create an instance of {@link Video }
     * 
     */
    public Video createVideo() {
        return new Video();
    }

    /**
     * Create an instance of {@link VideoUrlList }
     * 
     */
    public VideoUrlList createVideoUrlList() {
        return new VideoUrlList();
    }

    /**
     * Create an instance of {@link ContactFormConfiguration }
     * 
     */
    public ContactFormConfiguration createContactFormConfiguration() {
        return new ContactFormConfiguration();
    }

    /**
     * Create an instance of {@link ImprintLink }
     * 
     */
    public ImprintLink createImprintLink() {
        return new ImprintLink();
    }

    /**
     * Create an instance of {@link CancellationPolicyLink }
     * 
     */
    public CancellationPolicyLink createCancellationPolicyLink() {
        return new CancellationPolicyLink();
    }

    /**
     * Create an instance of {@link SimpleLink }
     * 
     */
    public SimpleLink createSimpleLink() {
        return new SimpleLink();
    }

    /**
     * Create an instance of {@link RealtorValuationJSONLink }
     * 
     */
    public RealtorValuationJSONLink createRealtorValuationJSONLink() {
        return new RealtorValuationJSONLink();
    }

    /**
     * Create an instance of {@link RealtorValuationJSONPLink }
     * 
     */
    public RealtorValuationJSONPLink createRealtorValuationJSONPLink() {
        return new RealtorValuationJSONPLink();
    }

    /**
     * Create an instance of {@link HouseBuy }
     * 
     */
    public HouseBuy createHouseBuy() {
        return new HouseBuy();
    }

    /**
     * Create an instance of {@link HouseRent }
     * 
     */
    public HouseRent createHouseRent() {
        return new HouseRent();
    }

    /**
     * Create an instance of {@link ApartmentRent }
     * 
     */
    public ApartmentRent createApartmentRent() {
        return new ApartmentRent();
    }

    /**
     * Create an instance of {@link ApartmentBuy }
     * 
     */
    public ApartmentBuy createApartmentBuy() {
        return new ApartmentBuy();
    }

    /**
     * Create an instance of {@link Office }
     * 
     */
    public Office createOffice() {
        return new Office();
    }

    /**
     * Create an instance of {@link Store }
     * 
     */
    public Store createStore() {
        return new Store();
    }

    /**
     * Create an instance of {@link Gastronomy }
     * 
     */
    public Gastronomy createGastronomy() {
        return new Gastronomy();
    }

    /**
     * Create an instance of {@link Industry }
     * 
     */
    public Industry createIndustry() {
        return new Industry();
    }

    /**
     * Create an instance of {@link SpecialPurpose }
     * 
     */
    public SpecialPurpose createSpecialPurpose() {
        return new SpecialPurpose();
    }

    /**
     * Create an instance of {@link ShortTermAccommodation }
     * 
     */
    public ShortTermAccommodation createShortTermAccommodation() {
        return new ShortTermAccommodation();
    }

    /**
     * Create an instance of {@link HouseType }
     * 
     */
    public HouseType createHouseType() {
        return new HouseType();
    }

    /**
     * Create an instance of {@link TradeSite }
     * 
     */
    public TradeSite createTradeSite() {
        return new TradeSite();
    }

    /**
     * Create an instance of {@link LivingBuySite }
     * 
     */
    public LivingBuySite createLivingBuySite() {
        return new LivingBuySite();
    }

    /**
     * Create an instance of {@link LivingRentSite }
     * 
     */
    public LivingRentSite createLivingRentSite() {
        return new LivingRentSite();
    }

    /**
     * Create an instance of {@link InvestmentProperty }
     * 
     */
    public InvestmentProperty createInvestmentProperty() {
        return new InvestmentProperty();
    }

    /**
     * Create an instance of {@link GarageRent }
     * 
     */
    public GarageRent createGarageRent() {
        return new GarageRent();
    }

    /**
     * Create an instance of {@link GarageBuy }
     * 
     */
    public GarageBuy createGarageBuy() {
        return new GarageBuy();
    }

    /**
     * Create an instance of {@link SeniorCare }
     * 
     */
    public SeniorCare createSeniorCare() {
        return new SeniorCare();
    }

    /**
     * Create an instance of {@link AssistedLiving }
     * 
     */
    public AssistedLiving createAssistedLiving() {
        return new AssistedLiving();
    }

    /**
     * Create an instance of {@link FlatShareRoom }
     * 
     */
    public FlatShareRoom createFlatShareRoom() {
        return new FlatShareRoom();
    }

    /**
     * Create an instance of {@link CompulsoryAuction }
     * 
     */
    public CompulsoryAuction createCompulsoryAuction() {
        return new CompulsoryAuction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Expose }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/search/expose/1.0", name = "expose")
    public JAXBElement<Expose> createExpose(Expose value) {
        return new JAXBElement<Expose>(_Expose_QNAME, Expose.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/search/expose/1.0", name = "contactForm")
    public JAXBElement<ContactForm> createContactForm(ContactForm value) {
        return new JAXBElement<ContactForm>(_ContactForm_QNAME, ContactForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAFriendForm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/search/expose/1.0", name = "sendAFriendForm")
    public JAXBElement<SendAFriendForm> createSendAFriendForm(SendAFriendForm value) {
        return new JAXBElement<SendAFriendForm>(_SendAFriendForm_QNAME, SendAFriendForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Imprint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/search/expose/1.0", name = "imprint")
    public JAXBElement<Imprint> createImprint(Imprint value) {
        return new JAXBElement<Imprint>(_Imprint_QNAME, Imprint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/search/expose/1.0", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

}
