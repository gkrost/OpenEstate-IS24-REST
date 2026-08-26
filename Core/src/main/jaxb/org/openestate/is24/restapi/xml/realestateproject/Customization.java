package org.openestate.is24.restapi.xml.realestateproject;

import java.awt.Color;
import java.io.Serializable;
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
 * <p>Java class for Customization complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Customization">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="layoutColor" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="#(([0-9]|[a-f]){3}|([0-9]|[a-f]){6})"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="announcement" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="500"/>
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
@XmlType(name = "Customization", propOrder = {
    "layoutColor",
    "announcement"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Customization implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Color layoutColor;
    @XmlJavaTypeAdapter(Adapter3 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String announcement;

    /**
     * Gets the value of the layoutColor property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Color getLayoutColor() {
        return layoutColor;
    }

    /**
     * Sets the value of the layoutColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLayoutColor(Color value) {
        this.layoutColor = value;
    }

    /**
     * Gets the value of the announcement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getAnnouncement() {
        return announcement;
    }

    /**
     * Sets the value of the announcement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAnnouncement(String value) {
        this.announcement = value;
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
            Color theLayoutColor;
            theLayoutColor = this.getLayoutColor();
            strategy.appendField(locator, this, "layoutColor", buffer, theLayoutColor, (this.layoutColor!= null));
        }
        {
            String theAnnouncement;
            theAnnouncement = this.getAnnouncement();
            strategy.appendField(locator, this, "announcement", buffer, theAnnouncement, (this.announcement!= null));
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
        if (draftCopy instanceof Customization) {
            final Customization copy = ((Customization) draftCopy);
            {
                Boolean layoutColorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.layoutColor!= null));
                if (layoutColorShouldBeCopiedAndSet == Boolean.TRUE) {
                    Color sourceLayoutColor;
                    sourceLayoutColor = this.getLayoutColor();
                    Color copyLayoutColor = ((Color) strategy.copy(LocatorUtils.property(locator, "layoutColor", sourceLayoutColor), sourceLayoutColor, (this.layoutColor!= null)));
                    copy.setLayoutColor(copyLayoutColor);
                } else {
                    if (layoutColorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.layoutColor = null;
                    }
                }
            }
            {
                Boolean announcementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.announcement!= null));
                if (announcementShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAnnouncement;
                    sourceAnnouncement = this.getAnnouncement();
                    String copyAnnouncement = ((String) strategy.copy(LocatorUtils.property(locator, "announcement", sourceAnnouncement), sourceAnnouncement, (this.announcement!= null)));
                    copy.setAnnouncement(copyAnnouncement);
                } else {
                    if (announcementShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.announcement = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Customization();
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
        final Customization that = ((Customization) object);
        {
            Color lhsLayoutColor;
            lhsLayoutColor = this.getLayoutColor();
            Color rhsLayoutColor;
            rhsLayoutColor = that.getLayoutColor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "layoutColor", lhsLayoutColor), LocatorUtils.property(thatLocator, "layoutColor", rhsLayoutColor), lhsLayoutColor, rhsLayoutColor, (this.layoutColor!= null), (that.layoutColor!= null))) {
                return false;
            }
        }
        {
            String lhsAnnouncement;
            lhsAnnouncement = this.getAnnouncement();
            String rhsAnnouncement;
            rhsAnnouncement = that.getAnnouncement();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "announcement", lhsAnnouncement), LocatorUtils.property(thatLocator, "announcement", rhsAnnouncement), lhsAnnouncement, rhsAnnouncement, (this.announcement!= null), (that.announcement!= null))) {
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
