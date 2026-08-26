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
 * Kriterien für die Regionssuche
 * 
 * Generelles Element für die Geo Criterias
 * 
 * <p>Java class for RegionCriteria complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegionCriteria">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/common/1.0}AbstractGeoCriteria">
 *       <sequence>
 *         <element name="geoInfoNodeCriteria" type="{http://rest.immobilienscout24.de/schema/common/1.0}GeoInfoNodeCriteria" maxOccurs="unbounded"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionCriteria", propOrder = {
    "geoInfoNodeCriteria"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class RegionCriteria
    extends AbstractGeoCriteria
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Liste der IS24 Geo-Ids.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<GeoInfoNodeCriteria> geoInfoNodeCriteria;

    /**
     * Liste der IS24 Geo-Ids.
     * 
     * Gets the value of the geoInfoNodeCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoInfoNodeCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeoInfoNodeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoInfoNodeCriteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the geoInfoNodeCriteria property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<GeoInfoNodeCriteria> getGeoInfoNodeCriteria() {
        if (geoInfoNodeCriteria == null) {
            geoInfoNodeCriteria = new ArrayList<>();
        }
        return this.geoInfoNodeCriteria;
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
        super.appendFields(locator, buffer, strategy);
        {
            List<GeoInfoNodeCriteria> theGeoInfoNodeCriteria;
            theGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            strategy.appendField(locator, this, "geoInfoNodeCriteria", buffer, theGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())));
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
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof RegionCriteria) {
            final RegionCriteria copy = ((RegionCriteria) draftCopy);
            {
                Boolean geoInfoNodeCriteriaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())));
                if (geoInfoNodeCriteriaShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoInfoNodeCriteria> sourceGeoInfoNodeCriteria;
                    sourceGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
                    @SuppressWarnings("unchecked")
                    List<GeoInfoNodeCriteria> copyGeoInfoNodeCriteria = ((List<GeoInfoNodeCriteria> ) strategy.copy(LocatorUtils.property(locator, "geoInfoNodeCriteria", sourceGeoInfoNodeCriteria), sourceGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))));
                    copy.geoInfoNodeCriteria = null;
                    if (copyGeoInfoNodeCriteria!= null) {
                        List<GeoInfoNodeCriteria> uniqueGeoInfoNodeCriterial = copy.getGeoInfoNodeCriteria();
                        uniqueGeoInfoNodeCriterial.addAll(copyGeoInfoNodeCriteria);
                    }
                } else {
                    if (geoInfoNodeCriteriaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoInfoNodeCriteria = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new RegionCriteria();
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
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RegionCriteria that = ((RegionCriteria) object);
        {
            List<GeoInfoNodeCriteria> lhsGeoInfoNodeCriteria;
            lhsGeoInfoNodeCriteria = (((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty()))?this.getGeoInfoNodeCriteria():null);
            List<GeoInfoNodeCriteria> rhsGeoInfoNodeCriteria;
            rhsGeoInfoNodeCriteria = (((that.geoInfoNodeCriteria!= null)&&(!that.geoInfoNodeCriteria.isEmpty()))?that.getGeoInfoNodeCriteria():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoInfoNodeCriteria", lhsGeoInfoNodeCriteria), LocatorUtils.property(thatLocator, "geoInfoNodeCriteria", rhsGeoInfoNodeCriteria), lhsGeoInfoNodeCriteria, rhsGeoInfoNodeCriteria, ((this.geoInfoNodeCriteria!= null)&&(!this.geoInfoNodeCriteria.isEmpty())), ((that.geoInfoNodeCriteria!= null)&&(!that.geoInfoNodeCriteria.isEmpty())))) {
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
