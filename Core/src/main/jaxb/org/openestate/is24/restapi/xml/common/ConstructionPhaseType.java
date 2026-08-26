package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der verfuegbaren Konstruktionsphasen
 * 
 * <p>Java class for ConstructionPhaseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ConstructionPhaseType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROJECTED"/>
 *     <enumeration value="UNDER_CONSTRUCTION"/>
 *     <enumeration value="COMPLETED"/>
 *     <enumeration value="NO_INFORMATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConstructionPhaseType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ConstructionPhaseType {


    /**
     * Haus in Planung
     * 
     */
    PROJECTED,

    /**
     * Haus in Bau
     * 
     */
    UNDER_CONSTRUCTION,

    /**
     * Haus fertig gestellt
     * 
     */
    COMPLETED,

    /**
     * keine genaue Angabe zur Bauphase
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static ConstructionPhaseType fromValue(String v) {
        return valueOf(v);
    }

}
