package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung der
 *                 Pflegeplatztypen
 * 
 * <p>Java class for CareType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CareType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="STATIONARY_CARE"/>
 *     <enumeration value="DAY_CARE"/>
 *     <enumeration value="SHORT_TERM_CARE"/>
 *     <enumeration value="RESPITE_CARE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CareType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CareType {


    /**
     * Vollstationäre Pflege
     * 
     */
    STATIONARY_CARE,

    /**
     * Tagespflege
     * 
     */
    DAY_CARE,

    /**
     * Kurzzeitpflege
     * 
     */
    SHORT_TERM_CARE,

    /**
     * Verhinderungspflege
     * 
     */
    RESPITE_CARE;

    public String value() {
        return name();
    }

    public static CareType fromValue(String v) {
        return valueOf(v);
    }

}
