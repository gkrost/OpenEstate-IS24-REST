package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die Genauigkeit der Geokodierung.
 * 
 * <p>Java class for GeoCodingPrecisionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GeoCodingPrecisionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROOFTOP"/>
 *     <enumeration value="HOUSE_NUMBER"/>
 *     <enumeration value="STREET"/>
 *     <enumeration value="QUARTER"/>
 *     <enumeration value="CITY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GeoCodingPrecisionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum GeoCodingPrecisionType {


    /**
     * schornsteingenau
     * 
     */
    ROOFTOP,

    /**
     * hausnummerngenau
     * 
     */
    HOUSE_NUMBER,

    /**
     * strassenabschnittsgenau
     * 
     */
    STREET,

    /**
     * PLZ-genau
     * 
     */
    QUARTER,

    /**
     * stadtgenau
     * 
     */
    CITY;

    public String value() {
        return name();
    }

    public static GeoCodingPrecisionType fromValue(String v) {
        return valueOf(v);
    }

}
