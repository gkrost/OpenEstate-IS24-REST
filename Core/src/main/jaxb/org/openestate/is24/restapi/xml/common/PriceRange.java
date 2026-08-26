package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.math.BigDecimal;
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


/**
 * Bereich des Preises
 * 
 * <p>Java class for PriceRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PriceRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="minimal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number13.2Type" minOccurs="0"/>
 *         <element name="maximal" type="{http://rest.immobilienscout24.de/schema/common/1.0}Number13.2Type" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRange", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class PriceRange implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Minimaler Preis
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal minimal;
    /**
     * Maximaler Preis
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    @XmlSchemaType(name = "decimal")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal maximal;

    /**
     * Minimaler Preis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getMinimal() {
        return minimal;
    }

    /**
     * Sets the value of the minimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinimal()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMinimal(BigDecimal value) {
        this.minimal = value;
    }

    /**
     * Maximaler Preis
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getMaximal() {
        return maximal;
    }

    /**
     * Sets the value of the maximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximal()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMaximal(BigDecimal value) {
        this.maximal = value;
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
            BigDecimal theMinimal;
            theMinimal = this.getMinimal();
            strategy.appendField(locator, this, "minimal", buffer, theMinimal, (this.minimal!= null));
        }
        {
            BigDecimal theMaximal;
            theMaximal = this.getMaximal();
            strategy.appendField(locator, this, "maximal", buffer, theMaximal, (this.maximal!= null));
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
        if (draftCopy instanceof PriceRange) {
            final PriceRange copy = ((PriceRange) draftCopy);
            {
                Boolean minimalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimal!= null));
                if (minimalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinimal;
                    sourceMinimal = this.getMinimal();
                    BigDecimal copyMinimal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minimal", sourceMinimal), sourceMinimal, (this.minimal!= null)));
                    copy.setMinimal(copyMinimal);
                } else {
                    if (minimalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minimal = null;
                    }
                }
            }
            {
                Boolean maximalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximal!= null));
                if (maximalShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMaximal;
                    sourceMaximal = this.getMaximal();
                    BigDecimal copyMaximal = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "maximal", sourceMaximal), sourceMaximal, (this.maximal!= null)));
                    copy.setMaximal(copyMaximal);
                } else {
                    if (maximalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maximal = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new PriceRange();
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
        final PriceRange that = ((PriceRange) object);
        {
            BigDecimal lhsMinimal;
            lhsMinimal = this.getMinimal();
            BigDecimal rhsMinimal;
            rhsMinimal = that.getMinimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimal", lhsMinimal), LocatorUtils.property(thatLocator, "minimal", rhsMinimal), lhsMinimal, rhsMinimal, (this.minimal!= null), (that.minimal!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMaximal;
            lhsMaximal = this.getMaximal();
            BigDecimal rhsMaximal;
            rhsMaximal = that.getMaximal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maximal", lhsMaximal), LocatorUtils.property(thatLocator, "maximal", rhsMaximal), lhsMaximal, rhsMaximal, (this.maximal!= null), (that.maximal!= null))) {
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
