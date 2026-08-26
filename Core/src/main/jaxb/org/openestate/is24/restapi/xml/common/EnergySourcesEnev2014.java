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
 * wesentliche Energieträger
 * 
 * <p>Java class for EnergySourcesEnev2014 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EnergySourcesEnev2014">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="energySourceEnev2014" type="{http://rest.immobilienscout24.de/schema/common/1.0}EnergySourceEnev2014" maxOccurs="25" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergySourcesEnev2014", propOrder = {
    "energySourceEnev2014"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class EnergySourcesEnev2014 implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * wesentliche Energieträger
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<EnergySourceEnev2014> energySourceEnev2014;

    /**
     * wesentliche Energieträger
     * 
     * Gets the value of the energySourceEnev2014 property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the energySourceEnev2014 property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnergySourceEnev2014().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnergySourceEnev2014 }
     * </p>
     * 
     * 
     * @return
     *     The value of the energySourceEnev2014 property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<EnergySourceEnev2014> getEnergySourceEnev2014() {
        if (energySourceEnev2014 == null) {
            energySourceEnev2014 = new ArrayList<>();
        }
        return this.energySourceEnev2014;
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
            List<EnergySourceEnev2014> theEnergySourceEnev2014;
            theEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
            strategy.appendField(locator, this, "energySourceEnev2014", buffer, theEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())));
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
        if (draftCopy instanceof EnergySourcesEnev2014) {
            final EnergySourcesEnev2014 copy = ((EnergySourcesEnev2014) draftCopy);
            {
                Boolean energySourceEnev2014ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())));
                if (energySourceEnev2014ShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<EnergySourceEnev2014> sourceEnergySourceEnev2014;
                    sourceEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
                    @SuppressWarnings("unchecked")
                    List<EnergySourceEnev2014> copyEnergySourceEnev2014 = ((List<EnergySourceEnev2014> ) strategy.copy(LocatorUtils.property(locator, "energySourceEnev2014", sourceEnergySourceEnev2014), sourceEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))));
                    copy.energySourceEnev2014 = null;
                    if (copyEnergySourceEnev2014 != null) {
                        List<EnergySourceEnev2014> uniqueEnergySourceEnev2014l = copy.getEnergySourceEnev2014();
                        uniqueEnergySourceEnev2014l.addAll(copyEnergySourceEnev2014);
                    }
                } else {
                    if (energySourceEnev2014ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.energySourceEnev2014 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new EnergySourcesEnev2014();
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
        final EnergySourcesEnev2014 that = ((EnergySourcesEnev2014) object);
        {
            List<EnergySourceEnev2014> lhsEnergySourceEnev2014;
            lhsEnergySourceEnev2014 = (((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty()))?this.getEnergySourceEnev2014():null);
            List<EnergySourceEnev2014> rhsEnergySourceEnev2014;
            rhsEnergySourceEnev2014 = (((that.energySourceEnev2014 != null)&&(!that.energySourceEnev2014 .isEmpty()))?that.getEnergySourceEnev2014():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "energySourceEnev2014", lhsEnergySourceEnev2014), LocatorUtils.property(thatLocator, "energySourceEnev2014", rhsEnergySourceEnev2014), lhsEnergySourceEnev2014, rhsEnergySourceEnev2014, ((this.energySourceEnev2014 != null)&&(!this.energySourceEnev2014 .isEmpty())), ((that.energySourceEnev2014 != null)&&(!that.energySourceEnev2014 .isEmpty())))) {
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
