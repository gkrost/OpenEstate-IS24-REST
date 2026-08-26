package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der verfuegbaren Gebäudearten
 * 
 * <p>Java class for BuildingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BuildingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     <enumeration value="MID_TERRACE_HOUSE"/>
 *     <enumeration value="END_TERRACE_HOUSE"/>
 *     <enumeration value="MULTI_FAMILY_HOUSE"/>
 *     <enumeration value="BUNGALOW"/>
 *     <enumeration value="FARMHOUSE"/>
 *     <enumeration value="SEMIDETACHED_HOUSE"/>
 *     <enumeration value="VILLA"/>
 *     <enumeration value="CASTLE_MANOR_HOUSE"/>
 *     <enumeration value="SPECIAL_REAL_ESTATE"/>
 *     <enumeration value="TERRACE_HOUSE"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BuildingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum BuildingType {


    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     * 
     */
    @Deprecated
    NO_INFORMATION,

    /**
     * Einfamilienhaus (freistehend)
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Reihenmittelhaus
     * 
     */
    MID_TERRACE_HOUSE,

    /**
     * Reiheneckhaus
     * 
     */
    END_TERRACE_HOUSE,

    /**
     * Mehrfamilienhaus
     * 
     */
    MULTI_FAMILY_HOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Bauernhaus
     * 
     */
    FARMHOUSE,

    /**
     * Doppelhaushälfte
     * 
     */
    SEMIDETACHED_HOUSE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Burg/Schloss
     * 
     */
    CASTLE_MANOR_HOUSE,

    /**
     * Besondere Immobilie
     * 
     */
    SPECIAL_REAL_ESTATE,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Wohnimmobilie (sonstige)
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static BuildingType fromValue(String v) {
        return valueOf(v);
    }

}
