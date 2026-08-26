package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * Ermöglicht die seitenweise Iteration über Daten(1-basiert).
 * 
 * <p>Java class for Paging complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Paging">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="next" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         <element name="previous" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         <element name="current" type="{http://rest.immobilienscout24.de/schema/common/1.0}ReferenceLink" minOccurs="0"/>
 *         <element name="pageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numberOfPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="numberOfHits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="numberOfListings" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paging", propOrder = {
    "next",
    "previous",
    "current",
    "pageNumber",
    "pageSize",
    "numberOfPages",
    "numberOfHits",
    "numberOfListings"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Paging implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Referenz auf die nächste Ergebnissseite.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ReferenceLink next;
    /**
     * Referenz auf die vorherige Seite.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ReferenceLink previous;
    /**
     * Referenz auf die aktuelle Seite.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ReferenceLink current;
    /**
     * Nummer der aktuellen Seite.
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long pageNumber;
    /**
     * Anzahl von Ergebnise pro Seite.
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long pageSize;
    /**
     * Gesamtanzahl von Seiten.
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfPages;
    /**
     * Anzahl der Suchergebnisse.
     * 
     */
    @XmlElement(required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfHits;
    /**
     * Anzahl der Sucheinträge.
     * 
     */
    @XmlElement(required = true, type = String.class, defaultValue = "0")
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long numberOfListings;

    /**
     * Referenz auf die nächste Ergebnissseite.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ReferenceLink getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     * @see #getNext()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNext(ReferenceLink value) {
        this.next = value;
    }

    /**
     * Referenz auf die vorherige Seite.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ReferenceLink getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     * @see #getPrevious()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPrevious(ReferenceLink value) {
        this.previous = value;
    }

    /**
     * Referenz auf die aktuelle Seite.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLink }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ReferenceLink getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLink }
     *     
     * @see #getCurrent()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCurrent(ReferenceLink value) {
        this.current = value;
    }

    /**
     * Nummer der aktuellen Seite.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getPageNumber()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPageNumber(Long value) {
        this.pageNumber = value;
    }

    /**
     * Anzahl von Ergebnise pro Seite.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getPageSize()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gesamtanzahl von Seiten.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Sets the value of the numberOfPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfPages()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfPages(Long value) {
        this.numberOfPages = value;
    }

    /**
     * Anzahl der Suchergebnisse.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfHits() {
        return numberOfHits;
    }

    /**
     * Sets the value of the numberOfHits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfHits()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfHits(Long value) {
        this.numberOfHits = value;
    }

    /**
     * Anzahl der Sucheinträge.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getNumberOfListings() {
        return numberOfListings;
    }

    /**
     * Sets the value of the numberOfListings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getNumberOfListings()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setNumberOfListings(Long value) {
        this.numberOfListings = value;
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
            ReferenceLink theNext;
            theNext = this.getNext();
            strategy.appendField(locator, this, "next", buffer, theNext, (this.next!= null));
        }
        {
            ReferenceLink thePrevious;
            thePrevious = this.getPrevious();
            strategy.appendField(locator, this, "previous", buffer, thePrevious, (this.previous!= null));
        }
        {
            ReferenceLink theCurrent;
            theCurrent = this.getCurrent();
            strategy.appendField(locator, this, "current", buffer, theCurrent, (this.current!= null));
        }
        {
            Long thePageNumber;
            thePageNumber = this.getPageNumber();
            strategy.appendField(locator, this, "pageNumber", buffer, thePageNumber, (this.pageNumber!= null));
        }
        {
            Long thePageSize;
            thePageSize = this.getPageSize();
            strategy.appendField(locator, this, "pageSize", buffer, thePageSize, (this.pageSize!= null));
        }
        {
            Long theNumberOfPages;
            theNumberOfPages = this.getNumberOfPages();
            strategy.appendField(locator, this, "numberOfPages", buffer, theNumberOfPages, (this.numberOfPages!= null));
        }
        {
            Long theNumberOfHits;
            theNumberOfHits = this.getNumberOfHits();
            strategy.appendField(locator, this, "numberOfHits", buffer, theNumberOfHits, (this.numberOfHits!= null));
        }
        {
            Long theNumberOfListings;
            theNumberOfListings = this.getNumberOfListings();
            strategy.appendField(locator, this, "numberOfListings", buffer, theNumberOfListings, (this.numberOfListings!= null));
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
        if (draftCopy instanceof Paging) {
            final Paging copy = ((Paging) draftCopy);
            {
                Boolean nextShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.next!= null));
                if (nextShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceLink sourceNext;
                    sourceNext = this.getNext();
                    ReferenceLink copyNext = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "next", sourceNext), sourceNext, (this.next!= null)));
                    copy.setNext(copyNext);
                } else {
                    if (nextShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.next = null;
                    }
                }
            }
            {
                Boolean previousShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.previous!= null));
                if (previousShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceLink sourcePrevious;
                    sourcePrevious = this.getPrevious();
                    ReferenceLink copyPrevious = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "previous", sourcePrevious), sourcePrevious, (this.previous!= null)));
                    copy.setPrevious(copyPrevious);
                } else {
                    if (previousShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.previous = null;
                    }
                }
            }
            {
                Boolean currentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.current!= null));
                if (currentShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReferenceLink sourceCurrent;
                    sourceCurrent = this.getCurrent();
                    ReferenceLink copyCurrent = ((ReferenceLink) strategy.copy(LocatorUtils.property(locator, "current", sourceCurrent), sourceCurrent, (this.current!= null)));
                    copy.setCurrent(copyCurrent);
                } else {
                    if (currentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.current = null;
                    }
                }
            }
            {
                Boolean pageNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pageNumber!= null));
                if (pageNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePageNumber;
                    sourcePageNumber = this.getPageNumber();
                    Long copyPageNumber = ((Long) strategy.copy(LocatorUtils.property(locator, "pageNumber", sourcePageNumber), sourcePageNumber, (this.pageNumber!= null)));
                    copy.setPageNumber(copyPageNumber);
                } else {
                    if (pageNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pageNumber = null;
                    }
                }
            }
            {
                Boolean pageSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pageSize!= null));
                if (pageSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourcePageSize;
                    sourcePageSize = this.getPageSize();
                    Long copyPageSize = ((Long) strategy.copy(LocatorUtils.property(locator, "pageSize", sourcePageSize), sourcePageSize, (this.pageSize!= null)));
                    copy.setPageSize(copyPageSize);
                } else {
                    if (pageSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pageSize = null;
                    }
                }
            }
            {
                Boolean numberOfPagesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfPages!= null));
                if (numberOfPagesShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfPages;
                    sourceNumberOfPages = this.getNumberOfPages();
                    Long copyNumberOfPages = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfPages", sourceNumberOfPages), sourceNumberOfPages, (this.numberOfPages!= null)));
                    copy.setNumberOfPages(copyNumberOfPages);
                } else {
                    if (numberOfPagesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfPages = null;
                    }
                }
            }
            {
                Boolean numberOfHitsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfHits!= null));
                if (numberOfHitsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfHits;
                    sourceNumberOfHits = this.getNumberOfHits();
                    Long copyNumberOfHits = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfHits", sourceNumberOfHits), sourceNumberOfHits, (this.numberOfHits!= null)));
                    copy.setNumberOfHits(copyNumberOfHits);
                } else {
                    if (numberOfHitsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfHits = null;
                    }
                }
            }
            {
                Boolean numberOfListingsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.numberOfListings!= null));
                if (numberOfListingsShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceNumberOfListings;
                    sourceNumberOfListings = this.getNumberOfListings();
                    Long copyNumberOfListings = ((Long) strategy.copy(LocatorUtils.property(locator, "numberOfListings", sourceNumberOfListings), sourceNumberOfListings, (this.numberOfListings!= null)));
                    copy.setNumberOfListings(copyNumberOfListings);
                } else {
                    if (numberOfListingsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.numberOfListings = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Paging();
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
        final Paging that = ((Paging) object);
        {
            ReferenceLink lhsNext;
            lhsNext = this.getNext();
            ReferenceLink rhsNext;
            rhsNext = that.getNext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "next", lhsNext), LocatorUtils.property(thatLocator, "next", rhsNext), lhsNext, rhsNext, (this.next!= null), (that.next!= null))) {
                return false;
            }
        }
        {
            ReferenceLink lhsPrevious;
            lhsPrevious = this.getPrevious();
            ReferenceLink rhsPrevious;
            rhsPrevious = that.getPrevious();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previous", lhsPrevious), LocatorUtils.property(thatLocator, "previous", rhsPrevious), lhsPrevious, rhsPrevious, (this.previous!= null), (that.previous!= null))) {
                return false;
            }
        }
        {
            ReferenceLink lhsCurrent;
            lhsCurrent = this.getCurrent();
            ReferenceLink rhsCurrent;
            rhsCurrent = that.getCurrent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "current", lhsCurrent), LocatorUtils.property(thatLocator, "current", rhsCurrent), lhsCurrent, rhsCurrent, (this.current!= null), (that.current!= null))) {
                return false;
            }
        }
        {
            Long lhsPageNumber;
            lhsPageNumber = this.getPageNumber();
            Long rhsPageNumber;
            rhsPageNumber = that.getPageNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageNumber", lhsPageNumber), LocatorUtils.property(thatLocator, "pageNumber", rhsPageNumber), lhsPageNumber, rhsPageNumber, (this.pageNumber!= null), (that.pageNumber!= null))) {
                return false;
            }
        }
        {
            Long lhsPageSize;
            lhsPageSize = this.getPageSize();
            Long rhsPageSize;
            rhsPageSize = that.getPageSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pageSize", lhsPageSize), LocatorUtils.property(thatLocator, "pageSize", rhsPageSize), lhsPageSize, rhsPageSize, (this.pageSize!= null), (that.pageSize!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfPages;
            lhsNumberOfPages = this.getNumberOfPages();
            Long rhsNumberOfPages;
            rhsNumberOfPages = that.getNumberOfPages();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfPages", lhsNumberOfPages), LocatorUtils.property(thatLocator, "numberOfPages", rhsNumberOfPages), lhsNumberOfPages, rhsNumberOfPages, (this.numberOfPages!= null), (that.numberOfPages!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfHits;
            lhsNumberOfHits = this.getNumberOfHits();
            Long rhsNumberOfHits;
            rhsNumberOfHits = that.getNumberOfHits();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfHits", lhsNumberOfHits), LocatorUtils.property(thatLocator, "numberOfHits", rhsNumberOfHits), lhsNumberOfHits, rhsNumberOfHits, (this.numberOfHits!= null), (that.numberOfHits!= null))) {
                return false;
            }
        }
        {
            Long lhsNumberOfListings;
            lhsNumberOfListings = this.getNumberOfListings();
            Long rhsNumberOfListings;
            rhsNumberOfListings = that.getNumberOfListings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberOfListings", lhsNumberOfListings), LocatorUtils.property(thatLocator, "numberOfListings", rhsNumberOfListings), lhsNumberOfListings, rhsNumberOfListings, (this.numberOfListings!= null), (that.numberOfListings!= null))) {
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
