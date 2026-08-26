package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for BuildingEnergyRatingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BuildingEnergyRatingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="ENERGY_REQUIRED"/>
 *     <enumeration value="ENERGY_CONSUMPTION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BuildingEnergyRatingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum BuildingEnergyRatingType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Endenergiebedarf
     * 
     */
    ENERGY_REQUIRED,

    /**
     * Energieverbrauchskennwert
     * 
     */
    ENERGY_CONSUMPTION;

    public String value() {
        return name();
    }

    public static BuildingEnergyRatingType fromValue(String v) {
        return valueOf(v);
    }

}
