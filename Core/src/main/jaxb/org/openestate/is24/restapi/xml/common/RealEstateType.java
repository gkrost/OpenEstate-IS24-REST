package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der is24 Immobilientypen.
 * 
 * <p>Java class for RealEstateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RealEstateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="APARTMENT_RENT"/>
 *     <enumeration value="APARTMENT_BUY"/>
 *     <enumeration value="HOUSE_RENT"/>
 *     <enumeration value="HOUSE_BUY"/>
 *     <enumeration value="GARAGE_RENT"/>
 *     <enumeration value="GARAGE_BUY"/>
 *     <enumeration value="LIVING_RENT_SITE"/>
 *     <enumeration value="LIVING_BUY_SITE"/>
 *     <enumeration value="TRADE_SITE"/>
 *     <enumeration value="HOUSE_TYPE"/>
 *     <enumeration value="FLAT_SHARE_ROOM"/>
 *     <enumeration value="SENIOR_CARE"/>
 *     <enumeration value="ASSISTED_LIVING"/>
 *     <enumeration value="OFFICE"/>
 *     <enumeration value="INDUSTRY"/>
 *     <enumeration value="STORE"/>
 *     <enumeration value="GASTRONOMY"/>
 *     <enumeration value="SPECIAL_PURPOSE"/>
 *     <enumeration value="INVESTMENT"/>
 *     <enumeration value="COMPULSORY_AUCTION"/>
 *     <enumeration value="SHORT_TERM_ACCOMMODATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RealEstateType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum RealEstateType {


    /**
     * Mietwohnung
     * 
     */
    APARTMENT_RENT,

    /**
     * Wohnung zum Kauf
     * 
     */
    APARTMENT_BUY,

    /**
     * Haus zur Miete
     * 
     */
    HOUSE_RENT,

    /**
     * Haus zum Kauf
     * 
     */
    HOUSE_BUY,

    /**
     * Garage zur Miete
     * 
     */
    GARAGE_RENT,

    /**
     * Garage zum Kauf
     * 
     */
    GARAGE_BUY,

    /**
     * Wohngrundstück zur Miete
     * 
     */
    LIVING_RENT_SITE,

    /**
     * Wohngrundstück zum Kauf
     * 
     */
    LIVING_BUY_SITE,

    /**
     * Gewerbegrundstück
     * 
     */
    TRADE_SITE,

    /**
     * Typenhaus
     * 
     */
    HOUSE_TYPE,

    /**
     * WG-Zimmer
     * 
     */
    FLAT_SHARE_ROOM,

    /**
     * Altenpflege
     * 
     */
    SENIOR_CARE,

    /**
     * Seniorenwohnen
     * 
     */
    ASSISTED_LIVING,

    /**
     * Büro und Praxis
     * 
     */
    OFFICE,

    /**
     * Halle und Produktion
     * 
     */
    INDUSTRY,

    /**
     * Einzelhandel
     * 
     */
    STORE,

    /**
     * Gastronomie und Hotel
     * 
     */
    GASTRONOMY,

    /**
     * Spezialgewerbe
     * 
     */
    SPECIAL_PURPOSE,

    /**
     * Anlageimmobilie
     * 
     */
    INVESTMENT,

    /**
     * Zwangsversteigerung
     * 
     */
    COMPULSORY_AUCTION,

    /**
     * Wohnen auf Zeit (WAZ)
     * 
     */
    SHORT_TERM_ACCOMMODATION;

    public String value() {
        return name();
    }

    public static RealEstateType fromValue(String v) {
        return valueOf(v);
    }

}
