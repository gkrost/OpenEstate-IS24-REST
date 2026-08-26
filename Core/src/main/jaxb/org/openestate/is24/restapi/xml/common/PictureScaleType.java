package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der verfuegbaren Bildgrößen
 * 
 * <p>Java class for PictureScaleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PictureScaleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SCALE_60x40"/>
 *     <enumeration value="SCALE_60x60"/>
 *     <enumeration value="SCALE_73x73"/>
 *     <enumeration value="SCALE_118x118"/>
 *     <enumeration value="SCALE_155x40"/>
 *     <enumeration value="SCALE_200x200"/>
 *     <enumeration value="SCALE_210x210"/>
 *     <enumeration value="SCALE_300x300"/>
 *     <enumeration value="SCALE_400x300"/>
 *     <enumeration value="SCALE_540x540"/>
 *     <enumeration value="SCALE_1000x1000"/>
 *     <enumeration value="SCALE_AND_CROP"/>
 *     <enumeration value="SCALE"/>
 *     <enumeration value="WHITE_FILLING"/>
 *     <enumeration value="SCALE_MAX"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PictureScaleType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum PictureScaleType {


    /**
     * Bildgröße 60 x 40
     * 
     */
    @XmlEnumValue("SCALE_60x40")
    SCALE_60_X_40("SCALE_60x40"),

    /**
     * Bildgröße 60 x 60
     * 
     */
    @XmlEnumValue("SCALE_60x60")
    SCALE_60_X_60("SCALE_60x60"),

    /**
     * Bildgröße 73 x 73
     * 
     */
    @XmlEnumValue("SCALE_73x73")
    SCALE_73_X_73("SCALE_73x73"),

    /**
     * Bildgröße 118 x 118
     * 
     */
    @XmlEnumValue("SCALE_118x118")
    SCALE_118_X_118("SCALE_118x118"),

    /**
     * Bildgröße 155 x 40
     * 
     */
    @XmlEnumValue("SCALE_155x40")
    SCALE_155_X_40("SCALE_155x40"),

    /**
     * Bildgröße 200 x 200
     * 
     */
    @XmlEnumValue("SCALE_200x200")
    SCALE_200_X_200("SCALE_200x200"),

    /**
     * Bildgröße 210 x 210
     * 
     */
    @XmlEnumValue("SCALE_210x210")
    SCALE_210_X_210("SCALE_210x210"),

    /**
     * Bildgröße 300 x 300
     * 
     */
    @XmlEnumValue("SCALE_300x300")
    SCALE_300_X_300("SCALE_300x300"),

    /**
     * Bildgröße 400 x 300
     * 
     */
    @XmlEnumValue("SCALE_400x300")
    SCALE_400_X_300("SCALE_400x300"),

    /**
     * Bildgröße 540 x 540
     * 
     */
    @XmlEnumValue("SCALE_540x540")
    SCALE_540_X_540("SCALE_540x540"),

    /**
     * Bildgröße 1000 x 1000
     * 
     */
    @XmlEnumValue("SCALE_1000x1000")
    SCALE_1000_X_1000("SCALE_1000x1000"),

    /**
     * Template für Scaling und Cropping
     * 
     */
    SCALE_AND_CROP("SCALE_AND_CROP"),

    /**
     * Template für Scaling
     * 
     */
    SCALE("SCALE"),

    /**
     * Template für White filling
     * 
     */
    WHITE_FILLING("WHITE_FILLING"),

    /**
     * Bild in höchster Auflösung
     * 
     */
    SCALE_MAX("SCALE_MAX");
    private final String value;

    PictureScaleType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static PictureScaleType fromValue(String v) {
        for (PictureScaleType c: PictureScaleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
