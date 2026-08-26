package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for RealEstateCondition</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RealEstateCondition">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="FIRST_TIME_USE"/>
 *     <enumeration value="FIRST_TIME_USE_AFTER_REFURBISHMENT"/>
 *     <enumeration value="MINT_CONDITION"/>
 *     <enumeration value="REFURBISHED"/>
 *     <enumeration value="MODERNIZED"/>
 *     <enumeration value="FULLY_RENOVATED"/>
 *     <enumeration value="WELL_KEPT"/>
 *     <enumeration value="NEED_OF_RENOVATION"/>
 *     <enumeration value="NEGOTIABLE"/>
 *     <enumeration value="RIPE_FOR_DEMOLITION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RealEstateCondition")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum RealEstateCondition {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erstbezug
     * 
     */
    FIRST_TIME_USE,

    /**
     * Erstbezug nach Sanierung
     * 
     */
    FIRST_TIME_USE_AFTER_REFURBISHMENT,

    /**
     * Neuwertig
     * 
     */
    MINT_CONDITION,

    /**
     * Saniert
     * 
     */
    REFURBISHED,

    /**
     * Modernisiert
     * 
     */
    MODERNIZED,

    /**
     * Vollständig renoviert
     * 
     */
    FULLY_RENOVATED,

    /**
     * Gepflegt
     * 
     */
    WELL_KEPT,

    /**
     * Renovierungsbedürftig
     * 
     */
    NEED_OF_RENOVATION,

    /**
     * Nach Vereinbarung
     * 
     */
    NEGOTIABLE,

    /**
     * Abbruchreif
     * 
     */
    RIPE_FOR_DEMOLITION;

    public String value() {
        return name();
    }

    public static RealEstateCondition fromValue(String v) {
        return valueOf(v);
    }

}
