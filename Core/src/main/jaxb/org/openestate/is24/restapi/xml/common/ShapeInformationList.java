package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for ShapeInformationList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShapeInformationList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="shapeInformation" type="{http://rest.immobilienscout24.de/schema/common/1.0}ShapeInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShapeInformationList", propOrder = {
    "shapeInformation"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class ShapeInformationList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<ShapeInformation> shapeInformation;

    /**
     * Gets the value of the shapeInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shapeInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getShapeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShapeInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the shapeInformation property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<ShapeInformation> getShapeInformation() {
        if (shapeInformation == null) {
            shapeInformation = new ArrayList<>();
        }
        return this.shapeInformation;
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
            List<ShapeInformation> theShapeInformation;
            theShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
            strategy.appendField(locator, this, "shapeInformation", buffer, theShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())));
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
        if (draftCopy instanceof ShapeInformationList) {
            final ShapeInformationList copy = ((ShapeInformationList) draftCopy);
            {
                Boolean shapeInformationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())));
                if (shapeInformationShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ShapeInformation> sourceShapeInformation;
                    sourceShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
                    @SuppressWarnings("unchecked")
                    List<ShapeInformation> copyShapeInformation = ((List<ShapeInformation> ) strategy.copy(LocatorUtils.property(locator, "shapeInformation", sourceShapeInformation), sourceShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))));
                    copy.shapeInformation = null;
                    if (copyShapeInformation!= null) {
                        List<ShapeInformation> uniqueShapeInformationl = copy.getShapeInformation();
                        uniqueShapeInformationl.addAll(copyShapeInformation);
                    }
                } else {
                    if (shapeInformationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shapeInformation = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new ShapeInformationList();
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
        final ShapeInformationList that = ((ShapeInformationList) object);
        {
            List<ShapeInformation> lhsShapeInformation;
            lhsShapeInformation = (((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty()))?this.getShapeInformation():null);
            List<ShapeInformation> rhsShapeInformation;
            rhsShapeInformation = (((that.shapeInformation!= null)&&(!that.shapeInformation.isEmpty()))?that.getShapeInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shapeInformation", lhsShapeInformation), LocatorUtils.property(thatLocator, "shapeInformation", rhsShapeInformation), lhsShapeInformation, rhsShapeInformation, ((this.shapeInformation!= null)&&(!this.shapeInformation.isEmpty())), ((that.shapeInformation!= null)&&(!that.shapeInformation.isEmpty())))) {
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
