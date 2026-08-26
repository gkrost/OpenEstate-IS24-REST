package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung des Typen von Wohnen auf Zeit (Wohnung, Zimmer oder Haus)
 * 
 * <p>Java class for ShortTermAccommodationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ShortTermAccommodationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APARTMENT"/>
 *     <enumeration value="FLAT"/>
 *     <enumeration value="HOUSE"/>
 *     <enumeration value="ROOM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ShortTermAccommodationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ShortTermAccommodationType {


    /**
     * Wohnung und Apartment
     * 
     */
    APARTMENT,

    /**
     * Wohnung
     * 
     */
    FLAT,

    /**
     * Haus
     * 
     */
    HOUSE,

    /**
     * Zimmer
     * 
     */
    ROOM;

    public String value() {
        return name();
    }

    public static ShortTermAccommodationType fromValue(String v) {
        return valueOf(v);
    }

}
