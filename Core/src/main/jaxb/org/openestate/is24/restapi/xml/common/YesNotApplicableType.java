package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Aufzählung für zwei-status Elemente
 * 
 * <p>Java class for YesNotApplicableType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="YesNotApplicableType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YES"/>
 *     <enumeration value="NOT_APPLICABLE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "YesNotApplicableType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum YesNotApplicableType {


    /**
     * Ja
     * 
     */
    YES,

    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE;

    public String value() {
        return name();
    }

    public static YesNotApplicableType fromValue(String v) {
        return valueOf(v);
    }

}
