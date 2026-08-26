package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Intervall um den Preis zu zahlen (Tag, Monat, Jahr, einmalig)
 * 
 * <p>Java class for PriceIntervalType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PriceIntervalType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAY"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MONTH"/>
 *     <enumeration value="YEAR"/>
 *     <enumeration value="ONE_TIME_CHARGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceIntervalType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PriceIntervalType {


    /**
     * Zahlung pro Tag
     * 
     */
    DAY,

    /**
     * Zahlung pro Woche
     * 
     */
    WEEK,

    /**
     * Zahlung pro Monat
     * 
     */
    MONTH,

    /**
     * Zahlung pro Jahr
     * 
     */
    YEAR,

    /**
     * Einmalzahlung
     * 
     */
    ONE_TIME_CHARGE;

    public String value() {
        return name();
    }

    public static PriceIntervalType fromValue(String v) {
        return valueOf(v);
    }

}
