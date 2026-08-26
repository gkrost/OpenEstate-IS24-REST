package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for OfficeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OfficeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LOFT"/>
 *     <enumeration value="STUDIO"/>
 *     <enumeration value="OFFICE"/>
 *     <enumeration value="OFFICE_FLOOR"/>
 *     <enumeration value="OFFICE_BUILDING"/>
 *     <enumeration value="OFFICE_CENTRE"/>
 *     <enumeration value="OFFICE_STORAGE_BUILDING"/>
 *     <enumeration value="SURGERY"/>
 *     <enumeration value="SURGERY_FLOOR"/>
 *     <enumeration value="SURGERY_BUILDING"/>
 *     <enumeration value="COMMERCIAL_CENTRE"/>
 *     <enumeration value="LIVING_AND_COMMERCIAL_BUILDING"/>
 *     <enumeration value="OFFICE_AND_COMMERCIAL_BUILDING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OfficeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum OfficeType {


    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Atelier
     * 
     */
    STUDIO,

    /**
     * Büro
     * 
     */
    OFFICE,

    /**
     * Büroetage
     * 
     */
    OFFICE_FLOOR,

    /**
     * Bürohaus
     * 
     */
    OFFICE_BUILDING,

    /**
     * Bürozentrum
     * 
     */
    OFFICE_CENTRE,

    /**
     * Büro-/ Lagergebäude
     * 
     */
    OFFICE_STORAGE_BUILDING,

    /**
     * Praxis
     * 
     */
    SURGERY,

    /**
     * Praxisetage
     * 
     */
    SURGERY_FLOOR,

    /**
     * Praxishaus
     * 
     */
    SURGERY_BUILDING,

    /**
     * Gewerbezentrum
     * 
     */
    COMMERCIAL_CENTRE,

    /**
     * Wohn- und Geschäftsgebäude
     * 
     */
    LIVING_AND_COMMERCIAL_BUILDING,

    /**
     * Büro- und Geschäftsgebäude
     * 
     */
    OFFICE_AND_COMMERCIAL_BUILDING;

    public String value() {
        return name();
    }

    public static OfficeType fromValue(String v) {
        return valueOf(v);
    }

}
