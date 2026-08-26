package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Unterstützte Vermarktungsarten (Miete, Kauf oder Pacht)
 * 
 * <p>Java class for MarketingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MarketingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PURCHASE"/>
 *     <enumeration value="PURCHASE_PER_SQM"/>
 *     <enumeration value="RENT"/>
 *     <enumeration value="RENT_PER_SQM"/>
 *     <enumeration value="LEASE"/>
 *     <enumeration value="LEASEHOLD"/>
 *     <enumeration value="BUDGET_RENT"/>
 *     <enumeration value="RENT_AND_BUY"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MarketingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum MarketingType {


    /**
     * Kauf
     * 
     */
    PURCHASE,

    /**
     * Kauf pro Quadratmeter
     * 
     */
    PURCHASE_PER_SQM,

    /**
     * Miete
     * 
     */
    RENT,

    /**
     * Miete pro Quadratmeter
     * 
     */
    RENT_PER_SQM,

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
     * Gesamtmiete aus allen verfügbaren Miet-Informationen zum
     *                         Vergleich zu einem gegebenen Monatsbudget
     * 
     */
    BUDGET_RENT,

    /**
     * Miete und Kauf
     * 
     */
    RENT_AND_BUY;

    public String value() {
        return name();
    }

    public static MarketingType fromValue(String v) {
        return valueOf(v);
    }

}
