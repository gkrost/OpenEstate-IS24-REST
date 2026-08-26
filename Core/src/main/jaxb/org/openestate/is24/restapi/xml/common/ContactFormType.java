package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Art des Kontaktformulars
 * 
 * <p>Java class for ContactFormType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ContactFormType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EMAIL"/>
 *     <enumeration value="LONG"/>
 *     <enumeration value="PHONE"/>
 *     <enumeration value="NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ContactFormType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ContactFormType {


    /**
     * E-Mail-Kontaktformular (Schnellkontakt)
     * 
     */
    EMAIL,

    /**
     * Ausfuehrliches Kontaktformular
     * 
     */
    LONG,

    /**
     * Telefon-Kontaktformular
     * 
     */
    PHONE,

    /**
     * Zeigt an, dass kein Kontaktformular sinnvoll angezeigt werden
     *                         kann, z.B. da der Anbieter zwar Kontaktaufnahme per E-Mail wuenscht, aber selbst keine
     *                         E-Mail-Adresse angegeben hat.
     * 
     */
    NONE;

    public String value() {
        return name();
    }

    public static ContactFormType fromValue(String v) {
        return valueOf(v);
    }

}
