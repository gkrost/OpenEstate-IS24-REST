package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typen für Preise.
 * 
 * <p>Java class for PriceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PriceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RENT_PER_MONTH"/>
 *     <enumeration value="RENT_PER_SQM"/>
 *     <enumeration value="PURCHASE_PRICE"/>
 *     <enumeration value="LEASE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PriceType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PriceType {


    /**
     * Miete pro Monat
     * 
     */
    RENT_PER_MONTH,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

    /**
     * Kaufpreis
     * 
     */
    PURCHASE_PRICE,

    /**
     * Pacht
     * 
     */
    LEASE;

    public String value() {
        return name();
    }

    public static PriceType fromValue(String v) {
        return valueOf(v);
    }

}
