package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung für Pflichtfeld oder optionales Feld
 * 
 * <p>Java class for MandatoryOptionalType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MandatoryOptionalType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MANDATORY"/>
 *     <enumeration value="OPTIONAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MandatoryOptionalType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum MandatoryOptionalType {


    /**
     * Pflichtfeld
     * 
     */
    MANDATORY,

    /**
     * optionales Feld
     * 
     */
    OPTIONAL;

    public String value() {
        return name();
    }

    public static MandatoryOptionalType fromValue(String v) {
        return valueOf(v);
    }

}
