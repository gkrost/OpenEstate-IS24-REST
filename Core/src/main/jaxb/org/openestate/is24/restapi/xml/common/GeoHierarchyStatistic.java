package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * Enthält die Statistik (d.h. Anzahl der Objekte) für einen
 *                 Immobilientyp.
 * 
 * <p>Java class for GeoHierarchyStatistic complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoHierarchyStatistic">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="realEstateType" use="required" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateType" />
 *       <attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistic")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchyStatistic implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlAttribute(name = "realEstateType", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealEstateType realEstateType;
    @XmlAttribute(name = "count", required = true)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long count;

    /**
     * Gets the value of the realEstateType property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    /**
     * Sets the value of the realEstateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstateType(RealEstateType value) {
        this.realEstateType = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCount(Long value) {
        this.count = value;
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
            RealEstateType theRealEstateType;
            theRealEstateType = this.getRealEstateType();
            strategy.appendField(locator, this, "realEstateType", buffer, theRealEstateType, (this.realEstateType!= null));
        }
        {
            Long theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount, (this.count!= null));
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
        if (draftCopy instanceof GeoHierarchyStatistic) {
            final GeoHierarchyStatistic copy = ((GeoHierarchyStatistic) draftCopy);
            {
                Boolean realEstateTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateType!= null));
                if (realEstateTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateType sourceRealEstateType;
                    sourceRealEstateType = this.getRealEstateType();
                    RealEstateType copyRealEstateType = ((RealEstateType) strategy.copy(LocatorUtils.property(locator, "realEstateType", sourceRealEstateType), sourceRealEstateType, (this.realEstateType!= null)));
                    copy.setRealEstateType(copyRealEstateType);
                } else {
                    if (realEstateTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateType = null;
                    }
                }
            }
            {
                Boolean countShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.count!= null));
                if (countShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCount;
                    sourceCount = this.getCount();
                    Long copyCount = ((Long) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount, (this.count!= null)));
                    copy.setCount(copyCount);
                } else {
                    if (countShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.count = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchyStatistic();
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
        final GeoHierarchyStatistic that = ((GeoHierarchyStatistic) object);
        {
            RealEstateType lhsRealEstateType;
            lhsRealEstateType = this.getRealEstateType();
            RealEstateType rhsRealEstateType;
            rhsRealEstateType = that.getRealEstateType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateType", lhsRealEstateType), LocatorUtils.property(thatLocator, "realEstateType", rhsRealEstateType), lhsRealEstateType, rhsRealEstateType, (this.realEstateType!= null), (that.realEstateType!= null))) {
                return false;
            }
        }
        {
            Long lhsCount;
            lhsCount = this.getCount();
            Long rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount, (this.count!= null), (that.count!= null))) {
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
