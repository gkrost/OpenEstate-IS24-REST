package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der Arten von Spezialgewerbe wie z.B. Bauernhof, Werkstatt
 *                 oder Gewerbepark
 * 
 * <p>Java class for SpecialPurposeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SpecialPurposeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RESIDENCE"/>
 *     <enumeration value="FARM"/>
 *     <enumeration value="HORSE_FARM"/>
 *     <enumeration value="VINEYARD"/>
 *     <enumeration value="REPAIR_SHOP"/>
 *     <enumeration value="LEISURE_FACILITY"/>
 *     <enumeration value="INDUSTRIAL_AREA"/>
 *     <enumeration value="SPECIAL_ESTATE"/>
 *     <enumeration value="COMMERCIAL_CENTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SpecialPurposeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SpecialPurposeType {


    /**
     * Anwesen
     * 
     */
    RESIDENCE,

    /**
     * Bauernhof
     * 
     */
    FARM,

    /**
     * Reiterhof
     * 
     */
    HORSE_FARM,

    /**
     * Weingut
     * 
     */
    VINEYARD,

    /**
     * Werkstatt
     * 
     */
    REPAIR_SHOP,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbefläche
     * 
     */
    INDUSTRIAL_AREA,

    /**
     * Spezialobjekt
     * 
     */
    SPECIAL_ESTATE,

    /**
     * Gewerbepark
     * 
     */
    COMMERCIAL_CENTRE;

    public String value() {
        return name();
    }

    public static SpecialPurposeType fromValue(String v) {
        return valueOf(v);
    }

}
