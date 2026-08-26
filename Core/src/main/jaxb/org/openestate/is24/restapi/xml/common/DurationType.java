package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Das Intervall für das die Immobilie mietbar ist (Tag, Monat, Woche)
 * 
 * <p>Java class for DurationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DurationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DAY"/>
 *     <enumeration value="WEEK"/>
 *     <enumeration value="MONTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DurationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum DurationType {


    /**
     * mietbar pro Tag
     * 
     */
    DAY,

    /**
     * mietbar pro Woche
     * 
     */
    WEEK,

    /**
     * mietbar pro Monat
     * 
     */
    MONTH;

    public String value() {
        return name();
    }

    public static DurationType fromValue(String v) {
        return valueOf(v);
    }

}
