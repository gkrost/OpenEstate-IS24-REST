package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DEPRECATED benutze EnergySourceEnev2014 Auflistung der wesentlichen
 *                 Energieträger
 * 
 * <p>Java class for FiringType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FiringType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="GEOTHERMAL"/>
 *     <enumeration value="SOLAR_HEATING"/>
 *     <enumeration value="PELLET_HEATING"/>
 *     <enumeration value="GAS"/>
 *     <enumeration value="OIL"/>
 *     <enumeration value="DISTRICT_HEATING"/>
 *     <enumeration value="ELECTRICITY"/>
 *     <enumeration value="COAL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FiringType")
@XmlEnum
@Deprecated
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum FiringType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Erdwärme
     * 
     */
    GEOTHERMAL,

    /**
     * Solarheizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Pelletheizung
     * 
     */
    PELLET_HEATING,

    /**
     * Gas
     * 
     */
    GAS,

    /**
     * Öl
     * 
     */
    OIL,

    /**
     * Fernwärme
     * 
     */
    DISTRICT_HEATING,

    /**
     * Strom
     * 
     */
    ELECTRICITY,

    /**
     * Kohle
     * 
     */
    COAL;

    public String value() {
        return name();
    }

    public static FiringType fromValue(String v) {
        return valueOf(v);
    }

}
