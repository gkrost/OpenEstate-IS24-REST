package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
import org.openestate.is24.restapi.xml.Adapter2;


/**
 * Objekt das den Zusammenhang zwischen einer Immobilie und einem
 *                 Veröffentlichungskanal beschreibt.
 * 
 * <p>Java class for PublishObject complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PublishObject">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="realEstate">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 <attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
 *                 <attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel"/>
 *         <element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="0" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishObject", propOrder = {
    "realEstate",
    "publishChannel"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class PublishObject implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected PublishObject.RealEstate realEstate;
    /**
     * Verweis auf einen Veröffentlichungskanal.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected PublishChannel publishChannel;
    /**
     * IS24 ID des Veröffentlichungsobjektes
     * 
     */
    @XmlAttribute(name = "id")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String id;

    /**
     * Gets the value of the realEstate property.
     * 
     * @return
     *     possible object is
     *     {@link PublishObject.RealEstate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public PublishObject.RealEstate getRealEstate() {
        return realEstate;
    }

    /**
     * Sets the value of the realEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishObject.RealEstate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstate(PublishObject.RealEstate value) {
        this.realEstate = value;
    }

    /**
     * Verweis auf einen Veröffentlichungskanal.
     * 
     * @return
     *     possible object is
     *     {@link PublishChannel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public PublishChannel getPublishChannel() {
        return publishChannel;
    }

    /**
     * Sets the value of the publishChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublishChannel }
     *     
     * @see #getPublishChannel()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPublishChannel(PublishChannel value) {
        this.publishChannel = value;
    }

    /**
     * IS24 ID des Veröffentlichungsobjektes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setId(String value) {
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
            PublishObject.RealEstate theRealEstate;
            theRealEstate = this.getRealEstate();
            strategy.appendField(locator, this, "realEstate", buffer, theRealEstate, (this.realEstate!= null));
        }
        {
            PublishChannel thePublishChannel;
            thePublishChannel = this.getPublishChannel();
            strategy.appendField(locator, this, "publishChannel", buffer, thePublishChannel, (this.publishChannel!= null));
        }
        {
            String theId;
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
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PublishObject) {
            final PublishObject copy = ((PublishObject) draftCopy);
            {
                Boolean realEstateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstate!= null));
                if (realEstateShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishObject.RealEstate sourceRealEstate;
                    sourceRealEstate = this.getRealEstate();
                    PublishObject.RealEstate copyRealEstate = ((PublishObject.RealEstate) strategy.copy(LocatorUtils.property(locator, "realEstate", sourceRealEstate), sourceRealEstate, (this.realEstate!= null)));
                    copy.setRealEstate(copyRealEstate);
                } else {
                    if (realEstateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstate = null;
                    }
                }
            }
            {
                Boolean publishChannelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.publishChannel!= null));
                if (publishChannelShouldBeCopiedAndSet == Boolean.TRUE) {
                    PublishChannel sourcePublishChannel;
                    sourcePublishChannel = this.getPublishChannel();
                    PublishChannel copyPublishChannel = ((PublishChannel) strategy.copy(LocatorUtils.property(locator, "publishChannel", sourcePublishChannel), sourcePublishChannel, (this.publishChannel!= null)));
                    copy.setPublishChannel(copyPublishChannel);
                } else {
                    if (publishChannelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannel = null;
                    }
                }
            }
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceId;
                    sourceId = this.getId();
                    String copyId = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId, (this.id!= null)));
                    copy.setId(copyId);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new PublishObject();
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
        final PublishObject that = ((PublishObject) object);
        {
            PublishObject.RealEstate lhsRealEstate;
            lhsRealEstate = this.getRealEstate();
            PublishObject.RealEstate rhsRealEstate;
            rhsRealEstate = that.getRealEstate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstate", lhsRealEstate), LocatorUtils.property(thatLocator, "realEstate", rhsRealEstate), lhsRealEstate, rhsRealEstate, (this.realEstate!= null), (that.realEstate!= null))) {
                return false;
            }
        }
        {
            PublishChannel lhsPublishChannel;
            lhsPublishChannel = this.getPublishChannel();
            PublishChannel rhsPublishChannel;
            rhsPublishChannel = that.getPublishChannel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannel", lhsPublishChannel), LocatorUtils.property(thatLocator, "publishChannel", rhsPublishChannel), lhsPublishChannel, rhsPublishChannel, (this.publishChannel!= null), (that.publishChannel!= null))) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
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


    /**
     * Verweis auf eine Immobilie.
     * 
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       <attribute name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" />
     *       <attribute name="firstActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
    public static class RealEstate implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        /**
         * Id des Elements.
         * 
         */
        @XmlAttribute(name = "id")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Long id;
        /**
         * Title des Elements.
         * 
         */
        @XmlAttribute(name = "title")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected String title;
        /**
         * Veröffentlichungsatum auf IS24
         * 
         */
        @XmlAttribute(name = "firstActivationDate")
        @XmlJavaTypeAdapter(Adapter2 .class)
        @XmlSchemaType(name = "dateTime")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected Calendar firstActivationDate;

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
         * Title des Elements.
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
         * Veröffentlichungsatum auf IS24
         * 
         * @return
         *     possible object is
         *     {@link Calendar }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Calendar getFirstActivationDate() {
            return firstActivationDate;
        }

        /**
         * Sets the value of the firstActivationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Calendar }
         *     
         * @see #getFirstActivationDate()
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public void setFirstActivationDate(Calendar value) {
            this.firstActivationDate = value;
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
                Long theId;
                theId = this.getId();
                strategy.appendField(locator, this, "id", buffer, theId, (this.id!= null));
            }
            {
                String theTitle;
                theTitle = this.getTitle();
                strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
            }
            {
                Calendar theFirstActivationDate;
                theFirstActivationDate = this.getFirstActivationDate();
                strategy.appendField(locator, this, "firstActivationDate", buffer, theFirstActivationDate, (this.firstActivationDate!= null));
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
            if (draftCopy instanceof PublishObject.RealEstate) {
                final PublishObject.RealEstate copy = ((PublishObject.RealEstate) draftCopy);
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
                    Boolean firstActivationDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.firstActivationDate!= null));
                    if (firstActivationDateShouldBeCopiedAndSet == Boolean.TRUE) {
                        Calendar sourceFirstActivationDate;
                        sourceFirstActivationDate = this.getFirstActivationDate();
                        Calendar copyFirstActivationDate = ((Calendar) strategy.copy(LocatorUtils.property(locator, "firstActivationDate", sourceFirstActivationDate), sourceFirstActivationDate, (this.firstActivationDate!= null)));
                        copy.setFirstActivationDate(copyFirstActivationDate);
                    } else {
                        if (firstActivationDateShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.firstActivationDate = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new PublishObject.RealEstate();
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
            final PublishObject.RealEstate that = ((PublishObject.RealEstate) object);
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
                String lhsTitle;
                lhsTitle = this.getTitle();
                String rhsTitle;
                rhsTitle = that.getTitle();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                    return false;
                }
            }
            {
                Calendar lhsFirstActivationDate;
                lhsFirstActivationDate = this.getFirstActivationDate();
                Calendar rhsFirstActivationDate;
                rhsFirstActivationDate = that.getFirstActivationDate();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "firstActivationDate", lhsFirstActivationDate), LocatorUtils.property(thatLocator, "firstActivationDate", rhsFirstActivationDate), lhsFirstActivationDate, rhsFirstActivationDate, (this.firstActivationDate!= null), (that.firstActivationDate!= null))) {
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
