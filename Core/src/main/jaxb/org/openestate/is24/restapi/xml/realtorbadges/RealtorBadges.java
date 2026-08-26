package org.openestate.is24.restapi.xml.realtorbadges;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * <p>Java class for RealtorBadges complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RealtorBadges">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="badges">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="badge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}Badge" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="virtualBadges" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="virtualBadge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}VirtualBadge" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealtorBadges", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealtorBadges implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealtorBadges.Badges badges;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealtorBadges.VirtualBadges virtualBadges;

    /**
     * Gets the value of the badges property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorBadges.Badges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealtorBadges.Badges getBadges() {
        return badges;
    }

    /**
     * Sets the value of the badges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorBadges.Badges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBadges(RealtorBadges.Badges value) {
        this.badges = value;
    }

    /**
     * Gets the value of the virtualBadges property.
     * 
     * @return
     *     possible object is
     *     {@link RealtorBadges.VirtualBadges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealtorBadges.VirtualBadges getVirtualBadges() {
        return virtualBadges;
    }

    /**
     * Sets the value of the virtualBadges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealtorBadges.VirtualBadges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setVirtualBadges(RealtorBadges.VirtualBadges value) {
        this.virtualBadges = value;
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
            RealtorBadges.Badges theBadges;
            theBadges = this.getBadges();
            strategy.appendField(locator, this, "badges", buffer, theBadges, (this.badges!= null));
        }
        {
            RealtorBadges.VirtualBadges theVirtualBadges;
            theVirtualBadges = this.getVirtualBadges();
            strategy.appendField(locator, this, "virtualBadges", buffer, theVirtualBadges, (this.virtualBadges!= null));
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
        if (draftCopy instanceof RealtorBadges) {
            final RealtorBadges copy = ((RealtorBadges) draftCopy);
            {
                Boolean badgesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.badges!= null));
                if (badgesShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorBadges.Badges sourceBadges;
                    sourceBadges = this.getBadges();
                    RealtorBadges.Badges copyBadges = ((RealtorBadges.Badges) strategy.copy(LocatorUtils.property(locator, "badges", sourceBadges), sourceBadges, (this.badges!= null)));
                    copy.setBadges(copyBadges);
                } else {
                    if (badgesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.badges = null;
                    }
                }
            }
            {
                Boolean virtualBadgesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.virtualBadges!= null));
                if (virtualBadgesShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealtorBadges.VirtualBadges sourceVirtualBadges;
                    sourceVirtualBadges = this.getVirtualBadges();
                    RealtorBadges.VirtualBadges copyVirtualBadges = ((RealtorBadges.VirtualBadges) strategy.copy(LocatorUtils.property(locator, "virtualBadges", sourceVirtualBadges), sourceVirtualBadges, (this.virtualBadges!= null)));
                    copy.setVirtualBadges(copyVirtualBadges);
                } else {
                    if (virtualBadgesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.virtualBadges = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RealtorBadges();
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
        final RealtorBadges that = ((RealtorBadges) object);
        {
            RealtorBadges.Badges lhsBadges;
            lhsBadges = this.getBadges();
            RealtorBadges.Badges rhsBadges;
            rhsBadges = that.getBadges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "badges", lhsBadges), LocatorUtils.property(thatLocator, "badges", rhsBadges), lhsBadges, rhsBadges, (this.badges!= null), (that.badges!= null))) {
                return false;
            }
        }
        {
            RealtorBadges.VirtualBadges lhsVirtualBadges;
            lhsVirtualBadges = this.getVirtualBadges();
            RealtorBadges.VirtualBadges rhsVirtualBadges;
            rhsVirtualBadges = that.getVirtualBadges();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualBadges", lhsVirtualBadges), LocatorUtils.property(thatLocator, "virtualBadges", rhsVirtualBadges), lhsVirtualBadges, rhsVirtualBadges, (this.virtualBadges!= null), (that.virtualBadges!= null))) {
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
     *       <sequence>
     *         <element name="badge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}Badge" maxOccurs="unbounded" minOccurs="0"/>
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
        "badge"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public static class Badges implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected List<Badge> badge;

        /**
         * Gets the value of the badge property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the badge property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBadge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Badge }
         * </p>
         * 
         * 
         * @return
         *     The value of the badge property.
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public List<Badge> getBadge() {
            if (badge == null) {
                badge = new ArrayList<>();
            }
            return this.badge;
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
                List<Badge> theBadge;
                theBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                strategy.appendField(locator, this, "badge", buffer, theBadge, ((this.badge!= null)&&(!this.badge.isEmpty())));
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
            if (draftCopy instanceof RealtorBadges.Badges) {
                final RealtorBadges.Badges copy = ((RealtorBadges.Badges) draftCopy);
                {
                    Boolean badgeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.badge!= null)&&(!this.badge.isEmpty())));
                    if (badgeShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<Badge> sourceBadge;
                        sourceBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                        @SuppressWarnings("unchecked")
                        List<Badge> copyBadge = ((List<Badge> ) strategy.copy(LocatorUtils.property(locator, "badge", sourceBadge), sourceBadge, ((this.badge!= null)&&(!this.badge.isEmpty()))));
                        copy.badge = null;
                        if (copyBadge!= null) {
                            List<Badge> uniqueBadgel = copy.getBadge();
                            uniqueBadgel.addAll(copyBadge);
                        }
                    } else {
                        if (badgeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.badge = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new RealtorBadges.Badges();
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
            final RealtorBadges.Badges that = ((RealtorBadges.Badges) object);
            {
                List<Badge> lhsBadge;
                lhsBadge = (((this.badge!= null)&&(!this.badge.isEmpty()))?this.getBadge():null);
                List<Badge> rhsBadge;
                rhsBadge = (((that.badge!= null)&&(!that.badge.isEmpty()))?that.getBadge():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "badge", lhsBadge), LocatorUtils.property(thatLocator, "badge", rhsBadge), lhsBadge, rhsBadge, ((this.badge!= null)&&(!this.badge.isEmpty())), ((that.badge!= null)&&(!that.badge.isEmpty())))) {
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
     *         <element name="virtualBadge" type="{http://rest.immobilienscout24.de/schema/offer/realtorbadges/1.0}VirtualBadge" maxOccurs="unbounded" minOccurs="0"/>
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
        "virtualBadge"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public static class VirtualBadges implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected List<VirtualBadge> virtualBadge;

        /**
         * Gets the value of the virtualBadge property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the virtualBadge property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getVirtualBadge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirtualBadge }
         * </p>
         * 
         * 
         * @return
         *     The value of the virtualBadge property.
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public List<VirtualBadge> getVirtualBadge() {
            if (virtualBadge == null) {
                virtualBadge = new ArrayList<>();
            }
            return this.virtualBadge;
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
                List<VirtualBadge> theVirtualBadge;
                theVirtualBadge = (((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty()))?this.getVirtualBadge():null);
                strategy.appendField(locator, this, "virtualBadge", buffer, theVirtualBadge, ((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty())));
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
            if (draftCopy instanceof RealtorBadges.VirtualBadges) {
                final RealtorBadges.VirtualBadges copy = ((RealtorBadges.VirtualBadges) draftCopy);
                {
                    Boolean virtualBadgeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty())));
                    if (virtualBadgeShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<VirtualBadge> sourceVirtualBadge;
                        sourceVirtualBadge = (((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty()))?this.getVirtualBadge():null);
                        @SuppressWarnings("unchecked")
                        List<VirtualBadge> copyVirtualBadge = ((List<VirtualBadge> ) strategy.copy(LocatorUtils.property(locator, "virtualBadge", sourceVirtualBadge), sourceVirtualBadge, ((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty()))));
                        copy.virtualBadge = null;
                        if (copyVirtualBadge!= null) {
                            List<VirtualBadge> uniqueVirtualBadgel = copy.getVirtualBadge();
                            uniqueVirtualBadgel.addAll(copyVirtualBadge);
                        }
                    } else {
                        if (virtualBadgeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.virtualBadge = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new RealtorBadges.VirtualBadges();
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
            final RealtorBadges.VirtualBadges that = ((RealtorBadges.VirtualBadges) object);
            {
                List<VirtualBadge> lhsVirtualBadge;
                lhsVirtualBadge = (((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty()))?this.getVirtualBadge():null);
                List<VirtualBadge> rhsVirtualBadge;
                rhsVirtualBadge = (((that.virtualBadge!= null)&&(!that.virtualBadge.isEmpty()))?that.getVirtualBadge():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "virtualBadge", lhsVirtualBadge), LocatorUtils.property(thatLocator, "virtualBadge", rhsVirtualBadge), lhsVirtualBadge, rhsVirtualBadge, ((this.virtualBadge!= null)&&(!this.virtualBadge.isEmpty())), ((that.virtualBadge!= null)&&(!that.virtualBadge.isEmpty())))) {
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
