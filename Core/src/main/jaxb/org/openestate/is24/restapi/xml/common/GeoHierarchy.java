package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * Die Geo-Hierarchie-Informationen.
 * 
 * <p>Java class for GeoHierarchy complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoHierarchy">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="continent" type="{http://rest.immobilienscout24.de/schema/common/1.0}Continent" minOccurs="0"/>
 *         <element name="country" type="{http://rest.immobilienscout24.de/schema/common/1.0}Country"/>
 *         <element name="region" type="{http://rest.immobilienscout24.de/schema/common/1.0}Region"/>
 *         <element name="city" type="{http://rest.immobilienscout24.de/schema/common/1.0}City"/>
 *         <element name="quarter" type="{http://rest.immobilienscout24.de/schema/common/1.0}Quarter"/>
 *         <element name="neighbourhood" type="{http://rest.immobilienscout24.de/schema/common/1.0}Neighbourhood" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchy", propOrder = {
    "continent",
    "country",
    "region",
    "city",
    "quarter",
    "neighbourhood"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchy implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Kontinent
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Continent continent;
    /**
     * Land
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Country country;
    /**
     * Bundesland
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Region region;
    /**
     * Stadt/Kreis
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected City city;
    /**
     * Bezirk/Gemeinde
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Quarter quarter;
    /**
     * Nachbarschaft
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Neighbourhood neighbourhood;

    /**
     * Kontinent
     * 
     * @return
     *     possible object is
     *     {@link Continent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Continent getContinent() {
        return continent;
    }

    /**
     * Sets the value of the continent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Continent }
     *     
     * @see #getContinent()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContinent(Continent value) {
        this.continent = value;
    }

    /**
     * Land
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     * @see #getCountry()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Bundesland
     * 
     * @return
     *     possible object is
     *     {@link Region }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Region getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link Region }
     *     
     * @see #getRegion()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRegion(Region value) {
        this.region = value;
    }

    /**
     * Stadt/Kreis
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public City getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     * @see #getCity()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCity(City value) {
        this.city = value;
    }

    /**
     * Bezirk/Gemeinde
     * 
     * @return
     *     possible object is
     *     {@link Quarter }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Quarter getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarter }
     *     
     * @see #getQuarter()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setQuarter(Quarter value) {
        this.quarter = value;
    }

    /**
     * Nachbarschaft
     * 
     * @return
     *     possible object is
     *     {@link Neighbourhood }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Neighbourhood getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Sets the value of the neighbourhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Neighbourhood }
     *     
     * @see #getNeighbourhood()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNeighbourhood(Neighbourhood value) {
        this.neighbourhood = value;
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
            Continent theContinent;
            theContinent = this.getContinent();
            strategy.appendField(locator, this, "continent", buffer, theContinent, (this.continent!= null));
        }
        {
            Country theCountry;
            theCountry = this.getCountry();
            strategy.appendField(locator, this, "country", buffer, theCountry, (this.country!= null));
        }
        {
            Region theRegion;
            theRegion = this.getRegion();
            strategy.appendField(locator, this, "region", buffer, theRegion, (this.region!= null));
        }
        {
            City theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            Quarter theQuarter;
            theQuarter = this.getQuarter();
            strategy.appendField(locator, this, "quarter", buffer, theQuarter, (this.quarter!= null));
        }
        {
            Neighbourhood theNeighbourhood;
            theNeighbourhood = this.getNeighbourhood();
            strategy.appendField(locator, this, "neighbourhood", buffer, theNeighbourhood, (this.neighbourhood!= null));
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
        if (draftCopy instanceof GeoHierarchy) {
            final GeoHierarchy copy = ((GeoHierarchy) draftCopy);
            {
                Boolean continentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.continent!= null));
                if (continentShouldBeCopiedAndSet == Boolean.TRUE) {
                    Continent sourceContinent;
                    sourceContinent = this.getContinent();
                    Continent copyContinent = ((Continent) strategy.copy(LocatorUtils.property(locator, "continent", sourceContinent), sourceContinent, (this.continent!= null)));
                    copy.setContinent(copyContinent);
                } else {
                    if (continentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.continent = null;
                    }
                }
            }
            {
                Boolean countryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.country!= null));
                if (countryShouldBeCopiedAndSet == Boolean.TRUE) {
                    Country sourceCountry;
                    sourceCountry = this.getCountry();
                    Country copyCountry = ((Country) strategy.copy(LocatorUtils.property(locator, "country", sourceCountry), sourceCountry, (this.country!= null)));
                    copy.setCountry(copyCountry);
                } else {
                    if (countryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.country = null;
                    }
                }
            }
            {
                Boolean regionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.region!= null));
                if (regionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Region sourceRegion;
                    sourceRegion = this.getRegion();
                    Region copyRegion = ((Region) strategy.copy(LocatorUtils.property(locator, "region", sourceRegion), sourceRegion, (this.region!= null)));
                    copy.setRegion(copyRegion);
                } else {
                    if (regionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.region = null;
                    }
                }
            }
            {
                Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                    City sourceCity;
                    sourceCity = this.getCity();
                    City copyCity = ((City) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                    copy.setCity(copyCity);
                } else {
                    if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.city = null;
                    }
                }
            }
            {
                Boolean quarterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.quarter!= null));
                if (quarterShouldBeCopiedAndSet == Boolean.TRUE) {
                    Quarter sourceQuarter;
                    sourceQuarter = this.getQuarter();
                    Quarter copyQuarter = ((Quarter) strategy.copy(LocatorUtils.property(locator, "quarter", sourceQuarter), sourceQuarter, (this.quarter!= null)));
                    copy.setQuarter(copyQuarter);
                } else {
                    if (quarterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.quarter = null;
                    }
                }
            }
            {
                Boolean neighbourhoodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.neighbourhood!= null));
                if (neighbourhoodShouldBeCopiedAndSet == Boolean.TRUE) {
                    Neighbourhood sourceNeighbourhood;
                    sourceNeighbourhood = this.getNeighbourhood();
                    Neighbourhood copyNeighbourhood = ((Neighbourhood) strategy.copy(LocatorUtils.property(locator, "neighbourhood", sourceNeighbourhood), sourceNeighbourhood, (this.neighbourhood!= null)));
                    copy.setNeighbourhood(copyNeighbourhood);
                } else {
                    if (neighbourhoodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.neighbourhood = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchy();
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
        final GeoHierarchy that = ((GeoHierarchy) object);
        {
            Continent lhsContinent;
            lhsContinent = this.getContinent();
            Continent rhsContinent;
            rhsContinent = that.getContinent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continent", lhsContinent), LocatorUtils.property(thatLocator, "continent", rhsContinent), lhsContinent, rhsContinent, (this.continent!= null), (that.continent!= null))) {
                return false;
            }
        }
        {
            Country lhsCountry;
            lhsCountry = this.getCountry();
            Country rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                return false;
            }
        }
        {
            Region lhsRegion;
            lhsRegion = this.getRegion();
            Region rhsRegion;
            rhsRegion = that.getRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "region", lhsRegion), LocatorUtils.property(thatLocator, "region", rhsRegion), lhsRegion, rhsRegion, (this.region!= null), (that.region!= null))) {
                return false;
            }
        }
        {
            City lhsCity;
            lhsCity = this.getCity();
            City rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            Quarter lhsQuarter;
            lhsQuarter = this.getQuarter();
            Quarter rhsQuarter;
            rhsQuarter = that.getQuarter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "quarter", lhsQuarter), LocatorUtils.property(thatLocator, "quarter", rhsQuarter), lhsQuarter, rhsQuarter, (this.quarter!= null), (that.quarter!= null))) {
                return false;
            }
        }
        {
            Neighbourhood lhsNeighbourhood;
            lhsNeighbourhood = this.getNeighbourhood();
            Neighbourhood rhsNeighbourhood;
            rhsNeighbourhood = that.getNeighbourhood();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "neighbourhood", lhsNeighbourhood), LocatorUtils.property(thatLocator, "neighbourhood", rhsNeighbourhood), lhsNeighbourhood, rhsNeighbourhood, (this.neighbourhood!= null), (that.neighbourhood!= null))) {
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
