package org.openestate.is24.restapi.xml.showcaseplacement;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.showcaseplacement package. 
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

    private static final QName _Showcaseplacements_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0", "showcaseplacements");
    private static final QName _Showcaseplacement_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0", "showcaseplacement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.showcaseplacement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Showcaseplacements }
     * 
     * @return
     *     the new instance of {@link Showcaseplacements }
     */
    public Showcaseplacements createShowcaseplacements() {
        return new Showcaseplacements();
    }

    /**
     * Create an instance of {@link Showcaseplacement }
     * 
     * @return
     *     the new instance of {@link Showcaseplacement }
     */
    public Showcaseplacement createShowcaseplacement() {
        return new Showcaseplacement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Showcaseplacements }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Showcaseplacements }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0", name = "showcaseplacements")
    public JAXBElement<Showcaseplacements> createShowcaseplacements(Showcaseplacements value) {
        return new JAXBElement<>(_Showcaseplacements_QNAME, Showcaseplacements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Showcaseplacement }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Showcaseplacement }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0", name = "showcaseplacement")
    public JAXBElement<Showcaseplacement> createShowcaseplacement(Showcaseplacement value) {
        return new JAXBElement<>(_Showcaseplacement_QNAME, Showcaseplacement.class, null, value);
    }

}
