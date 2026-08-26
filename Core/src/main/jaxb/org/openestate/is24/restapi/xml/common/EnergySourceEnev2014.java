package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der wesentlichen Energieträger für Energiezertifikat
 * 
 * <p>Java class for EnergySourceEnev2014</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EnergySourceEnev2014">
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
 *     <enumeration value="ACID_GAS"/>
 *     <enumeration value="SOUR_GAS"/>
 *     <enumeration value="LIQUID_GAS"/>
 *     <enumeration value="STEAM_DISTRICT_HEATING"/>
 *     <enumeration value="WOOD"/>
 *     <enumeration value="WOOD_CHIPS"/>
 *     <enumeration value="COAL_COKE"/>
 *     <enumeration value="LOCAL_HEATING"/>
 *     <enumeration value="HEAT_SUPPLY"/>
 *     <enumeration value="BIO_ENERGY"/>
 *     <enumeration value="WIND_ENERGY"/>
 *     <enumeration value="HYDRO_ENERGY"/>
 *     <enumeration value="ENVIRONMENTAL_THERMAL_ENERGY"/>
 *     <enumeration value="COMBINED_HEAT_AND_POWER_FOSSIL_FUELS"/>
 *     <enumeration value="COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY"/>
 *     <enumeration value="COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY"/>
 *     <enumeration value="COMBINED_HEAT_AND_POWER_BIO_ENERGY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergySourceEnev2014")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum EnergySourceEnev2014 {


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
    COAL,

    /**
     * Erdgas leicht
     * 
     */
    ACID_GAS,

    /**
     * Erdgas schwer
     * 
     */
    SOUR_GAS,

    /**
     * Flüssiggas
     * 
     */
    LIQUID_GAS,

    /**
     * Fernwärme Dampf
     * 
     */
    STEAM_DISTRICT_HEATING,

    /**
     * Holz
     * 
     */
    WOOD,

    /**
     * Holz-Hackschnitzel
     * 
     */
    WOOD_CHIPS,

    /**
     * Kohle/Koks
     * 
     */
    COAL_COKE,

    /**
     * Nahwärme
     * 
     */
    LOCAL_HEATING,

    /**
     * Wärmelieferung
     * 
     */
    HEAT_SUPPLY,

    /**
     * BIO Energie
     * 
     */
    BIO_ENERGY,

    /**
     * Windenergie
     * 
     */
    WIND_ENERGY,

    /**
     * Wasserenergie
     * 
     */
    HYDRO_ENERGY,

    /**
     * Umweltwärme
     * 
     */
    ENVIRONMENTAL_THERMAL_ENERGY,

    /**
     * KWK fossil
     * 
     */
    COMBINED_HEAT_AND_POWER_FOSSIL_FUELS,

    /**
     * KWK erneuerbar
     * 
     */
    COMBINED_HEAT_AND_POWER_RENEWABLE_ENERGY,

    /**
     * KWK regenerativ
     * 
     */
    COMBINED_HEAT_AND_POWER_REGENERATIVE_ENERGY,

    /**
     * KWK bio
     * 
     */
    COMBINED_HEAT_AND_POWER_BIO_ENERGY;

    public String value() {
        return name();
    }

    public static EnergySourceEnev2014 fromValue(String v) {
        return valueOf(v);
    }

}
