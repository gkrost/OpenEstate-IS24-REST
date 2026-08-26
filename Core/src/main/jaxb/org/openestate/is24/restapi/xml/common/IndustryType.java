package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for IndustryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="IndustryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHOWROOM_SPACE"/>
 *     <enumeration value="HALL"/>
 *     <enumeration value="HIGH_LACK_STORAGE"/>
 *     <enumeration value="INDUSTRY_HALL"/>
 *     <enumeration value="INDUSTRY_HALL_WITH_OPEN_AREA"/>
 *     <enumeration value="COLD_STORAGE"/>
 *     <enumeration value="MULTIDECK_CABINET_STORAGE"/>
 *     <enumeration value="STORAGE_WITH_OPEN_AREA"/>
 *     <enumeration value="STORAGE_AREA"/>
 *     <enumeration value="STORAGE_HALL"/>
 *     <enumeration value="SERVICE_AREA"/>
 *     <enumeration value="SHIPPING_STORAGE"/>
 *     <enumeration value="REPAIR_SHOP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IndustryType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum IndustryType {


    /**
     * Ausstellungsfläche
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Halle
     * 
     */
    HALL,

    /**
     * Hochregallager
     * 
     */
    HIGH_LACK_STORAGE,

    /**
     * Industriehalle
     * 
     */
    INDUSTRY_HALL,

    /**
     * Industriehalle mit Freifläche
     * 
     */
    INDUSTRY_HALL_WITH_OPEN_AREA,

    /**
     * Kühlhaus
     * 
     */
    COLD_STORAGE,

    /**
     * Kühlregallager
     * 
     */
    MULTIDECK_CABINET_STORAGE,

    /**
     * Lager mit Freifläche
     * 
     */
    STORAGE_WITH_OPEN_AREA,

    /**
     * Lagerfläche
     * 
     */
    STORAGE_AREA,

    /**
     * Lagerhalle
     * 
     */
    STORAGE_HALL,

    /**
     * Servicefläche
     * 
     */
    SERVICE_AREA,

    /**
     * Speditionslager
     * 
     */
    SHIPPING_STORAGE,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP;

    public String value() {
        return name();
    }

    public static IndustryType fromValue(String v) {
        return valueOf(v);
    }

}
