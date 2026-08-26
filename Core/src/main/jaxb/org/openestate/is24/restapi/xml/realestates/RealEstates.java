package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
import org.openestate.is24.restapi.xml.common.Paging;
import org.openestate.is24.restapi.xml.offerlistelement.RealEstateList;


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
 *         <element name="Paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging"/>
 *         <element name="realEstateList" type="{http://rest.immobilienscout24.de/schema/offer/listelement/1.0}realEstateList"/>
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
    "paging",
    "realEstateList"
})
@XmlRootElement(name = "realEstates")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RealEstates implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "Paging", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Paging paging;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RealEstateList realEstateList;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the realEstateList property.
     * 
     * @return
     *     possible object is
     *     {@link RealEstateList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RealEstateList getRealEstateList() {
        return realEstateList;
    }

    /**
     * Sets the value of the realEstateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealEstateList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRealEstateList(RealEstateList value) {
        this.realEstateList = value;
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
            Paging thePaging;
            thePaging = this.getPaging();
            strategy.appendField(locator, this, "paging", buffer, thePaging, (this.paging!= null));
        }
        {
            RealEstateList theRealEstateList;
            theRealEstateList = this.getRealEstateList();
            strategy.appendField(locator, this, "realEstateList", buffer, theRealEstateList, (this.realEstateList!= null));
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
        if (draftCopy instanceof RealEstates) {
            final RealEstates copy = ((RealEstates) draftCopy);
            {
                Boolean pagingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.paging!= null));
                if (pagingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Paging sourcePaging;
                    sourcePaging = this.getPaging();
                    Paging copyPaging = ((Paging) strategy.copy(LocatorUtils.property(locator, "paging", sourcePaging), sourcePaging, (this.paging!= null)));
                    copy.setPaging(copyPaging);
                } else {
                    if (pagingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paging = null;
                    }
                }
            }
            {
                Boolean realEstateListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.realEstateList!= null));
                if (realEstateListShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealEstateList sourceRealEstateList;
                    sourceRealEstateList = this.getRealEstateList();
                    RealEstateList copyRealEstateList = ((RealEstateList) strategy.copy(LocatorUtils.property(locator, "realEstateList", sourceRealEstateList), sourceRealEstateList, (this.realEstateList!= null)));
                    copy.setRealEstateList(copyRealEstateList);
                } else {
                    if (realEstateListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.realEstateList = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RealEstates();
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
        final RealEstates that = ((RealEstates) object);
        {
            Paging lhsPaging;
            lhsPaging = this.getPaging();
            Paging rhsPaging;
            rhsPaging = that.getPaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paging", lhsPaging), LocatorUtils.property(thatLocator, "paging", rhsPaging), lhsPaging, rhsPaging, (this.paging!= null), (that.paging!= null))) {
                return false;
            }
        }
        {
            RealEstateList lhsRealEstateList;
            lhsRealEstateList = this.getRealEstateList();
            RealEstateList rhsRealEstateList;
            rhsRealEstateList = that.getRealEstateList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realEstateList", lhsRealEstateList), LocatorUtils.property(thatLocator, "realEstateList", rhsRealEstateList), lhsRealEstateList, rhsRealEstateList, (this.realEstateList!= null), (that.realEstateList!= null))) {
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
