package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Erschließungsarten
 * 
 * <p>Java class for SiteDevelopmentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SiteDevelopmentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEVELOPED"/>
 *     <enumeration value="DEVELOPED_PARTIALLY"/>
 *     <enumeration value="NOT_DEVELOPED"/>
 *     <enumeration value="NO_INFORMATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SiteDevelopmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SiteDevelopmentType {


    /**
     * Erschlossen
     * 
     */
    DEVELOPED,

    /**
     * Teilerschlossen
     * 
     */
    DEVELOPED_PARTIALLY,

    /**
     * Unerschlossen
     * 
     */
    NOT_DEVELOPED,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteDevelopmentType fromValue(String v) {
        return valueOf(v);
    }

}
