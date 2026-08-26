package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AirConditioningType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AirConditioningType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="YES"/>
 *     <enumeration value="NO"/>
 *     <enumeration value="BY_APPOINTMENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AirConditioningType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum AirConditioningType {


    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Ja
     * 
     */
    YES,

    /**
     * Nein
     * 
     */
    NO,

    /**
     * Nach Vereinbarung
     * 
     */
    BY_APPOINTMENT;

    public String value() {
        return name();
    }

    public static AirConditioningType fromValue(String v) {
        return valueOf(v);
    }

}
