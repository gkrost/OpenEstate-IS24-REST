package org.openestate.is24.restapi.xml.common;

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
 * Liste der IS24 Geo-Ids.
 * 
 * <p>Java class for GeoInfoNodeCriteria complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoInfoNodeCriteria">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="continentId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="regionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="cityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="districtId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="label" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoInfoNodeCriteria", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoInfoNodeCriteria implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Kontinent Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected long continentId;
    /**
     * Land Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected long countryId;
    /**
     * Bundesland Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long regionId;
    /**
     * Stadt Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long cityId;
    /**
     * Stadtteil/Bezirk Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long districtId;
    /**
     * Name der Region
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String label;

    /**
     * Kontinent Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public long getContinentId() {
        return continentId;
    }

    /**
     * Sets the value of the continentId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContinentId(long value) {
        this.continentId = value;
    }

    /**
     * Land Id
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Bundesland Id
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
     * @see #getRegionId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRegionId(Long value) {
        this.regionId = value;
    }

    /**
     * Stadt Id
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
     * @see #getCityId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCityId(Long value) {
        this.cityId = value;
    }

    /**
     * Stadtteil/Bezirk Id
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
     * @see #getDistrictId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDistrictId(Long value) {
        this.districtId = value;
    }

    /**
     * Name der Region
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
            long theContinentId;
            theContinentId = this.getContinentId();
            strategy.appendField(locator, this, "continentId", buffer, theContinentId, true);
        }
        {
            long theCountryId;
            theCountryId = this.getCountryId();
            strategy.appendField(locator, this, "countryId", buffer, theCountryId, true);
        }
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
            String theLabel;
            theLabel = this.getLabel();
            strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
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
        if (draftCopy instanceof GeoInfoNodeCriteria) {
            final GeoInfoNodeCriteria copy = ((GeoInfoNodeCriteria) draftCopy);
            {
                Boolean continentIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (continentIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceContinentId;
                    sourceContinentId = this.getContinentId();
                    long copyContinentId = strategy.copy(LocatorUtils.property(locator, "continentId", sourceContinentId), sourceContinentId, true);
                    copy.setContinentId(copyContinentId);
                } else {
                    if (continentIdShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean countryIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (countryIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    long sourceCountryId;
                    sourceCountryId = this.getCountryId();
                    long copyCountryId = strategy.copy(LocatorUtils.property(locator, "countryId", sourceCountryId), sourceCountryId, true);
                    copy.setCountryId(copyCountryId);
                } else {
                    if (countryIdShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
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
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoInfoNodeCriteria();
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
        final GeoInfoNodeCriteria that = ((GeoInfoNodeCriteria) object);
        {
            long lhsContinentId;
            lhsContinentId = this.getContinentId();
            long rhsContinentId;
            rhsContinentId = that.getContinentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continentId", lhsContinentId), LocatorUtils.property(thatLocator, "continentId", rhsContinentId), lhsContinentId, rhsContinentId, true, true)) {
                return false;
            }
        }
        {
            long lhsCountryId;
            lhsCountryId = this.getCountryId();
            long rhsCountryId;
            rhsCountryId = that.getCountryId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryId", lhsCountryId), LocatorUtils.property(thatLocator, "countryId", rhsCountryId), lhsCountryId, rhsCountryId, true, true)) {
                return false;
            }
        }
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
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
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
