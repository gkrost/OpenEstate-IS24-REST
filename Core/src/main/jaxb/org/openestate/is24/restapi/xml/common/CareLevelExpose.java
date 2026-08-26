package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der versorgten
 *                 Pflegestufen einer Altenpflegeeinrichtung für Exposes.
 * 
 * <p>Java class for CareLevelExpose</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CareLevelExpose">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CARE_LEVEL_1"/>
 *     <enumeration value="CARE_LEVEL_2"/>
 *     <enumeration value="CARE_LEVEL_3"/>
 *     <enumeration value="CARE_LEVEL_1_AND_2"/>
 *     <enumeration value="CARE_LEVEL_2_AND_3"/>
 *     <enumeration value="ALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CareLevelExpose")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CareLevelExpose {


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
    CARE_LEVEL_3,

    /**
     * Pflegestufen 1 und 2
     * 
     */
    CARE_LEVEL_1_AND_2,

    /**
     * Pflegestufen 2 und 3
     * 
     */
    CARE_LEVEL_2_AND_3,

    /**
     * Alle Pflegestufen
     * 
     */
    ALL;

    public String value() {
        return name();
    }

    public static CareLevelExpose fromValue(String v) {
        return valueOf(v);
    }

}
