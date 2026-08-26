package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.HouseTypeBuildingType;
import org.openestate.is24.restapi.xml.common.HouseTypeConstructionMethodType;
import org.openestate.is24.restapi.xml.common.HouseTypeEnergyStandardType;
import org.openestate.is24.restapi.xml.common.HouseTypeStageOfCompletionType;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Eigenschaften für den Immobilientyp "Typenhäuser"
 * 
 * <p>Java class for HouseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HouseType">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       <sequence>
 *         <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedHouseTypeGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseType", propOrder = {
    "price",
    "livingSpace",
    "totalArea",
    "baseArea",
    "numberOfRooms",
    "courtage",
    "constructionMethod",
    "buildingType",
    "stageOfCompletionType",
    "energyStandardType",
    "uValue",
    "typeInformationNote",
    "modelInformationNote",
    "contructionPriceInformationNote",
    "floorInformationNote",
    "roofInformationNote"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class HouseType
    extends RealEstate
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Preis, die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price price;
    /**
     * Wohnfläche
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal livingSpace;
    /**
     * Gesamtfläche
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal totalArea;
    /**
     * Grundfläche
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal baseArea;
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
     * Provisionselemente
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CourtageInfo courtage;
    /**
     * Bauweise
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected HouseTypeConstructionMethodType constructionMethod;
    /**
     * Objektart
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected HouseTypeBuildingType buildingType;
    /**
     * Ausbaustufe
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected HouseTypeStageOfCompletionType stageOfCompletionType;
    /**
     * Energiestandard
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected HouseTypeEnergyStandardType energyStandardType;
    /**
     * U-Wert (Wärmedämmwert)
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal uValue;
    /**
     * Typ Informationen
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String typeInformationNote;
    /**
     * Modell Informationen
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String modelInformationNote;
    /**
     * Bauleistungs Informationen
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String contructionPriceInformationNote;
    /**
     * Geschoss Informationen
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String floorInformationNote;
    /**
     * Dachform Informationen
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String roofInformationNote;

    /**
     * Preis, die Attribute geben die Art, die Währung und den Intervall
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
     * Wohnfläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLivingSpace() {
        return livingSpace;
    }

    /**
     * Sets the value of the livingSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLivingSpace()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLivingSpace(BigDecimal value) {
        this.livingSpace = value;
    }

    /**
     * Gesamtfläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalArea()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTotalArea(BigDecimal value) {
        this.totalArea = value;
    }

    /**
     * Grundfläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getBaseArea() {
        return baseArea;
    }

    /**
     * Sets the value of the baseArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBaseArea()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBaseArea(BigDecimal value) {
        this.baseArea = value;
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
     * Provisionselemente
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     * @see #getCourtage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Bauweise
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public HouseTypeConstructionMethodType getConstructionMethod() {
        return constructionMethod;
    }

    /**
     * Sets the value of the constructionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeConstructionMethodType }
     *     
     * @see #getConstructionMethod()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setConstructionMethod(HouseTypeConstructionMethodType value) {
        this.constructionMethod = value;
    }

    /**
     * Objektart
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeBuildingType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public HouseTypeBuildingType getBuildingType() {
        return buildingType;
    }

    /**
     * Sets the value of the buildingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeBuildingType }
     *     
     * @see #getBuildingType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBuildingType(HouseTypeBuildingType value) {
        this.buildingType = value;
    }

    /**
     * Ausbaustufe
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public HouseTypeStageOfCompletionType getStageOfCompletionType() {
        return stageOfCompletionType;
    }

    /**
     * Sets the value of the stageOfCompletionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeStageOfCompletionType }
     *     
     * @see #getStageOfCompletionType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setStageOfCompletionType(HouseTypeStageOfCompletionType value) {
        this.stageOfCompletionType = value;
    }

    /**
     * Energiestandard
     * 
     * @return
     *     possible object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public HouseTypeEnergyStandardType getEnergyStandardType() {
        return energyStandardType;
    }

    /**
     * Sets the value of the energyStandardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseTypeEnergyStandardType }
     *     
     * @see #getEnergyStandardType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setEnergyStandardType(HouseTypeEnergyStandardType value) {
        this.energyStandardType = value;
    }

    /**
     * U-Wert (Wärmedämmwert)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getUValue() {
        return uValue;
    }

    /**
     * Sets the value of the uValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUValue()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setUValue(BigDecimal value) {
        this.uValue = value;
    }

    /**
     * Typ Informationen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getTypeInformationNote() {
        return typeInformationNote;
    }

    /**
     * Sets the value of the typeInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTypeInformationNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTypeInformationNote(String value) {
        this.typeInformationNote = value;
    }

    /**
     * Modell Informationen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getModelInformationNote() {
        return modelInformationNote;
    }

    /**
     * Sets the value of the modelInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModelInformationNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setModelInformationNote(String value) {
        this.modelInformationNote = value;
    }

    /**
     * Bauleistungs Informationen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getContructionPriceInformationNote() {
        return contructionPriceInformationNote;
    }

    /**
     * Sets the value of the contructionPriceInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContructionPriceInformationNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContructionPriceInformationNote(String value) {
        this.contructionPriceInformationNote = value;
    }

    /**
     * Geschoss Informationen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getFloorInformationNote() {
        return floorInformationNote;
    }

    /**
     * Sets the value of the floorInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFloorInformationNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFloorInformationNote(String value) {
        this.floorInformationNote = value;
    }

    /**
     * Dachform Informationen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getRoofInformationNote() {
        return roofInformationNote;
    }

    /**
     * Sets the value of the roofInformationNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoofInformationNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRoofInformationNote(String value) {
        this.roofInformationNote = value;
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
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            BigDecimal theLivingSpace;
            theLivingSpace = this.getLivingSpace();
            strategy.appendField(locator, this, "livingSpace", buffer, theLivingSpace, (this.livingSpace!= null));
        }
        {
            BigDecimal theTotalArea;
            theTotalArea = this.getTotalArea();
            strategy.appendField(locator, this, "totalArea", buffer, theTotalArea, (this.totalArea!= null));
        }
        {
            BigDecimal theBaseArea;
            theBaseArea = this.getBaseArea();
            strategy.appendField(locator, this, "baseArea", buffer, theBaseArea, (this.baseArea!= null));
        }
        {
            BigDecimal theNumberOfRooms;
            theNumberOfRooms = this.getNumberOfRooms();
            strategy.appendField(locator, this, "numberOfRooms", buffer, theNumberOfRooms, (this.numberOfRooms!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            HouseTypeConstructionMethodType theConstructionMethod;
            theConstructionMethod = this.getConstructionMethod();
            strategy.appendField(locator, this, "constructionMethod", buffer, theConstructionMethod, (this.constructionMethod!= null));
        }
        {
            HouseTypeBuildingType theBuildingType;
            theBuildingType = this.getBuildingType();
            strategy.appendField(locator, this, "buildingType", buffer, theBuildingType, (this.buildingType!= null));
        }
        {
            HouseTypeStageOfCompletionType theStageOfCompletionType;
            theStageOfCompletionType = this.getStageOfCompletionType();
            strategy.appendField(locator, this, "stageOfCompletionType", buffer, theStageOfCompletionType, (this.stageOfCompletionType!= null));
        }
        {
            HouseTypeEnergyStandardType theEnergyStandardType;
            theEnergyStandardType = this.getEnergyStandardType();
            strategy.appendField(locator, this, "energyStandardType", buffer, theEnergyStandardType, (this.energyStandardType!= null));
        }
        {
            BigDecimal theUValue;
            theUValue = this.getUValue();
            strategy.appendField(locator, this, "uValue", buffer, theUValue, (this.uValue!= null));
        }
        {
            String theTypeInformationNote;
            theTypeInformationNote = this.getTypeInformationNote();
            strategy.appendField(locator, this, "typeInformationNote", buffer, theTypeInformationNote, (this.typeInformationNote!= null));
        }
        {
            String theModelInformationNote;
            theModelInformationNote = this.getModelInformationNote();
            strategy.appendField(locator, this, "modelInformationNote", buffer, theModelInformationNote, (this.modelInformationNote!= null));
        }
        {
            String theContructionPriceInformationNote;
            theContructionPriceInformationNote = this.getContructionPriceInformationNote();
            strategy.appendField(locator, this, "contructionPriceInformationNote", buffer, theContructionPriceInformationNote, (this.contructionPriceInformationNote!= null));
        }
        {
            String theFloorInformationNote;
            theFloorInformationNote = this.getFloorInformationNote();
            strategy.appendField(locator, this, "floorInformationNote", buffer, theFloorInformationNote, (this.floorInformationNote!= null));
        }
        {
            String theRoofInformationNote;
            theRoofInformationNote = this.getRoofInformationNote();
            strategy.appendField(locator, this, "roofInformationNote", buffer, theRoofInformationNote, (this.roofInformationNote!= null));
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
        if (draftCopy instanceof HouseType) {
            final HouseType copy = ((HouseType) draftCopy);
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
                Boolean livingSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.livingSpace!= null));
                if (livingSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLivingSpace;
                    sourceLivingSpace = this.getLivingSpace();
                    BigDecimal copyLivingSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "livingSpace", sourceLivingSpace), sourceLivingSpace, (this.livingSpace!= null)));
                    copy.setLivingSpace(copyLivingSpace);
                } else {
                    if (livingSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.livingSpace = null;
                    }
                }
            }
            {
                Boolean totalAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalArea!= null));
                if (totalAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTotalArea;
                    sourceTotalArea = this.getTotalArea();
                    BigDecimal copyTotalArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalArea", sourceTotalArea), sourceTotalArea, (this.totalArea!= null)));
                    copy.setTotalArea(copyTotalArea);
                } else {
                    if (totalAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalArea = null;
                    }
                }
            }
            {
                Boolean baseAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.baseArea!= null));
                if (baseAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceBaseArea;
                    sourceBaseArea = this.getBaseArea();
                    BigDecimal copyBaseArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "baseArea", sourceBaseArea), sourceBaseArea, (this.baseArea!= null)));
                    copy.setBaseArea(copyBaseArea);
                } else {
                    if (baseAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.baseArea = null;
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
                Boolean courtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtage!= null));
                if (courtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CourtageInfo sourceCourtage;
                    sourceCourtage = this.getCourtage();
                    CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage, (this.courtage!= null)));
                    copy.setCourtage(copyCourtage);
                } else {
                    if (courtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtage = null;
                    }
                }
            }
            {
                Boolean constructionMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.constructionMethod!= null));
                if (constructionMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    HouseTypeConstructionMethodType sourceConstructionMethod;
                    sourceConstructionMethod = this.getConstructionMethod();
                    HouseTypeConstructionMethodType copyConstructionMethod = ((HouseTypeConstructionMethodType) strategy.copy(LocatorUtils.property(locator, "constructionMethod", sourceConstructionMethod), sourceConstructionMethod, (this.constructionMethod!= null)));
                    copy.setConstructionMethod(copyConstructionMethod);
                } else {
                    if (constructionMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constructionMethod = null;
                    }
                }
            }
            {
                Boolean buildingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingType!= null));
                if (buildingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    HouseTypeBuildingType sourceBuildingType;
                    sourceBuildingType = this.getBuildingType();
                    HouseTypeBuildingType copyBuildingType = ((HouseTypeBuildingType) strategy.copy(LocatorUtils.property(locator, "buildingType", sourceBuildingType), sourceBuildingType, (this.buildingType!= null)));
                    copy.setBuildingType(copyBuildingType);
                } else {
                    if (buildingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildingType = null;
                    }
                }
            }
            {
                Boolean stageOfCompletionTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.stageOfCompletionType!= null));
                if (stageOfCompletionTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    HouseTypeStageOfCompletionType sourceStageOfCompletionType;
                    sourceStageOfCompletionType = this.getStageOfCompletionType();
                    HouseTypeStageOfCompletionType copyStageOfCompletionType = ((HouseTypeStageOfCompletionType) strategy.copy(LocatorUtils.property(locator, "stageOfCompletionType", sourceStageOfCompletionType), sourceStageOfCompletionType, (this.stageOfCompletionType!= null)));
                    copy.setStageOfCompletionType(copyStageOfCompletionType);
                } else {
                    if (stageOfCompletionTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.stageOfCompletionType = null;
                    }
                }
            }
            {
                Boolean energyStandardTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.energyStandardType!= null));
                if (energyStandardTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    HouseTypeEnergyStandardType sourceEnergyStandardType;
                    sourceEnergyStandardType = this.getEnergyStandardType();
                    HouseTypeEnergyStandardType copyEnergyStandardType = ((HouseTypeEnergyStandardType) strategy.copy(LocatorUtils.property(locator, "energyStandardType", sourceEnergyStandardType), sourceEnergyStandardType, (this.energyStandardType!= null)));
                    copy.setEnergyStandardType(copyEnergyStandardType);
                } else {
                    if (energyStandardTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energyStandardType = null;
                    }
                }
            }
            {
                Boolean uValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uValue!= null));
                if (uValueShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUValue;
                    sourceUValue = this.getUValue();
                    BigDecimal copyUValue = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "uValue", sourceUValue), sourceUValue, (this.uValue!= null)));
                    copy.setUValue(copyUValue);
                } else {
                    if (uValueShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uValue = null;
                    }
                }
            }
            {
                Boolean typeInformationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.typeInformationNote!= null));
                if (typeInformationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTypeInformationNote;
                    sourceTypeInformationNote = this.getTypeInformationNote();
                    String copyTypeInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "typeInformationNote", sourceTypeInformationNote), sourceTypeInformationNote, (this.typeInformationNote!= null)));
                    copy.setTypeInformationNote(copyTypeInformationNote);
                } else {
                    if (typeInformationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.typeInformationNote = null;
                    }
                }
            }
            {
                Boolean modelInformationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modelInformationNote!= null));
                if (modelInformationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceModelInformationNote;
                    sourceModelInformationNote = this.getModelInformationNote();
                    String copyModelInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "modelInformationNote", sourceModelInformationNote), sourceModelInformationNote, (this.modelInformationNote!= null)));
                    copy.setModelInformationNote(copyModelInformationNote);
                } else {
                    if (modelInformationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.modelInformationNote = null;
                    }
                }
            }
            {
                Boolean contructionPriceInformationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contructionPriceInformationNote!= null));
                if (contructionPriceInformationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceContructionPriceInformationNote;
                    sourceContructionPriceInformationNote = this.getContructionPriceInformationNote();
                    String copyContructionPriceInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "contructionPriceInformationNote", sourceContructionPriceInformationNote), sourceContructionPriceInformationNote, (this.contructionPriceInformationNote!= null)));
                    copy.setContructionPriceInformationNote(copyContructionPriceInformationNote);
                } else {
                    if (contructionPriceInformationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contructionPriceInformationNote = null;
                    }
                }
            }
            {
                Boolean floorInformationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.floorInformationNote!= null));
                if (floorInformationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFloorInformationNote;
                    sourceFloorInformationNote = this.getFloorInformationNote();
                    String copyFloorInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "floorInformationNote", sourceFloorInformationNote), sourceFloorInformationNote, (this.floorInformationNote!= null)));
                    copy.setFloorInformationNote(copyFloorInformationNote);
                } else {
                    if (floorInformationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.floorInformationNote = null;
                    }
                }
            }
            {
                Boolean roofInformationNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.roofInformationNote!= null));
                if (roofInformationNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRoofInformationNote;
                    sourceRoofInformationNote = this.getRoofInformationNote();
                    String copyRoofInformationNote = ((String) strategy.copy(LocatorUtils.property(locator, "roofInformationNote", sourceRoofInformationNote), sourceRoofInformationNote, (this.roofInformationNote!= null)));
                    copy.setRoofInformationNote(copyRoofInformationNote);
                } else {
                    if (roofInformationNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.roofInformationNote = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new HouseType();
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
        final HouseType that = ((HouseType) object);
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
            BigDecimal lhsLivingSpace;
            lhsLivingSpace = this.getLivingSpace();
            BigDecimal rhsLivingSpace;
            rhsLivingSpace = that.getLivingSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "livingSpace", lhsLivingSpace), LocatorUtils.property(thatLocator, "livingSpace", rhsLivingSpace), lhsLivingSpace, rhsLivingSpace, (this.livingSpace!= null), (that.livingSpace!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalArea;
            lhsTotalArea = this.getTotalArea();
            BigDecimal rhsTotalArea;
            rhsTotalArea = that.getTotalArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalArea", lhsTotalArea), LocatorUtils.property(thatLocator, "totalArea", rhsTotalArea), lhsTotalArea, rhsTotalArea, (this.totalArea!= null), (that.totalArea!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBaseArea;
            lhsBaseArea = this.getBaseArea();
            BigDecimal rhsBaseArea;
            rhsBaseArea = that.getBaseArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseArea", lhsBaseArea), LocatorUtils.property(thatLocator, "baseArea", rhsBaseArea), lhsBaseArea, rhsBaseArea, (this.baseArea!= null), (that.baseArea!= null))) {
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
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        {
            HouseTypeConstructionMethodType lhsConstructionMethod;
            lhsConstructionMethod = this.getConstructionMethod();
            HouseTypeConstructionMethodType rhsConstructionMethod;
            rhsConstructionMethod = that.getConstructionMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constructionMethod", lhsConstructionMethod), LocatorUtils.property(thatLocator, "constructionMethod", rhsConstructionMethod), lhsConstructionMethod, rhsConstructionMethod, (this.constructionMethod!= null), (that.constructionMethod!= null))) {
                return false;
            }
        }
        {
            HouseTypeBuildingType lhsBuildingType;
            lhsBuildingType = this.getBuildingType();
            HouseTypeBuildingType rhsBuildingType;
            rhsBuildingType = that.getBuildingType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingType", lhsBuildingType), LocatorUtils.property(thatLocator, "buildingType", rhsBuildingType), lhsBuildingType, rhsBuildingType, (this.buildingType!= null), (that.buildingType!= null))) {
                return false;
            }
        }
        {
            HouseTypeStageOfCompletionType lhsStageOfCompletionType;
            lhsStageOfCompletionType = this.getStageOfCompletionType();
            HouseTypeStageOfCompletionType rhsStageOfCompletionType;
            rhsStageOfCompletionType = that.getStageOfCompletionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stageOfCompletionType", lhsStageOfCompletionType), LocatorUtils.property(thatLocator, "stageOfCompletionType", rhsStageOfCompletionType), lhsStageOfCompletionType, rhsStageOfCompletionType, (this.stageOfCompletionType!= null), (that.stageOfCompletionType!= null))) {
                return false;
            }
        }
        {
            HouseTypeEnergyStandardType lhsEnergyStandardType;
            lhsEnergyStandardType = this.getEnergyStandardType();
            HouseTypeEnergyStandardType rhsEnergyStandardType;
            rhsEnergyStandardType = that.getEnergyStandardType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energyStandardType", lhsEnergyStandardType), LocatorUtils.property(thatLocator, "energyStandardType", rhsEnergyStandardType), lhsEnergyStandardType, rhsEnergyStandardType, (this.energyStandardType!= null), (that.energyStandardType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsUValue;
            lhsUValue = this.getUValue();
            BigDecimal rhsUValue;
            rhsUValue = that.getUValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uValue", lhsUValue), LocatorUtils.property(thatLocator, "uValue", rhsUValue), lhsUValue, rhsUValue, (this.uValue!= null), (that.uValue!= null))) {
                return false;
            }
        }
        {
            String lhsTypeInformationNote;
            lhsTypeInformationNote = this.getTypeInformationNote();
            String rhsTypeInformationNote;
            rhsTypeInformationNote = that.getTypeInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "typeInformationNote", lhsTypeInformationNote), LocatorUtils.property(thatLocator, "typeInformationNote", rhsTypeInformationNote), lhsTypeInformationNote, rhsTypeInformationNote, (this.typeInformationNote!= null), (that.typeInformationNote!= null))) {
                return false;
            }
        }
        {
            String lhsModelInformationNote;
            lhsModelInformationNote = this.getModelInformationNote();
            String rhsModelInformationNote;
            rhsModelInformationNote = that.getModelInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modelInformationNote", lhsModelInformationNote), LocatorUtils.property(thatLocator, "modelInformationNote", rhsModelInformationNote), lhsModelInformationNote, rhsModelInformationNote, (this.modelInformationNote!= null), (that.modelInformationNote!= null))) {
                return false;
            }
        }
        {
            String lhsContructionPriceInformationNote;
            lhsContructionPriceInformationNote = this.getContructionPriceInformationNote();
            String rhsContructionPriceInformationNote;
            rhsContructionPriceInformationNote = that.getContructionPriceInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contructionPriceInformationNote", lhsContructionPriceInformationNote), LocatorUtils.property(thatLocator, "contructionPriceInformationNote", rhsContructionPriceInformationNote), lhsContructionPriceInformationNote, rhsContructionPriceInformationNote, (this.contructionPriceInformationNote!= null), (that.contructionPriceInformationNote!= null))) {
                return false;
            }
        }
        {
            String lhsFloorInformationNote;
            lhsFloorInformationNote = this.getFloorInformationNote();
            String rhsFloorInformationNote;
            rhsFloorInformationNote = that.getFloorInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "floorInformationNote", lhsFloorInformationNote), LocatorUtils.property(thatLocator, "floorInformationNote", rhsFloorInformationNote), lhsFloorInformationNote, rhsFloorInformationNote, (this.floorInformationNote!= null), (that.floorInformationNote!= null))) {
                return false;
            }
        }
        {
            String lhsRoofInformationNote;
            lhsRoofInformationNote = this.getRoofInformationNote();
            String rhsRoofInformationNote;
            rhsRoofInformationNote = that.getRoofInformationNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "roofInformationNote", lhsRoofInformationNote), LocatorUtils.property(thatLocator, "roofInformationNote", rhsRoofInformationNote), lhsRoofInformationNote, rhsRoofInformationNote, (this.roofInformationNote!= null), (that.roofInformationNote!= null))) {
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
