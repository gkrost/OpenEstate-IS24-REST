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
 * Befeuerungsarten
 * 
 * <p>Java class for FiringTypes complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FiringTypes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="firingType" type="{http://rest.immobilienscout24.de/schema/common/1.0}FiringType" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiringTypes", propOrder = {
    "firingType"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class FiringTypes implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Befeuerungsart
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<FiringType> firingType;

    /**
     * Befeuerungsart
     * 
     * Gets the value of the firingType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the firingType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFiringType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiringType }
     * </p>
     * 
     * 
     * @return
     *     The value of the firingType property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<FiringType> getFiringType() {
        if (firingType == null) {
            firingType = new ArrayList<>();
        }
        return this.firingType;
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
            List<FiringType> theFiringType;
            theFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
            strategy.appendField(locator, this, "firingType", buffer, theFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty())));
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
        if (draftCopy instanceof FiringTypes) {
            final FiringTypes copy = ((FiringTypes) draftCopy);
            {
                Boolean firingTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.firingType!= null)&&(!this.firingType.isEmpty())));
                if (firingTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FiringType> sourceFiringType;
                    sourceFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
                    @SuppressWarnings("unchecked")
                    List<FiringType> copyFiringType = ((List<FiringType> ) strategy.copy(LocatorUtils.property(locator, "firingType", sourceFiringType), sourceFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty()))));
                    copy.firingType = null;
                    if (copyFiringType!= null) {
                        List<FiringType> uniqueFiringTypel = copy.getFiringType();
                        uniqueFiringTypel.addAll(copyFiringType);
                    }
                } else {
                    if (firingTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.firingType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new FiringTypes();
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
        final FiringTypes that = ((FiringTypes) object);
        {
            List<FiringType> lhsFiringType;
            lhsFiringType = (((this.firingType!= null)&&(!this.firingType.isEmpty()))?this.getFiringType():null);
            List<FiringType> rhsFiringType;
            rhsFiringType = (((that.firingType!= null)&&(!that.firingType.isEmpty()))?that.getFiringType():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firingType", lhsFiringType), LocatorUtils.property(thatLocator, "firingType", rhsFiringType), lhsFiringType, rhsFiringType, ((this.firingType!= null)&&(!this.firingType.isEmpty())), ((that.firingType!= null)&&(!that.firingType.isEmpty())))) {
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
