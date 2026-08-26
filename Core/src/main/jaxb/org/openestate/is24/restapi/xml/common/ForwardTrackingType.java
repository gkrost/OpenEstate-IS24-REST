package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ForwardTrackingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ForwardTrackingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DIRECT"/>
 *     <enumeration value="LATER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ForwardTrackingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ForwardTrackingType {


    /**
     * Indicates that the customer was forwarded to us by a
     *                         partner/affiliate within the current session.
     * 
     */
    DIRECT,

    /**
     * Indicates that the customer was forwarded to us by a
     *                         partner/affiliate previously and has now returned independently of the partner/affiliate.
     * 
     */
    LATER;

    public String value() {
        return name();
    }

    public static ForwardTrackingType fromValue(String v) {
        return valueOf(v);
    }

}
