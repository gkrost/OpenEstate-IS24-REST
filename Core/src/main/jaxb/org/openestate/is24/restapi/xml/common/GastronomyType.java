package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der Arten von Gatronomie, wie z.B. Hotels, Diskotheken oder
 *                 Restaurants
 * 
 * <p>Java class for GastronomyType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="GastronomyType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BAR_LOUNGE"/>
 *     <enumeration value="CAFE"/>
 *     <enumeration value="CLUB_DISCO"/>
 *     <enumeration value="GUESTS_HOUSE"/>
 *     <enumeration value="TAVERN"/>
 *     <enumeration value="HOTEL"/>
 *     <enumeration value="HOTEL_RESIDENCE"/>
 *     <enumeration value="HOTEL_GARNI"/>
 *     <enumeration value="PENSION"/>
 *     <enumeration value="RESTAURANT"/>
 *     <enumeration value="BUNGALOW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "GastronomyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum GastronomyType {


    /**
     * Barbetrieb/Lounge
     * 
     */
    BAR_LOUNGE,

    /**
     * Cafe
     * 
     */
    CAFE,

    /**
     * Club/Diskothek
     * 
     */
    CLUB_DISCO,

    /**
     * Gästehaus
     * 
     */
    GUESTS_HOUSE,

    /**
     * Gaststätte
     * 
     */
    TAVERN,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Hotelanwesen
     * 
     */
    HOTEL_RESIDENCE,

    /**
     * Hotel garni (Ein Hotel, dass nur Frühstück anbietet /Tageshotel)
     * 
     */
    HOTEL_GARNI,

    /**
     * Pension
     * 
     */
    PENSION,

    /**
     * Restaurant
     * 
     */
    RESTAURANT,

    /**
     * Ferienbungalows
     * 
     */
    BUNGALOW;

    public String value() {
        return name();
    }

    public static GastronomyType fromValue(String v) {
        return valueOf(v);
    }

}
