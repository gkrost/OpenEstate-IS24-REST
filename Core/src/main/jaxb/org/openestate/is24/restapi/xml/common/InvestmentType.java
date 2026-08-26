package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der Arten von Anlageimmobilien-Objekte wie z.B.
 *                 Einfamilienhäuser, Lager oder Wohnanlagen
 * 
 * <p>Java class for InvestmentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="InvestmentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     <enumeration value="MULTI_FAMILY_HOUSE"/>
 *     <enumeration value="FREEHOLD_FLAT"/>
 *     <enumeration value="SHOPPING_CENTRE"/>
 *     <enumeration value="RESTAURANT"/>
 *     <enumeration value="HOTEL"/>
 *     <enumeration value="LEISURE_FACILITY"/>
 *     <enumeration value="COMMERCIAL_UNIT"/>
 *     <enumeration value="OFFICE_BUILDING"/>
 *     <enumeration value="COMMERCIAL_BUILDING"/>
 *     <enumeration value="COMMERCIAL_PROPERTY"/>
 *     <enumeration value="HALL_STORAGE"/>
 *     <enumeration value="INDUSTRIAL_PROPERTY"/>
 *     <enumeration value="SHOP_SALES_FLOOR"/>
 *     <enumeration value="SERVICE_CENTRE"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="SUPERMARKET"/>
 *     <enumeration value="LIVING_BUSINESS_HOUSE"/>
 *     <enumeration value="HOUSING_ESTATE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum InvestmentType {


    /**
     * Einfamilienhaus
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Mehrfamilienhaus
     * 
     */
    MULTI_FAMILY_HOUSE,

    /**
     * Eigentumswohnung
     * 
     */
    FREEHOLD_FLAT,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Gaststätte
     * 
     */
    RESTAURANT,

    /**
     * Hotel
     * 
     */
    HOTEL,

    /**
     * Freizeitanlage
     * 
     */
    LEISURE_FACILITY,

    /**
     * Gewerbeeinheit
     * 
     */
    COMMERCIAL_UNIT,

    /**
     * Bürogebäude
     * 
     */
    OFFICE_BUILDING,

    /**
     * Geschäftshaus
     * 
     */
    COMMERCIAL_BUILDING,

    /**
     * Gewerbeanwesen
     * 
     */
    COMMERCIAL_PROPERTY,

    /**
     * Halle/Lager
     * 
     */
    HALL_STORAGE,

    /**
     * Industrieanwesen
     * 
     */
    INDUSTRIAL_PROPERTY,

    /**
     * Laden/Verkaufsfläche
     * 
     */
    SHOP_SALES_FLOOR,

    /**
     * Servicecenter
     * 
     */
    SERVICE_CENTRE,

    /**
     * Sonstige
     * 
     */
    OTHER,

    /**
     * Supermarkt
     * 
     */
    SUPERMARKET,

    /**
     * Wohn-/ Geschäftshaus
     * 
     */
    LIVING_BUSINESS_HOUSE,

    /**
     * Wohnanlage
     * 
     */
    HOUSING_ESTATE;

    public String value() {
        return name();
    }

    public static InvestmentType fromValue(String v) {
        return valueOf(v);
    }

}
