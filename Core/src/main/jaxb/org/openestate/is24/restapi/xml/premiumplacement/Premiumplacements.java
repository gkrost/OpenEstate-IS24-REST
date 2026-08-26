package org.openestate.is24.restapi.xml.premiumplacement;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * Liste von Premiumplacements
 * 
 * <p>Java class for Premiumplacements complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Premiumplacements">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="premiumplacement" type="{http://rest.immobilienscout24.de/schema/offer/premiumplacement/1.0}Premiumplacement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://www.w3.org/1999/xlink}href"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Premiumplacements", propOrder = {
    "premiumplacement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Premiumplacements implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * ein Anhang
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<Premiumplacement> premiumplacement;
    /**
     * Link zum Element.
     * 
     */
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected URI href;

    /**
     * ein Anhang
     * 
     * Gets the value of the premiumplacement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the premiumplacement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPremiumplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Premiumplacement }
     * </p>
     * 
     * 
     * @return
     *     The value of the premiumplacement property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<Premiumplacement> getPremiumplacement() {
        if (premiumplacement == null) {
            premiumplacement = new ArrayList<>();
        }
        return this.premiumplacement;
    }

    /**
     * Link zum Element.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public URI getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     * @see #getHref()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHref(URI value) {
        this.href = value;
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
            List<Premiumplacement> thePremiumplacement;
            thePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            strategy.appendField(locator, this, "premiumplacement", buffer, thePremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())));
        }
        {
            URI theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
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
        if (draftCopy instanceof Premiumplacements) {
            final Premiumplacements copy = ((Premiumplacements) draftCopy);
            {
                Boolean premiumplacementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())));
                if (premiumplacementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Premiumplacement> sourcePremiumplacement;
                    sourcePremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
                    @SuppressWarnings("unchecked")
                    List<Premiumplacement> copyPremiumplacement = ((List<Premiumplacement> ) strategy.copy(LocatorUtils.property(locator, "premiumplacement", sourcePremiumplacement), sourcePremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))));
                    copy.premiumplacement = null;
                    if (copyPremiumplacement!= null) {
                        List<Premiumplacement> uniquePremiumplacementl = copy.getPremiumplacement();
                        uniquePremiumplacementl.addAll(copyPremiumplacement);
                    }
                } else {
                    if (premiumplacementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.premiumplacement = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceHref;
                    sourceHref = this.getHref();
                    URI copyHref = ((URI) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
                    copy.setHref(copyHref);
                } else {
                    if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.href = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Premiumplacements();
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
        final Premiumplacements that = ((Premiumplacements) object);
        {
            List<Premiumplacement> lhsPremiumplacement;
            lhsPremiumplacement = (((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty()))?this.getPremiumplacement():null);
            List<Premiumplacement> rhsPremiumplacement;
            rhsPremiumplacement = (((that.premiumplacement!= null)&&(!that.premiumplacement.isEmpty()))?that.getPremiumplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "premiumplacement", lhsPremiumplacement), LocatorUtils.property(thatLocator, "premiumplacement", rhsPremiumplacement), lhsPremiumplacement, rhsPremiumplacement, ((this.premiumplacement!= null)&&(!this.premiumplacement.isEmpty())), ((that.premiumplacement!= null)&&(!that.premiumplacement.isEmpty())))) {
                return false;
            }
        }
        {
            URI lhsHref;
            lhsHref = this.getHref();
            URI rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
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
