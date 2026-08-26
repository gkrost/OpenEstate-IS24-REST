package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.offerlistelement.OfferRealEstateForList;


/**
 * Allgemeine Elemente für alle Immobilienarten.
 * 
 * <p>Java class for AbstractRealEstateForList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AbstractRealEstateForList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="externalId" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         <element name="title">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="address" type="{http://rest.immobilienscout24.de/schema/common/1.0}Wgs84Address"/>
 *         <element name="apiSearchData" type="{http://rest.immobilienscout24.de/schema/common/1.0}ApiSearchData" minOccurs="0"/>
 *         <element name="realEstateState" type="{http://rest.immobilienscout24.de/schema/common/1.0}RealEstateState" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRealEstateForList", propOrder = {
    "externalId",
    "title",
    "creationDate",
    "lastModificationDate",
    "address",
    "apiSearchData",
    "realEstateState"
})
@XmlSeeAlso({
    OfferRealEstateForList.class,
    AbstractRealEstate.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public abstract class AbstractRealEstateForList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Repräsentiert eine kundenspezifische Referenz einer Immobilie.
     *                         Der Kennzeichner muss eineindeutig in Verbindung mit der Kundennummer sein.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String externalId;
    /**
     * Überschrift/Titel des Angebots
     * 
     */
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String title;
    /**
     * Erstelldatum des Angebots
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar creationDate;
    /**
     * Letztes Änderungsdatum
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar lastModificationDate;
    /**
     * Die Adresse der Immobilie
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Wgs84Address address;
    /**
     * Enthält die Informationen für die API Suche einer Immobilie.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected ApiSearchData apiSearchData;
    /**
     * Veröffentlichungsstatus einer Immobilie.
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealEstateState realEstateState;
    /**
     * IS24 ID der Immobilie
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long id;

    /**
     * Repräsentiert eine kundenspezifische Referenz einer Immobilie.
     *                         Der Kennzeichner muss eineindeutig in Verbindung mit der Kundennummer sein.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExternalId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Überschrift/Titel des Angebots
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTitle()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Erstelldatum des Angebots
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getCreationDate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCreationDate(Calendar value) {
        this.creationDate = value;
    }

    /**
     * Letztes Änderungsdatum
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getLastModificationDate() {
        return lastModificationDate;
    }

    /**
     * Sets the value of the lastModificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getLastModificationDate()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLastModificationDate(Calendar value) {
        this.lastModificationDate = value;
    }

    /**
     * Die Adresse der Immobilie
     * 
     * @return
     *     possible object is
     *     {@link Wgs84Address }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Wgs84Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wgs84Address }
     *     
     * @see #getAddress()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAddress(Wgs84Address value) {
        this.address = value;
    }

    /**
     * Enthält die Informationen für die API Suche einer Immobilie.
     * 
     * @return
     *     possible object is
     *     {@link ApiSearchData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public ApiSearchData getApiSearchData() {
        return apiSearchData;
    }

    /**
     * Sets the value of the apiSearchData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSearchData }
     *     
     * @see #getApiSearchData()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setApiSearchData(ApiSearchData value) {
        this.apiSearchData = value;
    }

    /**
     * Veröffentlichungsstatus einer Immobilie.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateState }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealEstateState getRealEstateState() {
        return realEstateState;
    }

    /**
     * Sets the value of the realEstateState property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateState }
     *     
     * @see #getRealEstateState()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstateState(RealEstateState value) {
        this.realEstateState = value;
    }

    /**
     * IS24 ID der Immobilie
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setId(Long value) {
        this.id = value;
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
            String theExternalId;
            theExternalId = this.getExternalId();
            strategy.appendField(locator, this, "externalId", buffer, theExternalId, (this.externalId!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            Calendar theCreationDate;
            theCreationDate = this.getCreationDate();
            strategy.appendField(locator, this, "creationDate", buffer, theCreationDate, (this.creationDate!= null));
        }
        {
            Calendar theLastModificationDate;
            theLastModificationDate = this.getLastModificationDate();
            strategy.appendField(locator, this, "lastModificationDate", buffer, theLastModificationDate, (this.lastModificationDate!= null));
        }
        {
            Wgs84Address theAddress;
            theAddress = this.getAddress();
            strategy.appendField(locator, this, "address", buffer, theAddress, (this.address!= null));
        }
        {
            ApiSearchData theApiSearchData;
            theApiSearchData = this.getApiSearchData();
            strategy.appendField(locator, this, "apiSearchData", buffer, theApiSearchData, (this.apiSearchData!= null));
        }
        {
            RealEstateState theRealEstateState;
            theRealEstateState = this.getRealEstateState();
            strategy.appendField(locator, this, "realEstateState", buffer, theRealEstateState, (this.realEstateState!= null));
        }
        {
            Long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
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
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof AbstractRealEstateForList) {
            final AbstractRealEstateForList copy = ((AbstractRealEstateForList) target);
            {
                Boolean externalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.externalId!= null));
                if (externalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceExternalId;
                    sourceExternalId = this.getExternalId();
                    String copyExternalId = ((String) strategy.copy(LocatorUtils.property(locator, "externalId", sourceExternalId), sourceExternalId, (this.externalId!= null)));
                    copy.setExternalId(copyExternalId);
                } else {
                    if (externalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.externalId = null;
                    }
                }
            }
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.title!= null));
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, (this.title!= null)));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
            {
                Boolean creationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creationDate!= null));
                if (creationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceCreationDate;
                    sourceCreationDate = this.getCreationDate();
                    Calendar copyCreationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creationDate", sourceCreationDate), sourceCreationDate, (this.creationDate!= null)));
                    copy.setCreationDate(copyCreationDate);
                } else {
                    if (creationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.creationDate = null;
                    }
                }
            }
            {
                Boolean lastModificationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastModificationDate!= null));
                if (lastModificationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceLastModificationDate;
                    sourceLastModificationDate = this.getLastModificationDate();
                    Calendar copyLastModificationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "lastModificationDate", sourceLastModificationDate), sourceLastModificationDate, (this.lastModificationDate!= null)));
                    copy.setLastModificationDate(copyLastModificationDate);
                } else {
                    if (lastModificationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.lastModificationDate = null;
                    }
                }
            }
            {
                Boolean addressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.address!= null));
                if (addressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Wgs84Address sourceAddress;
                    sourceAddress = this.getAddress();
                    Wgs84Address copyAddress = ((Wgs84Address) strategy.copy(LocatorUtils.property(locator, "address", sourceAddress), sourceAddress, (this.address!= null)));
                    copy.setAddress(copyAddress);
                } else {
                    if (addressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.address = null;
                    }
                }
            }
            {
                Boolean apiSearchDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.apiSearchData!= null));
                if (apiSearchDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ApiSearchData sourceApiSearchData;
                    sourceApiSearchData = this.getApiSearchData();
                    ApiSearchData copyApiSearchData = ((ApiSearchData) strategy.copy(LocatorUtils.property(locator, "apiSearchData", sourceApiSearchData), sourceApiSearchData, (this.apiSearchData!= null)));
                    copy.setApiSearchData(copyApiSearchData);
                } else {
                    if (apiSearchDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.apiSearchData = null;
                    }
                }
            }
            {
                Boolean realEstateStateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateState!= null));
                if (realEstateStateShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateState sourceRealEstateState;
                    sourceRealEstateState = this.getRealEstateState();
                    RealEstateState copyRealEstateState = ((RealEstateState) strategy.copy(LocatorUtils.property(locator, "realEstateState", sourceRealEstateState), sourceRealEstateState, (this.realEstateState!= null)));
                    copy.setRealEstateState(copyRealEstateState);
                } else {
                    if (realEstateStateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateState = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceId;
                    sourceId = this.getId();
                    Long copyId = ((Long) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return target;
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
        final AbstractRealEstateForList that = ((AbstractRealEstateForList) object);
        {
            String lhsExternalId;
            lhsExternalId = this.getExternalId();
            String rhsExternalId;
            rhsExternalId = that.getExternalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "externalId", lhsExternalId), LocatorUtils.property(thatLocator, "externalId", rhsExternalId), lhsExternalId, rhsExternalId, (this.externalId!= null), (that.externalId!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                return false;
            }
        }
        {
            Calendar lhsCreationDate;
            lhsCreationDate = this.getCreationDate();
            Calendar rhsCreationDate;
            rhsCreationDate = that.getCreationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creationDate", lhsCreationDate), LocatorUtils.property(thatLocator, "creationDate", rhsCreationDate), lhsCreationDate, rhsCreationDate, (this.creationDate!= null), (that.creationDate!= null))) {
                return false;
            }
        }
        {
            Calendar lhsLastModificationDate;
            lhsLastModificationDate = this.getLastModificationDate();
            Calendar rhsLastModificationDate;
            rhsLastModificationDate = that.getLastModificationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModificationDate", lhsLastModificationDate), LocatorUtils.property(thatLocator, "lastModificationDate", rhsLastModificationDate), lhsLastModificationDate, rhsLastModificationDate, (this.lastModificationDate!= null), (that.lastModificationDate!= null))) {
                return false;
            }
        }
        {
            Wgs84Address lhsAddress;
            lhsAddress = this.getAddress();
            Wgs84Address rhsAddress;
            rhsAddress = that.getAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "address", lhsAddress), LocatorUtils.property(thatLocator, "address", rhsAddress), lhsAddress, rhsAddress, (this.address!= null), (that.address!= null))) {
                return false;
            }
        }
        {
            ApiSearchData lhsApiSearchData;
            lhsApiSearchData = this.getApiSearchData();
            ApiSearchData rhsApiSearchData;
            rhsApiSearchData = that.getApiSearchData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apiSearchData", lhsApiSearchData), LocatorUtils.property(thatLocator, "apiSearchData", rhsApiSearchData), lhsApiSearchData, rhsApiSearchData, (this.apiSearchData!= null), (that.apiSearchData!= null))) {
                return false;
            }
        }
        {
            RealEstateState lhsRealEstateState;
            lhsRealEstateState = this.getRealEstateState();
            RealEstateState rhsRealEstateState;
            rhsRealEstateState = that.getRealEstateState();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateState", lhsRealEstateState), LocatorUtils.property(thatLocator, "realEstateState", rhsRealEstateState), lhsRealEstateState, rhsRealEstateState, (this.realEstateState!= null), (that.realEstateState!= null))) {
                return false;
            }
        }
        {
            Long lhsId;
            lhsId = this.getId();
            Long rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
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
