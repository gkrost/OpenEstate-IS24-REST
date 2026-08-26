package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * mögliche Bauweisen von Typenhäusern
 * 
 * <p>Java class for HouseTypeConstructionMethodType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HouseTypeConstructionMethodType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNSPECIFIED"/>
 *     <enumeration value="PREFABRICATED"/>
 *     <enumeration value="WOOD_PREFABRICATED"/>
 *     <enumeration value="SOLID"/>
 *     <enumeration value="SOLID_PREFABRICATED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HouseTypeConstructionMethodType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HouseTypeConstructionMethodType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Fertigteilhaus
     * 
     */
    PREFABRICATED,

    /**
     * Fertigteilhaus aus Holz
     * 
     */
    WOOD_PREFABRICATED,

    /**
     * Massivhaus
     * 
     */
    SOLID,

    /**
     * Fertigteilhaus Massiv
     * 
     */
    SOLID_PREFABRICATED;

    public String value() {
        return name();
    }

    public static HouseTypeConstructionMethodType fromValue(String v) {
        return valueOf(v);
    }

}
