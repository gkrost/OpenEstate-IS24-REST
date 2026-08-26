package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Rauchen erlaubt
 * 
 * <p>Java class for SmokingAllowedType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SmokingAllowedType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="ALLOWED"/>
 *     <enumeration value="UNWANTED"/>
 *     <enumeration value="OWN_ROOM_ONLY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SmokingAllowedType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SmokingAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erlaubt
     * 
     */
    ALLOWED,

    /**
     * Unerwünscht
     * 
     */
    UNWANTED,

    /**
     * Nur im eigenem Zimmer
     * 
     */
    OWN_ROOM_ONLY;

    public String value() {
        return name();
    }

    public static SmokingAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
