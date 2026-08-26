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
import org.openestate.is24.restapi.xml.common.BuildingEnergyRatingType;
import org.openestate.is24.restapi.xml.common.CompulsoryAuctionType;
import org.openestate.is24.restapi.xml.common.CountyCourt;
import org.openestate.is24.restapi.xml.common.EnergyPerformanceCertificate;
import org.openestate.is24.restapi.xml.common.EnergySourcesEnev2014;
import org.openestate.is24.restapi.xml.common.HeatingTypeEnev2014;
import org.openestate.is24.restapi.xml.common.ParkingSpaceType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.YesNotApplicableType;


/**
 * Eigenschaften für den Immobilientyp "Zwangsversteigerungsobjekte"
 * 
 * <p>Java class for CompulsoryAuction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompulsoryAuction">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       <sequence>
 *         <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedCompulsoryAuctionGroup"/>
 *         <element name="customLowestBid" type="{http://rest.immobilienscout24.de/schema/common/1.0}Price" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment",
    "dateOfAuction",
    "lastChangeDate",
    "cancellationDate",
    "recordationDate",
    "area",
    "auctionObjectType",
    "countyCourt",
    "fileReferenceAtCountyCourt",
    "numberOfFolio",
    "splittingAuction",
    "owner",
    "energyCertificate",
    "heatingTypeEnev2014",
    "energySourcesEnev2014",
    "buildingEnergyRatingType",
    "thermalCharacteristic",
    "energyConsumptionContainsWarmWater",
    "constructionYear",
    "constructionYearUnknown",
    "cellar",
    "numberOfRooms",
    "balcony",
    "builtInKitchen",
    "guestToilet",
    "lastRefurbishment",
    "numberOfBathRooms",
    "numberOfFloors",
    "numberOfParkingSpaces",
    "parkingSpacePrice",
    "parkingSpaceType",
    "floor",
    "customLowestBid"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class CompulsoryAuction
    extends RealEstate
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Marktwert der Immobilie, die Attribute geben die Art, die Währung
     *                         und den Intervall an
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price marketValue;
    /**
     * Mindestangebot zur Immobilie, die Attribute geben die Art, die
     *                         Währung und den Intervall an. Das Feld wird berechnet mit 5/10 des Markpreises.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price lowestBid;
    /**
     * Wiederholungstermin (Zweiter Termin)
     * 
     */
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean recurrenceAppointment;
    /**
     * Datum der Auktion
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar dateOfAuction;
    /**
     * Datum der letzten Änderung
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar lastChangeDate;
    /**
     * Aufhebungsdatum
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar cancellationDate;
    /**
     * Erfassungsdatum
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar recordationDate;
    /**
     * Fläche, unterschiedlich je nach Typ
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal area;
    /**
     * Objektart der Auktion
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CompulsoryAuctionType auctionObjectType;
    /**
     * Das Amtsgericht das für die Auktion verantwortlich ist
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CountyCourt countyCourt;
    /**
     * Das Aktenzeichen beim Amtsgericht
     * 
     */
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String fileReferenceAtCountyCourt;
    /**
     * Grundbuchsblatt-Nummer
     * 
     */
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String numberOfFolio;
    /**
     * Teilungsversteigerung
     * 
     */
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean splittingAuction;
    /**
     * Besitzer des zu versteigernden Objekts
     * 
     */
    @XmlJavaTypeAdapter(Adapter8 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String owner;
    /**
     * Energieausweis
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected EnergyPerformanceCertificate energyCertificate;
    /**
     * Heizungsart
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected HeatingTypeEnev2014 heatingTypeEnev2014;
    /**
     * wesentliche Energieträger
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected EnergySourcesEnev2014 energySourcesEnev2014;
    /**
     * Energieausweistyp
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BuildingEnergyRatingType buildingEnergyRatingType;
    /**
     * Energieverbrauchskennwert
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal thermalCharacteristic;
    /**
     * Energieverbrauch für Warmwasser enthalten
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType energyConsumptionContainsWarmWater;
    /**
     * Baujahr
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer constructionYear;
    /**
     * Baujahr ist unbekannt
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean constructionYearUnknown;
    /**
     * Keller verfügbar
     * 
     */
    @XmlElement(defaultValue = "NOT_APPLICABLE")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType cellar;
    /**
     * Zimmeranzahl
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal numberOfRooms;
    /**
     * Balkon
     * 
     */
    @XmlElement(defaultValue = "NOT_APPLICABLE")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType balcony;
    /**
     * Einbauküche
     * 
     */
    @XmlElement(defaultValue = "NOT_APPLICABLE")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType builtInKitchen;
    /**
     * Gästetoilette
     * 
     */
    @XmlElement(defaultValue = "NOT_APPLICABLE")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNotApplicableType guestToilet;
    /**
     * Letzte Modernisierung
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long lastRefurbishment;
    /**
     * Anzahl Badezimmer
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfBathRooms;
    /**
     * Anzahl Etagen
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfFloors;
    /**
     * Parkflächenanzahl
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfParkingSpaces;
    /**
     * Garage/ Stellplatz-Kaufpreis
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal parkingSpacePrice;
    /**
     * Garage/ Stellplatz
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ParkingSpaceType parkingSpaceType;
    /**
     * Etage
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter11 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer floor;
    /**
     * Mindestangebot zur Immobilie, die Attribute geben die
     *                                 Art, die
     *                                 Währung und den Intervall an. Das Feld wird gesetzt im Gegensatz zu "lowestBid" welches
     *                                 berechnet wird.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price customLowestBid;

    /**
     * Marktwert der Immobilie, die Attribute geben die Art, die Währung
     *                         und den Intervall an
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getMarketValue() {
        return marketValue;
    }

    /**
     * Sets the value of the marketValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getMarketValue()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMarketValue(Price value) {
        this.marketValue = value;
    }

    /**
     * Mindestangebot zur Immobilie, die Attribute geben die Art, die
     *                         Währung und den Intervall an. Das Feld wird berechnet mit 5/10 des Markpreises.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getLowestBid() {
        return lowestBid;
    }

    /**
     * Sets the value of the lowestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getLowestBid()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLowestBid(Price value) {
        this.lowestBid = value;
    }

    /**
     * Wiederholungstermin (Zweiter Termin)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getRecurrenceAppointment() {
        return recurrenceAppointment;
    }

    /**
     * Sets the value of the recurrenceAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getRecurrenceAppointment()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRecurrenceAppointment(Boolean value) {
        this.recurrenceAppointment = value;
    }

    /**
     * Datum der Auktion
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getDateOfAuction() {
        return dateOfAuction;
    }

    /**
     * Sets the value of the dateOfAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getDateOfAuction()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDateOfAuction(Calendar value) {
        this.dateOfAuction = value;
    }

    /**
     * Datum der letzten Änderung
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getLastChangeDate() {
        return lastChangeDate;
    }

    /**
     * Sets the value of the lastChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getLastChangeDate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLastChangeDate(Calendar value) {
        this.lastChangeDate = value;
    }

    /**
     * Aufhebungsdatum
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getCancellationDate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCancellationDate(Calendar value) {
        this.cancellationDate = value;
    }

    /**
     * Erfassungsdatum
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getRecordationDate() {
        return recordationDate;
    }

    /**
     * Sets the value of the recordationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getRecordationDate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRecordationDate(Calendar value) {
        this.recordationDate = value;
    }

    /**
     * Fläche, unterschiedlich je nach Typ
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getArea()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Objektart der Auktion
     * 
     * @return
     *     possible object is
     *     {@link CompulsoryAuctionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CompulsoryAuctionType getAuctionObjectType() {
        return auctionObjectType;
    }

    /**
     * Sets the value of the auctionObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompulsoryAuctionType }
     *     
     * @see #getAuctionObjectType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAuctionObjectType(CompulsoryAuctionType value) {
        this.auctionObjectType = value;
    }

    /**
     * Das Amtsgericht das für die Auktion verantwortlich ist
     * 
     * @return
     *     possible object is
     *     {@link CountyCourt }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CountyCourt getCountyCourt() {
        return countyCourt;
    }

    /**
     * Sets the value of the countyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyCourt }
     *     
     * @see #getCountyCourt()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCountyCourt(CountyCourt value) {
        this.countyCourt = value;
    }

    /**
     * Das Aktenzeichen beim Amtsgericht
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getFileReferenceAtCountyCourt() {
        return fileReferenceAtCountyCourt;
    }

    /**
     * Sets the value of the fileReferenceAtCountyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFileReferenceAtCountyCourt()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFileReferenceAtCountyCourt(String value) {
        this.fileReferenceAtCountyCourt = value;
    }

    /**
     * Grundbuchsblatt-Nummer
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getNumberOfFolio() {
        return numberOfFolio;
    }

    /**
     * Sets the value of the numberOfFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumberOfFolio()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfFolio(String value) {
        this.numberOfFolio = value;
    }

    /**
     * Teilungsversteigerung
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getSplittingAuction() {
        return splittingAuction;
    }

    /**
     * Sets the value of the splittingAuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getSplittingAuction()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSplittingAuction(Boolean value) {
        this.splittingAuction = value;
    }

    /**
     * Besitzer des zu versteigernden Objekts
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOwner()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Energieausweis
     * 
     * @return
     *     possible object is
     *     {@link EnergyPerformanceCertificate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public EnergyPerformanceCertificate getEnergyCertificate() {
        return energyCertificate;
    }

    /**
     * Sets the value of the energyCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyPerformanceCertificate }
     *     
     * @see #getEnergyCertificate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setEnergyCertificate(EnergyPerformanceCertificate value) {
        this.energyCertificate = value;
    }

    /**
     * Heizungsart
     * 
     * @return
     *     possible object is
     *     {@link HeatingTypeEnev2014 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
        return heatingTypeEnev2014;
    }

    /**
     * Sets the value of the heatingTypeEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeatingTypeEnev2014 }
     *     
     * @see #getHeatingTypeEnev2014()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
        this.heatingTypeEnev2014 = value;
    }

    /**
     * wesentliche Energieträger
     * 
     * @return
     *     possible object is
     *     {@link EnergySourcesEnev2014 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
        return energySourcesEnev2014;
    }

    /**
     * Sets the value of the energySourcesEnev2014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergySourcesEnev2014 }
     *     
     * @see #getEnergySourcesEnev2014()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
        this.energySourcesEnev2014 = value;
    }

    /**
     * Energieausweistyp
     * 
     * @return
     *     possible object is
     *     {@link BuildingEnergyRatingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BuildingEnergyRatingType getBuildingEnergyRatingType() {
        return buildingEnergyRatingType;
    }

    /**
     * Sets the value of the buildingEnergyRatingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingEnergyRatingType }
     *     
     * @see #getBuildingEnergyRatingType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
        this.buildingEnergyRatingType = value;
    }

    /**
     * Energieverbrauchskennwert
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getThermalCharacteristic() {
        return thermalCharacteristic;
    }

    /**
     * Sets the value of the thermalCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getThermalCharacteristic()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setThermalCharacteristic(BigDecimal value) {
        this.thermalCharacteristic = value;
    }

    /**
     * Energieverbrauch für Warmwasser enthalten
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
        return energyConsumptionContainsWarmWater;
    }

    /**
     * Sets the value of the energyConsumptionContainsWarmWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getEnergyConsumptionContainsWarmWater()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
        this.energyConsumptionContainsWarmWater = value;
    }

    /**
     * Baujahr
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Integer getConstructionYear() {
        return constructionYear;
    }

    /**
     * Sets the value of the constructionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getConstructionYear()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setConstructionYear(Integer value) {
        this.constructionYear = value;
    }

    /**
     * Baujahr ist unbekannt
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getConstructionYearUnknown() {
        return constructionYearUnknown;
    }

    /**
     * Sets the value of the constructionYearUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getConstructionYearUnknown()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setConstructionYearUnknown(Boolean value) {
        this.constructionYearUnknown = value;
    }

    /**
     * Keller verfügbar
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getCellar() {
        return cellar;
    }

    /**
     * Sets the value of the cellar property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getCellar()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCellar(YesNotApplicableType value) {
        this.cellar = value;
    }

    /**
     * Zimmeranzahl
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getNumberOfRooms() {
        return numberOfRooms;
    }

    /**
     * Sets the value of the numberOfRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNumberOfRooms()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfRooms(BigDecimal value) {
        this.numberOfRooms = value;
    }

    /**
     * Balkon
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getBalcony() {
        return balcony;
    }

    /**
     * Sets the value of the balcony property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getBalcony()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBalcony(YesNotApplicableType value) {
        this.balcony = value;
    }

    /**
     * Einbauküche
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getBuiltInKitchen() {
        return builtInKitchen;
    }

    /**
     * Sets the value of the builtInKitchen property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getBuiltInKitchen()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBuiltInKitchen(YesNotApplicableType value) {
        this.builtInKitchen = value;
    }

    /**
     * Gästetoilette
     * 
     * @return
     *     possible object is
     *     {@link YesNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNotApplicableType getGuestToilet() {
        return guestToilet;
    }

    /**
     * Sets the value of the guestToilet property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNotApplicableType }
     *     
     * @see #getGuestToilet()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGuestToilet(YesNotApplicableType value) {
        this.guestToilet = value;
    }

    /**
     * Letzte Modernisierung
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getLastRefurbishment() {
        return lastRefurbishment;
    }

    /**
     * Sets the value of the lastRefurbishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getLastRefurbishment()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLastRefurbishment(Long value) {
        this.lastRefurbishment = value;
    }

    /**
     * Anzahl Badezimmer
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfBathRooms() {
        return numberOfBathRooms;
    }

    /**
     * Sets the value of the numberOfBathRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfBathRooms()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfBathRooms(Long value) {
        this.numberOfBathRooms = value;
    }

    /**
     * Anzahl Etagen
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfFloors() {
        return numberOfFloors;
    }

    /**
     * Sets the value of the numberOfFloors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfFloors()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfFloors(Long value) {
        this.numberOfFloors = value;
    }

    /**
     * Parkflächenanzahl
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    /**
     * Sets the value of the numberOfParkingSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfParkingSpaces()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfParkingSpaces(Long value) {
        this.numberOfParkingSpaces = value;
    }

    /**
     * Garage/ Stellplatz-Kaufpreis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getParkingSpacePrice() {
        return parkingSpacePrice;
    }

    /**
     * Sets the value of the parkingSpacePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getParkingSpacePrice()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setParkingSpacePrice(BigDecimal value) {
        this.parkingSpacePrice = value;
    }

    /**
     * Garage/ Stellplatz
     * 
     * @return
     *     possible object is
     *     {@link ParkingSpaceType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    /**
     * Sets the value of the parkingSpaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpaceType }
     *     
     * @see #getParkingSpaceType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setParkingSpaceType(ParkingSpaceType value) {
        this.parkingSpaceType = value;
    }

    /**
     * Etage
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Integer getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFloor()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFloor(Integer value) {
        this.floor = value;
    }

    /**
     * Mindestangebot zur Immobilie, die Attribute geben die
     *                                 Art, die
     *                                 Währung und den Intervall an. Das Feld wird gesetzt im Gegensatz zu "lowestBid" welches
     *                                 berechnet wird.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getCustomLowestBid() {
        return customLowestBid;
    }

    /**
     * Sets the value of the customLowestBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getCustomLowestBid()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCustomLowestBid(Price value) {
        this.customLowestBid = value;
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
            Price theMarketValue;
            theMarketValue = this.getMarketValue();
            strategy.appendField(locator, this, "marketValue", buffer, theMarketValue, (this.marketValue!= null));
        }
        {
            Price theLowestBid;
            theLowestBid = this.getLowestBid();
            strategy.appendField(locator, this, "lowestBid", buffer, theLowestBid, (this.lowestBid!= null));
        }
        {
            Boolean theRecurrenceAppointment;
            theRecurrenceAppointment = this.getRecurrenceAppointment();
            strategy.appendField(locator, this, "recurrenceAppointment", buffer, theRecurrenceAppointment, (this.recurrenceAppointment!= null));
        }
        {
            Calendar theDateOfAuction;
            theDateOfAuction = this.getDateOfAuction();
            strategy.appendField(locator, this, "dateOfAuction", buffer, theDateOfAuction, (this.dateOfAuction!= null));
        }
        {
            Calendar theLastChangeDate;
            theLastChangeDate = this.getLastChangeDate();
            strategy.appendField(locator, this, "lastChangeDate", buffer, theLastChangeDate, (this.lastChangeDate!= null));
        }
        {
            Calendar theCancellationDate;
            theCancellationDate = this.getCancellationDate();
            strategy.appendField(locator, this, "cancellationDate", buffer, theCancellationDate, (this.cancellationDate!= null));
        }
        {
            Calendar theRecordationDate;
            theRecordationDate = this.getRecordationDate();
            strategy.appendField(locator, this, "recordationDate", buffer, theRecordationDate, (this.recordationDate!= null));
        }
        {
            BigDecimal theArea;
            theArea = this.getArea();
            strategy.appendField(locator, this, "area", buffer, theArea, (this.area!= null));
        }
        {
            CompulsoryAuctionType theAuctionObjectType;
            theAuctionObjectType = this.getAuctionObjectType();
            strategy.appendField(locator, this, "auctionObjectType", buffer, theAuctionObjectType, (this.auctionObjectType!= null));
        }
        {
            CountyCourt theCountyCourt;
            theCountyCourt = this.getCountyCourt();
            strategy.appendField(locator, this, "countyCourt", buffer, theCountyCourt, (this.countyCourt!= null));
        }
        {
            String theFileReferenceAtCountyCourt;
            theFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            strategy.appendField(locator, this, "fileReferenceAtCountyCourt", buffer, theFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null));
        }
        {
            String theNumberOfFolio;
            theNumberOfFolio = this.getNumberOfFolio();
            strategy.appendField(locator, this, "numberOfFolio", buffer, theNumberOfFolio, (this.numberOfFolio!= null));
        }
        {
            Boolean theSplittingAuction;
            theSplittingAuction = this.getSplittingAuction();
            strategy.appendField(locator, this, "splittingAuction", buffer, theSplittingAuction, (this.splittingAuction!= null));
        }
        {
            String theOwner;
            theOwner = this.getOwner();
            strategy.appendField(locator, this, "owner", buffer, theOwner, (this.owner!= null));
        }
        {
            EnergyPerformanceCertificate theEnergyCertificate;
            theEnergyCertificate = this.getEnergyCertificate();
            strategy.appendField(locator, this, "energyCertificate", buffer, theEnergyCertificate, (this.energyCertificate!= null));
        }
        {
            HeatingTypeEnev2014 theHeatingTypeEnev2014;
            theHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            strategy.appendField(locator, this, "heatingTypeEnev2014", buffer, theHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null));
        }
        {
            EnergySourcesEnev2014 theEnergySourcesEnev2014;
            theEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            strategy.appendField(locator, this, "energySourcesEnev2014", buffer, theEnergySourcesEnev2014, (this.energySourcesEnev2014 != null));
        }
        {
            BuildingEnergyRatingType theBuildingEnergyRatingType;
            theBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            strategy.appendField(locator, this, "buildingEnergyRatingType", buffer, theBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null));
        }
        {
            BigDecimal theThermalCharacteristic;
            theThermalCharacteristic = this.getThermalCharacteristic();
            strategy.appendField(locator, this, "thermalCharacteristic", buffer, theThermalCharacteristic, (this.thermalCharacteristic!= null));
        }
        {
            YesNotApplicableType theEnergyConsumptionContainsWarmWater;
            theEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            strategy.appendField(locator, this, "energyConsumptionContainsWarmWater", buffer, theEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null));
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            Boolean theConstructionYearUnknown;
            theConstructionYearUnknown = this.getConstructionYearUnknown();
            strategy.appendField(locator, this, "constructionYearUnknown", buffer, theConstructionYearUnknown, (this.constructionYearUnknown!= null));
        }
        {
            YesNotApplicableType theCellar;
            theCellar = this.getCellar();
            strategy.appendField(locator, this, "cellar", buffer, theCellar, (this.cellar!= null));
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms, (this.numberOfRooms!= null));
        }
        {
            YesNotApplicableType theBalcony;
            theBalcony = this.getBalcony();
            strategy.appendField(locator, this, "balcony", buffer, theBalcony, (this.balcony!= null));
        }
        {
            YesNotApplicableType theBuiltInKitchen;
            theBuiltInKitchen = this.getBuiltInKitchen();
            strategy.appendField(locator, this, "builtInKitchen", buffer, theBuiltInKitchen, (this.builtInKitchen!= null));
        }
        {
            YesNotApplicableType theGuestToilet;
            theGuestToilet = this.getGuestToilet();
            strategy.appendField(locator, this, "guestToilet", buffer, theGuestToilet, (this.guestToilet!= null));
        }
        {
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment, (this.lastRefurbishment!= null));
        }
        {
            Long theNumberOfBathRooms;
            theNumberOfBathRooms = this.getNumberOfBathRooms();
            strategy.appendField(locator, this, "numberOfBathRooms", buffer, theNumberOfBathRooms, (this.numberOfBathRooms!= null));
        }
        {
            Long theNumberOfFloors;
            theNumberOfFloors = this.getNumberOfFloors();
            strategy.appendField(locator, this, "numberOfFloors", buffer, theNumberOfFloors, (this.numberOfFloors!= null));
        }
        {
            Long theNumberOfParkingSpaces;
            theNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            strategy.appendField(locator, this, "numberOfParkingSpaces", buffer, theNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null));
        }
        {
            BigDecimal theParkingSpacePrice;
            theParkingSpacePrice = this.getParkingSpacePrice();
            strategy.appendField(locator, this, "parkingSpacePrice", buffer, theParkingSpacePrice, (this.parkingSpacePrice!= null));
        }
        {
            ParkingSpaceType theParkingSpaceType;
            theParkingSpaceType = this.getParkingSpaceType();
            strategy.appendField(locator, this, "parkingSpaceType", buffer, theParkingSpaceType, (this.parkingSpaceType!= null));
        }
        {
            Integer theFloor;
            theFloor = this.getFloor();
            strategy.appendField(locator, this, "floor", buffer, theFloor, (this.floor!= null));
        }
        {
            Price theCustomLowestBid;
            theCustomLowestBid = this.getCustomLowestBid();
            strategy.appendField(locator, this, "customLowestBid", buffer, theCustomLowestBid, (this.customLowestBid!= null));
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
        if (draftCopy instanceof CompulsoryAuction) {
            final CompulsoryAuction copy = ((CompulsoryAuction) draftCopy);
            {
                Boolean marketValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.marketValue!= null));
                if (marketValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceMarketValue;
                    sourceMarketValue = this.getMarketValue();
                    Price copyMarketValue = ((Price) strategy.copy(LocatorUtils.property(locator, "marketValue", sourceMarketValue), sourceMarketValue, (this.marketValue!= null)));
                    copy.setMarketValue(copyMarketValue);
                } else {
                    if (marketValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.marketValue = null;
                    }
                }
            }
            {
                Boolean lowestBidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lowestBid!= null));
                if (lowestBidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceLowestBid;
                    sourceLowestBid = this.getLowestBid();
                    Price copyLowestBid = ((Price) strategy.copy(LocatorUtils.property(locator, "lowestBid", sourceLowestBid), sourceLowestBid, (this.lowestBid!= null)));
                    copy.setLowestBid(copyLowestBid);
                } else {
                    if (lowestBidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lowestBid = null;
                    }
                }
            }
            {
                Boolean recurrenceAppointmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recurrenceAppointment!= null));
                if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceRecurrenceAppointment;
                    sourceRecurrenceAppointment = this.getRecurrenceAppointment();
                    Boolean copyRecurrenceAppointment = ((Boolean) strategy.copy(LocatorUtils.property(locator, "recurrenceAppointment", sourceRecurrenceAppointment), sourceRecurrenceAppointment, (this.recurrenceAppointment!= null)));
                    copy.setRecurrenceAppointment(copyRecurrenceAppointment);
                } else {
                    if (recurrenceAppointmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recurrenceAppointment = null;
                    }
                }
            }
            {
                Boolean dateOfAuctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateOfAuction!= null));
                if (dateOfAuctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateOfAuction;
                    sourceDateOfAuction = this.getDateOfAuction();
                    Calendar copyDateOfAuction = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateOfAuction", sourceDateOfAuction), sourceDateOfAuction, (this.dateOfAuction!= null)));
                    copy.setDateOfAuction(copyDateOfAuction);
                } else {
                    if (dateOfAuctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateOfAuction = null;
                    }
                }
            }
            {
                Boolean lastChangeDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastChangeDate!= null));
                if (lastChangeDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceLastChangeDate;
                    sourceLastChangeDate = this.getLastChangeDate();
                    Calendar copyLastChangeDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastChangeDate", sourceLastChangeDate), sourceLastChangeDate, (this.lastChangeDate!= null)));
                    copy.setLastChangeDate(copyLastChangeDate);
                } else {
                    if (lastChangeDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastChangeDate = null;
                    }
                }
            }
            {
                Boolean cancellationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cancellationDate!= null));
                if (cancellationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCancellationDate;
                    sourceCancellationDate = this.getCancellationDate();
                    Calendar copyCancellationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "cancellationDate", sourceCancellationDate), sourceCancellationDate, (this.cancellationDate!= null)));
                    copy.setCancellationDate(copyCancellationDate);
                } else {
                    if (cancellationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cancellationDate = null;
                    }
                }
            }
            {
                Boolean recordationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recordationDate!= null));
                if (recordationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceRecordationDate;
                    sourceRecordationDate = this.getRecordationDate();
                    Calendar copyRecordationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "recordationDate", sourceRecordationDate), sourceRecordationDate, (this.recordationDate!= null)));
                    copy.setRecordationDate(copyRecordationDate);
                } else {
                    if (recordationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recordationDate = null;
                    }
                }
            }
            {
                Boolean areaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.area!= null));
                if (areaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceArea;
                    sourceArea = this.getArea();
                    BigDecimal copyArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "area", sourceArea), sourceArea, (this.area!= null)));
                    copy.setArea(copyArea);
                } else {
                    if (areaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.area = null;
                    }
                }
            }
            {
                Boolean auctionObjectTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auctionObjectType!= null));
                if (auctionObjectTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CompulsoryAuctionType sourceAuctionObjectType;
                    sourceAuctionObjectType = this.getAuctionObjectType();
                    CompulsoryAuctionType copyAuctionObjectType = ((CompulsoryAuctionType) strategy.copy(LocatorUtils.property(locator, "auctionObjectType", sourceAuctionObjectType), sourceAuctionObjectType, (this.auctionObjectType!= null)));
                    copy.setAuctionObjectType(copyAuctionObjectType);
                } else {
                    if (auctionObjectTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auctionObjectType = null;
                    }
                }
            }
            {
                Boolean countyCourtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.countyCourt!= null));
                if (countyCourtShouldBeCopiedAndSet == Boolean.TRUE) {
                    CountyCourt sourceCountyCourt;
                    sourceCountyCourt = this.getCountyCourt();
                    CountyCourt copyCountyCourt = ((CountyCourt) strategy.copy(LocatorUtils.property(locator, "countyCourt", sourceCountyCourt), sourceCountyCourt, (this.countyCourt!= null)));
                    copy.setCountyCourt(copyCountyCourt);
                } else {
                    if (countyCourtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.countyCourt = null;
                    }
                }
            }
            {
                Boolean fileReferenceAtCountyCourtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fileReferenceAtCountyCourt!= null));
                if (fileReferenceAtCountyCourtShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFileReferenceAtCountyCourt;
                    sourceFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
                    String copyFileReferenceAtCountyCourt = ((String) strategy.copy(LocatorUtils.property(locator, "fileReferenceAtCountyCourt", sourceFileReferenceAtCountyCourt), sourceFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null)));
                    copy.setFileReferenceAtCountyCourt(copyFileReferenceAtCountyCourt);
                } else {
                    if (fileReferenceAtCountyCourtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.fileReferenceAtCountyCourt = null;
                    }
                }
            }
            {
                Boolean numberOfFolioShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFolio!= null));
                if (numberOfFolioShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNumberOfFolio;
                    sourceNumberOfFolio = this.getNumberOfFolio();
                    String copyNumberOfFolio = ((String) strategy.copy(LocatorUtils.property(locator, "numberOfFolio", sourceNumberOfFolio), sourceNumberOfFolio, (this.numberOfFolio!= null)));
                    copy.setNumberOfFolio(copyNumberOfFolio);
                } else {
                    if (numberOfFolioShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFolio = null;
                    }
                }
            }
            {
                Boolean splittingAuctionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.splittingAuction!= null));
                if (splittingAuctionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSplittingAuction;
                    sourceSplittingAuction = this.getSplittingAuction();
                    Boolean copySplittingAuction = ((Boolean) strategy.copy(LocatorUtils.property(locator, "splittingAuction", sourceSplittingAuction), sourceSplittingAuction, (this.splittingAuction!= null)));
                    copy.setSplittingAuction(copySplittingAuction);
                } else {
                    if (splittingAuctionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.splittingAuction = null;
                    }
                }
            }
            {
                Boolean ownerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.owner!= null));
                if (ownerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceOwner;
                    sourceOwner = this.getOwner();
                    String copyOwner = ((String) strategy.copy(LocatorUtils.property(locator, "owner", sourceOwner), sourceOwner, (this.owner!= null)));
                    copy.setOwner(copyOwner);
                } else {
                    if (ownerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.owner = null;
                    }
                }
            }
            {
                Boolean energyCertificateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyCertificate!= null));
                if (energyCertificateShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergyPerformanceCertificate sourceEnergyCertificate;
                    sourceEnergyCertificate = this.getEnergyCertificate();
                    EnergyPerformanceCertificate copyEnergyCertificate = ((EnergyPerformanceCertificate) strategy.copy(LocatorUtils.property(locator, "energyCertificate", sourceEnergyCertificate), sourceEnergyCertificate, (this.energyCertificate!= null)));
                    copy.setEnergyCertificate(copyEnergyCertificate);
                } else {
                    if (energyCertificateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyCertificate = null;
                    }
                }
            }
            {
                Boolean heatingTypeEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heatingTypeEnev2014 != null));
                if (heatingTypeEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    HeatingTypeEnev2014 sourceHeatingTypeEnev2014;
                    sourceHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
                    HeatingTypeEnev2014 copyHeatingTypeEnev2014 = ((HeatingTypeEnev2014) strategy.copy(LocatorUtils.property(locator, "heatingTypeEnev2014", sourceHeatingTypeEnev2014), sourceHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null)));
                    copy.setHeatingTypeEnev2014(copyHeatingTypeEnev2014);
                } else {
                    if (heatingTypeEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heatingTypeEnev2014 = null;
                    }
                }
            }
            {
                Boolean energySourcesEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energySourcesEnev2014 != null));
                if (energySourcesEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnergySourcesEnev2014 sourceEnergySourcesEnev2014;
                    sourceEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
                    EnergySourcesEnev2014 copyEnergySourcesEnev2014 = ((EnergySourcesEnev2014) strategy.copy(LocatorUtils.property(locator, "energySourcesEnev2014", sourceEnergySourcesEnev2014), sourceEnergySourcesEnev2014, (this.energySourcesEnev2014 != null)));
                    copy.setEnergySourcesEnev2014(copyEnergySourcesEnev2014);
                } else {
                    if (energySourcesEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energySourcesEnev2014 = null;
                    }
                }
            }
            {
                Boolean buildingEnergyRatingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingEnergyRatingType!= null));
                if (buildingEnergyRatingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BuildingEnergyRatingType sourceBuildingEnergyRatingType;
                    sourceBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
                    BuildingEnergyRatingType copyBuildingEnergyRatingType = ((BuildingEnergyRatingType) strategy.copy(LocatorUtils.property(locator, "buildingEnergyRatingType", sourceBuildingEnergyRatingType), sourceBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null)));
                    copy.setBuildingEnergyRatingType(copyBuildingEnergyRatingType);
                } else {
                    if (buildingEnergyRatingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildingEnergyRatingType = null;
                    }
                }
            }
            {
                Boolean thermalCharacteristicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.thermalCharacteristic!= null));
                if (thermalCharacteristicShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceThermalCharacteristic;
                    sourceThermalCharacteristic = this.getThermalCharacteristic();
                    BigDecimal copyThermalCharacteristic = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "thermalCharacteristic", sourceThermalCharacteristic), sourceThermalCharacteristic, (this.thermalCharacteristic!= null)));
                    copy.setThermalCharacteristic(copyThermalCharacteristic);
                } else {
                    if (thermalCharacteristicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.thermalCharacteristic = null;
                    }
                }
            }
            {
                Boolean energyConsumptionContainsWarmWaterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyConsumptionContainsWarmWater!= null));
                if (energyConsumptionContainsWarmWaterShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceEnergyConsumptionContainsWarmWater;
                    sourceEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
                    YesNotApplicableType copyEnergyConsumptionContainsWarmWater = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "energyConsumptionContainsWarmWater", sourceEnergyConsumptionContainsWarmWater), sourceEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null)));
                    copy.setEnergyConsumptionContainsWarmWater(copyEnergyConsumptionContainsWarmWater);
                } else {
                    if (energyConsumptionContainsWarmWaterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyConsumptionContainsWarmWater = null;
                    }
                }
            }
            {
                Boolean constructionYearShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionYear!= null));
                if (constructionYearShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceConstructionYear;
                    sourceConstructionYear = this.getConstructionYear();
                    Integer copyConstructionYear = ((Integer) strategy.copy(LocatorUtils.property(locator, "constructionYear", sourceConstructionYear), sourceConstructionYear, (this.constructionYear!= null)));
                    copy.setConstructionYear(copyConstructionYear);
                } else {
                    if (constructionYearShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYear = null;
                    }
                }
            }
            {
                Boolean constructionYearUnknownShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionYearUnknown!= null));
                if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceConstructionYearUnknown;
                    sourceConstructionYearUnknown = this.getConstructionYearUnknown();
                    Boolean copyConstructionYearUnknown = ((Boolean) strategy.copy(LocatorUtils.property(locator, "constructionYearUnknown", sourceConstructionYearUnknown), sourceConstructionYearUnknown, (this.constructionYearUnknown!= null)));
                    copy.setConstructionYearUnknown(copyConstructionYearUnknown);
                } else {
                    if (constructionYearUnknownShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionYearUnknown = null;
                    }
                }
            }
            {
                Boolean cellarShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cellar!= null));
                if (cellarShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceCellar;
                    sourceCellar = this.getCellar();
                    YesNotApplicableType copyCellar = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "cellar", sourceCellar), sourceCellar, (this.cellar!= null)));
                    copy.setCellar(copyCellar);
                } else {
                    if (cellarShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cellar = null;
                    }
                }
            }
            {
                Boolean numberOfRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfRooms!= null));
                if (numberOfRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNumberOfRooms;
                    sourceNumberOfRooms = this.getNumberOfRooms();
                    BigDecimal copyNumberOfRooms = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "numberOfRooms", sourceNumberOfRooms), sourceNumberOfRooms, (this.numberOfRooms!= null)));
                    copy.setNumberOfRooms(copyNumberOfRooms);
                } else {
                    if (numberOfRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfRooms = null;
                    }
                }
            }
            {
                Boolean balconyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balcony!= null));
                if (balconyShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBalcony;
                    sourceBalcony = this.getBalcony();
                    YesNotApplicableType copyBalcony = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "balcony", sourceBalcony), sourceBalcony, (this.balcony!= null)));
                    copy.setBalcony(copyBalcony);
                } else {
                    if (balconyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balcony = null;
                    }
                }
            }
            {
                Boolean builtInKitchenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.builtInKitchen!= null));
                if (builtInKitchenShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceBuiltInKitchen;
                    sourceBuiltInKitchen = this.getBuiltInKitchen();
                    YesNotApplicableType copyBuiltInKitchen = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "builtInKitchen", sourceBuiltInKitchen), sourceBuiltInKitchen, (this.builtInKitchen!= null)));
                    copy.setBuiltInKitchen(copyBuiltInKitchen);
                } else {
                    if (builtInKitchenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.builtInKitchen = null;
                    }
                }
            }
            {
                Boolean guestToiletShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.guestToilet!= null));
                if (guestToiletShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNotApplicableType sourceGuestToilet;
                    sourceGuestToilet = this.getGuestToilet();
                    YesNotApplicableType copyGuestToilet = ((YesNotApplicableType) strategy.copy(LocatorUtils.property(locator, "guestToilet", sourceGuestToilet), sourceGuestToilet, (this.guestToilet!= null)));
                    copy.setGuestToilet(copyGuestToilet);
                } else {
                    if (guestToiletShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.guestToilet = null;
                    }
                }
            }
            {
                Boolean lastRefurbishmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastRefurbishment!= null));
                if (lastRefurbishmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceLastRefurbishment;
                    sourceLastRefurbishment = this.getLastRefurbishment();
                    Long copyLastRefurbishment = ((Long) strategy.copy(LocatorUtils.property(locator, "lastRefurbishment", sourceLastRefurbishment), sourceLastRefurbishment, (this.lastRefurbishment!= null)));
                    copy.setLastRefurbishment(copyLastRefurbishment);
                } else {
                    if (lastRefurbishmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastRefurbishment = null;
                    }
                }
            }
            {
                Boolean numberOfBathRoomsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfBathRooms!= null));
                if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfBathRooms;
                    sourceNumberOfBathRooms = this.getNumberOfBathRooms();
                    Long copyNumberOfBathRooms = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfBathRooms", sourceNumberOfBathRooms), sourceNumberOfBathRooms, (this.numberOfBathRooms!= null)));
                    copy.setNumberOfBathRooms(copyNumberOfBathRooms);
                } else {
                    if (numberOfBathRoomsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfBathRooms = null;
                    }
                }
            }
            {
                Boolean numberOfFloorsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfFloors!= null));
                if (numberOfFloorsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfFloors;
                    sourceNumberOfFloors = this.getNumberOfFloors();
                    Long copyNumberOfFloors = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfFloors", sourceNumberOfFloors), sourceNumberOfFloors, (this.numberOfFloors!= null)));
                    copy.setNumberOfFloors(copyNumberOfFloors);
                } else {
                    if (numberOfFloorsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfFloors = null;
                    }
                }
            }
            {
                Boolean numberOfParkingSpacesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfParkingSpaces!= null));
                if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfParkingSpaces;
                    sourceNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
                    Long copyNumberOfParkingSpaces = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfParkingSpaces", sourceNumberOfParkingSpaces), sourceNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null)));
                    copy.setNumberOfParkingSpaces(copyNumberOfParkingSpaces);
                } else {
                    if (numberOfParkingSpacesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfParkingSpaces = null;
                    }
                }
            }
            {
                Boolean parkingSpacePriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingSpacePrice!= null));
                if (parkingSpacePriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceParkingSpacePrice;
                    sourceParkingSpacePrice = this.getParkingSpacePrice();
                    BigDecimal copyParkingSpacePrice = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "parkingSpacePrice", sourceParkingSpacePrice), sourceParkingSpacePrice, (this.parkingSpacePrice!= null)));
                    copy.setParkingSpacePrice(copyParkingSpacePrice);
                } else {
                    if (parkingSpacePriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingSpacePrice = null;
                    }
                }
            }
            {
                Boolean parkingSpaceTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parkingSpaceType!= null));
                if (parkingSpaceTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    ParkingSpaceType sourceParkingSpaceType;
                    sourceParkingSpaceType = this.getParkingSpaceType();
                    ParkingSpaceType copyParkingSpaceType = ((ParkingSpaceType) strategy.copy(LocatorUtils.property(locator, "parkingSpaceType", sourceParkingSpaceType), sourceParkingSpaceType, (this.parkingSpaceType!= null)));
                    copy.setParkingSpaceType(copyParkingSpaceType);
                } else {
                    if (parkingSpaceTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parkingSpaceType = null;
                    }
                }
            }
            {
                Boolean floorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floor!= null));
                if (floorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceFloor;
                    sourceFloor = this.getFloor();
                    Integer copyFloor = ((Integer) strategy.copy(LocatorUtils.property(locator, "floor", sourceFloor), sourceFloor, (this.floor!= null)));
                    copy.setFloor(copyFloor);
                } else {
                    if (floorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floor = null;
                    }
                }
            }
            {
                Boolean customLowestBidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.customLowestBid!= null));
                if (customLowestBidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceCustomLowestBid;
                    sourceCustomLowestBid = this.getCustomLowestBid();
                    Price copyCustomLowestBid = ((Price) strategy.copy(LocatorUtils.property(locator, "customLowestBid", sourceCustomLowestBid), sourceCustomLowestBid, (this.customLowestBid!= null)));
                    copy.setCustomLowestBid(copyCustomLowestBid);
                } else {
                    if (customLowestBidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.customLowestBid = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new CompulsoryAuction();
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
        final CompulsoryAuction that = ((CompulsoryAuction) object);
        {
            Price lhsMarketValue;
            lhsMarketValue = this.getMarketValue();
            Price rhsMarketValue;
            rhsMarketValue = that.getMarketValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "marketValue", lhsMarketValue), LocatorUtils.property(thatLocator, "marketValue", rhsMarketValue), lhsMarketValue, rhsMarketValue, (this.marketValue!= null), (that.marketValue!= null))) {
                return false;
            }
        }
        {
            Price lhsLowestBid;
            lhsLowestBid = this.getLowestBid();
            Price rhsLowestBid;
            rhsLowestBid = that.getLowestBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lowestBid", lhsLowestBid), LocatorUtils.property(thatLocator, "lowestBid", rhsLowestBid), lhsLowestBid, rhsLowestBid, (this.lowestBid!= null), (that.lowestBid!= null))) {
                return false;
            }
        }
        {
            Boolean lhsRecurrenceAppointment;
            lhsRecurrenceAppointment = this.getRecurrenceAppointment();
            Boolean rhsRecurrenceAppointment;
            rhsRecurrenceAppointment = that.getRecurrenceAppointment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recurrenceAppointment", lhsRecurrenceAppointment), LocatorUtils.property(thatLocator, "recurrenceAppointment", rhsRecurrenceAppointment), lhsRecurrenceAppointment, rhsRecurrenceAppointment, (this.recurrenceAppointment!= null), (that.recurrenceAppointment!= null))) {
                return false;
            }
        }
        {
            Calendar lhsDateOfAuction;
            lhsDateOfAuction = this.getDateOfAuction();
            Calendar rhsDateOfAuction;
            rhsDateOfAuction = that.getDateOfAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateOfAuction", lhsDateOfAuction), LocatorUtils.property(thatLocator, "dateOfAuction", rhsDateOfAuction), lhsDateOfAuction, rhsDateOfAuction, (this.dateOfAuction!= null), (that.dateOfAuction!= null))) {
                return false;
            }
        }
        {
            Calendar lhsLastChangeDate;
            lhsLastChangeDate = this.getLastChangeDate();
            Calendar rhsLastChangeDate;
            rhsLastChangeDate = that.getLastChangeDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangeDate", lhsLastChangeDate), LocatorUtils.property(thatLocator, "lastChangeDate", rhsLastChangeDate), lhsLastChangeDate, rhsLastChangeDate, (this.lastChangeDate!= null), (that.lastChangeDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsCancellationDate;
            lhsCancellationDate = this.getCancellationDate();
            Calendar rhsCancellationDate;
            rhsCancellationDate = that.getCancellationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cancellationDate", lhsCancellationDate), LocatorUtils.property(thatLocator, "cancellationDate", rhsCancellationDate), lhsCancellationDate, rhsCancellationDate, (this.cancellationDate!= null), (that.cancellationDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsRecordationDate;
            lhsRecordationDate = this.getRecordationDate();
            Calendar rhsRecordationDate;
            rhsRecordationDate = that.getRecordationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recordationDate", lhsRecordationDate), LocatorUtils.property(thatLocator, "recordationDate", rhsRecordationDate), lhsRecordationDate, rhsRecordationDate, (this.recordationDate!= null), (that.recordationDate!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsArea;
            lhsArea = this.getArea();
            BigDecimal rhsArea;
            rhsArea = that.getArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "area", lhsArea), LocatorUtils.property(thatLocator, "area", rhsArea), lhsArea, rhsArea, (this.area!= null), (that.area!= null))) {
                return false;
            }
        }
        {
            CompulsoryAuctionType lhsAuctionObjectType;
            lhsAuctionObjectType = this.getAuctionObjectType();
            CompulsoryAuctionType rhsAuctionObjectType;
            rhsAuctionObjectType = that.getAuctionObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auctionObjectType", lhsAuctionObjectType), LocatorUtils.property(thatLocator, "auctionObjectType", rhsAuctionObjectType), lhsAuctionObjectType, rhsAuctionObjectType, (this.auctionObjectType!= null), (that.auctionObjectType!= null))) {
                return false;
            }
        }
        {
            CountyCourt lhsCountyCourt;
            lhsCountyCourt = this.getCountyCourt();
            CountyCourt rhsCountyCourt;
            rhsCountyCourt = that.getCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countyCourt", lhsCountyCourt), LocatorUtils.property(thatLocator, "countyCourt", rhsCountyCourt), lhsCountyCourt, rhsCountyCourt, (this.countyCourt!= null), (that.countyCourt!= null))) {
                return false;
            }
        }
        {
            String lhsFileReferenceAtCountyCourt;
            lhsFileReferenceAtCountyCourt = this.getFileReferenceAtCountyCourt();
            String rhsFileReferenceAtCountyCourt;
            rhsFileReferenceAtCountyCourt = that.getFileReferenceAtCountyCourt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileReferenceAtCountyCourt", lhsFileReferenceAtCountyCourt), LocatorUtils.property(thatLocator, "fileReferenceAtCountyCourt", rhsFileReferenceAtCountyCourt), lhsFileReferenceAtCountyCourt, rhsFileReferenceAtCountyCourt, (this.fileReferenceAtCountyCourt!= null), (that.fileReferenceAtCountyCourt!= null))) {
                return false;
            }
        }
        {
            String lhsNumberOfFolio;
            lhsNumberOfFolio = this.getNumberOfFolio();
            String rhsNumberOfFolio;
            rhsNumberOfFolio = that.getNumberOfFolio();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFolio", lhsNumberOfFolio), LocatorUtils.property(thatLocator, "numberOfFolio", rhsNumberOfFolio), lhsNumberOfFolio, rhsNumberOfFolio, (this.numberOfFolio!= null), (that.numberOfFolio!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSplittingAuction;
            lhsSplittingAuction = this.getSplittingAuction();
            Boolean rhsSplittingAuction;
            rhsSplittingAuction = that.getSplittingAuction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "splittingAuction", lhsSplittingAuction), LocatorUtils.property(thatLocator, "splittingAuction", rhsSplittingAuction), lhsSplittingAuction, rhsSplittingAuction, (this.splittingAuction!= null), (that.splittingAuction!= null))) {
                return false;
            }
        }
        {
            String lhsOwner;
            lhsOwner = this.getOwner();
            String rhsOwner;
            rhsOwner = that.getOwner();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "owner", lhsOwner), LocatorUtils.property(thatLocator, "owner", rhsOwner), lhsOwner, rhsOwner, (this.owner!= null), (that.owner!= null))) {
                return false;
            }
        }
        {
            EnergyPerformanceCertificate lhsEnergyCertificate;
            lhsEnergyCertificate = this.getEnergyCertificate();
            EnergyPerformanceCertificate rhsEnergyCertificate;
            rhsEnergyCertificate = that.getEnergyCertificate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyCertificate", lhsEnergyCertificate), LocatorUtils.property(thatLocator, "energyCertificate", rhsEnergyCertificate), lhsEnergyCertificate, rhsEnergyCertificate, (this.energyCertificate!= null), (that.energyCertificate!= null))) {
                return false;
            }
        }
        {
            HeatingTypeEnev2014 lhsHeatingTypeEnev2014;
            lhsHeatingTypeEnev2014 = this.getHeatingTypeEnev2014();
            HeatingTypeEnev2014 rhsHeatingTypeEnev2014;
            rhsHeatingTypeEnev2014 = that.getHeatingTypeEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heatingTypeEnev2014", lhsHeatingTypeEnev2014), LocatorUtils.property(thatLocator, "heatingTypeEnev2014", rhsHeatingTypeEnev2014), lhsHeatingTypeEnev2014, rhsHeatingTypeEnev2014, (this.heatingTypeEnev2014 != null), (that.heatingTypeEnev2014 != null))) {
                return false;
            }
        }
        {
            EnergySourcesEnev2014 lhsEnergySourcesEnev2014;
            lhsEnergySourcesEnev2014 = this.getEnergySourcesEnev2014();
            EnergySourcesEnev2014 rhsEnergySourcesEnev2014;
            rhsEnergySourcesEnev2014 = that.getEnergySourcesEnev2014();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourcesEnev2014", lhsEnergySourcesEnev2014), LocatorUtils.property(thatLocator, "energySourcesEnev2014", rhsEnergySourcesEnev2014), lhsEnergySourcesEnev2014, rhsEnergySourcesEnev2014, (this.energySourcesEnev2014 != null), (that.energySourcesEnev2014 != null))) {
                return false;
            }
        }
        {
            BuildingEnergyRatingType lhsBuildingEnergyRatingType;
            lhsBuildingEnergyRatingType = this.getBuildingEnergyRatingType();
            BuildingEnergyRatingType rhsBuildingEnergyRatingType;
            rhsBuildingEnergyRatingType = that.getBuildingEnergyRatingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingEnergyRatingType", lhsBuildingEnergyRatingType), LocatorUtils.property(thatLocator, "buildingEnergyRatingType", rhsBuildingEnergyRatingType), lhsBuildingEnergyRatingType, rhsBuildingEnergyRatingType, (this.buildingEnergyRatingType!= null), (that.buildingEnergyRatingType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsThermalCharacteristic;
            lhsThermalCharacteristic = this.getThermalCharacteristic();
            BigDecimal rhsThermalCharacteristic;
            rhsThermalCharacteristic = that.getThermalCharacteristic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "thermalCharacteristic", lhsThermalCharacteristic), LocatorUtils.property(thatLocator, "thermalCharacteristic", rhsThermalCharacteristic), lhsThermalCharacteristic, rhsThermalCharacteristic, (this.thermalCharacteristic!= null), (that.thermalCharacteristic!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsEnergyConsumptionContainsWarmWater;
            lhsEnergyConsumptionContainsWarmWater = this.getEnergyConsumptionContainsWarmWater();
            YesNotApplicableType rhsEnergyConsumptionContainsWarmWater;
            rhsEnergyConsumptionContainsWarmWater = that.getEnergyConsumptionContainsWarmWater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyConsumptionContainsWarmWater", lhsEnergyConsumptionContainsWarmWater), LocatorUtils.property(thatLocator, "energyConsumptionContainsWarmWater", rhsEnergyConsumptionContainsWarmWater), lhsEnergyConsumptionContainsWarmWater, rhsEnergyConsumptionContainsWarmWater, (this.energyConsumptionContainsWarmWater!= null), (that.energyConsumptionContainsWarmWater!= null))) {
                return false;
            }
        }
        {
            Integer lhsConstructionYear;
            lhsConstructionYear = this.getConstructionYear();
            Integer rhsConstructionYear;
            rhsConstructionYear = that.getConstructionYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYear", lhsConstructionYear), LocatorUtils.property(thatLocator, "constructionYear", rhsConstructionYear), lhsConstructionYear, rhsConstructionYear, (this.constructionYear!= null), (that.constructionYear!= null))) {
                return false;
            }
        }
        {
            Boolean lhsConstructionYearUnknown;
            lhsConstructionYearUnknown = this.getConstructionYearUnknown();
            Boolean rhsConstructionYearUnknown;
            rhsConstructionYearUnknown = that.getConstructionYearUnknown();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionYearUnknown", lhsConstructionYearUnknown), LocatorUtils.property(thatLocator, "constructionYearUnknown", rhsConstructionYearUnknown), lhsConstructionYearUnknown, rhsConstructionYearUnknown, (this.constructionYearUnknown!= null), (that.constructionYearUnknown!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsCellar;
            lhsCellar = this.getCellar();
            YesNotApplicableType rhsCellar;
            rhsCellar = that.getCellar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellar", lhsCellar), LocatorUtils.property(thatLocator, "cellar", rhsCellar), lhsCellar, rhsCellar, (this.cellar!= null), (that.cellar!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNumberOfRooms;
            lhsNumberOfRooms = this.getNumberOfRooms();
            BigDecimal rhsNumberOfRooms;
            rhsNumberOfRooms = that.getNumberOfRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfRooms", lhsNumberOfRooms), LocatorUtils.property(thatLocator, "numberOfRooms", rhsNumberOfRooms), lhsNumberOfRooms, rhsNumberOfRooms, (this.numberOfRooms!= null), (that.numberOfRooms!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBalcony;
            lhsBalcony = this.getBalcony();
            YesNotApplicableType rhsBalcony;
            rhsBalcony = that.getBalcony();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balcony", lhsBalcony), LocatorUtils.property(thatLocator, "balcony", rhsBalcony), lhsBalcony, rhsBalcony, (this.balcony!= null), (that.balcony!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsBuiltInKitchen;
            lhsBuiltInKitchen = this.getBuiltInKitchen();
            YesNotApplicableType rhsBuiltInKitchen;
            rhsBuiltInKitchen = that.getBuiltInKitchen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "builtInKitchen", lhsBuiltInKitchen), LocatorUtils.property(thatLocator, "builtInKitchen", rhsBuiltInKitchen), lhsBuiltInKitchen, rhsBuiltInKitchen, (this.builtInKitchen!= null), (that.builtInKitchen!= null))) {
                return false;
            }
        }
        {
            YesNotApplicableType lhsGuestToilet;
            lhsGuestToilet = this.getGuestToilet();
            YesNotApplicableType rhsGuestToilet;
            rhsGuestToilet = that.getGuestToilet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "guestToilet", lhsGuestToilet), LocatorUtils.property(thatLocator, "guestToilet", rhsGuestToilet), lhsGuestToilet, rhsGuestToilet, (this.guestToilet!= null), (that.guestToilet!= null))) {
                return false;
            }
        }
        {
            Long lhsLastRefurbishment;
            lhsLastRefurbishment = this.getLastRefurbishment();
            Long rhsLastRefurbishment;
            rhsLastRefurbishment = that.getLastRefurbishment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastRefurbishment", lhsLastRefurbishment), LocatorUtils.property(thatLocator, "lastRefurbishment", rhsLastRefurbishment), lhsLastRefurbishment, rhsLastRefurbishment, (this.lastRefurbishment!= null), (that.lastRefurbishment!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfBathRooms;
            lhsNumberOfBathRooms = this.getNumberOfBathRooms();
            Long rhsNumberOfBathRooms;
            rhsNumberOfBathRooms = that.getNumberOfBathRooms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfBathRooms", lhsNumberOfBathRooms), LocatorUtils.property(thatLocator, "numberOfBathRooms", rhsNumberOfBathRooms), lhsNumberOfBathRooms, rhsNumberOfBathRooms, (this.numberOfBathRooms!= null), (that.numberOfBathRooms!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfFloors;
            lhsNumberOfFloors = this.getNumberOfFloors();
            Long rhsNumberOfFloors;
            rhsNumberOfFloors = that.getNumberOfFloors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfFloors", lhsNumberOfFloors), LocatorUtils.property(thatLocator, "numberOfFloors", rhsNumberOfFloors), lhsNumberOfFloors, rhsNumberOfFloors, (this.numberOfFloors!= null), (that.numberOfFloors!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfParkingSpaces;
            lhsNumberOfParkingSpaces = this.getNumberOfParkingSpaces();
            Long rhsNumberOfParkingSpaces;
            rhsNumberOfParkingSpaces = that.getNumberOfParkingSpaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfParkingSpaces", lhsNumberOfParkingSpaces), LocatorUtils.property(thatLocator, "numberOfParkingSpaces", rhsNumberOfParkingSpaces), lhsNumberOfParkingSpaces, rhsNumberOfParkingSpaces, (this.numberOfParkingSpaces!= null), (that.numberOfParkingSpaces!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsParkingSpacePrice;
            lhsParkingSpacePrice = this.getParkingSpacePrice();
            BigDecimal rhsParkingSpacePrice;
            rhsParkingSpacePrice = that.getParkingSpacePrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpacePrice", lhsParkingSpacePrice), LocatorUtils.property(thatLocator, "parkingSpacePrice", rhsParkingSpacePrice), lhsParkingSpacePrice, rhsParkingSpacePrice, (this.parkingSpacePrice!= null), (that.parkingSpacePrice!= null))) {
                return false;
            }
        }
        {
            ParkingSpaceType lhsParkingSpaceType;
            lhsParkingSpaceType = this.getParkingSpaceType();
            ParkingSpaceType rhsParkingSpaceType;
            rhsParkingSpaceType = that.getParkingSpaceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parkingSpaceType", lhsParkingSpaceType), LocatorUtils.property(thatLocator, "parkingSpaceType", rhsParkingSpaceType), lhsParkingSpaceType, rhsParkingSpaceType, (this.parkingSpaceType!= null), (that.parkingSpaceType!= null))) {
                return false;
            }
        }
        {
            Integer lhsFloor;
            lhsFloor = this.getFloor();
            Integer rhsFloor;
            rhsFloor = that.getFloor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floor", lhsFloor), LocatorUtils.property(thatLocator, "floor", rhsFloor), lhsFloor, rhsFloor, (this.floor!= null), (that.floor!= null))) {
                return false;
            }
        }
        {
            Price lhsCustomLowestBid;
            lhsCustomLowestBid = this.getCustomLowestBid();
            Price rhsCustomLowestBid;
            rhsCustomLowestBid = that.getCustomLowestBid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customLowestBid", lhsCustomLowestBid), LocatorUtils.property(thatLocator, "customLowestBid", rhsCustomLowestBid), lhsCustomLowestBid, rhsCustomLowestBid, (this.customLowestBid!= null), (that.customLowestBid!= null))) {
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
