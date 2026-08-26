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
 * Listenelement für GeoPathHierarchyElement.
 * 
 * <p>Java class for GeoPathHierarchyElements complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoPathHierarchyElements">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="geoPathHierarchyElement" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoPathHierarchyElement" maxOccurs="100" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoPathHierarchyElements", propOrder = {
    "geoPathHierarchyElement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoPathHierarchyElements implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<GeoPathHierarchyElement> geoPathHierarchyElement;

    /**
     * Gets the value of the geoPathHierarchyElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoPathHierarchyElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeoPathHierarchyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoPathHierarchyElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the geoPathHierarchyElement property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<GeoPathHierarchyElement> getGeoPathHierarchyElement() {
        if (geoPathHierarchyElement == null) {
            geoPathHierarchyElement = new ArrayList<>();
        }
        return this.geoPathHierarchyElement;
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
            List<GeoPathHierarchyElement> theGeoPathHierarchyElement;
            theGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
            strategy.appendField(locator, this, "geoPathHierarchyElement", buffer, theGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())));
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
        if (draftCopy instanceof GeoPathHierarchyElements) {
            final GeoPathHierarchyElements copy = ((GeoPathHierarchyElements) draftCopy);
            {
                Boolean geoPathHierarchyElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())));
                if (geoPathHierarchyElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoPathHierarchyElement> sourceGeoPathHierarchyElement;
                    sourceGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
                    @SuppressWarnings("unchecked")
                    List<GeoPathHierarchyElement> copyGeoPathHierarchyElement = ((List<GeoPathHierarchyElement> ) strategy.copy(LocatorUtils.property(locator, "geoPathHierarchyElement", sourceGeoPathHierarchyElement), sourceGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))));
                    copy.geoPathHierarchyElement = null;
                    if (copyGeoPathHierarchyElement!= null) {
                        List<GeoPathHierarchyElement> uniqueGeoPathHierarchyElementl = copy.getGeoPathHierarchyElement();
                        uniqueGeoPathHierarchyElementl.addAll(copyGeoPathHierarchyElement);
                    }
                } else {
                    if (geoPathHierarchyElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoPathHierarchyElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoPathHierarchyElements();
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
        final GeoPathHierarchyElements that = ((GeoPathHierarchyElements) object);
        {
            List<GeoPathHierarchyElement> lhsGeoPathHierarchyElement;
            lhsGeoPathHierarchyElement = (((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty()))?this.getGeoPathHierarchyElement():null);
            List<GeoPathHierarchyElement> rhsGeoPathHierarchyElement;
            rhsGeoPathHierarchyElement = (((that.geoPathHierarchyElement!= null)&&(!that.geoPathHierarchyElement.isEmpty()))?that.getGeoPathHierarchyElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoPathHierarchyElement", lhsGeoPathHierarchyElement), LocatorUtils.property(thatLocator, "geoPathHierarchyElement", rhsGeoPathHierarchyElement), lhsGeoPathHierarchyElement, rhsGeoPathHierarchyElement, ((this.geoPathHierarchyElement!= null)&&(!this.geoPathHierarchyElement.isEmpty())), ((that.geoPathHierarchyElement!= null)&&(!that.geoPathHierarchyElement.isEmpty())))) {
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
