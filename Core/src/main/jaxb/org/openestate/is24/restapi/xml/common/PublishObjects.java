package org.openestate.is24.restapi.xml.common;

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
 *         <element name="publishObject" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishObject" maxOccurs="unbounded" minOccurs="0"/>
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
    "publishObject"
})
@XmlRootElement(name = "publishObjects")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class PublishObjects implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Objekt das den Zusammenhang zwischen einer Immobilie und
     *                             einem Veröffentlichungskanal beschreibt.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<PublishObject> publishObject;

    /**
     * Objekt das den Zusammenhang zwischen einer Immobilie und
     *                             einem Veröffentlichungskanal beschreibt.
     * 
     * Gets the value of the publishObject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the publishObject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPublishObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishObject }
     * </p>
     * 
     * 
     * @return
     *     The value of the publishObject property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<PublishObject> getPublishObject() {
        if (publishObject == null) {
            publishObject = new ArrayList<>();
        }
        return this.publishObject;
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
            List<PublishObject> thePublishObject;
            thePublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
            strategy.appendField(locator, this, "publishObject", buffer, thePublishObject, ((this.publishObject!= null)&&(!this.publishObject.isEmpty())));
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
        if (draftCopy instanceof PublishObjects) {
            final PublishObjects copy = ((PublishObjects) draftCopy);
            {
                Boolean publishObjectShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.publishObject!= null)&&(!this.publishObject.isEmpty())));
                if (publishObjectShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PublishObject> sourcePublishObject;
                    sourcePublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
                    @SuppressWarnings("unchecked")
                    List<PublishObject> copyPublishObject = ((List<PublishObject> ) strategy.copy(LocatorUtils.property(locator, "publishObject", sourcePublishObject), sourcePublishObject, ((this.publishObject!= null)&&(!this.publishObject.isEmpty()))));
                    copy.publishObject = null;
                    if (copyPublishObject!= null) {
                        List<PublishObject> uniquePublishObjectl = copy.getPublishObject();
                        uniquePublishObjectl.addAll(copyPublishObject);
                    }
                } else {
                    if (publishObjectShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishObject = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new PublishObjects();
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
        final PublishObjects that = ((PublishObjects) object);
        {
            List<PublishObject> lhsPublishObject;
            lhsPublishObject = (((this.publishObject!= null)&&(!this.publishObject.isEmpty()))?this.getPublishObject():null);
            List<PublishObject> rhsPublishObject;
            rhsPublishObject = (((that.publishObject!= null)&&(!that.publishObject.isEmpty()))?that.getPublishObject():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishObject", lhsPublishObject), LocatorUtils.property(thatLocator, "publishObject", rhsPublishObject), lhsPublishObject, rhsPublishObject, ((this.publishObject!= null)&&(!this.publishObject.isEmpty())), ((that.publishObject!= null)&&(!that.publishObject.isEmpty())))) {
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
