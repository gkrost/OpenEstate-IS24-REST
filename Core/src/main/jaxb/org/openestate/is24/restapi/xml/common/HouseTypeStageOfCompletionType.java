package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Typenhaus Ausbaustufe
 * 
 * <p>Java class for HouseTypeStageOfCompletionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="HouseTypeStageOfCompletionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNSPECIFIED"/>
 *     <enumeration value="CONSTRUCTIONKIT"/>
 *     <enumeration value="UPGRADING"/>
 *     <enumeration value="TURNKEYWITHCELLAR"/>
 *     <enumeration value="TURNKEYWITHOUTFLOORSLAP"/>
 *     <enumeration value="TURNKEYWITHFLOORSLAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "HouseTypeStageOfCompletionType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum HouseTypeStageOfCompletionType {


    /**
     * nicht spezifiziert
     * 
     */
    UNSPECIFIED,

    /**
     * Bausatzhaus
     * 
     */
    CONSTRUCTIONKIT,

    /**
     * Ausbauhaus
     * 
     */
    UPGRADING,

    /**
     * Schlüsselfertig mit Keller
     * 
     */
    TURNKEYWITHCELLAR,

    /**
     * Schlüsselfertig ohne Bodenplatte
     * 
     */
    TURNKEYWITHOUTFLOORSLAP,

    /**
     * Schlüsselfertig mit Bodenplatte
     * 
     */
    TURNKEYWITHFLOORSLAP;

    public String value() {
        return name();
    }

    public static HouseTypeStageOfCompletionType fromValue(String v) {
        return valueOf(v);
    }

}
