package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fernsehanschluss Typ
 * 
 * <p>Java class for TvConnectionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TvConnectionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="CABLE"/>
 *     <enumeration value="SATELLITE"/>
 *     <enumeration value="CABLE_AND_SATELLITE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TvConnectionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum TvConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Kabel
     * 
     */
    CABLE,

    /**
     * Satellit
     * 
     */
    SATELLITE,

    /**
     * Kabel und Satellit
     * 
     */
    CABLE_AND_SATELLITE;

    public String value() {
        return name();
    }

    public static TvConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
