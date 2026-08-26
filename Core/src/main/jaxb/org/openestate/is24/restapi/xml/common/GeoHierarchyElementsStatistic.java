package org.openestate.is24.restapi.xml.common;

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
 *         <element name="parent" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement"/>
 *         <element name="children" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElements"/>
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
    "parent",
    "children"
})
@XmlRootElement(name = "geoHierarchyElementsStatistic")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchyElementsStatistic implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected GeoHierarchyElement parent;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected GeoHierarchyElements children;

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public GeoHierarchyElement getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setParent(GeoHierarchyElement value) {
        this.parent = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link GeoHierarchyElements }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public GeoHierarchyElements getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoHierarchyElements }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setChildren(GeoHierarchyElements value) {
        this.children = value;
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
            GeoHierarchyElement theParent;
            theParent = this.getParent();
            strategy.appendField(locator, this, "parent", buffer, theParent, (this.parent!= null));
        }
        {
            GeoHierarchyElements theChildren;
            theChildren = this.getChildren();
            strategy.appendField(locator, this, "children", buffer, theChildren, (this.children!= null));
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
        if (draftCopy instanceof GeoHierarchyElementsStatistic) {
            final GeoHierarchyElementsStatistic copy = ((GeoHierarchyElementsStatistic) draftCopy);
            {
                Boolean parentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parent!= null));
                if (parentShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoHierarchyElement sourceParent;
                    sourceParent = this.getParent();
                    GeoHierarchyElement copyParent = ((GeoHierarchyElement) strategy.copy(LocatorUtils.property(locator, "parent", sourceParent), sourceParent, (this.parent!= null)));
                    copy.setParent(copyParent);
                } else {
                    if (parentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.parent = null;
                    }
                }
            }
            {
                Boolean childrenShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.children!= null));
                if (childrenShouldBeCopiedAndSet == Boolean.TRUE) {
                    GeoHierarchyElements sourceChildren;
                    sourceChildren = this.getChildren();
                    GeoHierarchyElements copyChildren = ((GeoHierarchyElements) strategy.copy(LocatorUtils.property(locator, "children", sourceChildren), sourceChildren, (this.children!= null)));
                    copy.setChildren(copyChildren);
                } else {
                    if (childrenShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.children = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchyElementsStatistic();
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
        final GeoHierarchyElementsStatistic that = ((GeoHierarchyElementsStatistic) object);
        {
            GeoHierarchyElement lhsParent;
            lhsParent = this.getParent();
            GeoHierarchyElement rhsParent;
            rhsParent = that.getParent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parent", lhsParent), LocatorUtils.property(thatLocator, "parent", rhsParent), lhsParent, rhsParent, (this.parent!= null), (that.parent!= null))) {
                return false;
            }
        }
        {
            GeoHierarchyElements lhsChildren;
            lhsChildren = this.getChildren();
            GeoHierarchyElements rhsChildren;
            rhsChildren = that.getChildren();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "children", lhsChildren), LocatorUtils.property(thatLocator, "children", rhsChildren), lhsChildren, rhsChildren, (this.children!= null), (that.children!= null))) {
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
