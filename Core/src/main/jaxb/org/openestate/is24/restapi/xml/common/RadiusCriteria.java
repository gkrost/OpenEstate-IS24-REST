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
 * Kriterien für die Umkreissuche
 * 
 * Generelles Element für die Geo Criterias
 * 
 * <p>Java class for RadiusCriteria complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RadiusCriteria">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria">
 *       <all>
 *         <element name="wgs84" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Coordinate"/>
 *         <element name="radiusKm">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               <minExclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         <element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Address" minOccurs="0"/>
 *       </all>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusCriteria", propOrder = {
    "wgs84",
    "radiusKm",
    "label",
    "address"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RadiusCriteria
    extends AbstractGeoCriteria
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * WGS84-Koordinate (GPS)
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Wgs84Coordinate wgs84;
    /**
     * Radius der Umkreissuche
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter27 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal radiusKm;
    /**
     * formatierte Adresse
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String label;
    /**
     * Adresse für die gespeicherte Suche.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Address address;

    /**
     * WGS84-Koordinate (GPS)
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Coordinate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Wgs84Coordinate getWgs84() {
        return wgs84;
    }

    /**
     * Sets the value of the wgs84 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Coordinate }
     *     
     * @see #getWgs84()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setWgs84(Wgs84Coordinate value) {
        this.wgs84 = value;
    }

    /**
     * Radius der Umkreissuche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getRadiusKm() {
        return radiusKm;
    }

    /**
     * Sets the value of the radiusKm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRadiusKm()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRadiusKm(BigDecimal value) {
        this.radiusKm = value;
    }

    /**
     * formatierte Adresse
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLabel()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Adresse für die gespeicherte Suche.
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
            Wgs84Coordinate theWgs84;
            theWgs84 = this.getWgs84();
            strategy.appendField(locator, this, "wgs84", buffer, theWgs84, (this.wgs84 != null));
        }
        {
            BigDecimal theRadiusKm;
            theRadiusKm = this.getRadiusKm();
            strategy.appendField(locator, this, "radiusKm", buffer, theRadiusKm, (this.radiusKm!= null));
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
        }
        {
            Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof RadiusCriteria) {
            final RadiusCriteria copy = ((RadiusCriteria) draftCopy);
            {
                Boolean wgs84ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wgs84 != null));
                if (wgs84ShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84Coordinate sourceWgs84;
                    sourceWgs84 = this.getWgs84();
                    Wgs84Coordinate copyWgs84 = ((Wgs84Coordinate) strategy.copy(LocatorUtils.property(locator, "wgs84", sourceWgs84), sourceWgs84, (this.wgs84 != null)));
                    copy.setWgs84(copyWgs84);
                } else {
                    if (wgs84ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wgs84 = null;
                    }
                }
            }
            {
                Boolean radiusKmShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.radiusKm!= null));
                if (radiusKmShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceRadiusKm;
                    sourceRadiusKm = this.getRadiusKm();
                    BigDecimal copyRadiusKm = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "radiusKm", sourceRadiusKm), sourceRadiusKm, (this.radiusKm!= null)));
                    copy.setRadiusKm(copyRadiusKm);
                } else {
                    if (radiusKmShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.radiusKm = null;
                    }
                }
            }
            {
                Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLabel;
                    sourceLabel = this.getLabel();
                    String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                    copy.setLabel(copyLabel);
                } else {
                    if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.label = null;
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RadiusCriteria();
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
        final RadiusCriteria that = ((RadiusCriteria) object);
        {
            Wgs84Coordinate lhsWgs84;
            lhsWgs84 = this.getWgs84();
            Wgs84Coordinate rhsWgs84;
            rhsWgs84 = that.getWgs84();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wgs84", lhsWgs84), LocatorUtils.property(thatLocator, "wgs84", rhsWgs84), lhsWgs84, rhsWgs84, (this.wgs84 != null), (that.wgs84 != null))) {
                return false;
            }
        }
        {
            BigDecimal lhsRadiusKm;
            lhsRadiusKm = this.getRadiusKm();
            BigDecimal rhsRadiusKm;
            rhsRadiusKm = that.getRadiusKm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "radiusKm", lhsRadiusKm), LocatorUtils.property(thatLocator, "radiusKm", rhsRadiusKm), lhsRadiusKm, rhsRadiusKm, (this.radiusKm!= null), (that.radiusKm!= null))) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
                return false;
            }
        }
        {
            Address lhsAddress;
            lhsAddress = this.getAddress();
            Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
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
