package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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


/**
 * <p>Java class for User complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="User">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}ContactDetails"/>
 *         <element name="password" type="{http://rest.immobilienscout24.de/schema/common/1.0}Password"/>
 *         <element name="sharedShortlistGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *       <attribute name="peid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "contactDetails",
    "password",
    "sharedShortlistGroupId"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class User implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Kondaktdaten des Users welche auch die notwendige Emailadresse
     *                         enthält.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ContactDetails contactDetails;
    /**
     * Passwort für die Anlage/Veränderung des Users (ist immer leer bei
     *                         GET Operationen).
     * 
     */
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String password;
    /**
     * Id von der Gruppe, falls der Nutzer gemensame Suche/Merkzettel
     *                         nutzt.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long sharedShortlistGroupId;
    /**
     * Eineindeutige Kennung des Benutzers.
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String id;
    /**
     * Eineindeutige Personen Id des Benutzers.
     * 
     */
    @XmlAttribute(name = "peid")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long peid;

    /**
     * Kondaktdaten des Users welche auch die notwendige Emailadresse
     *                         enthält.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     * @see #getContactDetails()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Passwort für die Anlage/Veränderung des Users (ist immer leer bei
     *                         GET Operationen).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPassword()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Id von der Gruppe, falls der Nutzer gemensame Suche/Merkzettel
     *                         nutzt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getSharedShortlistGroupId() {
        return sharedShortlistGroupId;
    }

    /**
     * Sets the value of the sharedShortlistGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getSharedShortlistGroupId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSharedShortlistGroupId(Long value) {
        this.sharedShortlistGroupId = value;
    }

    /**
     * Eineindeutige Kennung des Benutzers.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Eineindeutige Personen Id des Benutzers.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getPeid() {
        return peid;
    }

    /**
     * Sets the value of the peid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getPeid()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPeid(Long value) {
        this.peid = value;
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
            ContactDetails theContactDetails;
            theContactDetails = this.getContactDetails();
            strategy.appendField(locator, this, "contactDetails", buffer, theContactDetails, (this.contactDetails!= null));
        }
        {
            String thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword, (this.password!= null));
        }
        {
            Long theSharedShortlistGroupId;
            theSharedShortlistGroupId = this.getSharedShortlistGroupId();
            strategy.appendField(locator, this, "sharedShortlistGroupId", buffer, theSharedShortlistGroupId, (this.sharedShortlistGroupId!= null));
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
        }
        {
            Long thePeid;
            thePeid = this.getPeid();
            strategy.appendField(locator, this, "peid", buffer, thePeid, (this.peid!= null));
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
        if (draftCopy instanceof User) {
            final User copy = ((User) draftCopy);
            {
                Boolean contactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contactDetails!= null));
                if (contactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContactDetails sourceContactDetails;
                    sourceContactDetails = this.getContactDetails();
                    ContactDetails copyContactDetails = ((ContactDetails) strategy.copy(LocatorUtils.property(locator, "contactDetails", sourceContactDetails), sourceContactDetails, (this.contactDetails!= null)));
                    copy.setContactDetails(copyContactDetails);
                } else {
                    if (contactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contactDetails = null;
                    }
                }
            }
            {
                Boolean passwordShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.password!= null));
                if (passwordShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePassword;
                    sourcePassword = this.getPassword();
                    String copyPassword = ((String) strategy.copy(LocatorUtils.property(locator, "password", sourcePassword), sourcePassword, (this.password!= null)));
                    copy.setPassword(copyPassword);
                } else {
                    if (passwordShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.password = null;
                    }
                }
            }
            {
                Boolean sharedShortlistGroupIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sharedShortlistGroupId!= null));
                if (sharedShortlistGroupIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceSharedShortlistGroupId;
                    sourceSharedShortlistGroupId = this.getSharedShortlistGroupId();
                    Long copySharedShortlistGroupId = ((Long) strategy.copy(LocatorUtils.property(locator, "sharedShortlistGroupId", sourceSharedShortlistGroupId), sourceSharedShortlistGroupId, (this.sharedShortlistGroupId!= null)));
                    copy.setSharedShortlistGroupId(copySharedShortlistGroupId);
                } else {
                    if (sharedShortlistGroupIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sharedShortlistGroupId = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
            {
                Boolean peidShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.peid!= null));
                if (peidShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePeid;
                    sourcePeid = this.getPeid();
                    Long copyPeid = ((Long) strategy.copy(LocatorUtils.property(locator, "peid", sourcePeid), sourcePeid, (this.peid!= null)));
                    copy.setPeid(copyPeid);
                } else {
                    if (peidShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.peid = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new User();
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
        final User that = ((User) object);
        {
            ContactDetails lhsContactDetails;
            lhsContactDetails = this.getContactDetails();
            ContactDetails rhsContactDetails;
            rhsContactDetails = that.getContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactDetails", lhsContactDetails), LocatorUtils.property(thatLocator, "contactDetails", rhsContactDetails), lhsContactDetails, rhsContactDetails, (this.contactDetails!= null), (that.contactDetails!= null))) {
                return false;
            }
        }
        {
            String lhsPassword;
            lhsPassword = this.getPassword();
            String rhsPassword;
            rhsPassword = that.getPassword();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "password", lhsPassword), LocatorUtils.property(thatLocator, "password", rhsPassword), lhsPassword, rhsPassword, (this.password!= null), (that.password!= null))) {
                return false;
            }
        }
        {
            Long lhsSharedShortlistGroupId;
            lhsSharedShortlistGroupId = this.getSharedShortlistGroupId();
            Long rhsSharedShortlistGroupId;
            rhsSharedShortlistGroupId = that.getSharedShortlistGroupId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sharedShortlistGroupId", lhsSharedShortlistGroupId), LocatorUtils.property(thatLocator, "sharedShortlistGroupId", rhsSharedShortlistGroupId), lhsSharedShortlistGroupId, rhsSharedShortlistGroupId, (this.sharedShortlistGroupId!= null), (that.sharedShortlistGroupId!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            Long lhsPeid;
            lhsPeid = this.getPeid();
            Long rhsPeid;
            rhsPeid = that.getPeid();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "peid", lhsPeid), LocatorUtils.property(thatLocator, "peid", rhsPeid), lhsPeid, rhsPeid, (this.peid!= null), (that.peid!= null))) {
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
