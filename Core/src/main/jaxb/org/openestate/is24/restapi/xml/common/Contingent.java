package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.math.BigInteger;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * Kontingent-Information
 * 
 * <p>Java class for Contingent complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Contingent">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         <element name="tolerance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contingent", propOrder = {
    "count",
    "tolerance"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Contingent implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigInteger count;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigInteger tolerance;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the tolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigInteger getTolerance() {
        return tolerance;
    }

    /**
     * Sets the value of the tolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTolerance(BigInteger value) {
        this.tolerance = value;
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
            BigInteger theCount;
            theCount = this.getCount();
            strategy.appendField(locator, this, "count", buffer, theCount, (this.count!= null));
        }
        {
            BigInteger theTolerance;
            theTolerance = this.getTolerance();
            strategy.appendField(locator, this, "tolerance", buffer, theTolerance, (this.tolerance!= null));
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
        if (draftCopy instanceof Contingent) {
            final Contingent copy = ((Contingent) draftCopy);
            {
                Boolean countShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.count!= null));
                if (countShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceCount;
                    sourceCount = this.getCount();
                    BigInteger copyCount = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "count", sourceCount), sourceCount, (this.count!= null)));
                    copy.setCount(copyCount);
                } else {
                    if (countShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.count = null;
                    }
                }
            }
            {
                Boolean toleranceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tolerance!= null));
                if (toleranceShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigInteger sourceTolerance;
                    sourceTolerance = this.getTolerance();
                    BigInteger copyTolerance = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "tolerance", sourceTolerance), sourceTolerance, (this.tolerance!= null)));
                    copy.setTolerance(copyTolerance);
                } else {
                    if (toleranceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tolerance = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Contingent();
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
        final Contingent that = ((Contingent) object);
        {
            BigInteger lhsCount;
            lhsCount = this.getCount();
            BigInteger rhsCount;
            rhsCount = that.getCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "count", lhsCount), LocatorUtils.property(thatLocator, "count", rhsCount), lhsCount, rhsCount, (this.count!= null), (that.count!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsTolerance;
            lhsTolerance = this.getTolerance();
            BigInteger rhsTolerance;
            rhsTolerance = that.getTolerance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tolerance", lhsTolerance), LocatorUtils.property(thatLocator, "tolerance", rhsTolerance), lhsTolerance, rhsTolerance, (this.tolerance!= null), (that.tolerance!= null))) {
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
