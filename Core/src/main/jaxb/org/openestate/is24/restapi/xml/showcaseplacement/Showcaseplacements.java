package org.openestate.is24.restapi.xml.showcaseplacement;

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
 * Liste von Schaufensterplatzierungen
 * 
 * <p>Java class for Showcaseplacements complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Showcaseplacements">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="showcaseplacement" type="{http://rest.immobilienscout24.de/schema/offer/showcaseplacement/1.0}Showcaseplacement" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Showcaseplacements", propOrder = {
    "showcaseplacement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Showcaseplacements implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * ein Anhang
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<Showcaseplacement> showcaseplacement;
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
     * Gets the value of the showcaseplacement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the showcaseplacement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getShowcaseplacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Showcaseplacement }
     * </p>
     * 
     * 
     * @return
     *     The value of the showcaseplacement property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<Showcaseplacement> getShowcaseplacement() {
        if (showcaseplacement == null) {
            showcaseplacement = new ArrayList<>();
        }
        return this.showcaseplacement;
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
            List<Showcaseplacement> theShowcaseplacement;
            theShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
            strategy.appendField(locator, this, "showcaseplacement", buffer, theShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())));
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
        if (draftCopy instanceof Showcaseplacements) {
            final Showcaseplacements copy = ((Showcaseplacements) draftCopy);
            {
                Boolean showcaseplacementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())));
                if (showcaseplacementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Showcaseplacement> sourceShowcaseplacement;
                    sourceShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
                    @SuppressWarnings("unchecked")
                    List<Showcaseplacement> copyShowcaseplacement = ((List<Showcaseplacement> ) strategy.copy(LocatorUtils.property(locator, "showcaseplacement", sourceShowcaseplacement), sourceShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))));
                    copy.showcaseplacement = null;
                    if (copyShowcaseplacement!= null) {
                        List<Showcaseplacement> uniqueShowcaseplacementl = copy.getShowcaseplacement();
                        uniqueShowcaseplacementl.addAll(copyShowcaseplacement);
                    }
                } else {
                    if (showcaseplacementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.showcaseplacement = null;
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
        return new Showcaseplacements();
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
        final Showcaseplacements that = ((Showcaseplacements) object);
        {
            List<Showcaseplacement> lhsShowcaseplacement;
            lhsShowcaseplacement = (((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty()))?this.getShowcaseplacement():null);
            List<Showcaseplacement> rhsShowcaseplacement;
            rhsShowcaseplacement = (((that.showcaseplacement!= null)&&(!that.showcaseplacement.isEmpty()))?that.getShowcaseplacement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "showcaseplacement", lhsShowcaseplacement), LocatorUtils.property(thatLocator, "showcaseplacement", rhsShowcaseplacement), lhsShowcaseplacement, rhsShowcaseplacement, ((this.showcaseplacement!= null)&&(!this.showcaseplacement.isEmpty())), ((that.showcaseplacement!= null)&&(!that.showcaseplacement.isEmpty())))) {
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
