package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SupplyType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SupplyType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="DIRECT_APPROACH"/>
 *     <enumeration value="NO_DIRECT_APPROACH"/>
 *     <enumeration value="CAR_APPROACH"/>
 *     <enumeration value="APPROACH_TO_THE_FRONT"/>
 *     <enumeration value="APPROACH_TO_THE_BACK"/>
 *     <enumeration value="FULL_TIME"/>
 *     <enumeration value="FORENOON"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SupplyType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SupplyType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Direkter Zugang
     * 
     */
    DIRECT_APPROACH,

    /**
     * Keine direkte Anfahrt
     * 
     */
    NO_DIRECT_APPROACH,

    /**
     * PKW-Zufahrt
     * 
     */
    CAR_APPROACH,

    /**
     * Anfahrt von vorne
     * 
     */
    APPROACH_TO_THE_FRONT,

    /**
     * Anfahrt von hinten
     * 
     */
    APPROACH_TO_THE_BACK,

    /**
     * Ganztägig
     * 
     */
    FULL_TIME,

    /**
     * Vormittags
     * 
     */
    FORENOON;

    public String value() {
        return name();
    }

    public static SupplyType fromValue(String v) {
        return valueOf(v);
    }

}
