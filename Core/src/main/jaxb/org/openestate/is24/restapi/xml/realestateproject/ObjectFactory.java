
package org.openestate.is24.restapi.xml.realestateproject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.realestateproject package. 
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

    private final static QName _RealEstateProjects_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjects");
    private final static QName _RealEstateProject_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProject");
    private final static QName _RealEstateProjectEntries_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjectEntries");
    private final static QName _RealEstateProjectEntry_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "realEstateProjectEntry");
    private final static QName _Attachment_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "attachment");
    private final static QName _Attachments_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "attachments");
    private final static QName _AttachmentsOrder_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "attachmentsOrder");
    private final static QName _UploadTicketRequest_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "uploadTicketRequest");
    private final static QName _UploadTicket_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "uploadTicket");
    private final static QName _ProjectProposal_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", "projectProposal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.realestateproject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Picture }
     * 
     */
    public Picture createPicture() {
        return new Picture();
    }

    /**
     * Create an instance of {@link Picture.Urls }
     * 
     */
    public Picture.Urls createPictureUrls() {
        return new Picture.Urls();
    }

    /**
     * Create an instance of {@link UploadTicket }
     * 
     */
    public UploadTicket createUploadTicket() {
        return new UploadTicket();
    }

    /**
     * Create an instance of {@link UploadTicket.Fields }
     * 
     */
    public UploadTicket.Fields createUploadTicketFields() {
        return new UploadTicket.Fields();
    }

    /**
     * Create an instance of {@link RealEstateProjects }
     * 
     */
    public RealEstateProjects createRealEstateProjects() {
        return new RealEstateProjects();
    }

    /**
     * Create an instance of {@link RealEstateProject }
     * 
     */
    public RealEstateProject createRealEstateProject() {
        return new RealEstateProject();
    }

    /**
     * Create an instance of {@link RealEstateProjectEntries }
     * 
     */
    public RealEstateProjectEntries createRealEstateProjectEntries() {
        return new RealEstateProjectEntries();
    }

    /**
     * Create an instance of {@link RealEstateProjectEntry }
     * 
     */
    public RealEstateProjectEntry createRealEstateProjectEntry() {
        return new RealEstateProjectEntry();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link AttachmentsOrder }
     * 
     */
    public AttachmentsOrder createAttachmentsOrder() {
        return new AttachmentsOrder();
    }

    /**
     * Create an instance of {@link UploadTicketRequest }
     * 
     */
    public UploadTicketRequest createUploadTicketRequest() {
        return new UploadTicketRequest();
    }

    /**
     * Create an instance of {@link ProjectProposal }
     * 
     */
    public ProjectProposal createProjectProposal() {
        return new ProjectProposal();
    }

    /**
     * Create an instance of {@link PDFDocument }
     * 
     */
    public PDFDocument createPDFDocument() {
        return new PDFDocument();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link InteriorCharacteristics }
     * 
     */
    public InteriorCharacteristics createInteriorCharacteristics() {
        return new InteriorCharacteristics();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link NumberOfRoomsRange }
     * 
     */
    public NumberOfRoomsRange createNumberOfRoomsRange() {
        return new NumberOfRoomsRange();
    }

    /**
     * Create an instance of {@link NumberOfHousingUnitsDetails }
     * 
     */
    public NumberOfHousingUnitsDetails createNumberOfHousingUnitsDetails() {
        return new NumberOfHousingUnitsDetails();
    }

    /**
     * Create an instance of {@link Customization }
     * 
     */
    public Customization createCustomization() {
        return new Customization();
    }

    /**
     * Create an instance of {@link ContactFormFields }
     * 
     */
    public ContactFormFields createContactFormFields() {
        return new ContactFormFields();
    }

    /**
     * Create an instance of {@link Picture.Urls.Url }
     * 
     */
    public Picture.Urls.Url createPictureUrlsUrl() {
        return new Picture.Urls.Url();
    }

    /**
     * Create an instance of {@link UploadTicket.Fields.Field }
     * 
     */
    public UploadTicket.Fields.Field createUploadTicketFieldsField() {
        return new UploadTicket.Fields.Field();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjects }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjects }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjects")
    public JAXBElement<RealEstateProjects> createRealEstateProjects(RealEstateProjects value) {
        return new JAXBElement<RealEstateProjects>(_RealEstateProjects_QNAME, RealEstateProjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProject }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProject")
    public JAXBElement<RealEstateProject> createRealEstateProject(RealEstateProject value) {
        return new JAXBElement<RealEstateProject>(_RealEstateProject_QNAME, RealEstateProject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntries }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntries }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjectEntries")
    public JAXBElement<RealEstateProjectEntries> createRealEstateProjectEntries(RealEstateProjectEntries value) {
        return new JAXBElement<RealEstateProjectEntries>(_RealEstateProjectEntries_QNAME, RealEstateProjectEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealEstateProjectEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "realEstateProjectEntry")
    public JAXBElement<RealEstateProjectEntry> createRealEstateProjectEntry(RealEstateProjectEntry value) {
        return new JAXBElement<RealEstateProjectEntry>(_RealEstateProjectEntry_QNAME, RealEstateProjectEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<Attachment>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "attachments")
    public JAXBElement<Attachments> createAttachments(Attachments value) {
        return new JAXBElement<Attachments>(_Attachments_QNAME, Attachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentsOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachmentsOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "attachmentsOrder")
    public JAXBElement<AttachmentsOrder> createAttachmentsOrder(AttachmentsOrder value) {
        return new JAXBElement<AttachmentsOrder>(_AttachmentsOrder_QNAME, AttachmentsOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "uploadTicketRequest")
    public JAXBElement<UploadTicketRequest> createUploadTicketRequest(UploadTicketRequest value) {
        return new JAXBElement<UploadTicketRequest>(_UploadTicketRequest_QNAME, UploadTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "uploadTicket")
    public JAXBElement<UploadTicket> createUploadTicket(UploadTicket value) {
        return new JAXBElement<UploadTicket>(_UploadTicket_QNAME, UploadTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectProposal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProjectProposal }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0", name = "projectProposal")
    public JAXBElement<ProjectProposal> createProjectProposal(ProjectProposal value) {
        return new JAXBElement<ProjectProposal>(_ProjectProposal_QNAME, ProjectProposal.class, null, value);
    }

}
