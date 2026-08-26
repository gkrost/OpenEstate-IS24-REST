package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="regionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="cityId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="districtId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="neighbourhoodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="gkz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "regionId",
    "cityId",
    "districtId",
    "postalCode",
    "neighbourhoodId",
    "gkz"
})
@XmlRootElement(name = "geoHierarchyInfo")
@Deprecated
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchyInfo implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long regionId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long cityId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long districtId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String postalCode;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long neighbourhoodId;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String gkz;

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCityId(Long value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the districtId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * Sets the value of the districtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the neighbourhoodId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNeighbourhoodId() {
        return neighbourhoodId;
    }

    /**
     * Sets the value of the neighbourhoodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNeighbourhoodId(Long value) {
        this.neighbourhoodId = value;
    }

    /**
     * Gets the value of the gkz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getGkz() {
        return gkz;
    }

    /**
     * Sets the value of the gkz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGkz(String value) {
        this.gkz = value;
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
            Long theRegionId;
            theRegionId = this.getRegionId();
            strategy.appendField(locator, this, "regionId", buffer, theRegionId, (this.regionId!= null));
        }
        {
            Long theCityId;
            theCityId = this.getCityId();
            strategy.appendField(locator, this, "cityId", buffer, theCityId, (this.cityId!= null));
        }
        {
            Long theDistrictId;
            theDistrictId = this.getDistrictId();
            strategy.appendField(locator, this, "districtId", buffer, theDistrictId, (this.districtId!= null));
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            strategy.appendField(locator, this, "postalCode", buffer, thePostalCode, (this.postalCode!= null));
        }
        {
            Long theNeighbourhoodId;
            theNeighbourhoodId = this.getNeighbourhoodId();
            strategy.appendField(locator, this, "neighbourhoodId", buffer, theNeighbourhoodId, (this.neighbourhoodId!= null));
        }
        {
            String theGkz;
            theGkz = this.getGkz();
            strategy.appendField(locator, this, "gkz", buffer, theGkz, (this.gkz!= null));
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
        if (draftCopy instanceof GeoHierarchyInfo) {
            final GeoHierarchyInfo copy = ((GeoHierarchyInfo) draftCopy);
            {
                Boolean regionIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.regionId!= null));
                if (regionIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceRegionId;
                    sourceRegionId = this.getRegionId();
                    Long copyRegionId = ((Long) strategy.copy(LocatorUtils.property(locator, "regionId", sourceRegionId), sourceRegionId, (this.regionId!= null)));
                    copy.setRegionId(copyRegionId);
                } else {
                    if (regionIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.regionId = null;
                    }
                }
            }
            {
                Boolean cityIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cityId!= null));
                if (cityIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceCityId;
                    sourceCityId = this.getCityId();
                    Long copyCityId = ((Long) strategy.copy(LocatorUtils.property(locator, "cityId", sourceCityId), sourceCityId, (this.cityId!= null)));
                    copy.setCityId(copyCityId);
                } else {
                    if (cityIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cityId = null;
                    }
                }
            }
            {
                Boolean districtIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.districtId!= null));
                if (districtIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDistrictId;
                    sourceDistrictId = this.getDistrictId();
                    Long copyDistrictId = ((Long) strategy.copy(LocatorUtils.property(locator, "districtId", sourceDistrictId), sourceDistrictId, (this.districtId!= null)));
                    copy.setDistrictId(copyDistrictId);
                } else {
                    if (districtIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.districtId = null;
                    }
                }
            }
            {
                Boolean postalCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postalCode!= null));
                if (postalCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostalCode;
                    sourcePostalCode = this.getPostalCode();
                    String copyPostalCode = ((String) strategy.copy(LocatorUtils.property(locator, "postalCode", sourcePostalCode), sourcePostalCode, (this.postalCode!= null)));
                    copy.setPostalCode(copyPostalCode);
                } else {
                    if (postalCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postalCode = null;
                    }
                }
            }
            {
                Boolean neighbourhoodIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neighbourhoodId!= null));
                if (neighbourhoodIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNeighbourhoodId;
                    sourceNeighbourhoodId = this.getNeighbourhoodId();
                    Long copyNeighbourhoodId = ((Long) strategy.copy(LocatorUtils.property(locator, "neighbourhoodId", sourceNeighbourhoodId), sourceNeighbourhoodId, (this.neighbourhoodId!= null)));
                    copy.setNeighbourhoodId(copyNeighbourhoodId);
                } else {
                    if (neighbourhoodIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neighbourhoodId = null;
                    }
                }
            }
            {
                Boolean gkzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gkz!= null));
                if (gkzShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceGkz;
                    sourceGkz = this.getGkz();
                    String copyGkz = ((String) strategy.copy(LocatorUtils.property(locator, "gkz", sourceGkz), sourceGkz, (this.gkz!= null)));
                    copy.setGkz(copyGkz);
                } else {
                    if (gkzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gkz = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchyInfo();
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
        final GeoHierarchyInfo that = ((GeoHierarchyInfo) object);
        {
            Long lhsRegionId;
            lhsRegionId = this.getRegionId();
            Long rhsRegionId;
            rhsRegionId = that.getRegionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionId", lhsRegionId), LocatorUtils.property(thatLocator, "regionId", rhsRegionId), lhsRegionId, rhsRegionId, (this.regionId!= null), (that.regionId!= null))) {
                return false;
            }
        }
        {
            Long lhsCityId;
            lhsCityId = this.getCityId();
            Long rhsCityId;
            rhsCityId = that.getCityId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cityId", lhsCityId), LocatorUtils.property(thatLocator, "cityId", rhsCityId), lhsCityId, rhsCityId, (this.cityId!= null), (that.cityId!= null))) {
                return false;
            }
        }
        {
            Long lhsDistrictId;
            lhsDistrictId = this.getDistrictId();
            Long rhsDistrictId;
            rhsDistrictId = that.getDistrictId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "districtId", lhsDistrictId), LocatorUtils.property(thatLocator, "districtId", rhsDistrictId), lhsDistrictId, rhsDistrictId, (this.districtId!= null), (that.districtId!= null))) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode, (this.postalCode!= null), (that.postalCode!= null))) {
                return false;
            }
        }
        {
            Long lhsNeighbourhoodId;
            lhsNeighbourhoodId = this.getNeighbourhoodId();
            Long rhsNeighbourhoodId;
            rhsNeighbourhoodId = that.getNeighbourhoodId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhoodId", lhsNeighbourhoodId), LocatorUtils.property(thatLocator, "neighbourhoodId", rhsNeighbourhoodId), lhsNeighbourhoodId, rhsNeighbourhoodId, (this.neighbourhoodId!= null), (that.neighbourhoodId!= null))) {
                return false;
            }
        }
        {
            String lhsGkz;
            lhsGkz = this.getGkz();
            String rhsGkz;
            rhsGkz = that.getGkz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gkz", lhsGkz), LocatorUtils.property(thatLocator, "gkz", rhsGkz), lhsGkz, rhsGkz, (this.gkz!= null), (that.gkz!= null))) {
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
