package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung für Vorhandensein eines Balkones.
 * 
 * <p>Java class for BalconyAvailableType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BalconyAvailableType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YES"/>
 *     <enumeration value="NO"/>
 *     <enumeration value="NOT_APPLICABLE"/>
 *     <enumeration value="PARTIALLY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BalconyAvailableType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum BalconyAvailableType {


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
     * keine Angabe
     * 
     */
    NOT_APPLICABLE,

    /**
     * Teilweise
     * 
     */
    PARTIALLY;

    public String value() {
        return name();
    }

    public static BalconyAvailableType fromValue(String v) {
        return valueOf(v);
    }

}
