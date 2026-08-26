package org.openestate.is24.restapi.xml.attachmentsorder;

import java.io.Serializable;
import java.util.ArrayList;
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
 * <p>Java class for list complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="list">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "list", propOrder = {
    "attachmentId"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class List implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Id des Anhanges.
     * 
     */
    @XmlElement(type = Long.class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected java.util.List<Long> attachmentId;

    /**
     * Id des Anhanges.
     * 
     * Gets the value of the attachmentId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attachmentId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachmentId property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public java.util.List<Long> getAttachmentId() {
        if (attachmentId == null) {
            attachmentId = new ArrayList<>();
        }
        return this.attachmentId;
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
            java.util.List<Long> theAttachmentId;
            theAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
            strategy.appendField(locator, this, "attachmentId", buffer, theAttachmentId, ((this.attachmentId!= null)&&(!this.attachmentId.isEmpty())));
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
        if (draftCopy instanceof List) {
            final List copy = ((List) draftCopy);
            {
                Boolean attachmentIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.attachmentId!= null)&&(!this.attachmentId.isEmpty())));
                if (attachmentIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    java.util.List<Long> sourceAttachmentId;
                    sourceAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
                    @SuppressWarnings("unchecked")
                    java.util.List<Long> copyAttachmentId = ((java.util.List<Long> ) strategy.copy(LocatorUtils.property(locator, "attachmentId", sourceAttachmentId), sourceAttachmentId, ((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))));
                    copy.attachmentId = null;
                    if (copyAttachmentId!= null) {
                        java.util.List<Long> uniqueAttachmentIdl = copy.getAttachmentId();
                        uniqueAttachmentIdl.addAll(copyAttachmentId);
                    }
                } else {
                    if (attachmentIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attachmentId = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new List();
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
        final List that = ((List) object);
        {
            java.util.List<Long> lhsAttachmentId;
            lhsAttachmentId = (((this.attachmentId!= null)&&(!this.attachmentId.isEmpty()))?this.getAttachmentId():null);
            java.util.List<Long> rhsAttachmentId;
            rhsAttachmentId = (((that.attachmentId!= null)&&(!that.attachmentId.isEmpty()))?that.getAttachmentId():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachmentId", lhsAttachmentId), LocatorUtils.property(thatLocator, "attachmentId", rhsAttachmentId), lhsAttachmentId, rhsAttachmentId, ((this.attachmentId!= null)&&(!this.attachmentId.isEmpty())), ((that.attachmentId!= null)&&(!that.attachmentId.isEmpty())))) {
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
