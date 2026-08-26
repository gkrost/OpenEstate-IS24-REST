package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DEPRECATED benutze HeatingTypeEnev2014 Auflistung der verfügbaren
 *                 Heizungsarten
 * 
 * <p>Java class for HeatingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HeatingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NO_INFORMATION"/>
 *     <enumeration value="SELF_CONTAINED_CENTRAL_HEATING"/>
 *     <enumeration value="STOVE_HEATING"/>
 *     <enumeration value="CENTRAL_HEATING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HeatingType")
@XmlEnum
@Deprecated
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HeatingType {


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
    CENTRAL_HEATING;

    public String value() {
        return name();
    }

    public static HeatingType fromValue(String v) {
        return valueOf(v);
    }

}
