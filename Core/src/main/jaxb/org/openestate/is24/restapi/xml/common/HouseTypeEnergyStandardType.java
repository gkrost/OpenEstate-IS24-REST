package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typenhaus Energiestandard
 * 
 * <p>Java class for HouseTypeEnergyStandardType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HouseTypeEnergyStandardType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNSPECIFIED"/>
 *     <enumeration value="LOW_ENERGY_40"/>
 *     <enumeration value="LOW_ENERGY_60"/>
 *     <enumeration value="PASSIVE_HOUSE"/>
 *     <enumeration value="ENERGY_EFFICIENT_40"/>
 *     <enumeration value="ENERGY_EFFICIENT_55"/>
 *     <enumeration value="ENERGY_EFFICIENT_70"/>
 *     <enumeration value="LOW_ENERGY_HOUSE"/>
 *     <enumeration value="NULL_ENERGY_HOUSE"/>
 *     <enumeration value="PLUS_ENERGY_HOUSE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HouseTypeEnergyStandardType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HouseTypeEnergyStandardType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Niedrigenergiehaus KfW 40
     * 
     */
    LOW_ENERGY_40,

    /**
     * Niedriegenergiehaus KfW60
     * 
     */
    LOW_ENERGY_60,

    /**
     * Passivhaus
     * 
     */
    PASSIVE_HOUSE,

    /**
     * KfW-Effizienzhaus 40
     * 
     */
    ENERGY_EFFICIENT_40,

    /**
     * KfW-Effizienzhaus 55
     * 
     */
    ENERGY_EFFICIENT_55,

    /**
     * KfW-Effizienzhaus 70
     * 
     */
    ENERGY_EFFICIENT_70,

    /**
     * Niedrigenergiehaus
     * 
     */
    LOW_ENERGY_HOUSE,

    /**
     * Nullenergiehaus
     * 
     */
    NULL_ENERGY_HOUSE,

    /**
     * Plusenergiehaus
     * 
     */
    PLUS_ENERGY_HOUSE;

    public String value() {
        return name();
    }

    public static HouseTypeEnergyStandardType fromValue(String v) {
        return valueOf(v);
    }

}
