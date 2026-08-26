package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EnergyCertificateAvailability</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EnergyCertificateAvailability">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVAILABLE"/>
 *     <enumeration value="NOT_AVAILABLE_YET"/>
 *     <enumeration value="NOT_REQUIRED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyCertificateAvailability")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum EnergyCertificateAvailability {


    /**
     * vorhanden
     * 
     */
    AVAILABLE,

    /**
     * noch nicht vorhanden
     * 
     */
    NOT_AVAILABLE_YET,

    /**
     * nicht notwendig
     * 
     */
    NOT_REQUIRED;

    public String value() {
        return name();
    }

    public static EnergyCertificateAvailability fromValue(String v) {
        return valueOf(v);
    }

}
