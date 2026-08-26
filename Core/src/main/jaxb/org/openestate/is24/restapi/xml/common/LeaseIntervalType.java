package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Intervall für das ein Grundstück/eine Immobilie pachtbar ist
 * 
 * <p>Java class for LeaseIntervalType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LeaseIntervalType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAY"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MONTH"/>
 *     <enumeration value="YEAR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LeaseIntervalType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum LeaseIntervalType {


    /**
     * Tag
     * 
     */
    DAY,

    /**
     * Woche
     * 
     */
    WEEK,

    /**
     * Monat
     * 
     */
    MONTH,

    /**
     * Jahr
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static LeaseIntervalType fromValue(String v) {
        return valueOf(v);
    }

}
