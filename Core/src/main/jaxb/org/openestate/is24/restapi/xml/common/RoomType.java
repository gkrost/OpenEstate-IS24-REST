package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der
 *                 Zimmertypen von Altenpflegeeinrichtungen.
 * 
 * <p>Java class for RoomType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RoomType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SINGLE"/>
 *     <enumeration value="SHARED"/>
 *     <enumeration value="SINGLE_AND_SHARED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoomType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum RoomType {


    /**
     * Einzelzimmer
     * 
     */
    SINGLE,

    /**
     * Mehrbettzimmer
     * 
     */
    SHARED,

    /**
     * Einzel- und Mehrbettzimmer
     * 
     */
    SINGLE_AND_SHARED;

    public String value() {
        return name();
    }

    public static RoomType fromValue(String v) {
        return valueOf(v);
    }

}
