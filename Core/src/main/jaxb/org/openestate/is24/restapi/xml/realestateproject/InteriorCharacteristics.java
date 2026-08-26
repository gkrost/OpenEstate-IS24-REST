package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for InteriorCharacteristics complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InteriorCharacteristics">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence maxOccurs="20" minOccurs="3">
 *         <element name="InteriorCharacteristic">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
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
@XmlType(name = "InteriorCharacteristics", propOrder = {
    "interiorCharacteristic"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class InteriorCharacteristics implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "InteriorCharacteristic", required = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<String> interiorCharacteristic;

    /**
     * Gets the value of the interiorCharacteristic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the interiorCharacteristic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInteriorCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the interiorCharacteristic property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<String> getInteriorCharacteristic() {
        if (interiorCharacteristic == null) {
            interiorCharacteristic = new ArrayList<>();
        }
        return this.interiorCharacteristic;
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
            List<String> theInteriorCharacteristic;
            theInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
            strategy.appendField(locator, this, "interiorCharacteristic", buffer, theInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())));
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
        if (draftCopy instanceof InteriorCharacteristics) {
            final InteriorCharacteristics copy = ((InteriorCharacteristics) draftCopy);
            {
                Boolean interiorCharacteristicShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())));
                if (interiorCharacteristicShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceInteriorCharacteristic;
                    sourceInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyInteriorCharacteristic = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "interiorCharacteristic", sourceInteriorCharacteristic), sourceInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))));
                    copy.interiorCharacteristic = null;
                    if (copyInteriorCharacteristic!= null) {
                        List<String> uniqueInteriorCharacteristicl = copy.getInteriorCharacteristic();
                        uniqueInteriorCharacteristicl.addAll(copyInteriorCharacteristic);
                    }
                } else {
                    if (interiorCharacteristicShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.interiorCharacteristic = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new InteriorCharacteristics();
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
        final InteriorCharacteristics that = ((InteriorCharacteristics) object);
        {
            List<String> lhsInteriorCharacteristic;
            lhsInteriorCharacteristic = (((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty()))?this.getInteriorCharacteristic():null);
            List<String> rhsInteriorCharacteristic;
            rhsInteriorCharacteristic = (((that.interiorCharacteristic!= null)&&(!that.interiorCharacteristic.isEmpty()))?that.getInteriorCharacteristic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "interiorCharacteristic", lhsInteriorCharacteristic), LocatorUtils.property(thatLocator, "interiorCharacteristic", rhsInteriorCharacteristic), lhsInteriorCharacteristic, rhsInteriorCharacteristic, ((this.interiorCharacteristic!= null)&&(!this.interiorCharacteristic.isEmpty())), ((that.interiorCharacteristic!= null)&&(!that.interiorCharacteristic.isEmpty())))) {
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
