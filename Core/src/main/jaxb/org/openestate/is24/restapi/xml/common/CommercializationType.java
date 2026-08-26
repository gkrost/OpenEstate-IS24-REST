package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Vermarktungsart (trade site)
 * 
 * <p>Java class for CommercializationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CommercializationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUY"/>
 *     <enumeration value="RENT"/>
 *     <enumeration value="LEASE"/>
 *     <enumeration value="LEASEHOLD"/>
 *     <enumeration value="COMPULSORY_AUCTION"/>
 *     <enumeration value="RENT_AND_BUY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommercializationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CommercializationType {


    /**
     * Kauf
     * 
     */
    BUY,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Pacht
     * 
     */
    LEASE,

    /**
     * Erbpacht
     * 
     */
    LEASEHOLD,

    /**
     * Zwangsversteigerung
     * 
     */
    COMPULSORY_AUCTION,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static CommercializationType fromValue(String v) {
        return valueOf(v);
    }

}
