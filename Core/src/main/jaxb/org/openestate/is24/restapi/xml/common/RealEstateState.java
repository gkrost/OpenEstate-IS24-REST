package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Veröffentlichungsstatus einer Immobilie.
 * 
 * <p>Java class for RealEstateState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RealEstateState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTIVE"/>
 *     <enumeration value="INACTIVE"/>
 *     <enumeration value="TO_BE_DELETED"/>
 *     <enumeration value="DRAFT"/>
 *     <enumeration value="ARCHIVED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RealEstateState")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum RealEstateState {


    /**
     * Veröffentlichungsstatus ist aktiv.
     * 
     */
    ACTIVE,

    /**
     * Veröffentlichungsstatus ist inaktiv.
     * 
     */
    INACTIVE,

    /**
     * Immobilie wurde gelöscht.
     * 
     */
    TO_BE_DELETED,

    /**
     * Immobilie ist im Entwurf.
     * 
     */
    DRAFT,

    /**
     * Immobilie ist archiviert.
     * 
     */
    ARCHIVED;

    public String value() {
        return name();
    }

    public static RealEstateState fromValue(String v) {
        return valueOf(v);
    }

}
