package org.openestate.is24.restapi.xml.realestateproject;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for percentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="percentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *     <enumeration value="0"/>
 *     <enumeration value="10"/>
 *     <enumeration value="20"/>
 *     <enumeration value="30"/>
 *     <enumeration value="40"/>
 *     <enumeration value="50"/>
 *     <enumeration value="60"/>
 *     <enumeration value="70"/>
 *     <enumeration value="80"/>
 *     <enumeration value="90"/>
 *     <enumeration value="100"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "percentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PercentType {

    @XmlEnumValue("0")
    ZERO("0"),
    @XmlEnumValue("10")
    TEN("10"),
    @XmlEnumValue("20")
    TWENTY("20"),
    @XmlEnumValue("30")
    THIRTY("30"),
    @XmlEnumValue("40")
    FORTY("40"),
    @XmlEnumValue("50")
    FIFTY("50"),
    @XmlEnumValue("60")
    SIXTY("60"),
    @XmlEnumValue("70")
    SEVENTY("70"),
    @XmlEnumValue("80")
    EIGHTY("80"),
    @XmlEnumValue("90")
    NINETY("90"),
    @XmlEnumValue("100")
    HUNDRED("100");
    private final String value;

    PercentType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static PercentType fromValue(String v) {
        for (PercentType c: PercentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
