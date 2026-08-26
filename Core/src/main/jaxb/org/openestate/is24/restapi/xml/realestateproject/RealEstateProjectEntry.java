package org.openestate.is24.restapi.xml.realestateproject;

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


/**
 * Eintrag in Realestate-Project
 * 
 * <p>Java class for RealEstateProjectEntry complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RealEstateProjectEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="realEstateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="realEstateExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealEstateProjectEntry", propOrder = {
    "realEstateId",
    "realEstateExternalId"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealEstateProjectEntry implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Id des Immobilienobjektes.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long realEstateId;
    /**
     * Id des Immobilienobjektes.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String realEstateExternalId;
    /**
     * Id des Elements.
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long id;

    /**
     * Id des Immobilienobjektes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getRealEstateId() {
        return realEstateId;
    }

    /**
     * Sets the value of the realEstateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getRealEstateId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstateId(Long value) {
        this.realEstateId = value;
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
    public String getRealEstateExternalId() {
        return realEstateExternalId;
    }

    /**
     * Sets the value of the realEstateExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRealEstateExternalId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstateExternalId(String value) {
        this.realEstateExternalId = value;
    }

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
            Long theRealEstateId;
            theRealEstateId = this.getRealEstateId();
            strategy.appendField(locator, this, "realEstateId", buffer, theRealEstateId, (this.realEstateId!= null));
        }
        {
            String theRealEstateExternalId;
            theRealEstateExternalId = this.getRealEstateExternalId();
            strategy.appendField(locator, this, "realEstateExternalId", buffer, theRealEstateExternalId, (this.realEstateExternalId!= null));
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        if (draftCopy instanceof RealEstateProjectEntry) {
            final RealEstateProjectEntry copy = ((RealEstateProjectEntry) draftCopy);
            {
                Boolean realEstateIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateId!= null));
                if (realEstateIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRealEstateId;
                    sourceRealEstateId = this.getRealEstateId();
                    Long copyRealEstateId = ((Long) strategy.copy(LocatorUtils.property(locator, "realEstateId", sourceRealEstateId), sourceRealEstateId, (this.realEstateId!= null)));
                    copy.setRealEstateId(copyRealEstateId);
                } else {
                    if (realEstateIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateId = null;
                    }
                }
            }
            {
                Boolean realEstateExternalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateExternalId!= null));
                if (realEstateExternalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRealEstateExternalId;
                    sourceRealEstateExternalId = this.getRealEstateExternalId();
                    String copyRealEstateExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "realEstateExternalId", sourceRealEstateExternalId), sourceRealEstateExternalId, (this.realEstateExternalId!= null)));
                    copy.setRealEstateExternalId(copyRealEstateExternalId);
                } else {
                    if (realEstateExternalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateExternalId = null;
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RealEstateProjectEntry();
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
        final RealEstateProjectEntry that = ((RealEstateProjectEntry) object);
        {
            Long lhsRealEstateId;
            lhsRealEstateId = this.getRealEstateId();
            Long rhsRealEstateId;
            rhsRealEstateId = that.getRealEstateId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateId", lhsRealEstateId), LocatorUtils.property(thatLocator, "realEstateId", rhsRealEstateId), lhsRealEstateId, rhsRealEstateId, (this.realEstateId!= null), (that.realEstateId!= null))) {
                return false;
            }
        }
        {
            String lhsRealEstateExternalId;
            lhsRealEstateExternalId = this.getRealEstateExternalId();
            String rhsRealEstateExternalId;
            rhsRealEstateExternalId = that.getRealEstateExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateExternalId", lhsRealEstateExternalId), LocatorUtils.property(thatLocator, "realEstateExternalId", rhsRealEstateExternalId), lhsRealEstateExternalId, rhsRealEstateExternalId, (this.realEstateExternalId!= null), (that.realEstateExternalId!= null))) {
                return false;
            }
        }
        {
            Long lhsId;
            lhsId = this.getId();
            Long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
