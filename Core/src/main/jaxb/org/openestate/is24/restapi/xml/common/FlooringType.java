package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for FlooringType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FlooringType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="CONCRETE"/>
 *     <enumeration value="EPOXY_RESIN"/>
 *     <enumeration value="TILES"/>
 *     <enumeration value="PLANKS"/>
 *     <enumeration value="LAMINATE"/>
 *     <enumeration value="PARQUET"/>
 *     <enumeration value="PVC"/>
 *     <enumeration value="CARPET"/>
 *     <enumeration value="ANTISTATIC_FLOOR"/>
 *     <enumeration value="OFFICE_CARPET"/>
 *     <enumeration value="STONE"/>
 *     <enumeration value="CUSTOMIZABLE"/>
 *     <enumeration value="WITHOUT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlooringType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum FlooringType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Beton
     * 
     */
    CONCRETE,

    /**
     * Epoxydharzboden
     * 
     */
    EPOXY_RESIN,

    /**
     * Fliesen
     * 
     */
    TILES,

    /**
     * Dielen
     * 
     */
    PLANKS,

    /**
     * Laminat
     * 
     */
    LAMINATE,

    /**
     * Parkett
     * 
     */
    PARQUET,

    /**
     * PVC
     * 
     */
    PVC,

    /**
     * Teppichboden
     * 
     */
    CARPET,

    /**
     * antistatischer Teppichboden
     * 
     */
    ANTISTATIC_FLOOR,

    /**
     * stuhlrollenfeste Teppichfliesen
     * 
     */
    OFFICE_CARPET,

    /**
     * Stein
     * 
     */
    STONE,

    /**
     * nach Mieterwunsch
     * 
     */
    CUSTOMIZABLE,

    /**
     * ohne Bodenbelag
     * 
     */
    WITHOUT;

    public String value() {
        return name();
    }

    public static FlooringType fromValue(String v) {
        return valueOf(v);
    }

}
