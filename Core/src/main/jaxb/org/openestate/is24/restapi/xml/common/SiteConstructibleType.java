package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Bebaubar nach
 * 
 * <p>Java class for SiteConstructibleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SiteConstructibleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONSTRUCTIONPLAN"/>
 *     <enumeration value="NEIGHBOURCONSTRUCTION"/>
 *     <enumeration value="EXTERNALAREA"/>
 *     <enumeration value="NO_INFORMATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SiteConstructibleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum SiteConstructibleType {


    /**
     * Bebauungsplan
     * 
     */
    CONSTRUCTIONPLAN,

    /**
     * wie Nachbarbebauung
     * 
     */
    NEIGHBOURCONSTRUCTION,

    /**
     * Aussengebiet
     * 
     */
    EXTERNALAREA,

    /**
     * Keine Angabe
     * 
     */
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static SiteConstructibleType fromValue(String v) {
        return valueOf(v);
    }

}
