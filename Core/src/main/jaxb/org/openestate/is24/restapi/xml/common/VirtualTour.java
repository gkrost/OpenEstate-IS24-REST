package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 * Eine einzelne virtuelle Tour
 * 
 * <p>Java class for VirtualTour complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VirtualTour">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Attachment">
 *       <sequence>
 *         <element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="previewUrls">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="url" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
 *                           <attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualTour", propOrder = {
    "url",
    "previewUrls"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class VirtualTour
    extends Attachment
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * URL des Vorschaubildes.
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String url;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected VirtualTour.PreviewUrls previewUrls;

    /**
     * URL des Vorschaubildes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUrl()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the previewUrls property.
     * 
     * @return
     *     possible object is
     *     {@link VirtualTour.PreviewUrls }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public VirtualTour.PreviewUrls getPreviewUrls() {
        return previewUrls;
    }

    /**
     * Sets the value of the previewUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualTour.PreviewUrls }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPreviewUrls(VirtualTour.PreviewUrls value) {
        this.previewUrls = value;
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
            String theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            VirtualTour.PreviewUrls thePreviewUrls;
            thePreviewUrls = this.getPreviewUrls();
            strategy.appendField(locator, this, "previewUrls", buffer, thePreviewUrls, (this.previewUrls!= null));
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
        if (draftCopy instanceof VirtualTour) {
            final VirtualTour copy = ((VirtualTour) draftCopy);
            {
                Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUrl;
                    sourceUrl = this.getUrl();
                    String copyUrl = ((String) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean previewUrlsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.previewUrls!= null));
                if (previewUrlsShouldBeCopiedAndSet == Boolean.TRUE) {
                    VirtualTour.PreviewUrls sourcePreviewUrls;
                    sourcePreviewUrls = this.getPreviewUrls();
                    VirtualTour.PreviewUrls copyPreviewUrls = ((VirtualTour.PreviewUrls) strategy.copy(LocatorUtils.property(locator, "previewUrls", sourcePreviewUrls), sourcePreviewUrls, (this.previewUrls!= null)));
                    copy.setPreviewUrls(copyPreviewUrls);
                } else {
                    if (previewUrlsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.previewUrls = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new VirtualTour();
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
        final VirtualTour that = ((VirtualTour) object);
        {
            String lhsUrl;
            lhsUrl = this.getUrl();
            String rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            VirtualTour.PreviewUrls lhsPreviewUrls;
            lhsPreviewUrls = this.getPreviewUrls();
            VirtualTour.PreviewUrls rhsPreviewUrls;
            rhsPreviewUrls = that.getPreviewUrls();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previewUrls", lhsPreviewUrls), LocatorUtils.property(thatLocator, "previewUrls", rhsPreviewUrls), lhsPreviewUrls, rhsPreviewUrls, (this.previewUrls!= null), (that.previewUrls!= null))) {
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
     *         <element name="url" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
     *                 <attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               </restriction>
     *             </complexContent>
     *           </complexType>
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
    @XmlType(name = "", propOrder = {
        "url"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public static class PreviewUrls implements Serializable, Cloneable, CopyTo, Equals, ToString
    {

        /**
         * URL des Vorschaubildes.
         * 
         */
        @XmlElement(required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        protected List<VirtualTour.PreviewUrls.Url> url;

        /**
         * URL des Vorschaubildes.
         * 
         * Gets the value of the url property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the url property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getUrl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VirtualTour.PreviewUrls.Url }
         * </p>
         * 
         * 
         * @return
         *     The value of the url property.
         */
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public List<VirtualTour.PreviewUrls.Url> getUrl() {
            if (url == null) {
                url = new ArrayList<>();
            }
            return this.url;
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
                List<VirtualTour.PreviewUrls.Url> theUrl;
                theUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                strategy.appendField(locator, this, "url", buffer, theUrl, ((this.url!= null)&&(!this.url.isEmpty())));
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
            if (draftCopy instanceof VirtualTour.PreviewUrls) {
                final VirtualTour.PreviewUrls copy = ((VirtualTour.PreviewUrls) draftCopy);
                {
                    Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.url!= null)&&(!this.url.isEmpty())));
                    if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<VirtualTour.PreviewUrls.Url> sourceUrl;
                        sourceUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                        @SuppressWarnings("unchecked")
                        List<VirtualTour.PreviewUrls.Url> copyUrl = ((List<VirtualTour.PreviewUrls.Url> ) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, ((this.url!= null)&&(!this.url.isEmpty()))));
                        copy.url = null;
                        if (copyUrl!= null) {
                            List<VirtualTour.PreviewUrls.Url> uniqueUrll = copy.getUrl();
                            uniqueUrll.addAll(copyUrl);
                        }
                    } else {
                        if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.url = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public Object createNewInstance() {
            return new VirtualTour.PreviewUrls();
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
            final VirtualTour.PreviewUrls that = ((VirtualTour.PreviewUrls) object);
            {
                List<VirtualTour.PreviewUrls.Url> lhsUrl;
                lhsUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
                List<VirtualTour.PreviewUrls.Url> rhsUrl;
                rhsUrl = (((that.url!= null)&&(!that.url.isEmpty()))?that.getUrl():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, ((this.url!= null)&&(!this.url.isEmpty())), ((that.url!= null)&&(!that.url.isEmpty())))) {
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <attribute name="scale" type="{http://rest.immobilienscout24.de/schema/common/1.0}PictureScaleType" />
         *       <attribute name="href" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
        public static class Url implements Serializable, Cloneable, CopyTo, Equals, ToString
        {

            /**
             * Bildergröße
             * 
             */
            @XmlAttribute(name = "scale")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            protected PictureScaleType scale;
            /**
             * URL zum skaliertem Bild
             * 
             */
            @XmlAttribute(name = "href")
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            protected String href;

            /**
             * Bildergröße
             * 
             * @return
             *     possible object is
             *     {@link PictureScaleType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            public PictureScaleType getScale() {
                return scale;
            }

            /**
             * Sets the value of the scale property.
             * 
             * @param value
             *     allowed object is
             *     {@link PictureScaleType }
             *     
             * @see #getScale()
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            public void setScale(PictureScaleType value) {
                this.scale = value;
            }

            /**
             * URL zum skaliertem Bild
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            public String getHref() {
                return href;
            }

            /**
             * Sets the value of the href property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getHref()
             */
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            public void setHref(String value) {
                this.href = value;
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
                    PictureScaleType theScale;
                    theScale = this.getScale();
                    strategy.appendField(locator, this, "scale", buffer, theScale, (this.scale!= null));
                }
                {
                    String theHref;
                    theHref = this.getHref();
                    strategy.appendField(locator, this, "href", buffer, theHref, (this.href!= null));
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
                if (draftCopy instanceof VirtualTour.PreviewUrls.Url) {
                    final VirtualTour.PreviewUrls.Url copy = ((VirtualTour.PreviewUrls.Url) draftCopy);
                    {
                        Boolean scaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.scale!= null));
                        if (scaleShouldBeCopiedAndSet == Boolean.TRUE) {
                            PictureScaleType sourceScale;
                            sourceScale = this.getScale();
                            PictureScaleType copyScale = ((PictureScaleType) strategy.copy(LocatorUtils.property(locator, "scale", sourceScale), sourceScale, (this.scale!= null)));
                            copy.setScale(copyScale);
                        } else {
                            if (scaleShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.scale = null;
                            }
                        }
                    }
                    {
                        Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.href!= null));
                        if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceHref;
                            sourceHref = this.getHref();
                            String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, (this.href!= null)));
                            copy.setHref(copyHref);
                        } else {
                            if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.href = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
            public Object createNewInstance() {
                return new VirtualTour.PreviewUrls.Url();
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
                final VirtualTour.PreviewUrls.Url that = ((VirtualTour.PreviewUrls.Url) object);
                {
                    PictureScaleType lhsScale;
                    lhsScale = this.getScale();
                    PictureScaleType rhsScale;
                    rhsScale = that.getScale();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "scale", lhsScale), LocatorUtils.property(thatLocator, "scale", rhsScale), lhsScale, rhsScale, (this.scale!= null), (that.scale!= null))) {
                        return false;
                    }
                }
                {
                    String lhsHref;
                    lhsHref = this.getHref();
                    String rhsHref;
                    rhsHref = that.getHref();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, (this.href!= null), (that.href!= null))) {
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

    }

}
