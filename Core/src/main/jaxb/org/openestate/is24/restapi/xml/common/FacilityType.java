package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for FacilityType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FacilityType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ASSISTED_LIVING"/>
 *     <enumeration value="RESIDENCE"/>
 *     <enumeration value="SENIOR_PARK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FacilityType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum FacilityType {


    /**
     * Seniorenwohnen
     * 
     */
    ASSISTED_LIVING,

    /**
     * Residenz
     * 
     */
    RESIDENCE,

    /**
     * Seniorenwohnpark
     * 
     */
    SENIOR_PARK;

    public String value() {
        return name();
    }

    public static FacilityType fromValue(String v) {
        return valueOf(v);
    }

}
