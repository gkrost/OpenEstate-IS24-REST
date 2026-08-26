package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Anredetyp
 * 
 * <p>Java class for SalutationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SalutationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEMALE"/>
 *     <enumeration value="MALE"/>
 *     <enumeration value="COMPANY"/>
 *     <enumeration value="NO_SALUTATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SalutationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SalutationType {


    /**
     * weibliche Anrede
     * 
     */
    FEMALE,

    /**
     * männnliche Anrede
     * 
     */
    MALE,

    /**
     * Anrede für Firmen
     * 
     */
    COMPANY,

    /**
     * Keine besondere Anrede.
     * 
     */
    NO_SALUTATION;

    public String value() {
        return name();
    }

    public static SalutationType fromValue(String v) {
        return valueOf(v);
    }

}
