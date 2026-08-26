package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Die zur Bildung der Gesamtmiete zur Verfügung stehenden Informationen.
 * 
 * <p>Java class for RentScopeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RentScopeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NET_RENT"/>
 *     <enumeration value="GROSS_RENT"/>
 *     <enumeration value="INCONSISTENT_WARM_RENT"/>
 *     <enumeration value="WARM_RENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RentScopeType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum RentScopeType {


    /**
     * Netto Kaltmiete ohne irgendwelche Betriebskosten
     * 
     */
    NET_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt
     * 
     */
    GROSS_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm, mit
     *                         Inkonsistenzen
     * 
     */
    INCONSISTENT_WARM_RENT,

    /**
     * Netto Kaltmiete plus Betriebskosten Kalt und Warm
     * 
     */
    WARM_RENT;

    public String value() {
        return name();
    }

    public static RentScopeType fromValue(String v) {
        return valueOf(v);
    }

}
