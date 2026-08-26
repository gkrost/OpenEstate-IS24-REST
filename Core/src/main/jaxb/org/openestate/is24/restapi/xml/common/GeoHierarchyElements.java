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
 * Listenelement für GeoHierarchyElement.
 * 
 * <p>Java class for GeoHierarchyElements complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoHierarchyElements">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="geoHierarchyElement" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyElement" maxOccurs="30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyElements", propOrder = {
    "geoHierarchyElement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchyElements implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<GeoHierarchyElement> geoHierarchyElement;

    /**
     * Gets the value of the geoHierarchyElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoHierarchyElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeoHierarchyElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoHierarchyElement }
     * </p>
     * 
     * 
     * @return
     *     The value of the geoHierarchyElement property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<GeoHierarchyElement> getGeoHierarchyElement() {
        if (geoHierarchyElement == null) {
            geoHierarchyElement = new ArrayList<>();
        }
        return this.geoHierarchyElement;
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
            List<GeoHierarchyElement> theGeoHierarchyElement;
            theGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
            strategy.appendField(locator, this, "geoHierarchyElement", buffer, theGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())));
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
        if (draftCopy instanceof GeoHierarchyElements) {
            final GeoHierarchyElements copy = ((GeoHierarchyElements) draftCopy);
            {
                Boolean geoHierarchyElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())));
                if (geoHierarchyElementShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoHierarchyElement> sourceGeoHierarchyElement;
                    sourceGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
                    @SuppressWarnings("unchecked")
                    List<GeoHierarchyElement> copyGeoHierarchyElement = ((List<GeoHierarchyElement> ) strategy.copy(LocatorUtils.property(locator, "geoHierarchyElement", sourceGeoHierarchyElement), sourceGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))));
                    copy.geoHierarchyElement = null;
                    if (copyGeoHierarchyElement!= null) {
                        List<GeoHierarchyElement> uniqueGeoHierarchyElementl = copy.getGeoHierarchyElement();
                        uniqueGeoHierarchyElementl.addAll(copyGeoHierarchyElement);
                    }
                } else {
                    if (geoHierarchyElementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoHierarchyElement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchyElements();
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
        final GeoHierarchyElements that = ((GeoHierarchyElements) object);
        {
            List<GeoHierarchyElement> lhsGeoHierarchyElement;
            lhsGeoHierarchyElement = (((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty()))?this.getGeoHierarchyElement():null);
            List<GeoHierarchyElement> rhsGeoHierarchyElement;
            rhsGeoHierarchyElement = (((that.geoHierarchyElement!= null)&&(!that.geoHierarchyElement.isEmpty()))?that.getGeoHierarchyElement():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchyElement", lhsGeoHierarchyElement), LocatorUtils.property(thatLocator, "geoHierarchyElement", rhsGeoHierarchyElement), lhsGeoHierarchyElement, rhsGeoHierarchyElement, ((this.geoHierarchyElement!= null)&&(!this.geoHierarchyElement.isEmpty())), ((that.geoHierarchyElement!= null)&&(!that.geoHierarchyElement.isEmpty())))) {
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
