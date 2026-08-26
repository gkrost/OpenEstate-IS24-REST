package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
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
 * <p>Java class for AutopilotSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AutopilotSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="autopilotEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="sendEmailWithAutopilotReport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutopilotSettings", propOrder = {
    "autopilotEnabled",
    "sendEmailWithAutopilotReport"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class AutopilotSettings implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Ist der Autopilot aktiviert
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean autopilotEnabled;
    /**
     * Ist der Autopilot Emailreport aktiviert
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean sendEmailWithAutopilotReport;

    /**
     * Ist der Autopilot aktiviert
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getAutopilotEnabled() {
        return autopilotEnabled;
    }

    /**
     * Sets the value of the autopilotEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getAutopilotEnabled()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAutopilotEnabled(Boolean value) {
        this.autopilotEnabled = value;
    }

    /**
     * Ist der Autopilot Emailreport aktiviert
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getSendEmailWithAutopilotReport() {
        return sendEmailWithAutopilotReport;
    }

    /**
     * Sets the value of the sendEmailWithAutopilotReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getSendEmailWithAutopilotReport()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSendEmailWithAutopilotReport(Boolean value) {
        this.sendEmailWithAutopilotReport = value;
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
            Boolean theAutopilotEnabled;
            theAutopilotEnabled = this.getAutopilotEnabled();
            strategy.appendField(locator, this, "autopilotEnabled", buffer, theAutopilotEnabled, (this.autopilotEnabled!= null));
        }
        {
            Boolean theSendEmailWithAutopilotReport;
            theSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
            strategy.appendField(locator, this, "sendEmailWithAutopilotReport", buffer, theSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null));
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
        if (draftCopy instanceof AutopilotSettings) {
            final AutopilotSettings copy = ((AutopilotSettings) draftCopy);
            {
                Boolean autopilotEnabledShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.autopilotEnabled!= null));
                if (autopilotEnabledShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceAutopilotEnabled;
                    sourceAutopilotEnabled = this.getAutopilotEnabled();
                    Boolean copyAutopilotEnabled = ((Boolean) strategy.copy(LocatorUtils.property(locator, "autopilotEnabled", sourceAutopilotEnabled), sourceAutopilotEnabled, (this.autopilotEnabled!= null)));
                    copy.setAutopilotEnabled(copyAutopilotEnabled);
                } else {
                    if (autopilotEnabledShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.autopilotEnabled = null;
                    }
                }
            }
            {
                Boolean sendEmailWithAutopilotReportShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.sendEmailWithAutopilotReport!= null));
                if (sendEmailWithAutopilotReportShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceSendEmailWithAutopilotReport;
                    sourceSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
                    Boolean copySendEmailWithAutopilotReport = ((Boolean) strategy.copy(LocatorUtils.property(locator, "sendEmailWithAutopilotReport", sourceSendEmailWithAutopilotReport), sourceSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null)));
                    copy.setSendEmailWithAutopilotReport(copySendEmailWithAutopilotReport);
                } else {
                    if (sendEmailWithAutopilotReportShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.sendEmailWithAutopilotReport = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new AutopilotSettings();
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
        final AutopilotSettings that = ((AutopilotSettings) object);
        {
            Boolean lhsAutopilotEnabled;
            lhsAutopilotEnabled = this.getAutopilotEnabled();
            Boolean rhsAutopilotEnabled;
            rhsAutopilotEnabled = that.getAutopilotEnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "autopilotEnabled", lhsAutopilotEnabled), LocatorUtils.property(thatLocator, "autopilotEnabled", rhsAutopilotEnabled), lhsAutopilotEnabled, rhsAutopilotEnabled, (this.autopilotEnabled!= null), (that.autopilotEnabled!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSendEmailWithAutopilotReport;
            lhsSendEmailWithAutopilotReport = this.getSendEmailWithAutopilotReport();
            Boolean rhsSendEmailWithAutopilotReport;
            rhsSendEmailWithAutopilotReport = that.getSendEmailWithAutopilotReport();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sendEmailWithAutopilotReport", lhsSendEmailWithAutopilotReport), LocatorUtils.property(thatLocator, "sendEmailWithAutopilotReport", rhsSendEmailWithAutopilotReport), lhsSendEmailWithAutopilotReport, rhsSendEmailWithAutopilotReport, (this.sendEmailWithAutopilotReport!= null), (that.sendEmailWithAutopilotReport!= null))) {
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
