package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fernsehanschluss Typ
 * 
 * <p>Java class for ParkingSituationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ParkingSituationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="GOOD"/>
 *     <enumeration value="BAD"/>
 *     <enumeration value="RESIDENT_PARKING"/>
 *     <enumeration value="OWN_PARKING_SPACE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ParkingSituationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ParkingSituationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Gut
     * 
     */
    GOOD,

    /**
     * schlecht
     * 
     */
    BAD,

    /**
     * Anwohnerparkplatz verfügbar
     * 
     */
    RESIDENT_PARKING,

    /**
     * eigener Parkplatz verfügbar
     * 
     */
    OWN_PARKING_SPACE;

    public String value() {
        return name();
    }

    public static ParkingSituationType fromValue(String v) {
        return valueOf(v);
    }

}
