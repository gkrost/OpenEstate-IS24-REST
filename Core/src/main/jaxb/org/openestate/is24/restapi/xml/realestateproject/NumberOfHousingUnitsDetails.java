package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * <p>Java class for NumberOfHousingUnitsDetails complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NumberOfHousingUnitsDetails">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="apartmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="houseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="commercialCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfHousingUnitsDetails", propOrder = {
    "apartmentCount",
    "houseCount",
    "commercialCount"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class NumberOfHousingUnitsDetails implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long apartmentCount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long houseCount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long commercialCount;

    /**
     * Gets the value of the apartmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getApartmentCount() {
        return apartmentCount;
    }

    /**
     * Sets the value of the apartmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setApartmentCount(Long value) {
        this.apartmentCount = value;
    }

    /**
     * Gets the value of the houseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getHouseCount() {
        return houseCount;
    }

    /**
     * Sets the value of the houseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHouseCount(Long value) {
        this.houseCount = value;
    }

    /**
     * Gets the value of the commercialCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getCommercialCount() {
        return commercialCount;
    }

    /**
     * Sets the value of the commercialCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCommercialCount(Long value) {
        this.commercialCount = value;
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
            Long theApartmentCount;
            theApartmentCount = this.getApartmentCount();
            strategy.appendField(locator, this, "apartmentCount", buffer, theApartmentCount, (this.apartmentCount!= null));
        }
        {
            Long theHouseCount;
            theHouseCount = this.getHouseCount();
            strategy.appendField(locator, this, "houseCount", buffer, theHouseCount, (this.houseCount!= null));
        }
        {
            Long theCommercialCount;
            theCommercialCount = this.getCommercialCount();
            strategy.appendField(locator, this, "commercialCount", buffer, theCommercialCount, (this.commercialCount!= null));
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
        if (draftCopy instanceof NumberOfHousingUnitsDetails) {
            final NumberOfHousingUnitsDetails copy = ((NumberOfHousingUnitsDetails) draftCopy);
            {
                Boolean apartmentCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apartmentCount!= null));
                if (apartmentCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceApartmentCount;
                    sourceApartmentCount = this.getApartmentCount();
                    Long copyApartmentCount = ((Long) strategy.copy(LocatorUtils.property(locator, "apartmentCount", sourceApartmentCount), sourceApartmentCount, (this.apartmentCount!= null)));
                    copy.setApartmentCount(copyApartmentCount);
                } else {
                    if (apartmentCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apartmentCount = null;
                    }
                }
            }
            {
                Boolean houseCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.houseCount!= null));
                if (houseCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceHouseCount;
                    sourceHouseCount = this.getHouseCount();
                    Long copyHouseCount = ((Long) strategy.copy(LocatorUtils.property(locator, "houseCount", sourceHouseCount), sourceHouseCount, (this.houseCount!= null)));
                    copy.setHouseCount(copyHouseCount);
                } else {
                    if (houseCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.houseCount = null;
                    }
                }
            }
            {
                Boolean commercialCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercialCount!= null));
                if (commercialCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCommercialCount;
                    sourceCommercialCount = this.getCommercialCount();
                    Long copyCommercialCount = ((Long) strategy.copy(LocatorUtils.property(locator, "commercialCount", sourceCommercialCount), sourceCommercialCount, (this.commercialCount!= null)));
                    copy.setCommercialCount(copyCommercialCount);
                } else {
                    if (commercialCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercialCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new NumberOfHousingUnitsDetails();
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
        final NumberOfHousingUnitsDetails that = ((NumberOfHousingUnitsDetails) object);
        {
            Long lhsApartmentCount;
            lhsApartmentCount = this.getApartmentCount();
            Long rhsApartmentCount;
            rhsApartmentCount = that.getApartmentCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apartmentCount", lhsApartmentCount), LocatorUtils.property(thatLocator, "apartmentCount", rhsApartmentCount), lhsApartmentCount, rhsApartmentCount, (this.apartmentCount!= null), (that.apartmentCount!= null))) {
                return false;
            }
        }
        {
            Long lhsHouseCount;
            lhsHouseCount = this.getHouseCount();
            Long rhsHouseCount;
            rhsHouseCount = that.getHouseCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseCount", lhsHouseCount), LocatorUtils.property(thatLocator, "houseCount", rhsHouseCount), lhsHouseCount, rhsHouseCount, (this.houseCount!= null), (that.houseCount!= null))) {
                return false;
            }
        }
        {
            Long lhsCommercialCount;
            lhsCommercialCount = this.getCommercialCount();
            Long rhsCommercialCount;
            rhsCommercialCount = that.getCommercialCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercialCount", lhsCommercialCount), LocatorUtils.property(thatLocator, "commercialCount", rhsCommercialCount), lhsCommercialCount, rhsCommercialCount, (this.commercialCount!= null), (that.commercialCount!= null))) {
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
