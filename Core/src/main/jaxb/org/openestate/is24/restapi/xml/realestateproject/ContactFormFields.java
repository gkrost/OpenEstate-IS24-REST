package org.openestate.is24.restapi.xml.realestateproject;

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
 * <p>Java class for contactFormFields complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="contactFormFields">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="address" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="phone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactFormFields", propOrder = {
    "firstName",
    "address",
    "phone"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class ContactFormFields implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * ob Vorname im Kontaktformular aktiviert ist
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean firstName;
    /**
     * ob Adresse im Kontaktformular aktivieren
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean address;
    /**
     * ob Telefon im Kontaktformular aktiviert ist
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean phone;

    /**
     * ob Vorname im Kontaktformular aktiviert ist
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getFirstName()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFirstName(Boolean value) {
        this.firstName = value;
    }

    /**
     * ob Adresse im Kontaktformular aktivieren
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getAddress()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAddress(Boolean value) {
        this.address = value;
    }

    /**
     * ob Telefon im Kontaktformular aktiviert ist
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getPhone()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPhone(Boolean value) {
        this.phone = value;
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
            Boolean theFirstName;
            theFirstName = this.getFirstName();
            strategy.appendField(locator, this, "firstName", buffer, theFirstName, (this.firstName!= null));
        }
        {
            Boolean theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            Boolean thePhone;
            thePhone = this.getPhone();
            strategy.appendField(locator, this, "phone", buffer, thePhone, (this.phone!= null));
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
        if (draftCopy instanceof ContactFormFields) {
            final ContactFormFields copy = ((ContactFormFields) draftCopy);
            {
                Boolean firstNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstName!= null));
                if (firstNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceFirstName;
                    sourceFirstName = this.getFirstName();
                    Boolean copyFirstName = ((Boolean) strategy.copy(LocatorUtils.property(locator, "firstName", sourceFirstName), sourceFirstName, (this.firstName!= null)));
                    copy.setFirstName(copyFirstName);
                } else {
                    if (firstNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firstName = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAddress;
                    sourceAddress = this.getAddress();
                    Boolean copyAddress = ((Boolean) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean phoneShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.phone!= null));
                if (phoneShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourcePhone;
                    sourcePhone = this.getPhone();
                    Boolean copyPhone = ((Boolean) strategy.copy(LocatorUtils.property(locator, "phone", sourcePhone), sourcePhone, (this.phone!= null)));
                    copy.setPhone(copyPhone);
                } else {
                    if (phoneShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.phone = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new ContactFormFields();
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
        final ContactFormFields that = ((ContactFormFields) object);
        {
            Boolean lhsFirstName;
            lhsFirstName = this.getFirstName();
            Boolean rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName, (this.firstName!= null), (that.firstName!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAddress;
            lhsAddress = this.getAddress();
            Boolean rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            Boolean lhsPhone;
            lhsPhone = this.getPhone();
            Boolean rhsPhone;
            rhsPhone = that.getPhone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phone", lhsPhone), LocatorUtils.property(thatLocator, "phone", rhsPhone), lhsPhone, rhsPhone, (this.phone!= null), (that.phone!= null))) {
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
