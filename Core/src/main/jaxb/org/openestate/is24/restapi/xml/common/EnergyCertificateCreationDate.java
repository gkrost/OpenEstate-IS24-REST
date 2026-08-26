package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EnergyCertificateCreationDate</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EnergyCertificateCreationDate">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOT_APPLICABLE"/>
 *     <enumeration value="BEFORE_01_MAY_2014"/>
 *     <enumeration value="FROM_01_MAY_2014"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EnergyCertificateCreationDate")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum EnergyCertificateCreationDate {


    /**
     * keine Angabe
     * 
     */
    NOT_APPLICABLE,

    /**
     * Ausgestellt vor dem 01.05.2014
     * 
     */
    BEFORE_01_MAY_2014,

    /**
     * Ausgestellt ab dem 01.05.2014
     * 
     */
    FROM_01_MAY_2014;

    public String value() {
        return name();
    }

    public static EnergyCertificateCreationDate fromValue(String v) {
        return valueOf(v);
    }

}
