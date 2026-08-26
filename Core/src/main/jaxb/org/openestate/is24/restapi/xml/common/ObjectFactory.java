package org.openestate.is24.restapi.xml.common;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.common package. 
 * <p>An ObjectFactory allows you to programmatically 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class ObjectFactory {

    private static final QName _Attachment_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "attachment");
    private static final QName _RealtorContactDetail_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "realtorContactDetail");
    private static final QName _RealtorLogo_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "realtorLogo");
    private static final QName _AutopilotSettings_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "autopilotSettings");
    private static final QName _Attachments_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "attachments");
    private static final QName _User_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "user");
    private static final QName _PublishObject_QNAME = new QName("http://rest.immobilienscout24.de/schema/common/1.0", "publishObject");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VirtualTour }
     * 
     * @return
     *     the new instance of {@link VirtualTour }
     */
    public VirtualTour createVirtualTour() {
        return new VirtualTour();
    }

    /**
     * Create an instance of {@link VirtualTour.PreviewUrls }
     * 
     * @return
     *     the new instance of {@link VirtualTour.PreviewUrls }
     */
    public VirtualTour.PreviewUrls createVirtualTourPreviewUrls() {
        return new VirtualTour.PreviewUrls();
    }

    /**
     * Create an instance of {@link Picture }
     * 
     * @return
     *     the new instance of {@link Picture }
     */
    public Picture createPicture() {
        return new Picture();
    }

    /**
     * Create an instance of {@link Picture.Urls }
     * 
     * @return
     *     the new instance of {@link Picture.Urls }
     */
    public Picture.Urls createPictureUrls() {
        return new Picture.Urls();
    }

    /**
     * Create an instance of {@link PublishObject }
     * 
     * @return
     *     the new instance of {@link PublishObject }
     */
    public PublishObject createPublishObject() {
        return new PublishObject();
    }

    /**
     * Create an instance of {@link RealtorLogo }
     * 
     * @return
     *     the new instance of {@link RealtorLogo }
     */
    public RealtorLogo createRealtorLogo() {
        return new RealtorLogo();
    }

    /**
     * Create an instance of {@link RealtorLogo.Urls }
     * 
     * @return
     *     the new instance of {@link RealtorLogo.Urls }
     */
    public RealtorLogo.Urls createRealtorLogoUrls() {
        return new RealtorLogo.Urls();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     * @return
     *     the new instance of {@link Messages }
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link Message }
     * 
     * @return
     *     the new instance of {@link Message }
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link RealtorContactDetails }
     * 
     * @return
     *     the new instance of {@link RealtorContactDetails }
     */
    public RealtorContactDetails createRealtorContactDetails() {
        return new RealtorContactDetails();
    }

    /**
     * Create an instance of {@link RealtorContactDetailsList }
     * 
     * @return
     *     the new instance of {@link RealtorContactDetailsList }
     */
    public RealtorContactDetailsList createRealtorContactDetailsList() {
        return new RealtorContactDetailsList();
    }

    /**
     * Create an instance of {@link AutopilotSettings }
     * 
     * @return
     *     the new instance of {@link AutopilotSettings }
     */
    public AutopilotSettings createAutopilotSettings() {
        return new AutopilotSettings();
    }

    /**
     * Create an instance of {@link Attachments }
     * 
     * @return
     *     the new instance of {@link Attachments }
     */
    public Attachments createAttachments() {
        return new Attachments();
    }

    /**
     * Create an instance of {@link User }
     * 
     * @return
     *     the new instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link StrictList }
     * 
     * @return
     *     the new instance of {@link StrictList }
     */
    public StrictList createStrictList() {
        return new StrictList();
    }

    /**
     * Create an instance of {@link Paging }
     * 
     * @return
     *     the new instance of {@link Paging }
     */
    public Paging createPaging() {
        return new Paging();
    }

    /**
     * Create an instance of {@link MatchCountList }
     * 
     * @return
     *     the new instance of {@link MatchCountList }
     */
    public MatchCountList createMatchCountList() {
        return new MatchCountList();
    }

    /**
     * Create an instance of {@link StrictEntry }
     * 
     * @return
     *     the new instance of {@link StrictEntry }
     */
    public StrictEntry createStrictEntry() {
        return new StrictEntry();
    }

    /**
     * Create an instance of {@link PublishChannels }
     * 
     * @return
     *     the new instance of {@link PublishChannels }
     */
    public PublishChannels createPublishChannels() {
        return new PublishChannels();
    }

    /**
     * Create an instance of {@link PublishChannel }
     * 
     * @return
     *     the new instance of {@link PublishChannel }
     */
    public PublishChannel createPublishChannel() {
        return new PublishChannel();
    }

    /**
     * Create an instance of {@link PublishObjects }
     * 
     * @return
     *     the new instance of {@link PublishObjects }
     */
    public PublishObjects createPublishObjects() {
        return new PublishObjects();
    }

    /**
     * Create an instance of {@link GeoHierarchyElementsStatistic }
     * 
     * @return
     *     the new instance of {@link GeoHierarchyElementsStatistic }
     */
    public GeoHierarchyElementsStatistic createGeoHierarchyElementsStatistic() {
        return new GeoHierarchyElementsStatistic();
    }

    /**
     * Create an instance of {@link GeoHierarchyElement }
     * 
     * @return
     *     the new instance of {@link GeoHierarchyElement }
     */
    public GeoHierarchyElement createGeoHierarchyElement() {
        return new GeoHierarchyElement();
    }

    /**
     * Create an instance of {@link GeoHierarchyElements }
     * 
     * @return
     *     the new instance of {@link GeoHierarchyElements }
     */
    public GeoHierarchyElements createGeoHierarchyElements() {
        return new GeoHierarchyElements();
    }

    /**
     * Create an instance of {@link GeoPathHierarchyElementsStatistic }
     * 
     * @return
     *     the new instance of {@link GeoPathHierarchyElementsStatistic }
     */
    public GeoPathHierarchyElementsStatistic createGeoPathHierarchyElementsStatistic() {
        return new GeoPathHierarchyElementsStatistic();
    }

    /**
     * Create an instance of {@link GeoPathHierarchyElement }
     * 
     * @return
     *     the new instance of {@link GeoPathHierarchyElement }
     */
    public GeoPathHierarchyElement createGeoPathHierarchyElement() {
        return new GeoPathHierarchyElement();
    }

    /**
     * Create an instance of {@link GeoPathHierarchyElements }
     * 
     * @return
     *     the new instance of {@link GeoPathHierarchyElements }
     */
    public GeoPathHierarchyElements createGeoPathHierarchyElements() {
        return new GeoPathHierarchyElements();
    }

    /**
     * Create an instance of {@link ApiSearchData }
     * 
     * @return
     *     the new instance of {@link ApiSearchData }
     */
    public ApiSearchData createApiSearchData() {
        return new ApiSearchData();
    }

    /**
     * Create an instance of {@link Wgs84Coordinate }
     * 
     * @return
     *     the new instance of {@link Wgs84Coordinate }
     */
    public Wgs84Coordinate createWgs84Coordinate() {
        return new Wgs84Coordinate();
    }

    /**
     * Create an instance of {@link Address }
     * 
     * @return
     *     the new instance of {@link Address }
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CountryRegion }
     * 
     * @return
     *     the new instance of {@link CountryRegion }
     */
    public CountryRegion createCountryRegion() {
        return new CountryRegion();
    }

    /**
     * Create an instance of {@link BaseContactDetails }
     * 
     * @return
     *     the new instance of {@link BaseContactDetails }
     */
    public BaseContactDetails createBaseContactDetails() {
        return new BaseContactDetails();
    }

    /**
     * Create an instance of {@link ContactMailCustomStyle }
     * 
     * @return
     *     the new instance of {@link ContactMailCustomStyle }
     */
    public ContactMailCustomStyle createContactMailCustomStyle() {
        return new ContactMailCustomStyle();
    }

    /**
     * Create an instance of {@link MasterDataContactDetailsType }
     * 
     * @return
     *     the new instance of {@link MasterDataContactDetailsType }
     */
    public MasterDataContactDetailsType createMasterDataContactDetailsType() {
        return new MasterDataContactDetailsType();
    }

    /**
     * Create an instance of {@link ContactDetails }
     * 
     * @return
     *     the new instance of {@link ContactDetails }
     */
    public ContactDetails createContactDetails() {
        return new ContactDetails();
    }

    /**
     * Create an instance of {@link ExposeContactDetails }
     * 
     * @return
     *     the new instance of {@link ExposeContactDetails }
     */
    public ExposeContactDetails createExposeContactDetails() {
        return new ExposeContactDetails();
    }

    /**
     * Create an instance of {@link Wgs84AddressDescription }
     * 
     * @return
     *     the new instance of {@link Wgs84AddressDescription }
     */
    public Wgs84AddressDescription createWgs84AddressDescription() {
        return new Wgs84AddressDescription();
    }

    /**
     * Create an instance of {@link Wgs84Address }
     * 
     * @return
     *     the new instance of {@link Wgs84Address }
     */
    public Wgs84Address createWgs84Address() {
        return new Wgs84Address();
    }

    /**
     * Create an instance of {@link StreamingVideo }
     * 
     * @return
     *     the new instance of {@link StreamingVideo }
     */
    public StreamingVideo createStreamingVideo() {
        return new StreamingVideo();
    }

    /**
     * Create an instance of {@link VideoInfo }
     * 
     * @return
     *     the new instance of {@link VideoInfo }
     */
    public VideoInfo createVideoInfo() {
        return new VideoInfo();
    }

    /**
     * Create an instance of {@link VideoUrlList }
     * 
     * @return
     *     the new instance of {@link VideoUrlList }
     */
    public VideoUrlList createVideoUrlList() {
        return new VideoUrlList();
    }

    /**
     * Create an instance of {@link PDFDocument }
     * 
     * @return
     *     the new instance of {@link PDFDocument }
     */
    public PDFDocument createPDFDocument() {
        return new PDFDocument();
    }

    /**
     * Create an instance of {@link VideoFile }
     * 
     * @return
     *     the new instance of {@link VideoFile }
     */
    public VideoFile createVideoFile() {
        return new VideoFile();
    }

    /**
     * Create an instance of {@link Link }
     * 
     * @return
     *     the new instance of {@link Link }
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link BudgetPrice }
     * 
     * @return
     *     the new instance of {@link BudgetPrice }
     */
    public BudgetPrice createBudgetPrice() {
        return new BudgetPrice();
    }

    /**
     * Create an instance of {@link Money }
     * 
     * @return
     *     the new instance of {@link Money }
     */
    public Money createMoney() {
        return new Money();
    }

    /**
     * Create an instance of {@link Money132 }
     * 
     * @return
     *     the new instance of {@link Money132 }
     */
    public Money132 createMoney132() {
        return new Money132();
    }

    /**
     * Create an instance of {@link Price }
     * 
     * @return
     *     the new instance of {@link Price }
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link CourtageInfo }
     * 
     * @return
     *     the new instance of {@link CourtageInfo }
     */
    public CourtageInfo createCourtageInfo() {
        return new CourtageInfo();
    }

    /**
     * Create an instance of {@link CountyCourt }
     * 
     * @return
     *     the new instance of {@link CountyCourt }
     */
    public CountyCourt createCountyCourt() {
        return new CountyCourt();
    }

    /**
     * Create an instance of {@link FiringTypes }
     * 
     * @return
     *     the new instance of {@link FiringTypes }
     */
    public FiringTypes createFiringTypes() {
        return new FiringTypes();
    }

    /**
     * Create an instance of {@link EnergySourcesEnev2014 }
     * 
     * @return
     *     the new instance of {@link EnergySourcesEnev2014 }
     */
    public EnergySourcesEnev2014 createEnergySourcesEnev2014() {
        return new EnergySourcesEnev2014();
    }

    /**
     * Create an instance of {@link MatchCount }
     * 
     * @return
     *     the new instance of {@link MatchCount }
     */
    public MatchCount createMatchCount() {
        return new MatchCount();
    }

    /**
     * Create an instance of {@link ReferenceLink }
     * 
     * @return
     *     the new instance of {@link ReferenceLink }
     */
    public ReferenceLink createReferenceLink() {
        return new ReferenceLink();
    }

    /**
     * Create an instance of {@link ForwardTracking }
     * 
     * @return
     *     the new instance of {@link ForwardTracking }
     */
    public ForwardTracking createForwardTracking() {
        return new ForwardTracking();
    }

    /**
     * Create an instance of {@link CareTypes }
     * 
     * @return
     *     the new instance of {@link CareTypes }
     */
    public CareTypes createCareTypes() {
        return new CareTypes();
    }

    /**
     * Create an instance of {@link SiteRecommendedUseForTradeTypes }
     * 
     * @return
     *     the new instance of {@link SiteRecommendedUseForTradeTypes }
     */
    public SiteRecommendedUseForTradeTypes createSiteRecommendedUseForTradeTypes() {
        return new SiteRecommendedUseForTradeTypes();
    }

    /**
     * Create an instance of {@link SiteRecommendedUseTypes }
     * 
     * @return
     *     the new instance of {@link SiteRecommendedUseTypes }
     */
    public SiteRecommendedUseTypes createSiteRecommendedUseTypes() {
        return new SiteRecommendedUseTypes();
    }

    /**
     * Create an instance of {@link NumberOfRoomsRange }
     * 
     * @return
     *     the new instance of {@link NumberOfRoomsRange }
     */
    public NumberOfRoomsRange createNumberOfRoomsRange() {
        return new NumberOfRoomsRange();
    }

    /**
     * Create an instance of {@link FloorRange }
     * 
     * @return
     *     the new instance of {@link FloorRange }
     */
    public FloorRange createFloorRange() {
        return new FloorRange();
    }

    /**
     * Create an instance of {@link PriceRange }
     * 
     * @return
     *     the new instance of {@link PriceRange }
     */
    public PriceRange createPriceRange() {
        return new PriceRange();
    }

    /**
     * Create an instance of {@link PriceRangeMandatory }
     * 
     * @return
     *     the new instance of {@link PriceRangeMandatory }
     */
    public PriceRangeMandatory createPriceRangeMandatory() {
        return new PriceRangeMandatory();
    }

    /**
     * Create an instance of {@link AreaRange }
     * 
     * @return
     *     the new instance of {@link AreaRange }
     */
    public AreaRange createAreaRange() {
        return new AreaRange();
    }

    /**
     * Create an instance of {@link AreaRangeMandatory }
     * 
     * @return
     *     the new instance of {@link AreaRangeMandatory }
     */
    public AreaRangeMandatory createAreaRangeMandatory() {
        return new AreaRangeMandatory();
    }

    /**
     * Create an instance of {@link YearRange }
     * 
     * @return
     *     the new instance of {@link YearRange }
     */
    public YearRange createYearRange() {
        return new YearRange();
    }

    /**
     * Create an instance of {@link ParkingSpaceRange }
     * 
     * @return
     *     the new instance of {@link ParkingSpaceRange }
     */
    public ParkingSpaceRange createParkingSpaceRange() {
        return new ParkingSpaceRange();
    }

    /**
     * Create an instance of {@link RadiusCriteria }
     * 
     * @return
     *     the new instance of {@link RadiusCriteria }
     */
    public RadiusCriteria createRadiusCriteria() {
        return new RadiusCriteria();
    }

    /**
     * Create an instance of {@link RegionCriteria }
     * 
     * @return
     *     the new instance of {@link RegionCriteria }
     */
    public RegionCriteria createRegionCriteria() {
        return new RegionCriteria();
    }

    /**
     * Create an instance of {@link GeoInfoNodeCriteria }
     * 
     * @return
     *     the new instance of {@link GeoInfoNodeCriteria }
     */
    public GeoInfoNodeCriteria createGeoInfoNodeCriteria() {
        return new GeoInfoNodeCriteria();
    }

    /**
     * Create an instance of {@link GeoHierarchy }
     * 
     * @return
     *     the new instance of {@link GeoHierarchy }
     */
    public GeoHierarchy createGeoHierarchy() {
        return new GeoHierarchy();
    }

    /**
     * Create an instance of {@link Continent }
     * 
     * @return
     *     the new instance of {@link Continent }
     */
    public Continent createContinent() {
        return new Continent();
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @return
     *     the new instance of {@link Country }
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Region }
     * 
     * @return
     *     the new instance of {@link Region }
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link City }
     * 
     * @return
     *     the new instance of {@link City }
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link Quarter }
     * 
     * @return
     *     the new instance of {@link Quarter }
     */
    public Quarter createQuarter() {
        return new Quarter();
    }

    /**
     * Create an instance of {@link Neighbourhood }
     * 
     * @return
     *     the new instance of {@link Neighbourhood }
     */
    public Neighbourhood createNeighbourhood() {
        return new Neighbourhood();
    }

    /**
     * Create an instance of {@link GeoHierarchyStatistic }
     * 
     * @return
     *     the new instance of {@link GeoHierarchyStatistic }
     */
    public GeoHierarchyStatistic createGeoHierarchyStatistic() {
        return new GeoHierarchyStatistic();
    }

    /**
     * Create an instance of {@link GeoHierarchyStatistics }
     * 
     * @return
     *     the new instance of {@link GeoHierarchyStatistics }
     */
    public GeoHierarchyStatistics createGeoHierarchyStatistics() {
        return new GeoHierarchyStatistics();
    }

    /**
     * Create an instance of {@link Imprint }
     * 
     * @return
     *     the new instance of {@link Imprint }
     */
    public Imprint createImprint() {
        return new Imprint();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     * @return
     *     the new instance of {@link DateRange }
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link EnergyPerformanceCertificate }
     * 
     * @return
     *     the new instance of {@link EnergyPerformanceCertificate }
     */
    public EnergyPerformanceCertificate createEnergyPerformanceCertificate() {
        return new EnergyPerformanceCertificate();
    }

    /**
     * Create an instance of {@link Contingent }
     * 
     * @return
     *     the new instance of {@link Contingent }
     */
    public Contingent createContingent() {
        return new Contingent();
    }

    /**
     * Create an instance of {@link ShapeInformationList }
     * 
     * @return
     *     the new instance of {@link ShapeInformationList }
     */
    public ShapeInformationList createShapeInformationList() {
        return new ShapeInformationList();
    }

    /**
     * Create an instance of {@link ShapeInformation }
     * 
     * @return
     *     the new instance of {@link ShapeInformation }
     */
    public ShapeInformation createShapeInformation() {
        return new ShapeInformation();
    }

    /**
     * Create an instance of {@link GeoPath }
     * 
     * @return
     *     the new instance of {@link GeoPath }
     */
    public GeoPath createGeoPath() {
        return new GeoPath();
    }

    /**
     * Create an instance of {@link RealNameList }
     * 
     * @return
     *     the new instance of {@link RealNameList }
     */
    public RealNameList createRealNameList() {
        return new RealNameList();
    }

    /**
     * Create an instance of {@link DatasetList }
     * 
     * @return
     *     the new instance of {@link DatasetList }
     */
    public DatasetList createDatasetList() {
        return new DatasetList();
    }

    /**
     * Create an instance of {@link VirtualTour.PreviewUrls.Url }
     * 
     * @return
     *     the new instance of {@link VirtualTour.PreviewUrls.Url }
     */
    public VirtualTour.PreviewUrls.Url createVirtualTourPreviewUrlsUrl() {
        return new VirtualTour.PreviewUrls.Url();
    }

    /**
     * Create an instance of {@link Picture.Urls.Url }
     * 
     * @return
     *     the new instance of {@link Picture.Urls.Url }
     */
    public Picture.Urls.Url createPictureUrlsUrl() {
        return new Picture.Urls.Url();
    }

    /**
     * Create an instance of {@link PublishObject.RealEstate }
     * 
     * @return
     *     the new instance of {@link PublishObject.RealEstate }
     */
    public PublishObject.RealEstate createPublishObjectRealEstate() {
        return new PublishObject.RealEstate();
    }

    /**
     * Create an instance of {@link RealtorLogo.Urls.Url }
     * 
     * @return
     *     the new instance of {@link RealtorLogo.Urls.Url }
     */
    public RealtorLogo.Urls.Url createRealtorLogoUrlsUrl() {
        return new RealtorLogo.Urls.Url();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachment }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "attachment")
    public JAXBElement<Attachment> createAttachment(Attachment value) {
        return new JAXBElement<>(_Attachment_QNAME, Attachment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealtorContactDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealtorContactDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "realtorContactDetail")
    public JAXBElement<RealtorContactDetails> createRealtorContactDetail(RealtorContactDetails value) {
        return new JAXBElement<>(_RealtorContactDetail_QNAME, RealtorContactDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealtorLogo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealtorLogo }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "realtorLogo")
    public JAXBElement<RealtorLogo> createRealtorLogo(RealtorLogo value) {
        return new JAXBElement<>(_RealtorLogo_QNAME, RealtorLogo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutopilotSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutopilotSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "autopilotSettings")
    public JAXBElement<AutopilotSettings> createAutopilotSettings(AutopilotSettings value) {
        return new JAXBElement<>(_AutopilotSettings_QNAME, AutopilotSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Attachments }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "attachments")
    public JAXBElement<Attachments> createAttachments(Attachments value) {
        return new JAXBElement<>(_Attachments_QNAME, Attachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PublishObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PublishObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/common/1.0", name = "publishObject")
    public JAXBElement<PublishObject> createPublishObject(PublishObject value) {
        return new JAXBElement<>(_PublishObject_QNAME, PublishObject.class, null, value);
    }

}
