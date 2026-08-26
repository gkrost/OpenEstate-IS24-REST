package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.Equals;
import org.jvnet.jaxb.lang.EqualsStrategy;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb.lang.JAXBToStringStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter3;
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.BalconyAvailableType;
import org.openestate.is24.restapi.xml.common.CareLevelExpose;
import org.openestate.is24.restapi.xml.common.CareTypes;
import org.openestate.is24.restapi.xml.common.PetsAllowedType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RoomType;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften für den Immobilientyp Altenpflege
 * 
 * <p>Java class for SeniorCare complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SeniorCare">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       <sequence>
 *         <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedSeniorCareGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeniorCare", propOrder = {
    "shortDescription",
    "petsAllowed",
    "trialLivingPossible",
    "careTypes",
    "careLevel",
    "price",
    "numberOfBeds",
    "opening",
    "careOfDementia",
    "careOfArtificialRespiration",
    "careOfComaVigil",
    "careOfStroke",
    "careOfParkinson",
    "careOfAlzheimer",
    "careOfMultipleSclerosis",
    "kitchenAvailable",
    "roomType",
    "therapyOfferingsAvailable",
    "barrierFree",
    "numberOfLookedAfterApartments",
    "numberOfNursingPlaces",
    "livingSpaceFrom",
    "livingSpaceTo",
    "handicappedAccessible",
    "guestApartmentsAvailable",
    "restaurantAvailable",
    "cookingFacilitiesAvailable",
    "ownFurniturePossible",
    "cleaningServiceAvailable",
    "shoppingFacilitiesAvailable",
    "security24Hours",
    "culturalProgramAvailable",
    "leisureActivitiesAvailable",
    "religiousOfferingsAvailable",
    "balconyAvailable",
    "branchEntry"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class SeniorCare
    extends RealEstate
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Kurzbeschreibung
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String shortDescription;
    /**
     * Haustiere erlaubt
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected PetsAllowedType petsAllowed;
    /**
     * Probewohnen
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType trialLivingPossible;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CareTypes careTypes;
    /**
     * Pflegestufe
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CareLevelExpose careLevel;
    /**
     * Preis; die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price price;
    /**
     * Bettenanzahl
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfBeds;
    /**
     * Eroeffnung/Bezug
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar opening;
    /**
     * Pflege von Demenz Patienten
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfDementia;
    /**
     * Pflege von kuenstlicher Beatmung
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfArtificialRespiration;
    /**
     * Pflege von Wachkoma
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfComaVigil;
    /**
     * Pflege von Schlaganfall
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfStroke;
    /**
     * Pflege von Parkinson Patienten
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfParkinson;
    /**
     * Pflege von Alzheimer Patienten
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfAlzheimer;
    /**
     * Pflege von Multipler Sklerosis
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType careOfMultipleSclerosis;
    /**
     * Hauseigene Küche verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType kitchenAvailable;
    /**
     * Zimmertyp
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RoomType roomType;
    /**
     * Therapieangebot verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType therapyOfferingsAvailable;
    /**
     * Barrierefrei
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType barrierFree;
    /**
     * Anzahl betreute Wohnungen
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfLookedAfterApartments;
    /**
     * Anzahl Pflegeplätze
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfNursingPlaces;
    /**
     * Wohnfläche von
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal livingSpaceFrom;
    /**
     * Wohnfläche bis
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal livingSpaceTo;
    /**
     * Behindertengerecht
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType handicappedAccessible;
    /**
     * Gästeappartments verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType guestApartmentsAvailable;
    /**
     * Restaurant/ Café verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType restaurantAvailable;
    /**
     * Eigene Kochmöglichkeit
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType cookingFacilitiesAvailable;
    /**
     * Mitnahme eigener Möbel möglich
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType ownFurniturePossible;
    /**
     * Reinigungsservice verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType cleaningServiceAvailable;
    /**
     * Einkaufsmöglichkeiten im Haus
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType shoppingFacilitiesAvailable;
    /**
     *  24 Stunden Sicherheit
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType security24Hours;
    /**
     * Kulturprogramm verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType culturalProgramAvailable;
    /**
     * Freizeitaktivitäten verfügbar
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType leisureActivitiesAvailable;
    /**
     * Religiöse Angebote
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType religiousOfferingsAvailable;
    /**
     * Zimmertyp
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BalconyAvailableType balconyAvailable;
    /**
     * Branchenbucheintrag
     * 
     */
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean branchEntry;

    /**
     * Kurzbeschreibung
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortDescription()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Haustiere erlaubt
     * 
     * @return
     *     possible object is
     *     {@link PetsAllowedType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public PetsAllowedType getPetsAllowed() {
        return petsAllowed;
    }

    /**
     * Sets the value of the petsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PetsAllowedType }
     *     
     * @see #getPetsAllowed()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPetsAllowed(PetsAllowedType value) {
        this.petsAllowed = value;
    }

    /**
     * Probewohnen
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getTrialLivingPossible() {
        return trialLivingPossible;
    }

    /**
     * Sets the value of the trialLivingPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getTrialLivingPossible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTrialLivingPossible(YesNotApplicableType value) {
        this.trialLivingPossible = value;
    }

    /**
     * Gets the value of the careTypes property.
     * 
     * @return
     *     possible object is
     *     {@link CareTypes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CareTypes getCareTypes() {
        return careTypes;
    }

    /**
     * Sets the value of the careTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareTypes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareTypes(CareTypes value) {
        this.careTypes = value;
    }

    /**
     * Pflegestufe
     * 
     * @return
     *     possible object is
     *     {@link CareLevelExpose }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CareLevelExpose getCareLevel() {
        return careLevel;
    }

    /**
     * Sets the value of the careLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CareLevelExpose }
     *     
     * @see #getCareLevel()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareLevel(CareLevelExpose value) {
        this.careLevel = value;
    }

    /**
     * Preis; die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getPrice()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Bettenanzahl
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Sets the value of the numberOfBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfBeds()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfBeds(Long value) {
        this.numberOfBeds = value;
    }

    /**
     * Eroeffnung/Bezug
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getOpening() {
        return opening;
    }

    /**
     * Sets the value of the opening property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getOpening()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setOpening(Calendar value) {
        this.opening = value;
    }

    /**
     * Pflege von Demenz Patienten
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfDementia() {
        return careOfDementia;
    }

    /**
     * Sets the value of the careOfDementia property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfDementia()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfDementia(YesNotApplicableType value) {
        this.careOfDementia = value;
    }

    /**
     * Pflege von kuenstlicher Beatmung
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfArtificialRespiration() {
        return careOfArtificialRespiration;
    }

    /**
     * Sets the value of the careOfArtificialRespiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfArtificialRespiration()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfArtificialRespiration(YesNotApplicableType value) {
        this.careOfArtificialRespiration = value;
    }

    /**
     * Pflege von Wachkoma
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfComaVigil() {
        return careOfComaVigil;
    }

    /**
     * Sets the value of the careOfComaVigil property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfComaVigil()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfComaVigil(YesNotApplicableType value) {
        this.careOfComaVigil = value;
    }

    /**
     * Pflege von Schlaganfall
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfStroke() {
        return careOfStroke;
    }

    /**
     * Sets the value of the careOfStroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfStroke()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfStroke(YesNotApplicableType value) {
        this.careOfStroke = value;
    }

    /**
     * Pflege von Parkinson Patienten
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfParkinson() {
        return careOfParkinson;
    }

    /**
     * Sets the value of the careOfParkinson property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfParkinson()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfParkinson(YesNotApplicableType value) {
        this.careOfParkinson = value;
    }

    /**
     * Pflege von Alzheimer Patienten
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfAlzheimer() {
        return careOfAlzheimer;
    }

    /**
     * Sets the value of the careOfAlzheimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfAlzheimer()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfAlzheimer(YesNotApplicableType value) {
        this.careOfAlzheimer = value;
    }

    /**
     * Pflege von Multipler Sklerosis
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCareOfMultipleSclerosis() {
        return careOfMultipleSclerosis;
    }

    /**
     * Sets the value of the careOfMultipleSclerosis property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCareOfMultipleSclerosis()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCareOfMultipleSclerosis(YesNotApplicableType value) {
        this.careOfMultipleSclerosis = value;
    }

    /**
     * Hauseigene Küche verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getKitchenAvailable() {
        return kitchenAvailable;
    }

    /**
     * Sets the value of the kitchenAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getKitchenAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setKitchenAvailable(YesNotApplicableType value) {
        this.kitchenAvailable = value;
    }

    /**
     * Zimmertyp
     * 
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RoomType getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     * @see #getRoomType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRoomType(RoomType value) {
        this.roomType = value;
    }

    /**
     * Therapieangebot verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getTherapyOfferingsAvailable() {
        return therapyOfferingsAvailable;
    }

    /**
     * Sets the value of the therapyOfferingsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getTherapyOfferingsAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTherapyOfferingsAvailable(YesNotApplicableType value) {
        this.therapyOfferingsAvailable = value;
    }

    /**
     * Barrierefrei
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getBarrierFree() {
        return barrierFree;
    }

    /**
     * Sets the value of the barrierFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getBarrierFree()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBarrierFree(YesNotApplicableType value) {
        this.barrierFree = value;
    }

    /**
     * Anzahl betreute Wohnungen
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfLookedAfterApartments() {
        return numberOfLookedAfterApartments;
    }

    /**
     * Sets the value of the numberOfLookedAfterApartments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfLookedAfterApartments()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfLookedAfterApartments(Long value) {
        this.numberOfLookedAfterApartments = value;
    }

    /**
     * Anzahl Pflegeplätze
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfNursingPlaces() {
        return numberOfNursingPlaces;
    }

    /**
     * Sets the value of the numberOfNursingPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfNursingPlaces()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfNursingPlaces(Long value) {
        this.numberOfNursingPlaces = value;
    }

    /**
     * Wohnfläche von
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLivingSpaceFrom() {
        return livingSpaceFrom;
    }

    /**
     * Sets the value of the livingSpaceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLivingSpaceFrom()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLivingSpaceFrom(BigDecimal value) {
        this.livingSpaceFrom = value;
    }

    /**
     * Wohnfläche bis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLivingSpaceTo() {
        return livingSpaceTo;
    }

    /**
     * Sets the value of the livingSpaceTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLivingSpaceTo()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLivingSpaceTo(BigDecimal value) {
        this.livingSpaceTo = value;
    }

    /**
     * Behindertengerecht
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getHandicappedAccessible() {
        return handicappedAccessible;
    }

    /**
     * Sets the value of the handicappedAccessible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getHandicappedAccessible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHandicappedAccessible(YesNotApplicableType value) {
        this.handicappedAccessible = value;
    }

    /**
     * Gästeappartments verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getGuestApartmentsAvailable() {
        return guestApartmentsAvailable;
    }

    /**
     * Sets the value of the guestApartmentsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getGuestApartmentsAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGuestApartmentsAvailable(YesNotApplicableType value) {
        this.guestApartmentsAvailable = value;
    }

    /**
     * Restaurant/ Café verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getRestaurantAvailable() {
        return restaurantAvailable;
    }

    /**
     * Sets the value of the restaurantAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getRestaurantAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRestaurantAvailable(YesNotApplicableType value) {
        this.restaurantAvailable = value;
    }

    /**
     * Eigene Kochmöglichkeit
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCookingFacilitiesAvailable() {
        return cookingFacilitiesAvailable;
    }

    /**
     * Sets the value of the cookingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCookingFacilitiesAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCookingFacilitiesAvailable(YesNotApplicableType value) {
        this.cookingFacilitiesAvailable = value;
    }

    /**
     * Mitnahme eigener Möbel möglich
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getOwnFurniturePossible() {
        return ownFurniturePossible;
    }

    /**
     * Sets the value of the ownFurniturePossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getOwnFurniturePossible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setOwnFurniturePossible(YesNotApplicableType value) {
        this.ownFurniturePossible = value;
    }

    /**
     * Reinigungsservice verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCleaningServiceAvailable() {
        return cleaningServiceAvailable;
    }

    /**
     * Sets the value of the cleaningServiceAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCleaningServiceAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCleaningServiceAvailable(YesNotApplicableType value) {
        this.cleaningServiceAvailable = value;
    }

    /**
     * Einkaufsmöglichkeiten im Haus
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getShoppingFacilitiesAvailable() {
        return shoppingFacilitiesAvailable;
    }

    /**
     * Sets the value of the shoppingFacilitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getShoppingFacilitiesAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setShoppingFacilitiesAvailable(YesNotApplicableType value) {
        this.shoppingFacilitiesAvailable = value;
    }

    /**
     *  24 Stunden Sicherheit
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getSecurity24Hours() {
        return security24Hours;
    }

    /**
     * Sets the value of the security24Hours property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getSecurity24Hours()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSecurity24Hours(YesNotApplicableType value) {
        this.security24Hours = value;
    }

    /**
     * Kulturprogramm verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCulturalProgramAvailable() {
        return culturalProgramAvailable;
    }

    /**
     * Sets the value of the culturalProgramAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCulturalProgramAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCulturalProgramAvailable(YesNotApplicableType value) {
        this.culturalProgramAvailable = value;
    }

    /**
     * Freizeitaktivitäten verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getLeisureActivitiesAvailable() {
        return leisureActivitiesAvailable;
    }

    /**
     * Sets the value of the leisureActivitiesAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getLeisureActivitiesAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLeisureActivitiesAvailable(YesNotApplicableType value) {
        this.leisureActivitiesAvailable = value;
    }

    /**
     * Religiöse Angebote
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getReligiousOfferingsAvailable() {
        return religiousOfferingsAvailable;
    }

    /**
     * Sets the value of the religiousOfferingsAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getReligiousOfferingsAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setReligiousOfferingsAvailable(YesNotApplicableType value) {
        this.religiousOfferingsAvailable = value;
    }

    /**
     * Zimmertyp
     * 
     * @return
     *     possible object is
     *     {@link BalconyAvailableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BalconyAvailableType getBalconyAvailable() {
        return balconyAvailable;
    }

    /**
     * Sets the value of the balconyAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalconyAvailableType }
     *     
     * @see #getBalconyAvailable()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBalconyAvailable(BalconyAvailableType value) {
        this.balconyAvailable = value;
    }

    /**
     * Branchenbucheintrag
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getBranchEntry() {
        return branchEntry;
    }

    /**
     * Sets the value of the branchEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getBranchEntry()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBranchEntry(Boolean value) {
        this.branchEntry = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            String theShortDescription;
            theShortDescription = this.getShortDescription();
            strategy.appendField(locator, this, "shortDescription", buffer, theShortDescription, (this.shortDescription!= null));
        }
        {
            PetsAllowedType thePetsAllowed;
            thePetsAllowed = this.getPetsAllowed();
            strategy.appendField(locator, this, "petsAllowed", buffer, thePetsAllowed, (this.petsAllowed!= null));
        }
        {
            YesNotApplicableType theTrialLivingPossible;
            theTrialLivingPossible = this.getTrialLivingPossible();
            strategy.appendField(locator, this, "trialLivingPossible", buffer, theTrialLivingPossible, (this.trialLivingPossible!= null));
        }
        {
            CareTypes theCareTypes;
            theCareTypes = this.getCareTypes();
            strategy.appendField(locator, this, "careTypes", buffer, theCareTypes, (this.careTypes!= null));
        }
        {
            CareLevelExpose theCareLevel;
            theCareLevel = this.getCareLevel();
            strategy.appendField(locator, this, "careLevel", buffer, theCareLevel, (this.careLevel!= null));
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            Long theNumberOfBeds;
            theNumberOfBeds = this.getNumberOfBeds();
            strategy.appendField(locator, this, "numberOfBeds", buffer, theNumberOfBeds, (this.numberOfBeds!= null));
        }
        {
            Calendar theOpening;
            theOpening = this.getOpening();
            strategy.appendField(locator, this, "opening", buffer, theOpening, (this.opening!= null));
        }
        {
            YesNotApplicableType theCareOfDementia;
            theCareOfDementia = this.getCareOfDementia();
            strategy.appendField(locator, this, "careOfDementia", buffer, theCareOfDementia, (this.careOfDementia!= null));
        }
        {
            YesNotApplicableType theCareOfArtificialRespiration;
            theCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
            strategy.appendField(locator, this, "careOfArtificialRespiration", buffer, theCareOfArtificialRespiration, (this.careOfArtificialRespiration!= null));
        }
        {
            YesNotApplicableType theCareOfComaVigil;
            theCareOfComaVigil = this.getCareOfComaVigil();
            strategy.appendField(locator, this, "careOfComaVigil", buffer, theCareOfComaVigil, (this.careOfComaVigil!= null));
        }
        {
            YesNotApplicableType theCareOfStroke;
            theCareOfStroke = this.getCareOfStroke();
            strategy.appendField(locator, this, "careOfStroke", buffer, theCareOfStroke, (this.careOfStroke!= null));
        }
        {
            YesNotApplicableType theCareOfParkinson;
            theCareOfParkinson = this.getCareOfParkinson();
            strategy.appendField(locator, this, "careOfParkinson", buffer, theCareOfParkinson, (this.careOfParkinson!= null));
        }
        {
            YesNotApplicableType theCareOfAlzheimer;
            theCareOfAlzheimer = this.getCareOfAlzheimer();
            strategy.appendField(locator, this, "careOfAlzheimer", buffer, theCareOfAlzheimer, (this.careOfAlzheimer!= null));
        }
        {
            YesNotApplicableType theCareOfMultipleSclerosis;
            theCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
            strategy.appendField(locator, this, "careOfMultipleSclerosis", buffer, theCareOfMultipleSclerosis, (this.careOfMultipleSclerosis!= null));
        }
        {
            YesNotApplicableType theKitchenAvailable;
            theKitchenAvailable = this.getKitchenAvailable();
            strategy.appendField(locator, this, "kitchenAvailable", buffer, theKitchenAvailable, (this.kitchenAvailable!= null));
        }
        {
            RoomType theRoomType;
            theRoomType = this.getRoomType();
            strategy.appendField(locator, this, "roomType", buffer, theRoomType, (this.roomType!= null));
        }
        {
            YesNotApplicableType theTherapyOfferingsAvailable;
            theTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
            strategy.appendField(locator, this, "therapyOfferingsAvailable", buffer, theTherapyOfferingsAvailable, (this.therapyOfferingsAvailable!= null));
        }
        {
            YesNotApplicableType theBarrierFree;
            theBarrierFree = this.getBarrierFree();
            strategy.appendField(locator, this, "barrierFree", buffer, theBarrierFree, (this.barrierFree!= null));
        }
        {
            Long theNumberOfLookedAfterApartments;
            theNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            strategy.appendField(locator, this, "numberOfLookedAfterApartments", buffer, theNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null));
        }
        {
            Long theNumberOfNursingPlaces;
            theNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            strategy.appendField(locator, this, "numberOfNursingPlaces", buffer, theNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null));
        }
        {
            BigDecimal theLivingSpaceFrom;
            theLivingSpaceFrom = this.getLivingSpaceFrom();
            strategy.appendField(locator, this, "livingSpaceFrom", buffer, theLivingSpaceFrom, (this.livingSpaceFrom!= null));
        }
        {
            BigDecimal theLivingSpaceTo;
            theLivingSpaceTo = this.getLivingSpaceTo();
            strategy.appendField(locator, this, "livingSpaceTo", buffer, theLivingSpaceTo, (this.livingSpaceTo!= null));
        }
        {
            YesNotApplicableType theHandicappedAccessible;
            theHandicappedAccessible = this.getHandicappedAccessible();
            strategy.appendField(locator, this, "handicappedAccessible", buffer, theHandicappedAccessible, (this.handicappedAccessible!= null));
        }
        {
            YesNotApplicableType theGuestApartmentsAvailable;
            theGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            strategy.appendField(locator, this, "guestApartmentsAvailable", buffer, theGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null));
        }
        {
            YesNotApplicableType theRestaurantAvailable;
            theRestaurantAvailable = this.getRestaurantAvailable();
            strategy.appendField(locator, this, "restaurantAvailable", buffer, theRestaurantAvailable, (this.restaurantAvailable!= null));
        }
        {
            YesNotApplicableType theCookingFacilitiesAvailable;
            theCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            strategy.appendField(locator, this, "cookingFacilitiesAvailable", buffer, theCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null));
        }
        {
            YesNotApplicableType theOwnFurniturePossible;
            theOwnFurniturePossible = this.getOwnFurniturePossible();
            strategy.appendField(locator, this, "ownFurniturePossible", buffer, theOwnFurniturePossible, (this.ownFurniturePossible!= null));
        }
        {
            YesNotApplicableType theCleaningServiceAvailable;
            theCleaningServiceAvailable = this.getCleaningServiceAvailable();
            strategy.appendField(locator, this, "cleaningServiceAvailable", buffer, theCleaningServiceAvailable, (this.cleaningServiceAvailable!= null));
        }
        {
            YesNotApplicableType theShoppingFacilitiesAvailable;
            theShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            strategy.appendField(locator, this, "shoppingFacilitiesAvailable", buffer, theShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null));
        }
        {
            YesNotApplicableType theSecurity24Hours;
            theSecurity24Hours = this.getSecurity24Hours();
            strategy.appendField(locator, this, "security24Hours", buffer, theSecurity24Hours, (this.security24Hours!= null));
        }
        {
            YesNotApplicableType theCulturalProgramAvailable;
            theCulturalProgramAvailable = this.getCulturalProgramAvailable();
            strategy.appendField(locator, this, "culturalProgramAvailable", buffer, theCulturalProgramAvailable, (this.culturalProgramAvailable!= null));
        }
        {
            YesNotApplicableType theLeisureActivitiesAvailable;
            theLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            strategy.appendField(locator, this, "leisureActivitiesAvailable", buffer, theLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null));
        }
        {
            YesNotApplicableType theReligiousOfferingsAvailable;
            theReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            strategy.appendField(locator, this, "religiousOfferingsAvailable", buffer, theReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null));
        }
        {
            BalconyAvailableType theBalconyAvailable;
            theBalconyAvailable = this.getBalconyAvailable();
            strategy.appendField(locator, this, "balconyAvailable", buffer, theBalconyAvailable, (this.balconyAvailable!= null));
        }
        {
            Boolean theBranchEntry;
            theBranchEntry = this.getBranchEntry();
            strategy.appendField(locator, this, "branchEntry", buffer, theBranchEntry, (this.branchEntry!= null));
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof SeniorCare) {
            final SeniorCare copy = ((SeniorCare) draftCopy);
            {
                Boolean shortDescriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shortDescription!= null));
                if (shortDescriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceShortDescription;
                    sourceShortDescription = this.getShortDescription();
                    String copyShortDescription = ((String) strategy.copy(LocatorUtils.property(locator, "shortDescription", sourceShortDescription), sourceShortDescription, (this.shortDescription!= null)));
                    copy.setShortDescription(copyShortDescription);
                } else {
                    if (shortDescriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shortDescription = null;
                    }
                }
            }
            {
                Boolean petsAllowedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.petsAllowed!= null));
                if (petsAllowedShouldBeCopiedAndSet == Boolean.TRUE) {
                    PetsAllowedType sourcePetsAllowed;
                    sourcePetsAllowed = this.getPetsAllowed();
                    PetsAllowedType copyPetsAllowed = ((PetsAllowedType) strategy.copy(LocatorUtils.property(locator, "petsAllowed", sourcePetsAllowed), sourcePetsAllowed, (this.petsAllowed!= null)));
                    copy.setPetsAllowed(copyPetsAllowed);
                } else {
                    if (petsAllowedShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.petsAllowed = null;
                    }
                }
            }
            {
                Boolean trialLivingPossibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trialLivingPossible!= null));
                if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceTrialLivingPossible;
                    sourceTrialLivingPossible = this.getTrialLivingPossible();
                    YesNotApplicableType copyTrialLivingPossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "trialLivingPossible", sourceTrialLivingPossible), sourceTrialLivingPossible, (this.trialLivingPossible!= null)));
                    copy.setTrialLivingPossible(copyTrialLivingPossible);
                } else {
                    if (trialLivingPossibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trialLivingPossible = null;
                    }
                }
            }
            {
                Boolean careTypesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careTypes!= null));
                if (careTypesShouldBeCopiedAndSet == Boolean.TRUE) {
                    CareTypes sourceCareTypes;
                    sourceCareTypes = this.getCareTypes();
                    CareTypes copyCareTypes = ((CareTypes) strategy.copy(LocatorUtils.property(locator, "careTypes", sourceCareTypes), sourceCareTypes, (this.careTypes!= null)));
                    copy.setCareTypes(copyCareTypes);
                } else {
                    if (careTypesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careTypes = null;
                    }
                }
            }
            {
                Boolean careLevelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careLevel!= null));
                if (careLevelShouldBeCopiedAndSet == Boolean.TRUE) {
                    CareLevelExpose sourceCareLevel;
                    sourceCareLevel = this.getCareLevel();
                    CareLevelExpose copyCareLevel = ((CareLevelExpose) strategy.copy(LocatorUtils.property(locator, "careLevel", sourceCareLevel), sourceCareLevel, (this.careLevel!= null)));
                    copy.setCareLevel(copyCareLevel);
                } else {
                    if (careLevelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careLevel = null;
                    }
                }
            }
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourcePrice;
                    sourcePrice = this.getPrice();
                    Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                Boolean numberOfBedsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfBeds!= null));
                if (numberOfBedsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfBeds;
                    sourceNumberOfBeds = this.getNumberOfBeds();
                    Long copyNumberOfBeds = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfBeds", sourceNumberOfBeds), sourceNumberOfBeds, (this.numberOfBeds!= null)));
                    copy.setNumberOfBeds(copyNumberOfBeds);
                } else {
                    if (numberOfBedsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfBeds = null;
                    }
                }
            }
            {
                Boolean openingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.opening!= null));
                if (openingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceOpening;
                    sourceOpening = this.getOpening();
                    Calendar copyOpening = ((Calendar) strategy.copy(LocatorUtils.property(locator, "opening", sourceOpening), sourceOpening, (this.opening!= null)));
                    copy.setOpening(copyOpening);
                } else {
                    if (openingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.opening = null;
                    }
                }
            }
            {
                Boolean careOfDementiaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfDementia!= null));
                if (careOfDementiaShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfDementia;
                    sourceCareOfDementia = this.getCareOfDementia();
                    YesNotApplicableType copyCareOfDementia = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfDementia", sourceCareOfDementia), sourceCareOfDementia, (this.careOfDementia!= null)));
                    copy.setCareOfDementia(copyCareOfDementia);
                } else {
                    if (careOfDementiaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfDementia = null;
                    }
                }
            }
            {
                Boolean careOfArtificialRespirationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfArtificialRespiration!= null));
                if (careOfArtificialRespirationShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfArtificialRespiration;
                    sourceCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
                    YesNotApplicableType copyCareOfArtificialRespiration = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfArtificialRespiration", sourceCareOfArtificialRespiration), sourceCareOfArtificialRespiration, (this.careOfArtificialRespiration!= null)));
                    copy.setCareOfArtificialRespiration(copyCareOfArtificialRespiration);
                } else {
                    if (careOfArtificialRespirationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfArtificialRespiration = null;
                    }
                }
            }
            {
                Boolean careOfComaVigilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfComaVigil!= null));
                if (careOfComaVigilShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfComaVigil;
                    sourceCareOfComaVigil = this.getCareOfComaVigil();
                    YesNotApplicableType copyCareOfComaVigil = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfComaVigil", sourceCareOfComaVigil), sourceCareOfComaVigil, (this.careOfComaVigil!= null)));
                    copy.setCareOfComaVigil(copyCareOfComaVigil);
                } else {
                    if (careOfComaVigilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfComaVigil = null;
                    }
                }
            }
            {
                Boolean careOfStrokeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfStroke!= null));
                if (careOfStrokeShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfStroke;
                    sourceCareOfStroke = this.getCareOfStroke();
                    YesNotApplicableType copyCareOfStroke = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfStroke", sourceCareOfStroke), sourceCareOfStroke, (this.careOfStroke!= null)));
                    copy.setCareOfStroke(copyCareOfStroke);
                } else {
                    if (careOfStrokeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfStroke = null;
                    }
                }
            }
            {
                Boolean careOfParkinsonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfParkinson!= null));
                if (careOfParkinsonShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfParkinson;
                    sourceCareOfParkinson = this.getCareOfParkinson();
                    YesNotApplicableType copyCareOfParkinson = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfParkinson", sourceCareOfParkinson), sourceCareOfParkinson, (this.careOfParkinson!= null)));
                    copy.setCareOfParkinson(copyCareOfParkinson);
                } else {
                    if (careOfParkinsonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfParkinson = null;
                    }
                }
            }
            {
                Boolean careOfAlzheimerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfAlzheimer!= null));
                if (careOfAlzheimerShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfAlzheimer;
                    sourceCareOfAlzheimer = this.getCareOfAlzheimer();
                    YesNotApplicableType copyCareOfAlzheimer = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfAlzheimer", sourceCareOfAlzheimer), sourceCareOfAlzheimer, (this.careOfAlzheimer!= null)));
                    copy.setCareOfAlzheimer(copyCareOfAlzheimer);
                } else {
                    if (careOfAlzheimerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfAlzheimer = null;
                    }
                }
            }
            {
                Boolean careOfMultipleSclerosisShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.careOfMultipleSclerosis!= null));
                if (careOfMultipleSclerosisShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCareOfMultipleSclerosis;
                    sourceCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
                    YesNotApplicableType copyCareOfMultipleSclerosis = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "careOfMultipleSclerosis", sourceCareOfMultipleSclerosis), sourceCareOfMultipleSclerosis, (this.careOfMultipleSclerosis!= null)));
                    copy.setCareOfMultipleSclerosis(copyCareOfMultipleSclerosis);
                } else {
                    if (careOfMultipleSclerosisShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.careOfMultipleSclerosis = null;
                    }
                }
            }
            {
                Boolean kitchenAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.kitchenAvailable!= null));
                if (kitchenAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceKitchenAvailable;
                    sourceKitchenAvailable = this.getKitchenAvailable();
                    YesNotApplicableType copyKitchenAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "kitchenAvailable", sourceKitchenAvailable), sourceKitchenAvailable, (this.kitchenAvailable!= null)));
                    copy.setKitchenAvailable(copyKitchenAvailable);
                } else {
                    if (kitchenAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.kitchenAvailable = null;
                    }
                }
            }
            {
                Boolean roomTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.roomType!= null));
                if (roomTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RoomType sourceRoomType;
                    sourceRoomType = this.getRoomType();
                    RoomType copyRoomType = ((RoomType) strategy.copy(LocatorUtils.property(locator, "roomType", sourceRoomType), sourceRoomType, (this.roomType!= null)));
                    copy.setRoomType(copyRoomType);
                } else {
                    if (roomTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.roomType = null;
                    }
                }
            }
            {
                Boolean therapyOfferingsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.therapyOfferingsAvailable!= null));
                if (therapyOfferingsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceTherapyOfferingsAvailable;
                    sourceTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
                    YesNotApplicableType copyTherapyOfferingsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "therapyOfferingsAvailable", sourceTherapyOfferingsAvailable), sourceTherapyOfferingsAvailable, (this.therapyOfferingsAvailable!= null)));
                    copy.setTherapyOfferingsAvailable(copyTherapyOfferingsAvailable);
                } else {
                    if (therapyOfferingsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.therapyOfferingsAvailable = null;
                    }
                }
            }
            {
                Boolean barrierFreeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.barrierFree!= null));
                if (barrierFreeShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBarrierFree;
                    sourceBarrierFree = this.getBarrierFree();
                    YesNotApplicableType copyBarrierFree = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "barrierFree", sourceBarrierFree), sourceBarrierFree, (this.barrierFree!= null)));
                    copy.setBarrierFree(copyBarrierFree);
                } else {
                    if (barrierFreeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.barrierFree = null;
                    }
                }
            }
            {
                Boolean numberOfLookedAfterApartmentsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfLookedAfterApartments!= null));
                if (numberOfLookedAfterApartmentsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfLookedAfterApartments;
                    sourceNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
                    Long copyNumberOfLookedAfterApartments = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfLookedAfterApartments", sourceNumberOfLookedAfterApartments), sourceNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null)));
                    copy.setNumberOfLookedAfterApartments(copyNumberOfLookedAfterApartments);
                } else {
                    if (numberOfLookedAfterApartmentsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfLookedAfterApartments = null;
                    }
                }
            }
            {
                Boolean numberOfNursingPlacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfNursingPlaces!= null));
                if (numberOfNursingPlacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfNursingPlaces;
                    sourceNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
                    Long copyNumberOfNursingPlaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfNursingPlaces", sourceNumberOfNursingPlaces), sourceNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null)));
                    copy.setNumberOfNursingPlaces(copyNumberOfNursingPlaces);
                } else {
                    if (numberOfNursingPlacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfNursingPlaces = null;
                    }
                }
            }
            {
                Boolean livingSpaceFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpaceFrom!= null));
                if (livingSpaceFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpaceFrom;
                    sourceLivingSpaceFrom = this.getLivingSpaceFrom();
                    BigDecimal copyLivingSpaceFrom = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceFrom", sourceLivingSpaceFrom), sourceLivingSpaceFrom, (this.livingSpaceFrom!= null)));
                    copy.setLivingSpaceFrom(copyLivingSpaceFrom);
                } else {
                    if (livingSpaceFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpaceFrom = null;
                    }
                }
            }
            {
                Boolean livingSpaceToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpaceTo!= null));
                if (livingSpaceToShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpaceTo;
                    sourceLivingSpaceTo = this.getLivingSpaceTo();
                    BigDecimal copyLivingSpaceTo = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpaceTo", sourceLivingSpaceTo), sourceLivingSpaceTo, (this.livingSpaceTo!= null)));
                    copy.setLivingSpaceTo(copyLivingSpaceTo);
                } else {
                    if (livingSpaceToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpaceTo = null;
                    }
                }
            }
            {
                Boolean handicappedAccessibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.handicappedAccessible!= null));
                if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceHandicappedAccessible;
                    sourceHandicappedAccessible = this.getHandicappedAccessible();
                    YesNotApplicableType copyHandicappedAccessible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "handicappedAccessible", sourceHandicappedAccessible), sourceHandicappedAccessible, (this.handicappedAccessible!= null)));
                    copy.setHandicappedAccessible(copyHandicappedAccessible);
                } else {
                    if (handicappedAccessibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.handicappedAccessible = null;
                    }
                }
            }
            {
                Boolean guestApartmentsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.guestApartmentsAvailable!= null));
                if (guestApartmentsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceGuestApartmentsAvailable;
                    sourceGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
                    YesNotApplicableType copyGuestApartmentsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestApartmentsAvailable", sourceGuestApartmentsAvailable), sourceGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null)));
                    copy.setGuestApartmentsAvailable(copyGuestApartmentsAvailable);
                } else {
                    if (guestApartmentsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.guestApartmentsAvailable = null;
                    }
                }
            }
            {
                Boolean restaurantAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.restaurantAvailable!= null));
                if (restaurantAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceRestaurantAvailable;
                    sourceRestaurantAvailable = this.getRestaurantAvailable();
                    YesNotApplicableType copyRestaurantAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "restaurantAvailable", sourceRestaurantAvailable), sourceRestaurantAvailable, (this.restaurantAvailable!= null)));
                    copy.setRestaurantAvailable(copyRestaurantAvailable);
                } else {
                    if (restaurantAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.restaurantAvailable = null;
                    }
                }
            }
            {
                Boolean cookingFacilitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cookingFacilitiesAvailable!= null));
                if (cookingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCookingFacilitiesAvailable;
                    sourceCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
                    YesNotApplicableType copyCookingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cookingFacilitiesAvailable", sourceCookingFacilitiesAvailable), sourceCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null)));
                    copy.setCookingFacilitiesAvailable(copyCookingFacilitiesAvailable);
                } else {
                    if (cookingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cookingFacilitiesAvailable = null;
                    }
                }
            }
            {
                Boolean ownFurniturePossibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.ownFurniturePossible!= null));
                if (ownFurniturePossibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceOwnFurniturePossible;
                    sourceOwnFurniturePossible = this.getOwnFurniturePossible();
                    YesNotApplicableType copyOwnFurniturePossible = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "ownFurniturePossible", sourceOwnFurniturePossible), sourceOwnFurniturePossible, (this.ownFurniturePossible!= null)));
                    copy.setOwnFurniturePossible(copyOwnFurniturePossible);
                } else {
                    if (ownFurniturePossibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.ownFurniturePossible = null;
                    }
                }
            }
            {
                Boolean cleaningServiceAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cleaningServiceAvailable!= null));
                if (cleaningServiceAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCleaningServiceAvailable;
                    sourceCleaningServiceAvailable = this.getCleaningServiceAvailable();
                    YesNotApplicableType copyCleaningServiceAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cleaningServiceAvailable", sourceCleaningServiceAvailable), sourceCleaningServiceAvailable, (this.cleaningServiceAvailable!= null)));
                    copy.setCleaningServiceAvailable(copyCleaningServiceAvailable);
                } else {
                    if (cleaningServiceAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cleaningServiceAvailable = null;
                    }
                }
            }
            {
                Boolean shoppingFacilitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shoppingFacilitiesAvailable!= null));
                if (shoppingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceShoppingFacilitiesAvailable;
                    sourceShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
                    YesNotApplicableType copyShoppingFacilitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "shoppingFacilitiesAvailable", sourceShoppingFacilitiesAvailable), sourceShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null)));
                    copy.setShoppingFacilitiesAvailable(copyShoppingFacilitiesAvailable);
                } else {
                    if (shoppingFacilitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shoppingFacilitiesAvailable = null;
                    }
                }
            }
            {
                Boolean security24HoursShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.security24Hours!= null));
                if (security24HoursShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceSecurity24Hours;
                    sourceSecurity24Hours = this.getSecurity24Hours();
                    YesNotApplicableType copySecurity24Hours = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "security24Hours", sourceSecurity24Hours), sourceSecurity24Hours, (this.security24Hours!= null)));
                    copy.setSecurity24Hours(copySecurity24Hours);
                } else {
                    if (security24HoursShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.security24Hours = null;
                    }
                }
            }
            {
                Boolean culturalProgramAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.culturalProgramAvailable!= null));
                if (culturalProgramAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCulturalProgramAvailable;
                    sourceCulturalProgramAvailable = this.getCulturalProgramAvailable();
                    YesNotApplicableType copyCulturalProgramAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "culturalProgramAvailable", sourceCulturalProgramAvailable), sourceCulturalProgramAvailable, (this.culturalProgramAvailable!= null)));
                    copy.setCulturalProgramAvailable(copyCulturalProgramAvailable);
                } else {
                    if (culturalProgramAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.culturalProgramAvailable = null;
                    }
                }
            }
            {
                Boolean leisureActivitiesAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leisureActivitiesAvailable!= null));
                if (leisureActivitiesAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceLeisureActivitiesAvailable;
                    sourceLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
                    YesNotApplicableType copyLeisureActivitiesAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "leisureActivitiesAvailable", sourceLeisureActivitiesAvailable), sourceLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null)));
                    copy.setLeisureActivitiesAvailable(copyLeisureActivitiesAvailable);
                } else {
                    if (leisureActivitiesAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leisureActivitiesAvailable = null;
                    }
                }
            }
            {
                Boolean religiousOfferingsAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.religiousOfferingsAvailable!= null));
                if (religiousOfferingsAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceReligiousOfferingsAvailable;
                    sourceReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
                    YesNotApplicableType copyReligiousOfferingsAvailable = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "religiousOfferingsAvailable", sourceReligiousOfferingsAvailable), sourceReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null)));
                    copy.setReligiousOfferingsAvailable(copyReligiousOfferingsAvailable);
                } else {
                    if (religiousOfferingsAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.religiousOfferingsAvailable = null;
                    }
                }
            }
            {
                Boolean balconyAvailableShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balconyAvailable!= null));
                if (balconyAvailableShouldBeCopiedAndSet == Boolean.TRUE) {
                    BalconyAvailableType sourceBalconyAvailable;
                    sourceBalconyAvailable = this.getBalconyAvailable();
                    BalconyAvailableType copyBalconyAvailable = ((BalconyAvailableType) strategy.copy(LocatorUtils.property(locator, "balconyAvailable", sourceBalconyAvailable), sourceBalconyAvailable, (this.balconyAvailable!= null)));
                    copy.setBalconyAvailable(copyBalconyAvailable);
                } else {
                    if (balconyAvailableShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balconyAvailable = null;
                    }
                }
            }
            {
                Boolean branchEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.branchEntry!= null));
                if (branchEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBranchEntry;
                    sourceBranchEntry = this.getBranchEntry();
                    Boolean copyBranchEntry = ((Boolean) strategy.copy(LocatorUtils.property(locator, "branchEntry", sourceBranchEntry), sourceBranchEntry, (this.branchEntry!= null)));
                    copy.setBranchEntry(copyBranchEntry);
                } else {
                    if (branchEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.branchEntry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new SeniorCare();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SeniorCare that = ((SeniorCare) object);
        {
            String lhsShortDescription;
            lhsShortDescription = this.getShortDescription();
            String rhsShortDescription;
            rhsShortDescription = that.getShortDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortDescription", lhsShortDescription), LocatorUtils.property(thatLocator, "shortDescription", rhsShortDescription), lhsShortDescription, rhsShortDescription, (this.shortDescription!= null), (that.shortDescription!= null))) {
                return false;
            }
        }
        {
            PetsAllowedType lhsPetsAllowed;
            lhsPetsAllowed = this.getPetsAllowed();
            PetsAllowedType rhsPetsAllowed;
            rhsPetsAllowed = that.getPetsAllowed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "petsAllowed", lhsPetsAllowed), LocatorUtils.property(thatLocator, "petsAllowed", rhsPetsAllowed), lhsPetsAllowed, rhsPetsAllowed, (this.petsAllowed!= null), (that.petsAllowed!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsTrialLivingPossible;
            lhsTrialLivingPossible = this.getTrialLivingPossible();
            YesNotApplicableType rhsTrialLivingPossible;
            rhsTrialLivingPossible = that.getTrialLivingPossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trialLivingPossible", lhsTrialLivingPossible), LocatorUtils.property(thatLocator, "trialLivingPossible", rhsTrialLivingPossible), lhsTrialLivingPossible, rhsTrialLivingPossible, (this.trialLivingPossible!= null), (that.trialLivingPossible!= null))) {
                return false;
            }
        }
        {
            CareTypes lhsCareTypes;
            lhsCareTypes = this.getCareTypes();
            CareTypes rhsCareTypes;
            rhsCareTypes = that.getCareTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careTypes", lhsCareTypes), LocatorUtils.property(thatLocator, "careTypes", rhsCareTypes), lhsCareTypes, rhsCareTypes, (this.careTypes!= null), (that.careTypes!= null))) {
                return false;
            }
        }
        {
            CareLevelExpose lhsCareLevel;
            lhsCareLevel = this.getCareLevel();
            CareLevelExpose rhsCareLevel;
            rhsCareLevel = that.getCareLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careLevel", lhsCareLevel), LocatorUtils.property(thatLocator, "careLevel", rhsCareLevel), lhsCareLevel, rhsCareLevel, (this.careLevel!= null), (that.careLevel!= null))) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfBeds;
            lhsNumberOfBeds = this.getNumberOfBeds();
            Long rhsNumberOfBeds;
            rhsNumberOfBeds = that.getNumberOfBeds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBeds", lhsNumberOfBeds), LocatorUtils.property(thatLocator, "numberOfBeds", rhsNumberOfBeds), lhsNumberOfBeds, rhsNumberOfBeds, (this.numberOfBeds!= null), (that.numberOfBeds!= null))) {
                return false;
            }
        }
        {
            Calendar lhsOpening;
            lhsOpening = this.getOpening();
            Calendar rhsOpening;
            rhsOpening = that.getOpening();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "opening", lhsOpening), LocatorUtils.property(thatLocator, "opening", rhsOpening), lhsOpening, rhsOpening, (this.opening!= null), (that.opening!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfDementia;
            lhsCareOfDementia = this.getCareOfDementia();
            YesNotApplicableType rhsCareOfDementia;
            rhsCareOfDementia = that.getCareOfDementia();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfDementia", lhsCareOfDementia), LocatorUtils.property(thatLocator, "careOfDementia", rhsCareOfDementia), lhsCareOfDementia, rhsCareOfDementia, (this.careOfDementia!= null), (that.careOfDementia!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfArtificialRespiration;
            lhsCareOfArtificialRespiration = this.getCareOfArtificialRespiration();
            YesNotApplicableType rhsCareOfArtificialRespiration;
            rhsCareOfArtificialRespiration = that.getCareOfArtificialRespiration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfArtificialRespiration", lhsCareOfArtificialRespiration), LocatorUtils.property(thatLocator, "careOfArtificialRespiration", rhsCareOfArtificialRespiration), lhsCareOfArtificialRespiration, rhsCareOfArtificialRespiration, (this.careOfArtificialRespiration!= null), (that.careOfArtificialRespiration!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfComaVigil;
            lhsCareOfComaVigil = this.getCareOfComaVigil();
            YesNotApplicableType rhsCareOfComaVigil;
            rhsCareOfComaVigil = that.getCareOfComaVigil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfComaVigil", lhsCareOfComaVigil), LocatorUtils.property(thatLocator, "careOfComaVigil", rhsCareOfComaVigil), lhsCareOfComaVigil, rhsCareOfComaVigil, (this.careOfComaVigil!= null), (that.careOfComaVigil!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfStroke;
            lhsCareOfStroke = this.getCareOfStroke();
            YesNotApplicableType rhsCareOfStroke;
            rhsCareOfStroke = that.getCareOfStroke();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfStroke", lhsCareOfStroke), LocatorUtils.property(thatLocator, "careOfStroke", rhsCareOfStroke), lhsCareOfStroke, rhsCareOfStroke, (this.careOfStroke!= null), (that.careOfStroke!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfParkinson;
            lhsCareOfParkinson = this.getCareOfParkinson();
            YesNotApplicableType rhsCareOfParkinson;
            rhsCareOfParkinson = that.getCareOfParkinson();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfParkinson", lhsCareOfParkinson), LocatorUtils.property(thatLocator, "careOfParkinson", rhsCareOfParkinson), lhsCareOfParkinson, rhsCareOfParkinson, (this.careOfParkinson!= null), (that.careOfParkinson!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfAlzheimer;
            lhsCareOfAlzheimer = this.getCareOfAlzheimer();
            YesNotApplicableType rhsCareOfAlzheimer;
            rhsCareOfAlzheimer = that.getCareOfAlzheimer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfAlzheimer", lhsCareOfAlzheimer), LocatorUtils.property(thatLocator, "careOfAlzheimer", rhsCareOfAlzheimer), lhsCareOfAlzheimer, rhsCareOfAlzheimer, (this.careOfAlzheimer!= null), (that.careOfAlzheimer!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCareOfMultipleSclerosis;
            lhsCareOfMultipleSclerosis = this.getCareOfMultipleSclerosis();
            YesNotApplicableType rhsCareOfMultipleSclerosis;
            rhsCareOfMultipleSclerosis = that.getCareOfMultipleSclerosis();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "careOfMultipleSclerosis", lhsCareOfMultipleSclerosis), LocatorUtils.property(thatLocator, "careOfMultipleSclerosis", rhsCareOfMultipleSclerosis), lhsCareOfMultipleSclerosis, rhsCareOfMultipleSclerosis, (this.careOfMultipleSclerosis!= null), (that.careOfMultipleSclerosis!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsKitchenAvailable;
            lhsKitchenAvailable = this.getKitchenAvailable();
            YesNotApplicableType rhsKitchenAvailable;
            rhsKitchenAvailable = that.getKitchenAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kitchenAvailable", lhsKitchenAvailable), LocatorUtils.property(thatLocator, "kitchenAvailable", rhsKitchenAvailable), lhsKitchenAvailable, rhsKitchenAvailable, (this.kitchenAvailable!= null), (that.kitchenAvailable!= null))) {
                return false;
            }
        }
        {
            RoomType lhsRoomType;
            lhsRoomType = this.getRoomType();
            RoomType rhsRoomType;
            rhsRoomType = that.getRoomType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roomType", lhsRoomType), LocatorUtils.property(thatLocator, "roomType", rhsRoomType), lhsRoomType, rhsRoomType, (this.roomType!= null), (that.roomType!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsTherapyOfferingsAvailable;
            lhsTherapyOfferingsAvailable = this.getTherapyOfferingsAvailable();
            YesNotApplicableType rhsTherapyOfferingsAvailable;
            rhsTherapyOfferingsAvailable = that.getTherapyOfferingsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "therapyOfferingsAvailable", lhsTherapyOfferingsAvailable), LocatorUtils.property(thatLocator, "therapyOfferingsAvailable", rhsTherapyOfferingsAvailable), lhsTherapyOfferingsAvailable, rhsTherapyOfferingsAvailable, (this.therapyOfferingsAvailable!= null), (that.therapyOfferingsAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBarrierFree;
            lhsBarrierFree = this.getBarrierFree();
            YesNotApplicableType rhsBarrierFree;
            rhsBarrierFree = that.getBarrierFree();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "barrierFree", lhsBarrierFree), LocatorUtils.property(thatLocator, "barrierFree", rhsBarrierFree), lhsBarrierFree, rhsBarrierFree, (this.barrierFree!= null), (that.barrierFree!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfLookedAfterApartments;
            lhsNumberOfLookedAfterApartments = this.getNumberOfLookedAfterApartments();
            Long rhsNumberOfLookedAfterApartments;
            rhsNumberOfLookedAfterApartments = that.getNumberOfLookedAfterApartments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfLookedAfterApartments", lhsNumberOfLookedAfterApartments), LocatorUtils.property(thatLocator, "numberOfLookedAfterApartments", rhsNumberOfLookedAfterApartments), lhsNumberOfLookedAfterApartments, rhsNumberOfLookedAfterApartments, (this.numberOfLookedAfterApartments!= null), (that.numberOfLookedAfterApartments!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfNursingPlaces;
            lhsNumberOfNursingPlaces = this.getNumberOfNursingPlaces();
            Long rhsNumberOfNursingPlaces;
            rhsNumberOfNursingPlaces = that.getNumberOfNursingPlaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfNursingPlaces", lhsNumberOfNursingPlaces), LocatorUtils.property(thatLocator, "numberOfNursingPlaces", rhsNumberOfNursingPlaces), lhsNumberOfNursingPlaces, rhsNumberOfNursingPlaces, (this.numberOfNursingPlaces!= null), (that.numberOfNursingPlaces!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceFrom;
            lhsLivingSpaceFrom = this.getLivingSpaceFrom();
            BigDecimal rhsLivingSpaceFrom;
            rhsLivingSpaceFrom = that.getLivingSpaceFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceFrom", lhsLivingSpaceFrom), LocatorUtils.property(thatLocator, "livingSpaceFrom", rhsLivingSpaceFrom), lhsLivingSpaceFrom, rhsLivingSpaceFrom, (this.livingSpaceFrom!= null), (that.livingSpaceFrom!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLivingSpaceTo;
            lhsLivingSpaceTo = this.getLivingSpaceTo();
            BigDecimal rhsLivingSpaceTo;
            rhsLivingSpaceTo = that.getLivingSpaceTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpaceTo", lhsLivingSpaceTo), LocatorUtils.property(thatLocator, "livingSpaceTo", rhsLivingSpaceTo), lhsLivingSpaceTo, rhsLivingSpaceTo, (this.livingSpaceTo!= null), (that.livingSpaceTo!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsHandicappedAccessible;
            lhsHandicappedAccessible = this.getHandicappedAccessible();
            YesNotApplicableType rhsHandicappedAccessible;
            rhsHandicappedAccessible = that.getHandicappedAccessible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handicappedAccessible", lhsHandicappedAccessible), LocatorUtils.property(thatLocator, "handicappedAccessible", rhsHandicappedAccessible), lhsHandicappedAccessible, rhsHandicappedAccessible, (this.handicappedAccessible!= null), (that.handicappedAccessible!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGuestApartmentsAvailable;
            lhsGuestApartmentsAvailable = this.getGuestApartmentsAvailable();
            YesNotApplicableType rhsGuestApartmentsAvailable;
            rhsGuestApartmentsAvailable = that.getGuestApartmentsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestApartmentsAvailable", lhsGuestApartmentsAvailable), LocatorUtils.property(thatLocator, "guestApartmentsAvailable", rhsGuestApartmentsAvailable), lhsGuestApartmentsAvailable, rhsGuestApartmentsAvailable, (this.guestApartmentsAvailable!= null), (that.guestApartmentsAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsRestaurantAvailable;
            lhsRestaurantAvailable = this.getRestaurantAvailable();
            YesNotApplicableType rhsRestaurantAvailable;
            rhsRestaurantAvailable = that.getRestaurantAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "restaurantAvailable", lhsRestaurantAvailable), LocatorUtils.property(thatLocator, "restaurantAvailable", rhsRestaurantAvailable), lhsRestaurantAvailable, rhsRestaurantAvailable, (this.restaurantAvailable!= null), (that.restaurantAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCookingFacilitiesAvailable;
            lhsCookingFacilitiesAvailable = this.getCookingFacilitiesAvailable();
            YesNotApplicableType rhsCookingFacilitiesAvailable;
            rhsCookingFacilitiesAvailable = that.getCookingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cookingFacilitiesAvailable", lhsCookingFacilitiesAvailable), LocatorUtils.property(thatLocator, "cookingFacilitiesAvailable", rhsCookingFacilitiesAvailable), lhsCookingFacilitiesAvailable, rhsCookingFacilitiesAvailable, (this.cookingFacilitiesAvailable!= null), (that.cookingFacilitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsOwnFurniturePossible;
            lhsOwnFurniturePossible = this.getOwnFurniturePossible();
            YesNotApplicableType rhsOwnFurniturePossible;
            rhsOwnFurniturePossible = that.getOwnFurniturePossible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ownFurniturePossible", lhsOwnFurniturePossible), LocatorUtils.property(thatLocator, "ownFurniturePossible", rhsOwnFurniturePossible), lhsOwnFurniturePossible, rhsOwnFurniturePossible, (this.ownFurniturePossible!= null), (that.ownFurniturePossible!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCleaningServiceAvailable;
            lhsCleaningServiceAvailable = this.getCleaningServiceAvailable();
            YesNotApplicableType rhsCleaningServiceAvailable;
            rhsCleaningServiceAvailable = that.getCleaningServiceAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cleaningServiceAvailable", lhsCleaningServiceAvailable), LocatorUtils.property(thatLocator, "cleaningServiceAvailable", rhsCleaningServiceAvailable), lhsCleaningServiceAvailable, rhsCleaningServiceAvailable, (this.cleaningServiceAvailable!= null), (that.cleaningServiceAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsShoppingFacilitiesAvailable;
            lhsShoppingFacilitiesAvailable = this.getShoppingFacilitiesAvailable();
            YesNotApplicableType rhsShoppingFacilitiesAvailable;
            rhsShoppingFacilitiesAvailable = that.getShoppingFacilitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shoppingFacilitiesAvailable", lhsShoppingFacilitiesAvailable), LocatorUtils.property(thatLocator, "shoppingFacilitiesAvailable", rhsShoppingFacilitiesAvailable), lhsShoppingFacilitiesAvailable, rhsShoppingFacilitiesAvailable, (this.shoppingFacilitiesAvailable!= null), (that.shoppingFacilitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsSecurity24Hours;
            lhsSecurity24Hours = this.getSecurity24Hours();
            YesNotApplicableType rhsSecurity24Hours;
            rhsSecurity24Hours = that.getSecurity24Hours();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "security24Hours", lhsSecurity24Hours), LocatorUtils.property(thatLocator, "security24Hours", rhsSecurity24Hours), lhsSecurity24Hours, rhsSecurity24Hours, (this.security24Hours!= null), (that.security24Hours!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCulturalProgramAvailable;
            lhsCulturalProgramAvailable = this.getCulturalProgramAvailable();
            YesNotApplicableType rhsCulturalProgramAvailable;
            rhsCulturalProgramAvailable = that.getCulturalProgramAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "culturalProgramAvailable", lhsCulturalProgramAvailable), LocatorUtils.property(thatLocator, "culturalProgramAvailable", rhsCulturalProgramAvailable), lhsCulturalProgramAvailable, rhsCulturalProgramAvailable, (this.culturalProgramAvailable!= null), (that.culturalProgramAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsLeisureActivitiesAvailable;
            lhsLeisureActivitiesAvailable = this.getLeisureActivitiesAvailable();
            YesNotApplicableType rhsLeisureActivitiesAvailable;
            rhsLeisureActivitiesAvailable = that.getLeisureActivitiesAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leisureActivitiesAvailable", lhsLeisureActivitiesAvailable), LocatorUtils.property(thatLocator, "leisureActivitiesAvailable", rhsLeisureActivitiesAvailable), lhsLeisureActivitiesAvailable, rhsLeisureActivitiesAvailable, (this.leisureActivitiesAvailable!= null), (that.leisureActivitiesAvailable!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsReligiousOfferingsAvailable;
            lhsReligiousOfferingsAvailable = this.getReligiousOfferingsAvailable();
            YesNotApplicableType rhsReligiousOfferingsAvailable;
            rhsReligiousOfferingsAvailable = that.getReligiousOfferingsAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "religiousOfferingsAvailable", lhsReligiousOfferingsAvailable), LocatorUtils.property(thatLocator, "religiousOfferingsAvailable", rhsReligiousOfferingsAvailable), lhsReligiousOfferingsAvailable, rhsReligiousOfferingsAvailable, (this.religiousOfferingsAvailable!= null), (that.religiousOfferingsAvailable!= null))) {
                return false;
            }
        }
        {
            BalconyAvailableType lhsBalconyAvailable;
            lhsBalconyAvailable = this.getBalconyAvailable();
            BalconyAvailableType rhsBalconyAvailable;
            rhsBalconyAvailable = that.getBalconyAvailable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balconyAvailable", lhsBalconyAvailable), LocatorUtils.property(thatLocator, "balconyAvailable", rhsBalconyAvailable), lhsBalconyAvailable, rhsBalconyAvailable, (this.balconyAvailable!= null), (that.balconyAvailable!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBranchEntry;
            lhsBranchEntry = this.getBranchEntry();
            Boolean rhsBranchEntry;
            rhsBranchEntry = that.getBranchEntry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchEntry", lhsBranchEntry), LocatorUtils.property(thatLocator, "branchEntry", rhsBranchEntry), lhsBranchEntry, rhsBranchEntry, (this.branchEntry!= null), (that.branchEntry!= null))) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
