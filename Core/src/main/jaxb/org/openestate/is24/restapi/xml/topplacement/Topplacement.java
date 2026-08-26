package org.openestate.is24.restapi.xml.topplacement;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.common.DateRange;


/**
 * Topplacement
 * 
 * <p>Java class for Topplacement complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Topplacement">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="servicePeriod" type="{http://rest.immobilienscout24.de/schema/common/1.0}DateRange" minOccurs="0"/>
 *         <element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="realestateid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <attribute name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Topplacement", propOrder = {
    "servicePeriod"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Topplacement implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Leistung gebucht von/bis
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected DateRange servicePeriod;
    /**
     * Id des Immobilienobjektes.
     * 
     */
    @XmlAttribute(name = "realestateid", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String realestateid;
    /**
     * Rabattkode
     * 
     */
    @XmlAttribute(name = "voucher")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String voucher;

    /**
     * Leistung gebucht von/bis
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public DateRange getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     * @see #getServicePeriod()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setServicePeriod(DateRange value) {
        this.servicePeriod = value;
    }

    /**
     * Id des Immobilienobjektes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getRealestateid() {
        return realestateid;
    }

    /**
     * Sets the value of the realestateid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRealestateid()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealestateid(String value) {
        this.realestateid = value;
    }

    /**
     * Rabattkode
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVoucher()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setVoucher(String value) {
        this.voucher = value;
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
        {
            DateRange theServicePeriod;
            theServicePeriod = this.getServicePeriod();
            strategy.appendField(locator, this, "servicePeriod", buffer, theServicePeriod, (this.servicePeriod!= null));
        }
        {
            String theRealestateid;
            theRealestateid = this.getRealestateid();
            strategy.appendField(locator, this, "realestateid", buffer, theRealestateid, (this.realestateid!= null));
        }
        {
            String theVoucher;
            theVoucher = this.getVoucher();
            strategy.appendField(locator, this, "voucher", buffer, theVoucher, (this.voucher!= null));
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
        if (draftCopy instanceof Topplacement) {
            final Topplacement copy = ((Topplacement) draftCopy);
            {
                Boolean servicePeriodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.servicePeriod!= null));
                if (servicePeriodShouldBeCopiedAndSet == Boolean.TRUE) {
                    DateRange sourceServicePeriod;
                    sourceServicePeriod = this.getServicePeriod();
                    DateRange copyServicePeriod = ((DateRange) strategy.copy(LocatorUtils.property(locator, "servicePeriod", sourceServicePeriod), sourceServicePeriod, (this.servicePeriod!= null)));
                    copy.setServicePeriod(copyServicePeriod);
                } else {
                    if (servicePeriodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.servicePeriod = null;
                    }
                }
            }
            {
                Boolean realestateidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realestateid!= null));
                if (realestateidShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRealestateid;
                    sourceRealestateid = this.getRealestateid();
                    String copyRealestateid = ((String) strategy.copy(LocatorUtils.property(locator, "realestateid", sourceRealestateid), sourceRealestateid, (this.realestateid!= null)));
                    copy.setRealestateid(copyRealestateid);
                } else {
                    if (realestateidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realestateid = null;
                    }
                }
            }
            {
                Boolean voucherShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucher!= null));
                if (voucherShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVoucher;
                    sourceVoucher = this.getVoucher();
                    String copyVoucher = ((String) strategy.copy(LocatorUtils.property(locator, "voucher", sourceVoucher), sourceVoucher, (this.voucher!= null)));
                    copy.setVoucher(copyVoucher);
                } else {
                    if (voucherShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voucher = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Topplacement();
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
        final Topplacement that = ((Topplacement) object);
        {
            DateRange lhsServicePeriod;
            lhsServicePeriod = this.getServicePeriod();
            DateRange rhsServicePeriod;
            rhsServicePeriod = that.getServicePeriod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "servicePeriod", lhsServicePeriod), LocatorUtils.property(thatLocator, "servicePeriod", rhsServicePeriod), lhsServicePeriod, rhsServicePeriod, (this.servicePeriod!= null), (that.servicePeriod!= null))) {
                return false;
            }
        }
        {
            String lhsRealestateid;
            lhsRealestateid = this.getRealestateid();
            String rhsRealestateid;
            rhsRealestateid = that.getRealestateid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realestateid", lhsRealestateid), LocatorUtils.property(thatLocator, "realestateid", rhsRealestateid), lhsRealestateid, rhsRealestateid, (this.realestateid!= null), (that.realestateid!= null))) {
                return false;
            }
        }
        {
            String lhsVoucher;
            lhsVoucher = this.getVoucher();
            String rhsVoucher;
            rhsVoucher = that.getVoucher();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voucher", lhsVoucher), LocatorUtils.property(thatLocator, "voucher", rhsVoucher), lhsVoucher, rhsVoucher, (this.voucher!= null), (that.voucher!= null))) {
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
