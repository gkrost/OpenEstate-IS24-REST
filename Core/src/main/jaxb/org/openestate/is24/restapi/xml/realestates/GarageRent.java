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
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.GarageType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.RealEstateCondition;


/**
 * Eigenschaften für den
 *                 Garagen-Miet Immobilientyp
 * 
 * <p>Java class for GarageRent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GarageRent">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       <sequence>
 *         <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedGarageRentGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GarageRent", propOrder = {
    "price",
    "usableFloorSpace",
    "courtage",
    "freeFrom",
    "freeUntil",
    "garageType",
    "constructionYear",
    "lengthGarage",
    "widthGarage",
    "heightGarage",
    "condition",
    "lastRefurbishment"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GarageRent
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
     * Nutzfläche
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal usableFloorSpace;
    /**
     * Provisionselemente
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CourtageInfo courtage;
    /**
     * Verfügbar ab
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar freeFrom;
    /**
     * Verfügbar bis
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar freeUntil;
    /**
     * Garagentyp
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected GarageType garageType;
    /**
     * Baujahr
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter22 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer constructionYear;
    /**
     * Garagenlänge
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal lengthGarage;
    /**
     * Garagenbreite
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal widthGarage;
    /**
     * Garagenhöhe
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal heightGarage;
    /**
     * Objektzustand
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealEstateCondition condition;
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
     * Nutzfläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getUsableFloorSpace() {
        return usableFloorSpace;
    }

    /**
     * Sets the value of the usableFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getUsableFloorSpace()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setUsableFloorSpace(BigDecimal value) {
        this.usableFloorSpace = value;
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
     * Verfügbar ab
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getFreeFrom()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFreeFrom(Calendar value) {
        this.freeFrom = value;
    }

    /**
     * Verfügbar bis
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getFreeUntil() {
        return freeUntil;
    }

    /**
     * Sets the value of the freeUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getFreeUntil()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFreeUntil(Calendar value) {
        this.freeUntil = value;
    }

    /**
     * Garagentyp
     * 
     * @return
     *     possible object is
     *     {@link GarageType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public GarageType getGarageType() {
        return garageType;
    }

    /**
     * Sets the value of the garageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GarageType }
     *     
     * @see #getGarageType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGarageType(GarageType value) {
        this.garageType = value;
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
     * Garagenlänge
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLengthGarage() {
        return lengthGarage;
    }

    /**
     * Sets the value of the lengthGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLengthGarage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLengthGarage(BigDecimal value) {
        this.lengthGarage = value;
    }

    /**
     * Garagenbreite
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getWidthGarage() {
        return widthGarage;
    }

    /**
     * Sets the value of the widthGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWidthGarage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setWidthGarage(BigDecimal value) {
        this.widthGarage = value;
    }

    /**
     * Garagenhöhe
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getHeightGarage() {
        return heightGarage;
    }

    /**
     * Sets the value of the heightGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHeightGarage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHeightGarage(BigDecimal value) {
        this.heightGarage = value;
    }

    /**
     * Objektzustand
     * 
     * @return
     *     possible object is
     *     {@link RealEstateCondition }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealEstateCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateCondition }
     *     
     * @see #getCondition()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCondition(RealEstateCondition value) {
        this.condition = value;
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
            BigDecimal theUsableFloorSpace;
            theUsableFloorSpace = this.getUsableFloorSpace();
            strategy.appendField(locator, this, "usableFloorSpace", buffer, theUsableFloorSpace, (this.usableFloorSpace!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            Calendar theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom, (this.freeFrom!= null));
        }
        {
            Calendar theFreeUntil;
            theFreeUntil = this.getFreeUntil();
            strategy.appendField(locator, this, "freeUntil", buffer, theFreeUntil, (this.freeUntil!= null));
        }
        {
            GarageType theGarageType;
            theGarageType = this.getGarageType();
            strategy.appendField(locator, this, "garageType", buffer, theGarageType, (this.garageType!= null));
        }
        {
            Integer theConstructionYear;
            theConstructionYear = this.getConstructionYear();
            strategy.appendField(locator, this, "constructionYear", buffer, theConstructionYear, (this.constructionYear!= null));
        }
        {
            BigDecimal theLengthGarage;
            theLengthGarage = this.getLengthGarage();
            strategy.appendField(locator, this, "lengthGarage", buffer, theLengthGarage, (this.lengthGarage!= null));
        }
        {
            BigDecimal theWidthGarage;
            theWidthGarage = this.getWidthGarage();
            strategy.appendField(locator, this, "widthGarage", buffer, theWidthGarage, (this.widthGarage!= null));
        }
        {
            BigDecimal theHeightGarage;
            theHeightGarage = this.getHeightGarage();
            strategy.appendField(locator, this, "heightGarage", buffer, theHeightGarage, (this.heightGarage!= null));
        }
        {
            RealEstateCondition theCondition;
            theCondition = this.getCondition();
            strategy.appendField(locator, this, "condition", buffer, theCondition, (this.condition!= null));
        }
        {
            Long theLastRefurbishment;
            theLastRefurbishment = this.getLastRefurbishment();
            strategy.appendField(locator, this, "lastRefurbishment", buffer, theLastRefurbishment, (this.lastRefurbishment!= null));
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
        if (draftCopy instanceof GarageRent) {
            final GarageRent copy = ((GarageRent) draftCopy);
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
                Boolean usableFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.usableFloorSpace!= null));
                if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceUsableFloorSpace;
                    sourceUsableFloorSpace = this.getUsableFloorSpace();
                    BigDecimal copyUsableFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "usableFloorSpace", sourceUsableFloorSpace), sourceUsableFloorSpace, (this.usableFloorSpace!= null)));
                    copy.setUsableFloorSpace(copyUsableFloorSpace);
                } else {
                    if (usableFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.usableFloorSpace = null;
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
                Boolean freeFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeFrom!= null));
                if (freeFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreeFrom;
                    sourceFreeFrom = this.getFreeFrom();
                    Calendar copyFreeFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom, (this.freeFrom!= null)));
                    copy.setFreeFrom(copyFreeFrom);
                } else {
                    if (freeFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeFrom = null;
                    }
                }
            }
            {
                Boolean freeUntilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeUntil!= null));
                if (freeUntilShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceFreeUntil;
                    sourceFreeUntil = this.getFreeUntil();
                    Calendar copyFreeUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "freeUntil", sourceFreeUntil), sourceFreeUntil, (this.freeUntil!= null)));
                    copy.setFreeUntil(copyFreeUntil);
                } else {
                    if (freeUntilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeUntil = null;
                    }
                }
            }
            {
                Boolean garageTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.garageType!= null));
                if (garageTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    GarageType sourceGarageType;
                    sourceGarageType = this.getGarageType();
                    GarageType copyGarageType = ((GarageType) strategy.copy(LocatorUtils.property(locator, "garageType", sourceGarageType), sourceGarageType, (this.garageType!= null)));
                    copy.setGarageType(copyGarageType);
                } else {
                    if (garageTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.garageType = null;
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
                Boolean lengthGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lengthGarage!= null));
                if (lengthGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLengthGarage;
                    sourceLengthGarage = this.getLengthGarage();
                    BigDecimal copyLengthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "lengthGarage", sourceLengthGarage), sourceLengthGarage, (this.lengthGarage!= null)));
                    copy.setLengthGarage(copyLengthGarage);
                } else {
                    if (lengthGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lengthGarage = null;
                    }
                }
            }
            {
                Boolean widthGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.widthGarage!= null));
                if (widthGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceWidthGarage;
                    sourceWidthGarage = this.getWidthGarage();
                    BigDecimal copyWidthGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "widthGarage", sourceWidthGarage), sourceWidthGarage, (this.widthGarage!= null)));
                    copy.setWidthGarage(copyWidthGarage);
                } else {
                    if (widthGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.widthGarage = null;
                    }
                }
            }
            {
                Boolean heightGarageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.heightGarage!= null));
                if (heightGarageShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceHeightGarage;
                    sourceHeightGarage = this.getHeightGarage();
                    BigDecimal copyHeightGarage = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "heightGarage", sourceHeightGarage), sourceHeightGarage, (this.heightGarage!= null)));
                    copy.setHeightGarage(copyHeightGarage);
                } else {
                    if (heightGarageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.heightGarage = null;
                    }
                }
            }
            {
                Boolean conditionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.condition!= null));
                if (conditionShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateCondition sourceCondition;
                    sourceCondition = this.getCondition();
                    RealEstateCondition copyCondition = ((RealEstateCondition) strategy.copy(LocatorUtils.property(locator, "condition", sourceCondition), sourceCondition, (this.condition!= null)));
                    copy.setCondition(copyCondition);
                } else {
                    if (conditionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.condition = null;
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GarageRent();
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
        final GarageRent that = ((GarageRent) object);
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
            BigDecimal lhsUsableFloorSpace;
            lhsUsableFloorSpace = this.getUsableFloorSpace();
            BigDecimal rhsUsableFloorSpace;
            rhsUsableFloorSpace = that.getUsableFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usableFloorSpace", lhsUsableFloorSpace), LocatorUtils.property(thatLocator, "usableFloorSpace", rhsUsableFloorSpace), lhsUsableFloorSpace, rhsUsableFloorSpace, (this.usableFloorSpace!= null), (that.usableFloorSpace!= null))) {
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
            Calendar lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            Calendar rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom, (this.freeFrom!= null), (that.freeFrom!= null))) {
                return false;
            }
        }
        {
            Calendar lhsFreeUntil;
            lhsFreeUntil = this.getFreeUntil();
            Calendar rhsFreeUntil;
            rhsFreeUntil = that.getFreeUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeUntil", lhsFreeUntil), LocatorUtils.property(thatLocator, "freeUntil", rhsFreeUntil), lhsFreeUntil, rhsFreeUntil, (this.freeUntil!= null), (that.freeUntil!= null))) {
                return false;
            }
        }
        {
            GarageType lhsGarageType;
            lhsGarageType = this.getGarageType();
            GarageType rhsGarageType;
            rhsGarageType = that.getGarageType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "garageType", lhsGarageType), LocatorUtils.property(thatLocator, "garageType", rhsGarageType), lhsGarageType, rhsGarageType, (this.garageType!= null), (that.garageType!= null))) {
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
            BigDecimal lhsLengthGarage;
            lhsLengthGarage = this.getLengthGarage();
            BigDecimal rhsLengthGarage;
            rhsLengthGarage = that.getLengthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lengthGarage", lhsLengthGarage), LocatorUtils.property(thatLocator, "lengthGarage", rhsLengthGarage), lhsLengthGarage, rhsLengthGarage, (this.lengthGarage!= null), (that.lengthGarage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsWidthGarage;
            lhsWidthGarage = this.getWidthGarage();
            BigDecimal rhsWidthGarage;
            rhsWidthGarage = that.getWidthGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "widthGarage", lhsWidthGarage), LocatorUtils.property(thatLocator, "widthGarage", rhsWidthGarage), lhsWidthGarage, rhsWidthGarage, (this.widthGarage!= null), (that.widthGarage!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsHeightGarage;
            lhsHeightGarage = this.getHeightGarage();
            BigDecimal rhsHeightGarage;
            rhsHeightGarage = that.getHeightGarage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "heightGarage", lhsHeightGarage), LocatorUtils.property(thatLocator, "heightGarage", rhsHeightGarage), lhsHeightGarage, rhsHeightGarage, (this.heightGarage!= null), (that.heightGarage!= null))) {
                return false;
            }
        }
        {
            RealEstateCondition lhsCondition;
            lhsCondition = this.getCondition();
            RealEstateCondition rhsCondition;
            rhsCondition = that.getCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "condition", lhsCondition), LocatorUtils.property(thatLocator, "condition", rhsCondition), lhsCondition, rhsCondition, (this.condition!= null), (that.condition!= null))) {
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
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
