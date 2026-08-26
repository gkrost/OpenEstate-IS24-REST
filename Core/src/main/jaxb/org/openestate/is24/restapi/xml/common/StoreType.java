package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for StoreType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StoreType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SHOWROOM_SPACE"/>
 *     <enumeration value="SHOPPING_CENTRE"/>
 *     <enumeration value="FACTORY_OUTLET"/>
 *     <enumeration value="DEPARTMENT_STORE"/>
 *     <enumeration value="KIOSK"/>
 *     <enumeration value="STORE"/>
 *     <enumeration value="SELF_SERVICE_MARKET"/>
 *     <enumeration value="SALES_AREA"/>
 *     <enumeration value="SALES_HALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StoreType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum StoreType {


    /**
     * Ausstellungsfläche
     * 
     */
    SHOWROOM_SPACE,

    /**
     * Einkaufszentrum
     * 
     */
    SHOPPING_CENTRE,

    /**
     * Factory Outlet
     * 
     */
    FACTORY_OUTLET,

    /**
     * Kaufhaus
     * 
     */
    DEPARTMENT_STORE,

    /**
     * Kiosk
     * 
     */
    KIOSK,

    /**
     * Laden
     * 
     */
    STORE,

    /**
     * SB-Markt
     * 
     */
    SELF_SERVICE_MARKET,

    /**
     * Verkaufsfläche
     * 
     */
    SALES_AREA,

    /**
     * Verkaufshalle
     * 
     */
    SALES_HALL;

    public String value() {
        return name();
    }

    public static StoreType fromValue(String v) {
        return valueOf(v);
    }

}
