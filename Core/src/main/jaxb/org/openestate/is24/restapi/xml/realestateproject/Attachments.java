package org.openestate.is24.restapi.xml.realestateproject;

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
 * Liste von Anhängen.
 * 
 * <p>Java class for Attachments complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Attachments">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="attachment" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attachments", propOrder = {
    "attachment"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class Attachments implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<Attachment> attachment;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachment property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<>();
        }
        return this.attachment;
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
            List<Attachment> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
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
        if (draftCopy instanceof Attachments) {
            final Attachments copy = ((Attachments) draftCopy);
            {
                Boolean attachmentShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
                if (attachmentShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Attachment> sourceAttachment;
                    sourceAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
                    @SuppressWarnings("unchecked")
                    List<Attachment> copyAttachment = ((List<Attachment> ) strategy.copy(LocatorUtils.property(locator, "attachment", sourceAttachment), sourceAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty()))));
                    copy.attachment = null;
                    if (copyAttachment!= null) {
                        List<Attachment> uniqueAttachmentl = copy.getAttachment();
                        uniqueAttachmentl.addAll(copyAttachment);
                    }
                } else {
                    if (attachmentShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.attachment = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new Attachments();
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
        final Attachments that = ((Attachments) object);
        {
            List<Attachment> lhsAttachment;
            lhsAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            List<Attachment> rhsAttachment;
            rhsAttachment = (((that.attachment!= null)&&(!that.attachment.isEmpty()))?that.getAttachment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())), ((that.attachment!= null)&&(!that.attachment.isEmpty())))) {
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
