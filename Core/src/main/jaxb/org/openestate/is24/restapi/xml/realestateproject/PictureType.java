package org.openestate.is24.restapi.xml.realestateproject;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PictureType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PictureType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMPANY_LOGO"/>
 *     <enumeration value="PROJECT_LOGO"/>
 *     <enumeration value="IMAGE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PictureType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PictureType {

    COMPANY_LOGO,
    PROJECT_LOGO,
    IMAGE;

    public String value() {
        return name();
    }

    public static PictureType fromValue(String v) {
        return valueOf(v);
    }

}
