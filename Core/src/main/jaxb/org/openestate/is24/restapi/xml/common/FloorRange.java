package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * Bereich der Etage
 * 
 * <p>Java class for FloorRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FloorRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="minimal" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="maximal" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="999"/>
 *             </restriction>
 *           </simpleType>
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
@XmlType(name = "FloorRange", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class FloorRange implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Minimale Nummer der Etage
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter28 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer minimal;
    /**
     * Maximale Nummer der Etage
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter29 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer maximal;

    /**
     * Minimale Nummer der Etage
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Integer getMinimal() {
        return minimal;
    }

    /**
     * Sets the value of the minimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinimal()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMinimal(Integer value) {
        this.minimal = value;
    }

    /**
     * Maximale Nummer der Etage
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Integer getMaximal() {
        return maximal;
    }

    /**
     * Sets the value of the maximal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMaximal()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMaximal(Integer value) {
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
            Integer theMinimal;
            theMinimal = this.getMinimal();
            strategy.appendField(locator, this, "minimal", buffer, theMinimal, (this.minimal!= null));
        }
        {
            Integer theMaximal;
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
        if (draftCopy instanceof FloorRange) {
            final FloorRange copy = ((FloorRange) draftCopy);
            {
                Boolean minimalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimal!= null));
                if (minimalShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMinimal;
                    sourceMinimal = this.getMinimal();
                    Integer copyMinimal = ((Integer) strategy.copy(LocatorUtils.property(locator, "minimal", sourceMinimal), sourceMinimal, (this.minimal!= null)));
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
                    Integer sourceMaximal;
                    sourceMaximal = this.getMaximal();
                    Integer copyMaximal = ((Integer) strategy.copy(LocatorUtils.property(locator, "maximal", sourceMaximal), sourceMaximal, (this.maximal!= null)));
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
        return new FloorRange();
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
        final FloorRange that = ((FloorRange) object);
        {
            Integer lhsMinimal;
            lhsMinimal = this.getMinimal();
            Integer rhsMinimal;
            rhsMinimal = that.getMinimal();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minimal", lhsMinimal), LocatorUtils.property(thatLocator, "minimal", rhsMinimal), lhsMinimal, rhsMinimal, (this.minimal!= null), (that.minimal!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaximal;
            lhsMaximal = this.getMaximal();
            Integer rhsMaximal;
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
