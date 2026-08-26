package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Fernsehanschluss Typ
 * 
 * <p>Java class for TelephoneConnectionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TelephoneConnectionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="ANALOG"/>
 *     <enumeration value="ISDN"/>
 *     <enumeration value="NOT_AVAILABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TelephoneConnectionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum TelephoneConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Analog
     * 
     */
    ANALOG,

    /**
     * ISDN
     * 
     */
    ISDN,

    /**
     * nicht verfügbar
     * 
     */
    NOT_AVAILABLE;

    public String value() {
        return name();
    }

    public static TelephoneConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
