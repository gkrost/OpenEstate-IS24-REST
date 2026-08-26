package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * Geoinformationen der Immobilie.
 * 
 * <p>Java class for Wgs84Coordinate complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Wgs84Coordinate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="latitude">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               <minInclusive value="-90.0"/>
 *               <maxInclusive value="90.0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="longitude">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               <minInclusive value="-180.0"/>
 *               <maxInclusive value="180.0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wgs84Coordinate", propOrder = {
    "latitude",
    "longitude"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Wgs84Coordinate implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Latitude (Y-Wert) der WGS84-Koordinate (GPS).
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter61 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal latitude;
    /**
     * Longitude (X-Wert) der WGS84-Koordinate (GPS).
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter62 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal longitude;

    /**
     * Latitude (Y-Wert) der WGS84-Koordinate (GPS).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLatitude()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Longitude (X-Wert) der WGS84-Koordinate (GPS).
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLongitude()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
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
            BigDecimal theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude, (this.latitude!= null));
        }
        {
            BigDecimal theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude, (this.longitude!= null));
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
        if (draftCopy instanceof Wgs84Coordinate) {
            final Wgs84Coordinate copy = ((Wgs84Coordinate) draftCopy);
            {
                Boolean latitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.latitude!= null));
                if (latitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLatitude;
                    sourceLatitude = this.getLatitude();
                    BigDecimal copyLatitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "latitude", sourceLatitude), sourceLatitude, (this.latitude!= null)));
                    copy.setLatitude(copyLatitude);
                } else {
                    if (latitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.latitude = null;
                    }
                }
            }
            {
                Boolean longitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.longitude!= null));
                if (longitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceLongitude;
                    sourceLongitude = this.getLongitude();
                    BigDecimal copyLongitude = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "longitude", sourceLongitude), sourceLongitude, (this.longitude!= null)));
                    copy.setLongitude(copyLongitude);
                } else {
                    if (longitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.longitude = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Wgs84Coordinate();
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
        final Wgs84Coordinate that = ((Wgs84Coordinate) object);
        {
            BigDecimal lhsLatitude;
            lhsLatitude = this.getLatitude();
            BigDecimal rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude, (this.latitude!= null), (that.latitude!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsLongitude;
            lhsLongitude = this.getLongitude();
            BigDecimal rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude, (this.longitude!= null), (that.longitude!= null))) {
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
