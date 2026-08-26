package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Haustiere erlaubt Typ
 * 
 * <p>Java class for PetsAllowedType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PetsAllowedType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="NEGOTIABLE"/>
 *     <enumeration value="YES"/>
 *     <enumeration value="NO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PetsAllowedType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PetsAllowedType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Nach Vereinbarung
     * 
     */
    NEGOTIABLE,

    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO;

    public String value() {
        return name();
    }

    public static PetsAllowedType fromValue(String v) {
        return valueOf(v);
    }

}
