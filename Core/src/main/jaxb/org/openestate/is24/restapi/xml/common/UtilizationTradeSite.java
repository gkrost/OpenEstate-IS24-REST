package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Nutzungsart
 * 
 * <p>Java class for UtilizationTradeSite</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="UtilizationTradeSite">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LEISURE"/>
 *     <enumeration value="AGRICULTURE_FORESTRY"/>
 *     <enumeration value="TRADE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "UtilizationTradeSite")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum UtilizationTradeSite {


    /**
     * Freizeit
     * 
     */
    LEISURE,

    /**
     * Land- / Forstwirtschaft
     * 
     */
    AGRICULTURE_FORESTRY,

    /**
     * Gewerbe
     * 
     */
    TRADE;

    public String value() {
        return name();
    }

    public static UtilizationTradeSite fromValue(String v) {
        return valueOf(v);
    }

}
