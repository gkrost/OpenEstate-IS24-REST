package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for videoProcessingStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="videoProcessingStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INCOMING"/>
 *     <enumeration value="PROCESSING"/>
 *     <enumeration value="SUCCESSFUL"/>
 *     <enumeration value="FAILED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "videoProcessingStatusType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum VideoProcessingStatusType {


    /**
     * media status is incomming
     * 
     */
    INCOMING,

    /**
     * media status is processing
     * 
     */
    PROCESSING,

    /**
     * media status is successful
     * 
     */
    SUCCESSFUL,

    /**
     * media status is failed
     * 
     */
    FAILED;

    public String value() {
        return name();
    }

    public static VideoProcessingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
