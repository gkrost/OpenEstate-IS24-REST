package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
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


/**
 * <p>Java class for CourtageInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CourtageInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="hasCourtage" type="{http://rest.immobilienscout24.de/schema/common/1.0}YesNoNotApplicableType"/>
 *         <element name="courtage" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="courtageNote" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://rest.immobilienscout24.de/schema/common/1.0}TextField">
 *               <maxLength value="1800"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourtageInfo", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class CourtageInfo implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Provisionpflichtig:'YES' oder 'NO', der Wert NOT_APPLICABLE ist
     *                         nicht mehr erlaubt.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected YesNoNotApplicableType hasCourtage;
    /**
     * Provisionshöhe, muss spezifiziert werden wenn hasCourtage 'YES'
     *                         ist
     * 
     */
    @XmlJavaTypeAdapter(Adapter32 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String courtage;
    /**
     * Provisionshinweis
     * 
     */
    @XmlJavaTypeAdapter(Adapter33 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String courtageNote;

    /**
     * Provisionpflichtig:'YES' oder 'NO', der Wert NOT_APPLICABLE ist
     *                         nicht mehr erlaubt.
     * 
     * @return
     *     possible object is
     *     {@link YesNoNotApplicableType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public YesNoNotApplicableType getHasCourtage() {
        return hasCourtage;
    }

    /**
     * Sets the value of the hasCourtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoNotApplicableType }
     *     
     * @see #getHasCourtage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setHasCourtage(YesNoNotApplicableType value) {
        this.hasCourtage = value;
    }

    /**
     * Provisionshöhe, muss spezifiziert werden wenn hasCourtage 'YES'
     *                         ist
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCourtage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCourtage(String value) {
        this.courtage = value;
    }

    /**
     * Provisionshinweis
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getCourtageNote() {
        return courtageNote;
    }

    /**
     * Sets the value of the courtageNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCourtageNote()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCourtageNote(String value) {
        this.courtageNote = value;
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
            YesNoNotApplicableType theHasCourtage;
            theHasCourtage = this.getHasCourtage();
            strategy.appendField(locator, this, "hasCourtage", buffer, theHasCourtage, (this.hasCourtage!= null));
        }
        {
            String theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            String theCourtageNote;
            theCourtageNote = this.getCourtageNote();
            strategy.appendField(locator, this, "courtageNote", buffer, theCourtageNote, (this.courtageNote!= null));
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
        if (draftCopy instanceof CourtageInfo) {
            final CourtageInfo copy = ((CourtageInfo) draftCopy);
            {
                Boolean hasCourtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hasCourtage!= null));
                if (hasCourtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    YesNoNotApplicableType sourceHasCourtage;
                    sourceHasCourtage = this.getHasCourtage();
                    YesNoNotApplicableType copyHasCourtage = ((YesNoNotApplicableType) strategy.copy(LocatorUtils.property(locator, "hasCourtage", sourceHasCourtage), sourceHasCourtage, (this.hasCourtage!= null)));
                    copy.setHasCourtage(copyHasCourtage);
                } else {
                    if (hasCourtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hasCourtage = null;
                    }
                }
            }
            {
                Boolean courtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtage!= null));
                if (courtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCourtage;
                    sourceCourtage = this.getCourtage();
                    String copyCourtage = ((String) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage, (this.courtage!= null)));
                    copy.setCourtage(copyCourtage);
                } else {
                    if (courtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtage = null;
                    }
                }
            }
            {
                Boolean courtageNoteShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtageNote!= null));
                if (courtageNoteShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCourtageNote;
                    sourceCourtageNote = this.getCourtageNote();
                    String copyCourtageNote = ((String) strategy.copy(LocatorUtils.property(locator, "courtageNote", sourceCourtageNote), sourceCourtageNote, (this.courtageNote!= null)));
                    copy.setCourtageNote(copyCourtageNote);
                } else {
                    if (courtageNoteShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtageNote = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new CourtageInfo();
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
        final CourtageInfo that = ((CourtageInfo) object);
        {
            YesNoNotApplicableType lhsHasCourtage;
            lhsHasCourtage = this.getHasCourtage();
            YesNoNotApplicableType rhsHasCourtage;
            rhsHasCourtage = that.getHasCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hasCourtage", lhsHasCourtage), LocatorUtils.property(thatLocator, "hasCourtage", rhsHasCourtage), lhsHasCourtage, rhsHasCourtage, (this.hasCourtage!= null), (that.hasCourtage!= null))) {
                return false;
            }
        }
        {
            String lhsCourtage;
            lhsCourtage = this.getCourtage();
            String rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        {
            String lhsCourtageNote;
            lhsCourtageNote = this.getCourtageNote();
            String rhsCourtageNote;
            rhsCourtageNote = that.getCourtageNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtageNote", lhsCourtageNote), LocatorUtils.property(thatLocator, "courtageNote", rhsCourtageNote), lhsCourtageNote, rhsCourtageNote, (this.courtageNote!= null), (that.courtageNote!= null))) {
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
