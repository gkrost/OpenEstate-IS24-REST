package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Empfohlene Nutzung Gewerbegrundstück
 * 
 * <p>Java class for SiteRecommendedUseForTradeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SiteRecommendedUseForTradeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="FARMLAND"/>
 *     <enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     <enumeration value="MOORAGE"/>
 *     <enumeration value="OFFICE"/>
 *     <enumeration value="CAMPING"/>
 *     <enumeration value="BIG_STORE"/>
 *     <enumeration value="LITTLE_STORE"/>
 *     <enumeration value="GARAGE"/>
 *     <enumeration value="GARDEN"/>
 *     <enumeration value="GASTRONOMY"/>
 *     <enumeration value="BUSINESS"/>
 *     <enumeration value="HOTEL"/>
 *     <enumeration value="INDUSTRY"/>
 *     <enumeration value="NO_DEVELOPMENT"/>
 *     <enumeration value="SMALL_BUSINESS"/>
 *     <enumeration value="STOCK"/>
 *     <enumeration value="ORCHARD"/>
 *     <enumeration value="CAR_PARK"/>
 *     <enumeration value="PRODUCTION"/>
 *     <enumeration value="PARKING_SPACE"/>
 *     <enumeration value="FORREST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseForTradeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SiteRecommendedUseForTradeType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Ackerland
     * 
     */
    FARMLAND,

    /**
     * Bauerwartungsland
     * 
     */
    FUTURE_DEVELOPMENT_LAND,

    /**
     * Bootsstand
     * 
     */
    MOORAGE,

    /**
     * Büro
     * 
     */
    OFFICE,

    /**
     * Camping
     * 
     */
    CAMPING,

    /**
     * Einzelhandel - groß
     * 
     */
    BIG_STORE,

    /**
     * Einzelhandel - klein
     * 
     */
    LITTLE_STORE,

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
     * Gastronomie
     * 
     */
    GASTRONOMY,

    /**
     * Gewerbe
     * 
     */
    BUSINESS,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Industrie
     * 
     */
    INDUSTRY,

    /**
     * Keine Bebauung
     * 
     */
    NO_DEVELOPMENT,

    /**
     * Kleingewerbe
     * 
     */
    SMALL_BUSINESS,

    /**
     * Lager
     * 
     */
    STOCK,

    /**
     * Obstpflanzung
     * 
     */
    ORCHARD,

    /**
     * Parkhaus
     * 
     */
    CAR_PARK,

    /**
     * Produktion
     * 
     */
    PRODUCTION,

    /**
     * Stellplätze
     * 
     */
    PARKING_SPACE,

    /**
     * Wald
     * 
     */
    FORREST;

    public String value() {
        return name();
    }

    public static SiteRecommendedUseForTradeType fromValue(String v) {
        return valueOf(v);
    }

}
