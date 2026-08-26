package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Empfohlene Nutzung Wohnen-Grundstück
 * 
 * <p>Java class for SiteRecommendedUseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SiteRecommendedUseType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     <enumeration value="TWINHOUSE"/>
 *     <enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     <enumeration value="GARAGE"/>
 *     <enumeration value="GARDEN"/>
 *     <enumeration value="NO_DEVELOPMENT"/>
 *     <enumeration value="APARTMENT_BUILDING"/>
 *     <enumeration value="ORCHARD"/>
 *     <enumeration value="TERRACE_HOUSE"/>
 *     <enumeration value="PARKING_SPACE"/>
 *     <enumeration value="VILLA"/>
 *     <enumeration value="FORREST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SiteRecommendedUseType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Bauerwartungsland
     * 
     */
    FUTURE_DEVELOPMENT_LAND,

    /**
     * Doppelhaushälfte
     * 
     */
    TWINHOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Garten
     * 
     */
    GARDEN,

    /**
     * Keine Bebauung
     * 
     */
    NO_DEVELOPMENT,

    /**
     * Mehrfamilienhaus
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Obstpflanzung
     * 
     */
    ORCHARD,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Stellplätze
     * 
     */
    PARKING_SPACE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Wald
     * 
     */
    FORREST;

    public String value() {
        return name();
    }

    public static SiteRecommendedUseType fromValue(String v) {
        return valueOf(v);
    }

}
