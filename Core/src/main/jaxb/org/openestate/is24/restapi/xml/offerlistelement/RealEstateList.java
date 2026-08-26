package org.openestate.is24.restapi.xml.offerlistelement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for realEstateList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="realEstateList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realEstateElement" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}OfferRealEstateForList" maxOccurs="100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realEstateList", propOrder = {
    "realEstateElement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealEstateList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<OfferRealEstateForList> realEstateElement;

    /**
     * Gets the value of the realEstateElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the realEstateElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRealEstateElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferRealEstateForList }
     * </p>
     * 
     * 
     * @return
     *     The value of the realEstateElement property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<OfferRealEstateForList> getRealEstateElement() {
        if (realEstateElement == null) {
            realEstateElement = new ArrayList<>();
        }
        return this.realEstateElement;
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
            List<OfferRealEstateForList> theRealEstateElement;
            theRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
            strategy.appendField(locator, this, "realEstateElement", buffer, theRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())));
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
        if (draftCopy instanceof RealEstateList) {
            final RealEstateList copy = ((RealEstateList) draftCopy);
            {
                Boolean realEstateElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())));
                if (realEstateElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<OfferRealEstateForList> sourceRealEstateElement;
                    sourceRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
                    @SuppressWarnings("unchecked")
                    List<OfferRealEstateForList> copyRealEstateElement = ((List<OfferRealEstateForList> ) strategy.copy(LocatorUtils.property(locator, "realEstateElement", sourceRealEstateElement), sourceRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))));
                    copy.realEstateElement = null;
                    if (copyRealEstateElement!= null) {
                        List<OfferRealEstateForList> uniqueRealEstateElementl = copy.getRealEstateElement();
                        uniqueRealEstateElementl.addAll(copyRealEstateElement);
                    }
                } else {
                    if (realEstateElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RealEstateList();
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
        final RealEstateList that = ((RealEstateList) object);
        {
            List<OfferRealEstateForList> lhsRealEstateElement;
            lhsRealEstateElement = (((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty()))?this.getRealEstateElement():null);
            List<OfferRealEstateForList> rhsRealEstateElement;
            rhsRealEstateElement = (((that.realEstateElement!= null)&&(!that.realEstateElement.isEmpty()))?that.getRealEstateElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateElement", lhsRealEstateElement), LocatorUtils.property(thatLocator, "realEstateElement", rhsRealEstateElement), lhsRealEstateElement, rhsRealEstateElement, ((this.realEstateElement!= null)&&(!this.realEstateElement.isEmpty())), ((that.realEstateElement!= null)&&(!that.realEstateElement.isEmpty())))) {
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
