package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Internet Typ
 * 
 * <p>Java class for InternetConnectionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="InternetConnectionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="DSL"/>
 *     <enumeration value="DSL_FLATRATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InternetConnectionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum InternetConnectionType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * DSL
     * 
     */
    DSL,

    /**
     * DSL Flatrate
     * 
     */
    DSL_FLATRATE;

    public String value() {
        return name();
    }

    public static InternetConnectionType fromValue(String v) {
        return valueOf(v);
    }

}
