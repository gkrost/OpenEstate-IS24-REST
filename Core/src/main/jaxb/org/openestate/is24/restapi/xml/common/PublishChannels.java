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
 *         <element name="publishChannel" type="{http://rest.immobilienscout24.de/schema/common/1.0}PublishChannel" maxOccurs="unbounded" minOccurs="0"/>
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
    "publishChannel"
})
@XmlRootElement(name = "publishChannels")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class PublishChannels implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Verweis auf einen Veröffentlichungskanal.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<PublishChannel> publishChannel;

    /**
     * Verweis auf einen Veröffentlichungskanal.
     * 
     * Gets the value of the publishChannel property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the publishChannel property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPublishChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublishChannel }
     * </p>
     * 
     * 
     * @return
     *     The value of the publishChannel property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<PublishChannel> getPublishChannel() {
        if (publishChannel == null) {
            publishChannel = new ArrayList<>();
        }
        return this.publishChannel;
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
            List<PublishChannel> thePublishChannel;
            thePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            strategy.appendField(locator, this, "publishChannel", buffer, thePublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())));
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
        if (draftCopy instanceof PublishChannels) {
            final PublishChannels copy = ((PublishChannels) draftCopy);
            {
                Boolean publishChannelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())));
                if (publishChannelShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<PublishChannel> sourcePublishChannel;
                    sourcePublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
                    @SuppressWarnings("unchecked")
                    List<PublishChannel> copyPublishChannel = ((List<PublishChannel> ) strategy.copy(LocatorUtils.property(locator, "publishChannel", sourcePublishChannel), sourcePublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))));
                    copy.publishChannel = null;
                    if (copyPublishChannel!= null) {
                        List<PublishChannel> uniquePublishChannell = copy.getPublishChannel();
                        uniquePublishChannell.addAll(copyPublishChannel);
                    }
                } else {
                    if (publishChannelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.publishChannel = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new PublishChannels();
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
        final PublishChannels that = ((PublishChannels) object);
        {
            List<PublishChannel> lhsPublishChannel;
            lhsPublishChannel = (((this.publishChannel!= null)&&(!this.publishChannel.isEmpty()))?this.getPublishChannel():null);
            List<PublishChannel> rhsPublishChannel;
            rhsPublishChannel = (((that.publishChannel!= null)&&(!that.publishChannel.isEmpty()))?that.getPublishChannel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "publishChannel", lhsPublishChannel), LocatorUtils.property(thatLocator, "publishChannel", rhsPublishChannel), lhsPublishChannel, rhsPublishChannel, ((this.publishChannel!= null)&&(!this.publishChannel.isEmpty())), ((that.publishChannel!= null)&&(!that.publishChannel.isEmpty())))) {
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
