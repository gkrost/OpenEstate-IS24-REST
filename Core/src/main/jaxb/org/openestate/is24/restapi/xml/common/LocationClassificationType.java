package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LocationClassificationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LocationClassificationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="CLASSIFICATION_A"/>
 *     <enumeration value="CLASSIFICATION_B"/>
 *     <enumeration value="SHOPPING_CENTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LocationClassificationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum LocationClassificationType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * A-Lage
     * 
     */
    CLASSIFICATION_A,

    /**
     * B-Lage
     * 
     */
    CLASSIFICATION_B,

    /**
     * im Schoppingcenter
     * 
     */
    SHOPPING_CENTRE;

    public String value() {
        return name();
    }

    public static LocationClassificationType fromValue(String v) {
        return valueOf(v);
    }

}
