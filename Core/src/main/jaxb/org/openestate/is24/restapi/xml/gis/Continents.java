package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.Adapter4;


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
 *         <element name="Continent" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
    "continent"
})
@XmlRootElement(name = "continents")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Continents implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Continent")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<Continents.Continent> continent;

    /**
     * Gets the value of the continent property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the continent property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContinent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Continents.Continent }
     * </p>
     * 
     * 
     * @return
     *     The value of the continent property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<Continents.Continent> getContinent() {
        if (continent == null) {
            continent = new ArrayList<>();
        }
        return this.continent;
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
            List<Continents.Continent> theContinent;
            theContinent = (((this.continent!= null)&&(!this.continent.isEmpty()))?this.getContinent():null);
            strategy.appendField(locator, this, "continent", buffer, theContinent, ((this.continent!= null)&&(!this.continent.isEmpty())));
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
        if (draftCopy instanceof Continents) {
            final Continents copy = ((Continents) draftCopy);
            {
                Boolean continentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.continent!= null)&&(!this.continent.isEmpty())));
                if (continentShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Continents.Continent> sourceContinent;
                    sourceContinent = (((this.continent!= null)&&(!this.continent.isEmpty()))?this.getContinent():null);
                    @SuppressWarnings("unchecked")
                    List<Continents.Continent> copyContinent = ((List<Continents.Continent> ) strategy.copy(LocatorUtils.property(locator, "continent", sourceContinent), sourceContinent, ((this.continent!= null)&&(!this.continent.isEmpty()))));
                    copy.continent = null;
                    if (copyContinent!= null) {
                        List<Continents.Continent> uniqueContinentl = copy.getContinent();
                        uniqueContinentl.addAll(copyContinent);
                    }
                } else {
                    if (continentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.continent = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Continents();
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
        final Continents that = ((Continents) object);
        {
            List<Continents.Continent> lhsContinent;
            lhsContinent = (((this.continent!= null)&&(!this.continent.isEmpty()))?this.getContinent():null);
            List<Continents.Continent> rhsContinent;
            rhsContinent = (((that.continent!= null)&&(!that.continent.isEmpty()))?that.getContinent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "continent", lhsContinent), LocatorUtils.property(thatLocator, "continent", rhsContinent), lhsContinent, rhsContinent, ((this.continent!= null)&&(!this.continent.isEmpty())), ((that.continent!= null)&&(!that.continent.isEmpty())))) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attGroup ref="{http://rest.immobilienscout24.de/schema/common/1.0}Reference"/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public static class Continent implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

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
         * Id des Elements.
         * 
         */
        @XmlAttribute(name = "id")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Long id;
        /**
         * Lesbarer Name des Elements (wenn vorhanden).
         * 
         */
        @XmlAttribute(name = "label")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected String label;
        /**
         * Datum der letzten Veränderung der Entität.
         * 
         */
        @XmlAttribute(name = "modification")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Calendar modification;
        /**
         * Datum der letzten Veränderung der Entität.
         * 
         */
        @XmlAttribute(name = "creation")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Calendar creation;
        /**
         * Datum der ersten Einstellung der Entität.
         * 
         */
        @XmlAttribute(name = "publishDate")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Calendar publishDate;

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

        /**
         * Id des Elements.
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

        /**
         * Lesbarer Name des Elements (wenn vorhanden).
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public String getLabel() {
            return label;
        }

        /**
         * Sets the value of the label property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLabel()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setLabel(String value) {
            this.label = value;
        }

        /**
         * Datum der letzten Veränderung der Entität.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Calendar getModification() {
            return modification;
        }

        /**
         * Sets the value of the modification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         * @see #getModification()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setModification(Calendar value) {
            this.modification = value;
        }

        /**
         * Datum der letzten Veränderung der Entität.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Calendar getCreation() {
            return creation;
        }

        /**
         * Sets the value of the creation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         * @see #getCreation()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setCreation(Calendar value) {
            this.creation = value;
        }

        /**
         * Datum der ersten Einstellung der Entität.
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Calendar getPublishDate() {
            return publishDate;
        }

        /**
         * Sets the value of the publishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         * @see #getPublishDate()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setPublishDate(Calendar value) {
            this.publishDate = value;
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
                URI theHref;
                theHref = this.getHref();
                strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
            }
            {
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theLabel;
                theLabel = this.getLabel();
                strategy.appendField(locator, this, "label", buffer, theLabel, (this.label!= null));
            }
            {
                Calendar theModification;
                theModification = this.getModification();
                strategy.appendField(locator, this, "modification", buffer, theModification, (this.modification!= null));
            }
            {
                Calendar theCreation;
                theCreation = this.getCreation();
                strategy.appendField(locator, this, "creation", buffer, theCreation, (this.creation!= null));
            }
            {
                Calendar thePublishDate;
                thePublishDate = this.getPublishDate();
                strategy.appendField(locator, this, "publishDate", buffer, thePublishDate, (this.publishDate!= null));
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
            if (draftCopy instanceof Continents.Continent) {
                final Continents.Continent copy = ((Continents.Continent) draftCopy);
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
                {
                    Boolean labelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.label!= null));
                    if (labelShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceLabel;
                        sourceLabel = this.getLabel();
                        String copyLabel = ((String) strategy.copy(LocatorUtils.property(locator, "label", sourceLabel), sourceLabel, (this.label!= null)));
                        copy.setLabel(copyLabel);
                    } else {
                        if (labelShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.label = null;
                        }
                    }
                }
                {
                    Boolean modificationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.modification!= null));
                    if (modificationShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceModification;
                        sourceModification = this.getModification();
                        Calendar copyModification = ((Calendar) strategy.copy(LocatorUtils.property(locator, "modification", sourceModification), sourceModification, (this.modification!= null)));
                        copy.setModification(copyModification);
                    } else {
                        if (modificationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.modification = null;
                        }
                    }
                }
                {
                    Boolean creationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creation!= null));
                    if (creationShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceCreation;
                        sourceCreation = this.getCreation();
                        Calendar copyCreation = ((Calendar) strategy.copy(LocatorUtils.property(locator, "creation", sourceCreation), sourceCreation, (this.creation!= null)));
                        copy.setCreation(copyCreation);
                    } else {
                        if (creationShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.creation = null;
                        }
                    }
                }
                {
                    Boolean publishDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishDate!= null));
                    if (publishDateShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourcePublishDate;
                        sourcePublishDate = this.getPublishDate();
                        Calendar copyPublishDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "publishDate", sourcePublishDate), sourcePublishDate, (this.publishDate!= null)));
                        copy.setPublishDate(copyPublishDate);
                    } else {
                        if (publishDateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.publishDate = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new Continents.Continent();
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
            final Continents.Continent that = ((Continents.Continent) object);
            {
                URI lhsHref;
                lhsHref = this.getHref();
                URI rhsHref;
                rhsHref = that.getHref();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
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
            {
                String lhsLabel;
                lhsLabel = this.getLabel();
                String rhsLabel;
                rhsLabel = that.getLabel();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel, (this.label!= null), (that.label!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsModification;
                lhsModification = this.getModification();
                Calendar rhsModification;
                rhsModification = that.getModification();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "modification", lhsModification), LocatorUtils.property(thatLocator, "modification", rhsModification), lhsModification, rhsModification, (this.modification!= null), (that.modification!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsCreation;
                lhsCreation = this.getCreation();
                Calendar rhsCreation;
                rhsCreation = that.getCreation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "creation", lhsCreation), LocatorUtils.property(thatLocator, "creation", rhsCreation), lhsCreation, rhsCreation, (this.creation!= null), (that.creation!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsPublishDate;
                lhsPublishDate = this.getPublishDate();
                Calendar rhsPublishDate;
                rhsPublishDate = that.getPublishDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "publishDate", lhsPublishDate), LocatorUtils.property(thatLocator, "publishDate", rhsPublishDate), lhsPublishDate, rhsPublishDate, (this.publishDate!= null), (that.publishDate!= null))) {
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

}
