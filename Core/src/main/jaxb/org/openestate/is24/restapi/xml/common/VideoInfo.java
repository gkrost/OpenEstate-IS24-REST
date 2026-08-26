package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
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
import org.openestate.is24.restapi.xml.Adapter4;
import org.openestate.is24.restapi.xml.Adapter5;


/**
 * streaming video urls von screen9
 * 
 * <p>Java class for VideoInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VideoInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="videoUrlList" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoUrlList" maxOccurs="2"/>
 *         <element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="teaserUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="title" type="{http://rest.immobilienscout24.de/schema/common/1.0}TextField" minOccurs="0"/>
 *         <element name="processingProgress" type="{http://rest.immobilienscout24.de/schema/common/1.0}percentType" minOccurs="0"/>
 *         <element name="processingStatus" type="{http://rest.immobilienscout24.de/schema/common/1.0}videoProcessingStatusType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoInfo", propOrder = {
    "videoUrlList",
    "duration",
    "teaserUrl",
    "title",
    "processingProgress",
    "processingStatus"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class VideoInfo implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * streaming video url Liste von screen9
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<VideoUrlList> videoUrlList;
    /**
     * Video Abspieldauer in ms
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long duration;
    /**
     * Teaser Bild für das gegebene Video
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected URI teaserUrl;
    /**
     * Titel vom Video
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String title;
    /**
     * Progress in percent information for media which is either
     *                         processing or re-processing.
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Integer processingProgress;
    /**
     * The status of this media
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected VideoProcessingStatusType processingStatus;

    /**
     * streaming video url Liste von screen9
     * 
     * Gets the value of the videoUrlList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the videoUrlList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVideoUrlList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoUrlList }
     * </p>
     * 
     * 
     * @return
     *     The value of the videoUrlList property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<VideoUrlList> getVideoUrlList() {
        if (videoUrlList == null) {
            videoUrlList = new ArrayList<>();
        }
        return this.videoUrlList;
    }

    /**
     * Video Abspieldauer in ms
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getDuration()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Teaser Bild für das gegebene Video
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public URI getTeaserUrl() {
        return teaserUrl;
    }

    /**
     * Sets the value of the teaserUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     * @see #getTeaserUrl()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTeaserUrl(URI value) {
        this.teaserUrl = value;
    }

    /**
     * Titel vom Video
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTitle()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Progress in percent information for media which is either
     *                         processing or re-processing.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Integer getProcessingProgress() {
        return processingProgress;
    }

    /**
     * Sets the value of the processingProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getProcessingProgress()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setProcessingProgress(Integer value) {
        this.processingProgress = value;
    }

    /**
     * The status of this media
     * 
     * @return
     *     possible object is
     *     {@link VideoProcessingStatusType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public VideoProcessingStatusType getProcessingStatus() {
        return processingStatus;
    }

    /**
     * Sets the value of the processingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoProcessingStatusType }
     *     
     * @see #getProcessingStatus()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setProcessingStatus(VideoProcessingStatusType value) {
        this.processingStatus = value;
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
            List<VideoUrlList> theVideoUrlList;
            theVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            strategy.appendField(locator, this, "videoUrlList", buffer, theVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())));
        }
        {
            Long theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration, (this.duration!= null));
        }
        {
            URI theTeaserUrl;
            theTeaserUrl = this.getTeaserUrl();
            strategy.appendField(locator, this, "teaserUrl", buffer, theTeaserUrl, (this.teaserUrl!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, (this.title!= null));
        }
        {
            Integer theProcessingProgress;
            theProcessingProgress = this.getProcessingProgress();
            strategy.appendField(locator, this, "processingProgress", buffer, theProcessingProgress, (this.processingProgress!= null));
        }
        {
            VideoProcessingStatusType theProcessingStatus;
            theProcessingStatus = this.getProcessingStatus();
            strategy.appendField(locator, this, "processingStatus", buffer, theProcessingStatus, (this.processingStatus!= null));
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
        if (draftCopy instanceof VideoInfo) {
            final VideoInfo copy = ((VideoInfo) draftCopy);
            {
                Boolean videoUrlListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())));
                if (videoUrlListShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<VideoUrlList> sourceVideoUrlList;
                    sourceVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
                    @SuppressWarnings("unchecked")
                    List<VideoUrlList> copyVideoUrlList = ((List<VideoUrlList> ) strategy.copy(LocatorUtils.property(locator, "videoUrlList", sourceVideoUrlList), sourceVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))));
                    copy.videoUrlList = null;
                    if (copyVideoUrlList!= null) {
                        List<VideoUrlList> uniqueVideoUrlListl = copy.getVideoUrlList();
                        uniqueVideoUrlListl.addAll(copyVideoUrlList);
                    }
                } else {
                    if (videoUrlListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.videoUrlList = null;
                    }
                }
            }
            {
                Boolean durationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.duration!= null));
                if (durationShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceDuration;
                    sourceDuration = this.getDuration();
                    Long copyDuration = ((Long) strategy.copy(LocatorUtils.property(locator, "duration", sourceDuration), sourceDuration, (this.duration!= null)));
                    copy.setDuration(copyDuration);
                } else {
                    if (durationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duration = null;
                    }
                }
            }
            {
                Boolean teaserUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.teaserUrl!= null));
                if (teaserUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceTeaserUrl;
                    sourceTeaserUrl = this.getTeaserUrl();
                    URI copyTeaserUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "teaserUrl", sourceTeaserUrl), sourceTeaserUrl, (this.teaserUrl!= null)));
                    copy.setTeaserUrl(copyTeaserUrl);
                } else {
                    if (teaserUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.teaserUrl = null;
                    }
                }
            }
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.title!= null));
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, (this.title!= null)));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
            {
                Boolean processingProgressShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.processingProgress!= null));
                if (processingProgressShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceProcessingProgress;
                    sourceProcessingProgress = this.getProcessingProgress();
                    Integer copyProcessingProgress = ((Integer) strategy.copy(LocatorUtils.property(locator, "processingProgress", sourceProcessingProgress), sourceProcessingProgress, (this.processingProgress!= null)));
                    copy.setProcessingProgress(copyProcessingProgress);
                } else {
                    if (processingProgressShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.processingProgress = null;
                    }
                }
            }
            {
                Boolean processingStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.processingStatus!= null));
                if (processingStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    VideoProcessingStatusType sourceProcessingStatus;
                    sourceProcessingStatus = this.getProcessingStatus();
                    VideoProcessingStatusType copyProcessingStatus = ((VideoProcessingStatusType) strategy.copy(LocatorUtils.property(locator, "processingStatus", sourceProcessingStatus), sourceProcessingStatus, (this.processingStatus!= null)));
                    copy.setProcessingStatus(copyProcessingStatus);
                } else {
                    if (processingStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.processingStatus = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new VideoInfo();
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
        final VideoInfo that = ((VideoInfo) object);
        {
            List<VideoUrlList> lhsVideoUrlList;
            lhsVideoUrlList = (((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty()))?this.getVideoUrlList():null);
            List<VideoUrlList> rhsVideoUrlList;
            rhsVideoUrlList = (((that.videoUrlList!= null)&&(!that.videoUrlList.isEmpty()))?that.getVideoUrlList():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "videoUrlList", lhsVideoUrlList), LocatorUtils.property(thatLocator, "videoUrlList", rhsVideoUrlList), lhsVideoUrlList, rhsVideoUrlList, ((this.videoUrlList!= null)&&(!this.videoUrlList.isEmpty())), ((that.videoUrlList!= null)&&(!that.videoUrlList.isEmpty())))) {
                return false;
            }
        }
        {
            Long lhsDuration;
            lhsDuration = this.getDuration();
            Long rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration, (this.duration!= null), (that.duration!= null))) {
                return false;
            }
        }
        {
            URI lhsTeaserUrl;
            lhsTeaserUrl = this.getTeaserUrl();
            URI rhsTeaserUrl;
            rhsTeaserUrl = that.getTeaserUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "teaserUrl", lhsTeaserUrl), LocatorUtils.property(thatLocator, "teaserUrl", rhsTeaserUrl), lhsTeaserUrl, rhsTeaserUrl, (this.teaserUrl!= null), (that.teaserUrl!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                return false;
            }
        }
        {
            Integer lhsProcessingProgress;
            lhsProcessingProgress = this.getProcessingProgress();
            Integer rhsProcessingProgress;
            rhsProcessingProgress = that.getProcessingProgress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingProgress", lhsProcessingProgress), LocatorUtils.property(thatLocator, "processingProgress", rhsProcessingProgress), lhsProcessingProgress, rhsProcessingProgress, (this.processingProgress!= null), (that.processingProgress!= null))) {
                return false;
            }
        }
        {
            VideoProcessingStatusType lhsProcessingStatus;
            lhsProcessingStatus = this.getProcessingStatus();
            VideoProcessingStatusType rhsProcessingStatus;
            rhsProcessingStatus = that.getProcessingStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processingStatus", lhsProcessingStatus), LocatorUtils.property(thatLocator, "processingStatus", rhsProcessingStatus), lhsProcessingStatus, rhsProcessingStatus, (this.processingStatus!= null), (that.processingStatus!= null))) {
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
