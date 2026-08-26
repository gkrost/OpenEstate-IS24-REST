package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typenhaus Gebäudeart
 * 
 * <p>Java class for HouseTypeBuildingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HouseTypeBuildingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="BLOCKHOUSE"/>
 *     <enumeration value="BUNGALOW"/>
 *     <enumeration value="SEMI_DETACHED_HOUSE"/>
 *     <enumeration value="ONE_FAMILY_HOUSE"/>
 *     <enumeration value="FAMILY_HOUSE_WITH_LODGER_FLAT"/>
 *     <enumeration value="TUDOR_HOUSE"/>
 *     <enumeration value="WOODEN_HOUSE"/>
 *     <enumeration value="COUNTRY_HOUSE"/>
 *     <enumeration value="APARTMENT_BUILDING"/>
 *     <enumeration value="NON_DETACHED_HOUSE"/>
 *     <enumeration value="CITY_VILLA"/>
 *     <enumeration value="VILLA"/>
 *     <enumeration value="SEMI_DETACHED_HOUSE_PAIR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HouseTypeBuildingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HouseTypeBuildingType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Blockhaus
     * 
     */
    BLOCKHOUSE,

    /**
     * Bungalow
     * 
     */
    BUNGALOW,

    /**
     * Doppelhaushaelfte
     * 
     */
    SEMI_DETACHED_HOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    ONE_FAMILY_HOUSE,

    /**
     * Haus mit Einlegerwohnung
     * 
     */
    FAMILY_HOUSE_WITH_LODGER_FLAT,

    /**
     * Haus im Tudorstil
     * 
     */
    TUDOR_HOUSE,

    /**
     * Holzhaus
     * 
     */
    WOODEN_HOUSE,

    /**
     * Landhaus
     * 
     */
    COUNTRY_HOUSE,

    /**
     * Appartment Gebäude
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Freistehendes Haus
     * 
     */
    NON_DETACHED_HOUSE,

    /**
     * Stadtvilla
     * 
     */
    CITY_VILLA,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Doppelhaus
     * 
     */
    SEMI_DETACHED_HOUSE_PAIR;

    public String value() {
        return name();
    }

    public static HouseTypeBuildingType fromValue(String v) {
        return valueOf(v);
    }

}
