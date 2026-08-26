package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CompulsoryAuctionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CompulsoryAuctionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FREEHOLD_FLAT"/>
 *     <enumeration value="FAMILY_HOUSE"/>
 *     <enumeration value="BUSINESS_AND_YIELD"/>
 *     <enumeration value="LOT"/>
 *     <enumeration value="GARAGE_AND_OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CompulsoryAuctionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CompulsoryAuctionType {


    /**
     * Eigentumswohnungen
     * 
     */
    FREEHOLD_FLAT,

    /**
     *  1+2 Familienhäuser
     * 
     */
    FAMILY_HOUSE,

    /**
     * Gewerbe + Rendite
     * 
     */
    BUSINESS_AND_YIELD,

    /**
     * Grundstücke
     * 
     */
    LOT,

    /**
     * Garagen + Sonstiges
     * 
     */
    GARAGE_AND_OTHER;

    public String value() {
        return name();
    }

    public static CompulsoryAuctionType fromValue(String v) {
        return valueOf(v);
    }

}
