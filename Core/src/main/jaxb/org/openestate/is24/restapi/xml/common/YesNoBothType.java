package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung für Tristate-Boolean-Elemente (boolesche Werte die drei
 *                 Status abbilden können).
 * 
 * <p>Java class for YesNoBothType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="YesNoBothType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YES"/>
 *     <enumeration value="NO"/>
 *     <enumeration value="BOTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "YesNoBothType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum YesNoBothType {


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
     * beide
     * 
     */
    BOTH;

    public String value() {
        return name();
    }

    public static YesNoBothType fromValue(String v) {
        return valueOf(v);
    }

}
