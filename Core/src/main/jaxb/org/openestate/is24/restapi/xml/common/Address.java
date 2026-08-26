package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
 * Definition der Basisfelder einer Adresse.
 * 
 * <p>Java class for Address complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Address">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="street" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="houseNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="postcode" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="city" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="internationalCountryRegion" type="{http://rest.immobilienscout24.de/schema/common/1.0}CountryRegion" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "street",
    "houseNumber",
    "postcode",
    "city",
    "internationalCountryRegion"
})
@XmlSeeAlso({
    Wgs84Address.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Address implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Straße ohne Hausnummer. Pflichtfeld für Deutschland,
     *                         optional für Auslandsimmobilien.
     * 
     */
    @XmlJavaTypeAdapter(Adapter36 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String street;
    /**
     * Hausnummer. Pflichtfeld für Deutschland, optional für
     *                         Auslandsimmobilien. Weiterhin optional für LIVING_RENT_SITE,
     *                         LIVING_BUY_SITE and TRADE_SITE
     * 
     */
    @XmlJavaTypeAdapter(Adapter37 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String houseNumber;
    /**
     * Postleitzahl
     * 
     */
    @XmlJavaTypeAdapter(Adapter38 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String postcode;
    /**
     * Stadt
     * 
     */
    @XmlJavaTypeAdapter(Adapter39 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String city;
    /**
     * Nur für Ortsangaben (von Immobilien) außerhalb
     *                         Deutschlands: Land und Region.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CountryRegion internationalCountryRegion;

    /**
     * Straße ohne Hausnummer. Pflichtfeld für Deutschland,
     *                         optional für Auslandsimmobilien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStreet()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Hausnummer. Pflichtfeld für Deutschland, optional für
     *                         Auslandsimmobilien. Weiterhin optional für LIVING_RENT_SITE,
     *                         LIVING_BUY_SITE and TRADE_SITE
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseNumber()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Postleitzahl
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPostcode()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Stadt
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCity()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Nur für Ortsangaben (von Immobilien) außerhalb
     *                         Deutschlands: Land und Region.
     * 
     * @return
     *     possible object is
     *     {@link CountryRegion }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CountryRegion getInternationalCountryRegion() {
        return internationalCountryRegion;
    }

    /**
     * Sets the value of the internationalCountryRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryRegion }
     *     
     * @see #getInternationalCountryRegion()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setInternationalCountryRegion(CountryRegion value) {
        this.internationalCountryRegion = value;
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
            String theStreet;
            theStreet = this.getStreet();
            strategy.appendField(locator, this, "street", buffer, theStreet, (this.street!= null));
        }
        {
            String theHouseNumber;
            theHouseNumber = this.getHouseNumber();
            strategy.appendField(locator, this, "houseNumber", buffer, theHouseNumber, (this.houseNumber!= null));
        }
        {
            String thePostcode;
            thePostcode = this.getPostcode();
            strategy.appendField(locator, this, "postcode", buffer, thePostcode, (this.postcode!= null));
        }
        {
            String theCity;
            theCity = this.getCity();
            strategy.appendField(locator, this, "city", buffer, theCity, (this.city!= null));
        }
        {
            CountryRegion theInternationalCountryRegion;
            theInternationalCountryRegion = this.getInternationalCountryRegion();
            strategy.appendField(locator, this, "internationalCountryRegion", buffer, theInternationalCountryRegion, (this.internationalCountryRegion!= null));
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
        if (draftCopy instanceof Address) {
            final Address copy = ((Address) draftCopy);
            {
                Boolean streetShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.street!= null));
                if (streetShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceStreet;
                    sourceStreet = this.getStreet();
                    String copyStreet = ((String) strategy.copy(LocatorUtils.property(locator, "street", sourceStreet), sourceStreet, (this.street!= null)));
                    copy.setStreet(copyStreet);
                } else {
                    if (streetShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.street = null;
                    }
                }
            }
            {
                Boolean houseNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.houseNumber!= null));
                if (houseNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHouseNumber;
                    sourceHouseNumber = this.getHouseNumber();
                    String copyHouseNumber = ((String) strategy.copy(LocatorUtils.property(locator, "houseNumber", sourceHouseNumber), sourceHouseNumber, (this.houseNumber!= null)));
                    copy.setHouseNumber(copyHouseNumber);
                } else {
                    if (houseNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.houseNumber = null;
                    }
                }
            }
            {
                Boolean postcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.postcode!= null));
                if (postcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePostcode;
                    sourcePostcode = this.getPostcode();
                    String copyPostcode = ((String) strategy.copy(LocatorUtils.property(locator, "postcode", sourcePostcode), sourcePostcode, (this.postcode!= null)));
                    copy.setPostcode(copyPostcode);
                } else {
                    if (postcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.postcode = null;
                    }
                }
            }
            {
                Boolean cityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.city!= null));
                if (cityShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCity;
                    sourceCity = this.getCity();
                    String copyCity = ((String) strategy.copy(LocatorUtils.property(locator, "city", sourceCity), sourceCity, (this.city!= null)));
                    copy.setCity(copyCity);
                } else {
                    if (cityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.city = null;
                    }
                }
            }
            {
                Boolean internationalCountryRegionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.internationalCountryRegion!= null));
                if (internationalCountryRegionShouldBeCopiedAndSet == Boolean.TRUE) {
                    CountryRegion sourceInternationalCountryRegion;
                    sourceInternationalCountryRegion = this.getInternationalCountryRegion();
                    CountryRegion copyInternationalCountryRegion = ((CountryRegion) strategy.copy(LocatorUtils.property(locator, "internationalCountryRegion", sourceInternationalCountryRegion), sourceInternationalCountryRegion, (this.internationalCountryRegion!= null)));
                    copy.setInternationalCountryRegion(copyInternationalCountryRegion);
                } else {
                    if (internationalCountryRegionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.internationalCountryRegion = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Address();
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
        final Address that = ((Address) object);
        {
            String lhsStreet;
            lhsStreet = this.getStreet();
            String rhsStreet;
            rhsStreet = that.getStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "street", lhsStreet), LocatorUtils.property(thatLocator, "street", rhsStreet), lhsStreet, rhsStreet, (this.street!= null), (that.street!= null))) {
                return false;
            }
        }
        {
            String lhsHouseNumber;
            lhsHouseNumber = this.getHouseNumber();
            String rhsHouseNumber;
            rhsHouseNumber = that.getHouseNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "houseNumber", lhsHouseNumber), LocatorUtils.property(thatLocator, "houseNumber", rhsHouseNumber), lhsHouseNumber, rhsHouseNumber, (this.houseNumber!= null), (that.houseNumber!= null))) {
                return false;
            }
        }
        {
            String lhsPostcode;
            lhsPostcode = this.getPostcode();
            String rhsPostcode;
            rhsPostcode = that.getPostcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postcode", lhsPostcode), LocatorUtils.property(thatLocator, "postcode", rhsPostcode), lhsPostcode, rhsPostcode, (this.postcode!= null), (that.postcode!= null))) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            CountryRegion lhsInternationalCountryRegion;
            lhsInternationalCountryRegion = this.getInternationalCountryRegion();
            CountryRegion rhsInternationalCountryRegion;
            rhsInternationalCountryRegion = that.getInternationalCountryRegion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "internationalCountryRegion", lhsInternationalCountryRegion), LocatorUtils.property(thatLocator, "internationalCountryRegion", rhsInternationalCountryRegion), lhsInternationalCountryRegion, rhsInternationalCountryRegion, (this.internationalCountryRegion!= null), (that.internationalCountryRegion!= null))) {
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
