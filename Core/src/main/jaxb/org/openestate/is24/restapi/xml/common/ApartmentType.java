package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der verfuegbaren Wohnungsarten
 * 
 * <p>Java class for ApartmentType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApartmentType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ROOF_STOREY"/>
 *     <enumeration value="LOFT"/>
 *     <enumeration value="MAISONETTE"/>
 *     <enumeration value="PENTHOUSE"/>
 *     <enumeration value="TERRACED_FLAT"/>
 *     <enumeration value="GROUND_FLOOR"/>
 *     <enumeration value="APARTMENT"/>
 *     <enumeration value="RAISED_GROUND_FLOOR"/>
 *     <enumeration value="HALF_BASEMENT"/>
 *     <enumeration value="OTHER"/>
 *     <enumeration value="NO_INFORMATION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ApartmentType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum ApartmentType {


    /**
     * Dachgeschoss
     * 
     */
    ROOF_STOREY,

    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Maisonette
     * 
     */
    MAISONETTE,

    /**
     * Penthouse
     * 
     */
    PENTHOUSE,

    /**
     * Terrassenwohnung
     * 
     */
    TERRACED_FLAT,

    /**
     * Erdgeschosswohnung
     * 
     */
    GROUND_FLOOR,

    /**
     * Etagenwohnung
     * 
     */
    APARTMENT,

    /**
     * Hochparterre
     * 
     */
    RAISED_GROUND_FLOOR,

    /**
     * Souterrain
     * 
     */
    HALF_BASEMENT,

    /**
     * Sonstige
     * 
     */
    OTHER,

    /**
     * Keine Angabe (wird zusammen mit OTHER verwendet)
     * 
     */
    @Deprecated
    NO_INFORMATION;

    public String value() {
        return name();
    }

    public static ApartmentType fromValue(String v) {
        return valueOf(v);
    }

}
