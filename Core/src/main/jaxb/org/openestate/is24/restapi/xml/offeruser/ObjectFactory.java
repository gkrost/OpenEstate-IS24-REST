package org.openestate.is24.restapi.xml.offeruser;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openestate.is24.restapi.xml.offeruser package. 
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

    private static final QName _OfferUser_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/user/1.0", "offerUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openestate.is24.restapi.xml.offeruser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OfferUser }
     * 
     * @return
     *     the new instance of {@link OfferUser }
     */
    public OfferUser createOfferUser() {
        return new OfferUser();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     * @return
     *     the new instance of {@link Customer }
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ContractContactDetails }
     * 
     * @return
     *     the new instance of {@link ContractContactDetails }
     */
    public ContractContactDetails createContractContactDetails() {
        return new ContractContactDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/user/1.0", name = "offerUser")
    public JAXBElement<OfferUser> createOfferUser(OfferUser value) {
        return new JAXBElement<>(_OfferUser_QNAME, OfferUser.class, null, value);
    }

}
