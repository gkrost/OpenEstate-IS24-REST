package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der versorgten
 *                 Pflegestufen einer Altenpflegeeinrichtung.
 * 
 * <p>Java class for CareLevel</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CareLevel">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARE_LEVEL_1"/>
 *     <enumeration value="CARE_LEVEL_2"/>
 *     <enumeration value="CARE_LEVEL_3"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CareLevel")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CareLevel {


    /**
     * Pflegestufe 1
     * 
     */
    CARE_LEVEL_1,

    /**
     * Pflegestufe 2
     * 
     */
    CARE_LEVEL_2,

    /**
     * Pflegestufe 3
     * 
     */
    CARE_LEVEL_3;

    public String value() {
        return name();
    }

    public static CareLevel fromValue(String v) {
        return valueOf(v);
    }

}
