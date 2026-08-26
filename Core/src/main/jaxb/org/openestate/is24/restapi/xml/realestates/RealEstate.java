package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
import org.openestate.is24.restapi.xml.common.AbstractRealEstate;
import org.openestate.is24.restapi.xml.common.PublishChannels;


/**
 * Allgemeine Elemente für
 *                 alle Immobilienarten.
 * 
 * <p>Java class for RealEstate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RealEstate">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractRealEstate">
 *       <sequence>
 *         <element name="showAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="contact" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 <attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://rest.immobilienscout24.de/schema/common/1.0}publishChannels" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstate", propOrder = {
    "showAddress",
    "contact",
    "publishChannels"
})
@XmlSeeAlso({
    HouseBuy.class,
    HouseRent.class,
    GarageRent.class,
    GarageBuy.class,
    SeniorCare.class,
    AssistedLiving.class,
    ApartmentRent.class,
    ApartmentBuy.class,
    CompulsoryAuction.class,
    ShortTermAccommodation.class,
    Investment.class,
    Office.class,
    Store.class,
    Gastronomy.class,
    Industry.class,
    SpecialPurpose.class,
    LivingBuySite.class,
    LivingRentSite.class,
    TradeSite.class,
    HouseType.class,
    FlatShareRoom.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public abstract class RealEstate
    extends AbstractRealEstate
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Bestimmt, ob die
     *                                 Adresse angezeigt werden darf.
     * 
     */
    @XmlElement(defaultValue = "false")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected boolean showAddress;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealEstate.Contact contact;
    /**
     * Liste von Veröffentlichungskanälen.
     * 
     */
    @XmlElement(namespace = "http://rest.immobilienscout24.de/schema/common/1.0")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected PublishChannels publishChannels;

    /**
     * Bestimmt, ob die
     *                                 Adresse angezeigt werden darf.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean isShowAddress() {
        return showAddress;
    }

    /**
     * Sets the value of the showAddress property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setShowAddress(boolean value) {
        this.showAddress = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstate.Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealEstate.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstate.Contact }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContact(RealEstate.Contact value) {
        this.contact = value;
    }

    /**
     * Liste von Veröffentlichungskanälen.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannels }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public PublishChannels getPublishChannels() {
        return publishChannels;
    }

    /**
     * Sets the value of the publishChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannels }
     *     
     * @see #getPublishChannels()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPublishChannels(PublishChannels value) {
        this.publishChannels = value;
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
            boolean theShowAddress;
            theShowAddress = this.isShowAddress();
            strategy.appendField(locator, this, "showAddress", buffer, theShowAddress, true);
        }
        {
            RealEstate.Contact theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact, (this.contact!= null));
        }
        {
            PublishChannels thePublishChannels;
            thePublishChannels = this.getPublishChannels();
            strategy.appendField(locator, this, "publishChannels", buffer, thePublishChannels, (this.publishChannels!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        super.copyTo(locator, target, strategy);
        if (target instanceof RealEstate) {
            final RealEstate copy = ((RealEstate) target);
            {
                Boolean showAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (showAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceShowAddress;
                    sourceShowAddress = this.isShowAddress();
                    boolean copyShowAddress = strategy.copy(LocatorUtils.property(locator, "showAddress", sourceShowAddress), sourceShowAddress, true);
                    copy.setShowAddress(copyShowAddress);
                } else {
                    if (showAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean contactShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contact!= null));
                if (contactShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstate.Contact sourceContact;
                    sourceContact = this.getContact();
                    RealEstate.Contact copyContact = ((RealEstate.Contact) strategy.copy(LocatorUtils.property(locator, "contact", sourceContact), sourceContact, (this.contact!= null)));
                    copy.setContact(copyContact);
                } else {
                    if (contactShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contact = null;
                    }
                }
            }
            {
                Boolean publishChannelsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishChannels!= null));
                if (publishChannelsShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishChannels sourcePublishChannels;
                    sourcePublishChannels = this.getPublishChannels();
                    PublishChannels copyPublishChannels = ((PublishChannels) strategy.copy(LocatorUtils.property(locator, "publishChannels", sourcePublishChannels), sourcePublishChannels, (this.publishChannels!= null)));
                    copy.setPublishChannels(copyPublishChannels);
                } else {
                    if (publishChannelsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannels = null;
                    }
                }
            }
        }
        return target;
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
        final RealEstate that = ((RealEstate) object);
        {
            boolean lhsShowAddress;
            lhsShowAddress = this.isShowAddress();
            boolean rhsShowAddress;
            rhsShowAddress = that.isShowAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showAddress", lhsShowAddress), LocatorUtils.property(thatLocator, "showAddress", rhsShowAddress), lhsShowAddress, rhsShowAddress, true, true)) {
                return false;
            }
        }
        {
            RealEstate.Contact lhsContact;
            lhsContact = this.getContact();
            RealEstate.Contact rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact, (this.contact!= null), (that.contact!= null))) {
                return false;
            }
        }
        {
            PublishChannels lhsPublishChannels;
            lhsPublishChannels = this.getPublishChannels();
            PublishChannels rhsPublishChannels;
            rhsPublishChannels = that.getPublishChannels();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannels", lhsPublishChannels), LocatorUtils.property(thatLocator, "publishChannels", rhsPublishChannels), lhsPublishChannels, rhsPublishChannels, (this.publishChannels!= null), (that.publishChannels!= null))) {
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


    /**
     * Verweis auf einen Anbieterkontakt.
     * 
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       <attribute name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public static class Contact implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        /**
         * Id des Elements.
         * 
         */
        @XmlAttribute(name = "id")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Long id;
        /**
         * Id des Elements im Kundensystem.
         * 
         */
        @XmlAttribute(name = "externalId")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected String externalId;

        /**
         * Id des Elements.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Long getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         * @see #getId()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setId(Long value) {
            this.id = value;
        }

        /**
         * Id des Elements im Kundensystem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public String getExternalId() {
            return externalId;
        }

        /**
         * Sets the value of the externalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getExternalId()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setExternalId(String value) {
            this.externalId = value;
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
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theExternalId;
                theExternalId = this.getExternalId();
                strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
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
            if (draftCopy instanceof RealEstate.Contact) {
                final RealEstate.Contact copy = ((RealEstate.Contact) draftCopy);
                {
                    Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                    if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                        Long sourceId;
                        sourceId = this.getId();
                        Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                        copy.setId(copyId);
                    } else {
                        if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.id = null;
                        }
                    }
                }
                {
                    Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                    if (externalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceExternalId;
                        sourceExternalId = this.getExternalId();
                        String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                        copy.setExternalId(copyExternalId);
                    } else {
                        if (externalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.externalId = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new RealEstate.Contact();
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
            final RealEstate.Contact that = ((RealEstate.Contact) object);
            {
                Long lhsId;
                lhsId = this.getId();
                Long rhsId;
                rhsId = that.getId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                    return false;
                }
            }
            {
                String lhsExternalId;
                lhsExternalId = this.getExternalId();
                String rhsExternalId;
                rhsExternalId = that.getExternalId();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
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

}
