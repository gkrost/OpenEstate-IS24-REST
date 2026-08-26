package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 * Listenelement für GeoHierarchyStatistic.
 * 
 * <p>Java class for GeoHierarchyStatistics complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeoHierarchyStatistics">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GeoHierarchyStatistic" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoHierarchyStatistic" maxOccurs="30" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoHierarchyStatistics", propOrder = {
    "geoHierarchyStatistic"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoHierarchyStatistics implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(name = "GeoHierarchyStatistic")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<GeoHierarchyStatistic> geoHierarchyStatistic;

    /**
     * Gets the value of the geoHierarchyStatistic property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoHierarchyStatistic property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeoHierarchyStatistic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoHierarchyStatistic }
     * </p>
     * 
     * 
     * @return
     *     The value of the geoHierarchyStatistic property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<GeoHierarchyStatistic> getGeoHierarchyStatistic() {
        if (geoHierarchyStatistic == null) {
            geoHierarchyStatistic = new ArrayList<>();
        }
        return this.geoHierarchyStatistic;
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
            List<GeoHierarchyStatistic> theGeoHierarchyStatistic;
            theGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
            strategy.appendField(locator, this, "geoHierarchyStatistic", buffer, theGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())));
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
        if (draftCopy instanceof GeoHierarchyStatistics) {
            final GeoHierarchyStatistics copy = ((GeoHierarchyStatistics) draftCopy);
            {
                Boolean geoHierarchyStatisticShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())));
                if (geoHierarchyStatisticShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoHierarchyStatistic> sourceGeoHierarchyStatistic;
                    sourceGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
                    @SuppressWarnings("unchecked")
                    List<GeoHierarchyStatistic> copyGeoHierarchyStatistic = ((List<GeoHierarchyStatistic> ) strategy.copy(LocatorUtils.property(locator, "geoHierarchyStatistic", sourceGeoHierarchyStatistic), sourceGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))));
                    copy.geoHierarchyStatistic = null;
                    if (copyGeoHierarchyStatistic!= null) {
                        List<GeoHierarchyStatistic> uniqueGeoHierarchyStatisticl = copy.getGeoHierarchyStatistic();
                        uniqueGeoHierarchyStatisticl.addAll(copyGeoHierarchyStatistic);
                    }
                } else {
                    if (geoHierarchyStatisticShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoHierarchyStatistic = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoHierarchyStatistics();
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
        final GeoHierarchyStatistics that = ((GeoHierarchyStatistics) object);
        {
            List<GeoHierarchyStatistic> lhsGeoHierarchyStatistic;
            lhsGeoHierarchyStatistic = (((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty()))?this.getGeoHierarchyStatistic():null);
            List<GeoHierarchyStatistic> rhsGeoHierarchyStatistic;
            rhsGeoHierarchyStatistic = (((that.geoHierarchyStatistic!= null)&&(!that.geoHierarchyStatistic.isEmpty()))?that.getGeoHierarchyStatistic():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoHierarchyStatistic", lhsGeoHierarchyStatistic), LocatorUtils.property(thatLocator, "geoHierarchyStatistic", rhsGeoHierarchyStatistic), lhsGeoHierarchyStatistic, rhsGeoHierarchyStatistic, ((this.geoHierarchyStatistic!= null)&&(!this.geoHierarchyStatistic.isEmpty())), ((that.geoHierarchyStatistic!= null)&&(!that.geoHierarchyStatistic.isEmpty())))) {
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
