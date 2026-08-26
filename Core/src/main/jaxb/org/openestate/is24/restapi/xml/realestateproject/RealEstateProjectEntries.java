package org.openestate.is24.restapi.xml.realestateproject;

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
 * Liste von Realestateprojectseinträgen
 * 
 * <p>Java class for RealEstateProjectEntries complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RealEstateProjectEntries">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realEstateProjectEntry" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}RealEstateProjectEntry" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RealEstateProjectEntries", propOrder = {
    "realEstateProjectEntry"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealEstateProjectEntries implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Eintrag eines RealEstateprojektes
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<RealEstateProjectEntry> realEstateProjectEntry;
    /**
     * Link zum Abruf der Eintragsliste.
     * 
     */
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected URI href;

    /**
     * Eintrag eines RealEstateprojektes
     * 
     * Gets the value of the realEstateProjectEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the realEstateProjectEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRealEstateProjectEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealEstateProjectEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the realEstateProjectEntry property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<RealEstateProjectEntry> getRealEstateProjectEntry() {
        if (realEstateProjectEntry == null) {
            realEstateProjectEntry = new ArrayList<>();
        }
        return this.realEstateProjectEntry;
    }

    /**
     * Link zum Abruf der Eintragsliste.
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
            List<RealEstateProjectEntry> theRealEstateProjectEntry;
            theRealEstateProjectEntry = (((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty()))?this.getRealEstateProjectEntry():null);
            strategy.appendField(locator, this, "realEstateProjectEntry", buffer, theRealEstateProjectEntry, ((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty())));
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
        if (draftCopy instanceof RealEstateProjectEntries) {
            final RealEstateProjectEntries copy = ((RealEstateProjectEntries) draftCopy);
            {
                Boolean realEstateProjectEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty())));
                if (realEstateProjectEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<RealEstateProjectEntry> sourceRealEstateProjectEntry;
                    sourceRealEstateProjectEntry = (((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty()))?this.getRealEstateProjectEntry():null);
                    @SuppressWarnings("unchecked")
                    List<RealEstateProjectEntry> copyRealEstateProjectEntry = ((List<RealEstateProjectEntry> ) strategy.copy(LocatorUtils.property(locator, "realEstateProjectEntry", sourceRealEstateProjectEntry), sourceRealEstateProjectEntry, ((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty()))));
                    copy.realEstateProjectEntry = null;
                    if (copyRealEstateProjectEntry!= null) {
                        List<RealEstateProjectEntry> uniqueRealEstateProjectEntryl = copy.getRealEstateProjectEntry();
                        uniqueRealEstateProjectEntryl.addAll(copyRealEstateProjectEntry);
                    }
                } else {
                    if (realEstateProjectEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateProjectEntry = null;
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
        return new RealEstateProjectEntries();
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
        final RealEstateProjectEntries that = ((RealEstateProjectEntries) object);
        {
            List<RealEstateProjectEntry> lhsRealEstateProjectEntry;
            lhsRealEstateProjectEntry = (((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty()))?this.getRealEstateProjectEntry():null);
            List<RealEstateProjectEntry> rhsRealEstateProjectEntry;
            rhsRealEstateProjectEntry = (((that.realEstateProjectEntry!= null)&&(!that.realEstateProjectEntry.isEmpty()))?that.getRealEstateProjectEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateProjectEntry", lhsRealEstateProjectEntry), LocatorUtils.property(thatLocator, "realEstateProjectEntry", rhsRealEstateProjectEntry), lhsRealEstateProjectEntry, rhsRealEstateProjectEntry, ((this.realEstateProjectEntry!= null)&&(!this.realEstateProjectEntry.isEmpty())), ((that.realEstateProjectEntry!= null)&&(!that.realEstateProjectEntry.isEmpty())))) {
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
