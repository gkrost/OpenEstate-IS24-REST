package org.openestate.is24.restapi.xml.realtor;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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


/**
 * <p>Java class for Realtor complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Realtor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="businessCardActivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Realtor", propOrder = {
    "customerNumber",
    "businessCardActivated"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Realtor implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * The customer number of the realtor if he is a customer.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String customerNumber;
    /**
     * Is the homepage activated.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected boolean businessCardActivated;

    /**
     * The customer number of the realtor if he is a customer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCustomerNumber()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Is the homepage activated.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean isBusinessCardActivated() {
        return businessCardActivated;
    }

    /**
     * Sets the value of the businessCardActivated property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBusinessCardActivated(boolean value) {
        this.businessCardActivated = value;
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
            String theCustomerNumber;
            theCustomerNumber = this.getCustomerNumber();
            strategy.appendField(locator, this, "customerNumber", buffer, theCustomerNumber, (this.customerNumber!= null));
        }
        {
            boolean theBusinessCardActivated;
            theBusinessCardActivated = this.isBusinessCardActivated();
            strategy.appendField(locator, this, "businessCardActivated", buffer, theBusinessCardActivated, true);
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
        if (draftCopy instanceof Realtor) {
            final Realtor copy = ((Realtor) draftCopy);
            {
                Boolean customerNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.customerNumber!= null));
                if (customerNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCustomerNumber;
                    sourceCustomerNumber = this.getCustomerNumber();
                    String copyCustomerNumber = ((String) strategy.copy(LocatorUtils.property(locator, "customerNumber", sourceCustomerNumber), sourceCustomerNumber, (this.customerNumber!= null)));
                    copy.setCustomerNumber(copyCustomerNumber);
                } else {
                    if (customerNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.customerNumber = null;
                    }
                }
            }
            {
                Boolean businessCardActivatedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (businessCardActivatedShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceBusinessCardActivated;
                    sourceBusinessCardActivated = this.isBusinessCardActivated();
                    boolean copyBusinessCardActivated = strategy.copy(LocatorUtils.property(locator, "businessCardActivated", sourceBusinessCardActivated), sourceBusinessCardActivated, true);
                    copy.setBusinessCardActivated(copyBusinessCardActivated);
                } else {
                    if (businessCardActivatedShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Realtor();
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
        final Realtor that = ((Realtor) object);
        {
            String lhsCustomerNumber;
            lhsCustomerNumber = this.getCustomerNumber();
            String rhsCustomerNumber;
            rhsCustomerNumber = that.getCustomerNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerNumber", lhsCustomerNumber), LocatorUtils.property(thatLocator, "customerNumber", rhsCustomerNumber), lhsCustomerNumber, rhsCustomerNumber, (this.customerNumber!= null), (that.customerNumber!= null))) {
                return false;
            }
        }
        {
            boolean lhsBusinessCardActivated;
            lhsBusinessCardActivated = this.isBusinessCardActivated();
            boolean rhsBusinessCardActivated;
            rhsBusinessCardActivated = that.isBusinessCardActivated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessCardActivated", lhsBusinessCardActivated), LocatorUtils.property(thatLocator, "businessCardActivated", rhsBusinessCardActivated), lhsBusinessCardActivated, rhsBusinessCardActivated, true, true)) {
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
