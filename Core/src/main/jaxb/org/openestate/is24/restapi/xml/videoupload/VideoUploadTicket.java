package org.openestate.is24.restapi.xml.videoupload;

import java.io.Serializable;
import java.net.URI;
import java.util.Calendar;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
import org.openestate.is24.restapi.xml.Adapter2;
import org.openestate.is24.restapi.xml.Adapter4;


/**
 * <p>Java class for VideoUploadTicket complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoUploadTicket">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="uploadUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="videoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="auth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoUploadTicket", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class VideoUploadTicket implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * The API-client sends a multi-part-POST request
     *                         to this URL with the video file and an authentication-token. One part is
     *                         "videofile" with the video file, the other is "auth", the authentication-token.
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected URI uploadUrl;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar validUntil;
    /**
     * This Id is used as a reference to the yet-to-be-uploaded
     *                         video. After uploading (done by the API-client) it must be provided when creating an
     *                         attachment.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String videoId;
    /**
     * When uploading the part named "auth" has to be filled
     *                         with the value of this element. Only temporarily valid, see "validUntil".
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String auth;

    /**
     * The API-client sends a multi-part-POST request
     *                         to this URL with the video file and an authentication-token. One part is
     *                         "videofile" with the video file, the other is "auth", the authentication-token.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public URI getUploadUrl() {
        return uploadUrl;
    }

    /**
     * Sets the value of the uploadUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     * @see #getUploadUrl()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setUploadUrl(URI value) {
        this.uploadUrl = value;
    }

    /**
     * Gets the value of the validUntil property.
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setValidUntil(Calendar value) {
        this.validUntil = value;
    }

    /**
     * This Id is used as a reference to the yet-to-be-uploaded
     *                         video. After uploading (done by the API-client) it must be provided when creating an
     *                         attachment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVideoId()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setVideoId(String value) {
        this.videoId = value;
    }

    /**
     * When uploading the part named "auth" has to be filled
     *                         with the value of this element. Only temporarily valid, see "validUntil".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuth()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setAuth(String value) {
        this.auth = value;
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
            URI theUploadUrl;
            theUploadUrl = this.getUploadUrl();
            strategy.appendField(locator, this, "uploadUrl", buffer, theUploadUrl, (this.uploadUrl!= null));
        }
        {
            Calendar theValidUntil;
            theValidUntil = this.getValidUntil();
            strategy.appendField(locator, this, "validUntil", buffer, theValidUntil, (this.validUntil!= null));
        }
        {
            String theVideoId;
            theVideoId = this.getVideoId();
            strategy.appendField(locator, this, "videoId", buffer, theVideoId, (this.videoId!= null));
        }
        {
            String theAuth;
            theAuth = this.getAuth();
            strategy.appendField(locator, this, "auth", buffer, theAuth, (this.auth!= null));
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
        if (draftCopy instanceof VideoUploadTicket) {
            final VideoUploadTicket copy = ((VideoUploadTicket) draftCopy);
            {
                Boolean uploadUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uploadUrl!= null));
                if (uploadUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceUploadUrl;
                    sourceUploadUrl = this.getUploadUrl();
                    URI copyUploadUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "uploadUrl", sourceUploadUrl), sourceUploadUrl, (this.uploadUrl!= null)));
                    copy.setUploadUrl(copyUploadUrl);
                } else {
                    if (uploadUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uploadUrl = null;
                    }
                }
            }
            {
                Boolean validUntilShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.validUntil!= null));
                if (validUntilShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceValidUntil;
                    sourceValidUntil = this.getValidUntil();
                    Calendar copyValidUntil = ((Calendar) strategy.copy(LocatorUtils.property(locator, "validUntil", sourceValidUntil), sourceValidUntil, (this.validUntil!= null)));
                    copy.setValidUntil(copyValidUntil);
                } else {
                    if (validUntilShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.validUntil = null;
                    }
                }
            }
            {
                Boolean videoIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.videoId!= null));
                if (videoIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVideoId;
                    sourceVideoId = this.getVideoId();
                    String copyVideoId = ((String) strategy.copy(LocatorUtils.property(locator, "videoId", sourceVideoId), sourceVideoId, (this.videoId!= null)));
                    copy.setVideoId(copyVideoId);
                } else {
                    if (videoIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videoId = null;
                    }
                }
            }
            {
                Boolean authShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.auth!= null));
                if (authShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAuth;
                    sourceAuth = this.getAuth();
                    String copyAuth = ((String) strategy.copy(LocatorUtils.property(locator, "auth", sourceAuth), sourceAuth, (this.auth!= null)));
                    copy.setAuth(copyAuth);
                } else {
                    if (authShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.auth = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new VideoUploadTicket();
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
        final VideoUploadTicket that = ((VideoUploadTicket) object);
        {
            URI lhsUploadUrl;
            lhsUploadUrl = this.getUploadUrl();
            URI rhsUploadUrl;
            rhsUploadUrl = that.getUploadUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uploadUrl", lhsUploadUrl), LocatorUtils.property(thatLocator, "uploadUrl", rhsUploadUrl), lhsUploadUrl, rhsUploadUrl, (this.uploadUrl!= null), (that.uploadUrl!= null))) {
                return false;
            }
        }
        {
            Calendar lhsValidUntil;
            lhsValidUntil = this.getValidUntil();
            Calendar rhsValidUntil;
            rhsValidUntil = that.getValidUntil();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "validUntil", lhsValidUntil), LocatorUtils.property(thatLocator, "validUntil", rhsValidUntil), lhsValidUntil, rhsValidUntil, (this.validUntil!= null), (that.validUntil!= null))) {
                return false;
            }
        }
        {
            String lhsVideoId;
            lhsVideoId = this.getVideoId();
            String rhsVideoId;
            rhsVideoId = that.getVideoId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoId", lhsVideoId), LocatorUtils.property(thatLocator, "videoId", rhsVideoId), lhsVideoId, rhsVideoId, (this.videoId!= null), (that.videoId!= null))) {
                return false;
            }
        }
        {
            String lhsAuth;
            lhsAuth = this.getAuth();
            String rhsAuth;
            rhsAuth = that.getAuth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "auth", lhsAuth), LocatorUtils.property(thatLocator, "auth", rhsAuth), lhsAuth, rhsAuth, (this.auth!= null), (that.auth!= null))) {
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
