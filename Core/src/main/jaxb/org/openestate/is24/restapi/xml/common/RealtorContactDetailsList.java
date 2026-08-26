package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realtorContactDetails" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealtorContactDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "realtorContactDetails"
})
@XmlRootElement(name = "realtorContactDetailsList")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealtorContactDetailsList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Die Kontaktdaten eines Anbieters
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<RealtorContactDetails> realtorContactDetails;

    /**
     * Die Kontaktdaten eines Anbieters
     * 
     * Gets the value of the realtorContactDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the realtorContactDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRealtorContactDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealtorContactDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the realtorContactDetails property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<RealtorContactDetails> getRealtorContactDetails() {
        if (realtorContactDetails == null) {
            realtorContactDetails = new ArrayList<>();
        }
        return this.realtorContactDetails;
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
            List<RealtorContactDetails> theRealtorContactDetails;
            theRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
            strategy.appendField(locator, this, "realtorContactDetails", buffer, theRealtorContactDetails, ((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty())));
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
        if (draftCopy instanceof RealtorContactDetailsList) {
            final RealtorContactDetailsList copy = ((RealtorContactDetailsList) draftCopy);
            {
                Boolean realtorContactDetailsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty())));
                if (realtorContactDetailsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<RealtorContactDetails> sourceRealtorContactDetails;
                    sourceRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
                    @SuppressWarnings("unchecked")
                    List<RealtorContactDetails> copyRealtorContactDetails = ((List<RealtorContactDetails> ) strategy.copy(LocatorUtils.property(locator, "realtorContactDetails", sourceRealtorContactDetails), sourceRealtorContactDetails, ((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))));
                    copy.realtorContactDetails = null;
                    if (copyRealtorContactDetails!= null) {
                        List<RealtorContactDetails> uniqueRealtorContactDetailsl = copy.getRealtorContactDetails();
                        uniqueRealtorContactDetailsl.addAll(copyRealtorContactDetails);
                    }
                } else {
                    if (realtorContactDetailsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realtorContactDetails = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RealtorContactDetailsList();
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
        final RealtorContactDetailsList that = ((RealtorContactDetailsList) object);
        {
            List<RealtorContactDetails> lhsRealtorContactDetails;
            lhsRealtorContactDetails = (((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty()))?this.getRealtorContactDetails():null);
            List<RealtorContactDetails> rhsRealtorContactDetails;
            rhsRealtorContactDetails = (((that.realtorContactDetails!= null)&&(!that.realtorContactDetails.isEmpty()))?that.getRealtorContactDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtorContactDetails", lhsRealtorContactDetails), LocatorUtils.property(thatLocator, "realtorContactDetails", rhsRealtorContactDetails), lhsRealtorContactDetails, rhsRealtorContactDetails, ((this.realtorContactDetails!= null)&&(!this.realtorContactDetails.isEmpty())), ((that.realtorContactDetails!= null)&&(!that.realtorContactDetails.isEmpty())))) {
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
