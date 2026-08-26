package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der verfügbaren Heizungsarten für Energiezertifikat
 * 
 * <p>Java class for HeatingTypeEnev2014</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HeatingTypeEnev2014">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="SELF_CONTAINED_CENTRAL_HEATING"/>
 *     <enumeration value="STOVE_HEATING"/>
 *     <enumeration value="CENTRAL_HEATING"/>
 *     <enumeration value="COMBINED_HEAT_AND_POWER_PLANT"/>
 *     <enumeration value="ELECTRIC_HEATING"/>
 *     <enumeration value="DISTRICT_HEATING"/>
 *     <enumeration value="FLOOR_HEATING"/>
 *     <enumeration value="GAS_HEATING"/>
 *     <enumeration value="WOOD_PELLET_HEATING"/>
 *     <enumeration value="NIGHT_STORAGE_HEATER"/>
 *     <enumeration value="OIL_HEATING"/>
 *     <enumeration value="SOLAR_HEATING"/>
 *     <enumeration value="HEAT_PUMP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HeatingTypeEnev2014")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HeatingTypeEnev2014 {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Etagenheizung
     * 
     */
    SELF_CONTAINED_CENTRAL_HEATING,

    /**
     * Ofenheizung
     * 
     */
    STOVE_HEATING,

    /**
     * Zentralheizung
     * 
     */
    CENTRAL_HEATING,

    /**
     * Blockheizkraftwerk
     * 
     */
    COMBINED_HEAT_AND_POWER_PLANT,

    /**
     * Elektro-Heizung
     * 
     */
    ELECTRIC_HEATING,

    /**
     * Fernwärmedampf
     * 
     */
    DISTRICT_HEATING,

    /**
     * Fußbodenheizung
     * 
     */
    FLOOR_HEATING,

    /**
     * Gas-Heizung
     * 
     */
    GAS_HEATING,

    /**
     * Holz-Pelletheizung
     * 
     */
    WOOD_PELLET_HEATING,

    /**
     * Nachtspeicherofen
     * 
     */
    NIGHT_STORAGE_HEATER,

    /**
     * Ölheizung
     * 
     */
    OIL_HEATING,

    /**
     * Solar-Heizung
     * 
     */
    SOLAR_HEATING,

    /**
     * Wärmepumpe
     * 
     */
    HEAT_PUMP;

    public String value() {
        return name();
    }

    public static HeatingTypeEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
