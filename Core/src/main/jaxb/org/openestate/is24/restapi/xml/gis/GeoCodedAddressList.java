package org.openestate.is24.restapi.xml.gis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="geoCodedAddress" type="{http://rest.immobilienscout24.de/schema/platform/gis/1.0}GeoCodedAddress" maxOccurs="unbounded" minOccurs="0"/>
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
    "geoCodedAddress"
})
@XmlRootElement(name = "geoCodedAddressList")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class GeoCodedAddressList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Eine Adresse mit zugehöriger Geokodierungs-Information.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<GeoCodedAddress> geoCodedAddress;

    /**
     * Eine Adresse mit zugehöriger Geokodierungs-Information.
     * 
     * Gets the value of the geoCodedAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geoCodedAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGeoCodedAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoCodedAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the geoCodedAddress property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<GeoCodedAddress> getGeoCodedAddress() {
        if (geoCodedAddress == null) {
            geoCodedAddress = new ArrayList<>();
        }
        return this.geoCodedAddress;
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
            List<GeoCodedAddress> theGeoCodedAddress;
            theGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
            strategy.appendField(locator, this, "geoCodedAddress", buffer, theGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())));
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
        if (draftCopy instanceof GeoCodedAddressList) {
            final GeoCodedAddressList copy = ((GeoCodedAddressList) draftCopy);
            {
                Boolean geoCodedAddressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())));
                if (geoCodedAddressShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<GeoCodedAddress> sourceGeoCodedAddress;
                    sourceGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
                    @SuppressWarnings("unchecked")
                    List<GeoCodedAddress> copyGeoCodedAddress = ((List<GeoCodedAddress> ) strategy.copy(LocatorUtils.property(locator, "geoCodedAddress", sourceGeoCodedAddress), sourceGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))));
                    copy.geoCodedAddress = null;
                    if (copyGeoCodedAddress!= null) {
                        List<GeoCodedAddress> uniqueGeoCodedAddressl = copy.getGeoCodedAddress();
                        uniqueGeoCodedAddressl.addAll(copyGeoCodedAddress);
                    }
                } else {
                    if (geoCodedAddressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geoCodedAddress = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new GeoCodedAddressList();
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
        final GeoCodedAddressList that = ((GeoCodedAddressList) object);
        {
            List<GeoCodedAddress> lhsGeoCodedAddress;
            lhsGeoCodedAddress = (((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty()))?this.getGeoCodedAddress():null);
            List<GeoCodedAddress> rhsGeoCodedAddress;
            rhsGeoCodedAddress = (((that.geoCodedAddress!= null)&&(!that.geoCodedAddress.isEmpty()))?that.getGeoCodedAddress():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geoCodedAddress", lhsGeoCodedAddress), LocatorUtils.property(thatLocator, "geoCodedAddress", rhsGeoCodedAddress), lhsGeoCodedAddress, rhsGeoCodedAddress, ((this.geoCodedAddress!= null)&&(!this.geoCodedAddress.isEmpty())), ((that.geoCodedAddress!= null)&&(!that.geoCodedAddress.isEmpty())))) {
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
