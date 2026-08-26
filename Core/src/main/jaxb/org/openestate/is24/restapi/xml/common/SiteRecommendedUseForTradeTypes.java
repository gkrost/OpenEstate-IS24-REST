package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * Empfohlene Nutzungsarten eines Gewerbegrundstuecks
 * 
 * <p>Java class for SiteRecommendedUseForTradeTypes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SiteRecommendedUseForTradeTypes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="siteRecommendedUseForTradeType" type="{http://rest.immobilienscout24.de/schema/common/1.0}SiteRecommendedUseForTradeType" maxOccurs="22" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteRecommendedUseForTradeTypes", propOrder = {
    "siteRecommendedUseForTradeType"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class SiteRecommendedUseForTradeTypes implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Empfohlene Nutzung Gewerbegrundstueck
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<SiteRecommendedUseForTradeType> siteRecommendedUseForTradeType;

    /**
     * Empfohlene Nutzung Gewerbegrundstueck
     * 
     * Gets the value of the siteRecommendedUseForTradeType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the siteRecommendedUseForTradeType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSiteRecommendedUseForTradeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteRecommendedUseForTradeType }
     * </p>
     * 
     * 
     * @return
     *     The value of the siteRecommendedUseForTradeType property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<SiteRecommendedUseForTradeType> getSiteRecommendedUseForTradeType() {
        if (siteRecommendedUseForTradeType == null) {
            siteRecommendedUseForTradeType = new ArrayList<>();
        }
        return this.siteRecommendedUseForTradeType;
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
            List<SiteRecommendedUseForTradeType> theSiteRecommendedUseForTradeType;
            theSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            strategy.appendField(locator, this, "siteRecommendedUseForTradeType", buffer, theSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())));
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
        if (draftCopy instanceof SiteRecommendedUseForTradeTypes) {
            final SiteRecommendedUseForTradeTypes copy = ((SiteRecommendedUseForTradeTypes) draftCopy);
            {
                Boolean siteRecommendedUseForTradeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())));
                if (siteRecommendedUseForTradeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SiteRecommendedUseForTradeType> sourceSiteRecommendedUseForTradeType;
                    sourceSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
                    @SuppressWarnings("unchecked")
                    List<SiteRecommendedUseForTradeType> copySiteRecommendedUseForTradeType = ((List<SiteRecommendedUseForTradeType> ) strategy.copy(LocatorUtils.property(locator, "siteRecommendedUseForTradeType", sourceSiteRecommendedUseForTradeType), sourceSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))));
                    copy.siteRecommendedUseForTradeType = null;
                    if (copySiteRecommendedUseForTradeType!= null) {
                        List<SiteRecommendedUseForTradeType> uniqueSiteRecommendedUseForTradeTypel = copy.getSiteRecommendedUseForTradeType();
                        uniqueSiteRecommendedUseForTradeTypel.addAll(copySiteRecommendedUseForTradeType);
                    }
                } else {
                    if (siteRecommendedUseForTradeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.siteRecommendedUseForTradeType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new SiteRecommendedUseForTradeTypes();
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
        final SiteRecommendedUseForTradeTypes that = ((SiteRecommendedUseForTradeTypes) object);
        {
            List<SiteRecommendedUseForTradeType> lhsSiteRecommendedUseForTradeType;
            lhsSiteRecommendedUseForTradeType = (((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty()))?this.getSiteRecommendedUseForTradeType():null);
            List<SiteRecommendedUseForTradeType> rhsSiteRecommendedUseForTradeType;
            rhsSiteRecommendedUseForTradeType = (((that.siteRecommendedUseForTradeType!= null)&&(!that.siteRecommendedUseForTradeType.isEmpty()))?that.getSiteRecommendedUseForTradeType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteRecommendedUseForTradeType", lhsSiteRecommendedUseForTradeType), LocatorUtils.property(thatLocator, "siteRecommendedUseForTradeType", rhsSiteRecommendedUseForTradeType), lhsSiteRecommendedUseForTradeType, rhsSiteRecommendedUseForTradeType, ((this.siteRecommendedUseForTradeType!= null)&&(!this.siteRecommendedUseForTradeType.isEmpty())), ((that.siteRecommendedUseForTradeType!= null)&&(!that.siteRecommendedUseForTradeType.isEmpty())))) {
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
