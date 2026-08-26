package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.common.Address;
import org.openestate.is24.restapi.xml.common.GeoCodingPrecisionType;
import org.openestate.is24.restapi.xml.common.GeoHierarchy;
import org.openestate.is24.restapi.xml.common.Wgs84Coordinate;


/**
 * Eine Adresse mit zugehöriger Geokodierungs-Information.
 * 
 * <p>Java class for GeoCodedAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoCodedAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address"/>
 *         <element name="wgs84Coordinate" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/>
 *         <element name="geoCodingPrecision" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoCodingPrecisionType"/>
 *         <element name="geoCodingHierarchy" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchy"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCodedAddress", propOrder = {
    "address",
    "wgs84Coordinate",
    "geoCodingPrecision",
    "geoCodingHierarchy"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoCodedAddress implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Die Adresse
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Address address;
    /**
     * WGS84 Koordinaten
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Wgs84Coordinate wgs84Coordinate;
    /**
     * Die Genauigkeit der Geokodierung.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected GeoCodingPrecisionType geoCodingPrecision;
    /**
     * Die Geo-Hierarchie-Informationen.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected GeoHierarchy geoCodingHierarchy;

    /**
     * Die Adresse
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     * @see #getAddress()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * WGS84 Koordinaten
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Wgs84Coordinate getWgs84Coordinate() {
        return wgs84Coordinate;
    }

    /**
     * Sets the value of the wgs84Coordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     * @see #getWgs84Coordinate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setWgs84Coordinate(Wgs84Coordinate value) {
        this.wgs84Coordinate = value;
    }

    /**
     * Die Genauigkeit der Geokodierung.
     * 
     * @return
     *     possible object is
     *     {@link GeoCodingPrecisionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public GeoCodingPrecisionType getGeoCodingPrecision() {
        return geoCodingPrecision;
    }

    /**
     * Sets the value of the geoCodingPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCodingPrecisionType }
     *     
     * @see #getGeoCodingPrecision()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGeoCodingPrecision(GeoCodingPrecisionType value) {
        this.geoCodingPrecision = value;
    }

    /**
     * Die Geo-Hierarchie-Informationen.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public GeoHierarchy getGeoCodingHierarchy() {
        return geoCodingHierarchy;
    }

    /**
     * Sets the value of the geoCodingHierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchy }
     *     
     * @see #getGeoCodingHierarchy()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGeoCodingHierarchy(GeoHierarchy value) {
        this.geoCodingHierarchy = value;
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
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            Wgs84Coordinate theWgs84Coordinate;
            theWgs84Coordinate = this.getWgs84Coordinate();
            strategy.appendField(locator, this, "wgs84Coordinate", buffer, theWgs84Coordinate, (this.wgs84Coordinate!= null));
        }
        {
            GeoCodingPrecisionType theGeoCodingPrecision;
            theGeoCodingPrecision = this.getGeoCodingPrecision();
            strategy.appendField(locator, this, "geoCodingPrecision", buffer, theGeoCodingPrecision, (this.geoCodingPrecision!= null));
        }
        {
            GeoHierarchy theGeoCodingHierarchy;
            theGeoCodingHierarchy = this.getGeoCodingHierarchy();
            strategy.appendField(locator, this, "geoCodingHierarchy", buffer, theGeoCodingHierarchy, (this.geoCodingHierarchy!= null));
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
        if (draftCopy instanceof GeoCodedAddress) {
            final GeoCodedAddress copy = ((GeoCodedAddress) draftCopy);
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Address sourceAddress;
                    sourceAddress = this.getAddress();
                    Address copyAddress = ((Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean wgs84CoordinateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wgs84Coordinate!= null));
                if (wgs84CoordinateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84Coordinate sourceWgs84Coordinate;
                    sourceWgs84Coordinate = this.getWgs84Coordinate();
                    Wgs84Coordinate copyWgs84Coordinate = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84Coordinate", sourceWgs84Coordinate), sourceWgs84Coordinate, (this.wgs84Coordinate!= null)));
                    copy.setWgs84Coordinate(copyWgs84Coordinate);
                } else {
                    if (wgs84CoordinateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wgs84Coordinate = null;
                    }
                }
            }
            {
                Boolean geoCodingPrecisionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoCodingPrecision!= null));
                if (geoCodingPrecisionShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoCodingPrecisionType sourceGeoCodingPrecision;
                    sourceGeoCodingPrecision = this.getGeoCodingPrecision();
                    GeoCodingPrecisionType copyGeoCodingPrecision = ((GeoCodingPrecisionType) strategy.copy(LocatorUtils.property(locator, "geoCodingPrecision", sourceGeoCodingPrecision), sourceGeoCodingPrecision, (this.geoCodingPrecision!= null)));
                    copy.setGeoCodingPrecision(copyGeoCodingPrecision);
                } else {
                    if (geoCodingPrecisionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoCodingPrecision = null;
                    }
                }
            }
            {
                Boolean geoCodingHierarchyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.geoCodingHierarchy!= null));
                if (geoCodingHierarchyShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoHierarchy sourceGeoCodingHierarchy;
                    sourceGeoCodingHierarchy = this.getGeoCodingHierarchy();
                    GeoHierarchy copyGeoCodingHierarchy = ((GeoHierarchy) strategy.copy(LocatorUtils.property(locator, "geoCodingHierarchy", sourceGeoCodingHierarchy), sourceGeoCodingHierarchy, (this.geoCodingHierarchy!= null)));
                    copy.setGeoCodingHierarchy(copyGeoCodingHierarchy);
                } else {
                    if (geoCodingHierarchyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoCodingHierarchy = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoCodedAddress();
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
        final GeoCodedAddress that = ((GeoCodedAddress) object);
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            Wgs84Coordinate lhsWgs84Coordinate;
            lhsWgs84Coordinate = this.getWgs84Coordinate();
            Wgs84Coordinate rhsWgs84Coordinate;
            rhsWgs84Coordinate = that.getWgs84Coordinate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84Coordinate", lhsWgs84Coordinate), LocatorUtils.property(thatLocator, "wgs84Coordinate", rhsWgs84Coordinate), lhsWgs84Coordinate, rhsWgs84Coordinate, (this.wgs84Coordinate!= null), (that.wgs84Coordinate!= null))) {
                return false;
            }
        }
        {
            GeoCodingPrecisionType lhsGeoCodingPrecision;
            lhsGeoCodingPrecision = this.getGeoCodingPrecision();
            GeoCodingPrecisionType rhsGeoCodingPrecision;
            rhsGeoCodingPrecision = that.getGeoCodingPrecision();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodingPrecision", lhsGeoCodingPrecision), LocatorUtils.property(thatLocator, "geoCodingPrecision", rhsGeoCodingPrecision), lhsGeoCodingPrecision, rhsGeoCodingPrecision, (this.geoCodingPrecision!= null), (that.geoCodingPrecision!= null))) {
                return false;
            }
        }
        {
            GeoHierarchy lhsGeoCodingHierarchy;
            lhsGeoCodingHierarchy = this.getGeoCodingHierarchy();
            GeoHierarchy rhsGeoCodingHierarchy;
            rhsGeoCodingHierarchy = that.getGeoCodingHierarchy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodingHierarchy", lhsGeoCodingHierarchy), LocatorUtils.property(thatLocator, "geoCodingHierarchy", rhsGeoCodingHierarchy), lhsGeoCodingHierarchy, rhsGeoCodingHierarchy, (this.geoCodingHierarchy!= null), (that.geoCodingHierarchy!= null))) {
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
