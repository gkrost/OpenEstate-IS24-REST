package org.openestate.is24.restapi.xml.offeruser;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.jvnet.jaxb.lang.CopyStrategy;
import org.jvnet.jaxb.lang.CopyTo;
import org.jvnet.jaxb.lang.Equals;
import org.jvnet.jaxb.lang.EqualsStrategy;
import org.jvnet.jaxb.lang.JAXBCopyStrategy;
import org.jvnet.jaxb.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb.lang.JAXBToStringStrategy;
import org.jvnet.jaxb.lang.ToString;
import org.jvnet.jaxb.lang.ToStringStrategy;
import org.jvnet.jaxb.locator.ObjectLocator;
import org.jvnet.jaxb.locator.util.LocatorUtils;


/**
 * <p>Java class for customer complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="customer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contractContactDetails" type="{http://rest.immobilienscout24.de/schema/offer/user/1.0}contractContactDetails" minOccurs="0"/>
 *         <element name="professional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "contractContactDetails",
    "professional"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Customer implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ContractContactDetails contractContactDetails;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected boolean professional;

    /**
     * Gets the value of the contractContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractContactDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ContractContactDetails getContractContactDetails() {
        return contractContactDetails;
    }

    /**
     * Sets the value of the contractContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractContactDetails }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setContractContactDetails(ContractContactDetails value) {
        this.contractContactDetails = value;
    }

    /**
     * Gets the value of the professional property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean isProfessional() {
        return professional;
    }

    /**
     * Sets the value of the professional property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setProfessional(boolean value) {
        this.professional = value;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.getInstance();
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            ContractContactDetails theContractContactDetails;
            theContractContactDetails = this.getContractContactDetails();
            strategy.appendField(locator, this, "contractContactDetails", buffer, theContractContactDetails, (this.contractContactDetails!= null));
        }
        {
            boolean theProfessional;
            theProfessional = this.isProfessional();
            strategy.appendField(locator, this, "professional", buffer, theProfessional, true);
        }
        return buffer;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object clone() {
        return copyTo(createNewInstance());
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.getInstance();
        return copyTo(null, target, strategy);
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Customer) {
            final Customer copy = ((Customer) draftCopy);
            {
                Boolean contractContactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.contractContactDetails!= null));
                if (contractContactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ContractContactDetails sourceContractContactDetails;
                    sourceContractContactDetails = this.getContractContactDetails();
                    ContractContactDetails copyContractContactDetails = ((ContractContactDetails) strategy.copy(LocatorUtils.property(locator, "contractContactDetails", sourceContractContactDetails), sourceContractContactDetails, (this.contractContactDetails!= null)));
                    copy.setContractContactDetails(copyContractContactDetails);
                } else {
                    if (contractContactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.contractContactDetails = null;
                    }
                }
            }
            {
                Boolean professionalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (professionalShouldBeCopiedAndSet == Boolean.TRUE) {
                    boolean sourceProfessional;
                    sourceProfessional = this.isProfessional();
                    boolean copyProfessional = strategy.copy(LocatorUtils.property(locator, "professional", sourceProfessional), sourceProfessional, true);
                    copy.setProfessional(copyProfessional);
                } else {
                    if (professionalShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Customer();
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Customer that = ((Customer) object);
        {
            ContractContactDetails lhsContractContactDetails;
            lhsContractContactDetails = this.getContractContactDetails();
            ContractContactDetails rhsContractContactDetails;
            rhsContractContactDetails = that.getContractContactDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contractContactDetails", lhsContractContactDetails), LocatorUtils.property(thatLocator, "contractContactDetails", rhsContractContactDetails), lhsContractContactDetails, rhsContractContactDetails, (this.contractContactDetails!= null), (that.contractContactDetails!= null))) {
                return false;
            }
        }
        {
            boolean lhsProfessional;
            lhsProfessional = this.isProfessional();
            boolean rhsProfessional;
            rhsProfessional = that.isProfessional();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "professional", lhsProfessional), LocatorUtils.property(thatLocator, "professional", rhsProfessional), lhsProfessional, rhsProfessional, true, true)) {
                return false;
            }
        }
        return true;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.getInstance();
        return equals(null, null, object, strategy);
    }

}
