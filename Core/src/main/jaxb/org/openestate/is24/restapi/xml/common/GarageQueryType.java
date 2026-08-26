package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Garagensuchtyp
 * 
 * <p>Java class for GarageQueryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GarageQueryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="GARAGE"/>
 *     <enumeration value="STREET_PARKING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GarageQueryType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum GarageQueryType {


    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Außenstellplatz
     * 
     */
    STREET_PARKING;

    public String value() {
        return name();
    }

    public static GarageQueryType fromValue(String v) {
        return valueOf(v);
    }

}
