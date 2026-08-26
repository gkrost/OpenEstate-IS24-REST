package org.openestate.is24.restapi.xml.offerlistelement;

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
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Büro Immobilientyp.
 * 
 * <p>Java class for OfferOffice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferOffice">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseOfficeGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferOffice", propOrder = {
    "commercializationType",
    "price",
    "calculatedPrice",
    "totalFloorSpace",
    "netFloorSpace",
    "minDivisible",
    "courtage"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class OfferOffice
    extends OfferRealEstateForList
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Vermarktungsart: Gibt an, ob ein Objekt zum Kauf, zur Miete, zur
     *                         Pacht etc. steht
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CommercializationType commercializationType;
    /**
     * Preis; die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price price;
    /**
     * Aus dem vom Benutzer eingegebenen 'Preis' berechnete
     *                         Preis-Alternativdarstellung;
     *                         die Attribute geben die Art, die Währung und den
     *                         Intervall an
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price calculatedPrice;
    /**
     * Gesamtfläche der Immobilie
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal totalFloorSpace;
    /**
     * (teilbare) Nettofläche
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal netFloorSpace;
    /**
     * Teilbar ab
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal minDivisible;
    /**
     * Provisionselemente
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CourtageInfo courtage;

    /**
     * Vermarktungsart: Gibt an, ob ein Objekt zum Kauf, zur Miete, zur
     *                         Pacht etc. steht
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Sets the value of the commercializationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     * @see #getCommercializationType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
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
     * Aus dem vom Benutzer eingegebenen 'Preis' berechnete
     *                         Preis-Alternativdarstellung;
     *                         die Attribute geben die Art, die Währung und den
     *                         Intervall an
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getCalculatedPrice() {
        return calculatedPrice;
    }

    /**
     * Sets the value of the calculatedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getCalculatedPrice()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCalculatedPrice(Price value) {
        this.calculatedPrice = value;
    }

    /**
     * Gesamtfläche der Immobilie
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getTotalFloorSpace() {
        return totalFloorSpace;
    }

    /**
     * Sets the value of the totalFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalFloorSpace()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTotalFloorSpace(BigDecimal value) {
        this.totalFloorSpace = value;
    }

    /**
     * (teilbare) Nettofläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getNetFloorSpace() {
        return netFloorSpace;
    }

    /**
     * Sets the value of the netFloorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNetFloorSpace()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNetFloorSpace(BigDecimal value) {
        this.netFloorSpace = value;
    }

    /**
     * Teilbar ab
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinDivisible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMinDivisible(BigDecimal value) {
        this.minDivisible = value;
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
            CommercializationType theCommercializationType;
            theCommercializationType = this.getCommercializationType();
            strategy.appendField(locator, this, "commercializationType", buffer, theCommercializationType, (this.commercializationType!= null));
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            Price theCalculatedPrice;
            theCalculatedPrice = this.getCalculatedPrice();
            strategy.appendField(locator, this, "calculatedPrice", buffer, theCalculatedPrice, (this.calculatedPrice!= null));
        }
        {
            BigDecimal theTotalFloorSpace;
            theTotalFloorSpace = this.getTotalFloorSpace();
            strategy.appendField(locator, this, "totalFloorSpace", buffer, theTotalFloorSpace, (this.totalFloorSpace!= null));
        }
        {
            BigDecimal theNetFloorSpace;
            theNetFloorSpace = this.getNetFloorSpace();
            strategy.appendField(locator, this, "netFloorSpace", buffer, theNetFloorSpace, (this.netFloorSpace!= null));
        }
        {
            BigDecimal theMinDivisible;
            theMinDivisible = this.getMinDivisible();
            strategy.appendField(locator, this, "minDivisible", buffer, theMinDivisible, (this.minDivisible!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
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
        if (draftCopy instanceof OfferOffice) {
            final OfferOffice copy = ((OfferOffice) draftCopy);
            {
                Boolean commercializationTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercializationType!= null));
                if (commercializationTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CommercializationType sourceCommercializationType;
                    sourceCommercializationType = this.getCommercializationType();
                    CommercializationType copyCommercializationType = ((CommercializationType) strategy.copy(LocatorUtils.property(locator, "commercializationType", sourceCommercializationType), sourceCommercializationType, (this.commercializationType!= null)));
                    copy.setCommercializationType(copyCommercializationType);
                } else {
                    if (commercializationTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercializationType = null;
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
                Boolean calculatedPriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.calculatedPrice!= null));
                if (calculatedPriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourceCalculatedPrice;
                    sourceCalculatedPrice = this.getCalculatedPrice();
                    Price copyCalculatedPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "calculatedPrice", sourceCalculatedPrice), sourceCalculatedPrice, (this.calculatedPrice!= null)));
                    copy.setCalculatedPrice(copyCalculatedPrice);
                } else {
                    if (calculatedPriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.calculatedPrice = null;
                    }
                }
            }
            {
                Boolean totalFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalFloorSpace!= null));
                if (totalFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceTotalFloorSpace;
                    sourceTotalFloorSpace = this.getTotalFloorSpace();
                    BigDecimal copyTotalFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "totalFloorSpace", sourceTotalFloorSpace), sourceTotalFloorSpace, (this.totalFloorSpace!= null)));
                    copy.setTotalFloorSpace(copyTotalFloorSpace);
                } else {
                    if (totalFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalFloorSpace = null;
                    }
                }
            }
            {
                Boolean netFloorSpaceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.netFloorSpace!= null));
                if (netFloorSpaceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceNetFloorSpace;
                    sourceNetFloorSpace = this.getNetFloorSpace();
                    BigDecimal copyNetFloorSpace = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "netFloorSpace", sourceNetFloorSpace), sourceNetFloorSpace, (this.netFloorSpace!= null)));
                    copy.setNetFloorSpace(copyNetFloorSpace);
                } else {
                    if (netFloorSpaceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.netFloorSpace = null;
                    }
                }
            }
            {
                Boolean minDivisibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minDivisible!= null));
                if (minDivisibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinDivisible;
                    sourceMinDivisible = this.getMinDivisible();
                    BigDecimal copyMinDivisible = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minDivisible", sourceMinDivisible), sourceMinDivisible, (this.minDivisible!= null)));
                    copy.setMinDivisible(copyMinDivisible);
                } else {
                    if (minDivisibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minDivisible = null;
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new OfferOffice();
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
        final OfferOffice that = ((OfferOffice) object);
        {
            CommercializationType lhsCommercializationType;
            lhsCommercializationType = this.getCommercializationType();
            CommercializationType rhsCommercializationType;
            rhsCommercializationType = that.getCommercializationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercializationType", lhsCommercializationType), LocatorUtils.property(thatLocator, "commercializationType", rhsCommercializationType), lhsCommercializationType, rhsCommercializationType, (this.commercializationType!= null), (that.commercializationType!= null))) {
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
            Price lhsCalculatedPrice;
            lhsCalculatedPrice = this.getCalculatedPrice();
            Price rhsCalculatedPrice;
            rhsCalculatedPrice = that.getCalculatedPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculatedPrice", lhsCalculatedPrice), LocatorUtils.property(thatLocator, "calculatedPrice", rhsCalculatedPrice), lhsCalculatedPrice, rhsCalculatedPrice, (this.calculatedPrice!= null), (that.calculatedPrice!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalFloorSpace;
            lhsTotalFloorSpace = this.getTotalFloorSpace();
            BigDecimal rhsTotalFloorSpace;
            rhsTotalFloorSpace = that.getTotalFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalFloorSpace", lhsTotalFloorSpace), LocatorUtils.property(thatLocator, "totalFloorSpace", rhsTotalFloorSpace), lhsTotalFloorSpace, rhsTotalFloorSpace, (this.totalFloorSpace!= null), (that.totalFloorSpace!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsNetFloorSpace;
            lhsNetFloorSpace = this.getNetFloorSpace();
            BigDecimal rhsNetFloorSpace;
            rhsNetFloorSpace = that.getNetFloorSpace();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netFloorSpace", lhsNetFloorSpace), LocatorUtils.property(thatLocator, "netFloorSpace", rhsNetFloorSpace), lhsNetFloorSpace, rhsNetFloorSpace, (this.netFloorSpace!= null), (that.netFloorSpace!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinDivisible;
            lhsMinDivisible = this.getMinDivisible();
            BigDecimal rhsMinDivisible;
            rhsMinDivisible = that.getMinDivisible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDivisible", lhsMinDivisible), LocatorUtils.property(thatLocator, "minDivisible", rhsMinDivisible), lhsMinDivisible, rhsMinDivisible, (this.minDivisible!= null), (that.minDivisible!= null))) {
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
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
