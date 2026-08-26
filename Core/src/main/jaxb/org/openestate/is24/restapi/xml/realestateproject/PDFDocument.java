package org.openestate.is24.restapi.xml.realestateproject;

import java.io.Serializable;
import java.net.URI;
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


/**
 * Ein PDF-Dokument.
 * 
 * <p>Java class for PDFDocument complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PDFDocument">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}Attachment">
 *       <sequence>
 *         <element name="url" type="{http://rest.immobilienscout24.de/schema/common/1.0}uri" minOccurs="0"/>
 *         <element name="pdfDocumentType" type="{http://rest.immobilienscout24.de/schema/offer/realestateproject/1.0}PDFDocumentType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFDocument", propOrder = {
    "url",
    "pdfDocumentType"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class PDFDocument
    extends Attachment
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected URI url;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected PDFDocumentType pdfDocumentType;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public URI getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setUrl(URI value) {
        this.url = value;
    }

    /**
     * Gets the value of the pdfDocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link PDFDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public PDFDocumentType getPdfDocumentType() {
        return pdfDocumentType;
    }

    /**
     * Sets the value of the pdfDocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDFDocumentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPdfDocumentType(PDFDocumentType value) {
        this.pdfDocumentType = value;
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
            URI theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl, (this.url!= null));
        }
        {
            PDFDocumentType thePdfDocumentType;
            thePdfDocumentType = this.getPdfDocumentType();
            strategy.appendField(locator, this, "pdfDocumentType", buffer, thePdfDocumentType, (this.pdfDocumentType!= null));
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
        if (draftCopy instanceof PDFDocument) {
            final PDFDocument copy = ((PDFDocument) draftCopy);
            {
                Boolean urlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.url!= null));
                if (urlShouldBeCopiedAndSet == Boolean.TRUE) {
                    URI sourceUrl;
                    sourceUrl = this.getUrl();
                    URI copyUrl = ((URI) strategy.copy(LocatorUtils.property(locator, "url", sourceUrl), sourceUrl, (this.url!= null)));
                    copy.setUrl(copyUrl);
                } else {
                    if (urlShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.url = null;
                    }
                }
            }
            {
                Boolean pdfDocumentTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pdfDocumentType!= null));
                if (pdfDocumentTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    PDFDocumentType sourcePdfDocumentType;
                    sourcePdfDocumentType = this.getPdfDocumentType();
                    PDFDocumentType copyPdfDocumentType = ((PDFDocumentType) strategy.copy(LocatorUtils.property(locator, "pdfDocumentType", sourcePdfDocumentType), sourcePdfDocumentType, (this.pdfDocumentType!= null)));
                    copy.setPdfDocumentType(copyPdfDocumentType);
                } else {
                    if (pdfDocumentTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pdfDocumentType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new PDFDocument();
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
        final PDFDocument that = ((PDFDocument) object);
        {
            URI lhsUrl;
            lhsUrl = this.getUrl();
            URI rhsUrl;
            rhsUrl = that.getUrl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, (this.url!= null), (that.url!= null))) {
                return false;
            }
        }
        {
            PDFDocumentType lhsPdfDocumentType;
            lhsPdfDocumentType = this.getPdfDocumentType();
            PDFDocumentType rhsPdfDocumentType;
            rhsPdfDocumentType = that.getPdfDocumentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pdfDocumentType", lhsPdfDocumentType), LocatorUtils.property(thatLocator, "pdfDocumentType", rhsPdfDocumentType), lhsPdfDocumentType, rhsPdfDocumentType, (this.pdfDocumentType!= null), (that.pdfDocumentType!= null))) {
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
