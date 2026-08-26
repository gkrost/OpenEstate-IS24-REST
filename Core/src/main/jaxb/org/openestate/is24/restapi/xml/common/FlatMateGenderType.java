package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Gesuchter Mitbewohner
 * 
 * <p>Java class for FlatMateGenderType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FlatMateGenderType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MALE_OR_FEMALE"/>
 *     <enumeration value="MALE"/>
 *     <enumeration value="FEMALE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FlatMateGenderType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum FlatMateGenderType {


    /**
     * Männlich oder weiblich
     * 
     */
    MALE_OR_FEMALE,

    /**
     * Männlich
     * 
     */
    MALE,

    /**
     * Weiblich
     * 
     */
    FEMALE;

    public String value() {
        return name();
    }

    public static FlatMateGenderType fromValue(String v) {
        return valueOf(v);
    }

}
