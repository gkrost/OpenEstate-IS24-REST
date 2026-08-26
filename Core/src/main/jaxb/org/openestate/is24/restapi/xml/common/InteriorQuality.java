package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for InteriorQuality</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="InteriorQuality">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="LUXURY"/>
 *     <enumeration value="SOPHISTICATED"/>
 *     <enumeration value="NORMAL"/>
 *     <enumeration value="SIMPLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InteriorQuality")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum InteriorQuality {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Luxus
     * 
     */
    LUXURY,

    /**
     * Gehoben
     * 
     */
    SOPHISTICATED,

    /**
     * Normal
     * 
     */
    NORMAL,

    /**
     * Einfach
     * 
     */
    SIMPLE;

    public String value() {
        return name();
    }

    public static InteriorQuality fromValue(String v) {
        return valueOf(v);
    }

}
