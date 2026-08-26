package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for OfficeRentDuration</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OfficeRentDuration">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEEKLY"/>
 *     <enumeration value="MONTHLY"/>
 *     <enumeration value="YEARLY"/>
 *     <enumeration value="LONG_TERM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OfficeRentDuration")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum OfficeRentDuration {


    /**
     * wochenweise
     * 
     */
    WEEKLY,

    /**
     * monatsweise
     * 
     */
    MONTHLY,

    /**
     *  1 bis 2 Jahre
     * 
     */
    YEARLY,

    /**
     * langfristig
     * 
     */
    LONG_TERM;

    public String value() {
        return name();
    }

    public static OfficeRentDuration fromValue(String v) {
        return valueOf(v);
    }

}
