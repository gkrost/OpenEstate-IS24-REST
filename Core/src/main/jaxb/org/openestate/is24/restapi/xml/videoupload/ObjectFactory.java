package org.openestate.is24.restapi.xml.videoupload;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.videoupload package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class ObjectFactory {

    private static final QName _VideoUploadTicket_QNAME = new QName("http://rest.immobilienscout24.de/schema/videoupload/1.0", "videoUploadTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.videoupload
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VideoUploadTicket }
     * 
     * @return
     *     the new instance of {@link VideoUploadTicket }
     */
    public VideoUploadTicket createVideoUploadTicket() {
        return new VideoUploadTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoUploadTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VideoUploadTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/videoupload/1.0", name = "videoUploadTicket")
    public JAXBElement<VideoUploadTicket> createVideoUploadTicket(VideoUploadTicket value) {
        return new JAXBElement<>(_VideoUploadTicket_QNAME, VideoUploadTicket.class, null, value);
    }

}
