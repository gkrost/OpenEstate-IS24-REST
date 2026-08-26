package org.openestate.is24.restapi.xml.offerlistelement;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
import org.openestate.is24.restapi.xml.common.Price;


/**
 * Zwangsversteigerungsobjekte.
 * 
 * <p>Java class for OfferCompulsoryAuction complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OfferCompulsoryAuction">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList">
 *       <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}BaseCompulsoryAuctionGroup"/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferCompulsoryAuction", propOrder = {
    "marketValue",
    "lowestBid",
    "recurrenceAppointment"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class OfferCompulsoryAuction
    extends OfferRealEstateForList
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
        if (draftCopy instanceof OfferCompulsoryAuction) {
            final OfferCompulsoryAuction copy = ((OfferCompulsoryAuction) draftCopy);
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new OfferCompulsoryAuction();
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
        final OfferCompulsoryAuction that = ((OfferCompulsoryAuction) object);
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
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
