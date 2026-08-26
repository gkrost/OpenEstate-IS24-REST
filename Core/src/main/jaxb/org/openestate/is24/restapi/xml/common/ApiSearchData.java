package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 * Enthält die Informationen für die API Suche einer Immobilie.
 * 
 * <p>Java class for ApiSearchData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApiSearchData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="searchField1" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         <element name="searchField2" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *         <element name="searchField3" type="{http://rest.immobilienscout24.de/schema/common/1.0}searchField" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiSearchData", propOrder = {
    "searchField1",
    "searchField2",
    "searchField3"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class ApiSearchData implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Suchfeld 1
     * 
     */
    @XmlJavaTypeAdapter(Adapter1 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String searchField1;
    /**
     * Suchfeld 2
     * 
     */
    @XmlJavaTypeAdapter(Adapter1 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String searchField2;
    /**
     * Suchfeld 3
     * 
     */
    @XmlJavaTypeAdapter(Adapter1 .class)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String searchField3;

    /**
     * Suchfeld 1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getSearchField1() {
        return searchField1;
    }

    /**
     * Sets the value of the searchField1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearchField1()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSearchField1(String value) {
        this.searchField1 = value;
    }

    /**
     * Suchfeld 2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getSearchField2() {
        return searchField2;
    }

    /**
     * Sets the value of the searchField2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearchField2()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSearchField2(String value) {
        this.searchField2 = value;
    }

    /**
     * Suchfeld 3
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getSearchField3() {
        return searchField3;
    }

    /**
     * Sets the value of the searchField3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSearchField3()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSearchField3(String value) {
        this.searchField3 = value;
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
            String theSearchField1;
            theSearchField1 = this.getSearchField1();
            strategy.appendField(locator, this, "searchField1", buffer, theSearchField1, (this.searchField1 != null));
        }
        {
            String theSearchField2;
            theSearchField2 = this.getSearchField2();
            strategy.appendField(locator, this, "searchField2", buffer, theSearchField2, (this.searchField2 != null));
        }
        {
            String theSearchField3;
            theSearchField3 = this.getSearchField3();
            strategy.appendField(locator, this, "searchField3", buffer, theSearchField3, (this.searchField3 != null));
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
        if (draftCopy instanceof ApiSearchData) {
            final ApiSearchData copy = ((ApiSearchData) draftCopy);
            {
                Boolean searchField1ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField1 != null));
                if (searchField1ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField1;
                    sourceSearchField1 = this.getSearchField1();
                    String copySearchField1 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField1", sourceSearchField1), sourceSearchField1, (this.searchField1 != null)));
                    copy.setSearchField1(copySearchField1);
                } else {
                    if (searchField1ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField1 = null;
                    }
                }
            }
            {
                Boolean searchField2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField2 != null));
                if (searchField2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField2;
                    sourceSearchField2 = this.getSearchField2();
                    String copySearchField2 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField2", sourceSearchField2), sourceSearchField2, (this.searchField2 != null)));
                    copy.setSearchField2(copySearchField2);
                } else {
                    if (searchField2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField2 = null;
                    }
                }
            }
            {
                Boolean searchField3ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchField3 != null));
                if (searchField3ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSearchField3;
                    sourceSearchField3 = this.getSearchField3();
                    String copySearchField3 = ((String) strategy.copy(LocatorUtils.property(locator, "searchField3", sourceSearchField3), sourceSearchField3, (this.searchField3 != null)));
                    copy.setSearchField3(copySearchField3);
                } else {
                    if (searchField3ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchField3 = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new ApiSearchData();
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
        final ApiSearchData that = ((ApiSearchData) object);
        {
            String lhsSearchField1;
            lhsSearchField1 = this.getSearchField1();
            String rhsSearchField1;
            rhsSearchField1 = that.getSearchField1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField1", lhsSearchField1), LocatorUtils.property(thatLocator, "searchField1", rhsSearchField1), lhsSearchField1, rhsSearchField1, (this.searchField1 != null), (that.searchField1 != null))) {
                return false;
            }
        }
        {
            String lhsSearchField2;
            lhsSearchField2 = this.getSearchField2();
            String rhsSearchField2;
            rhsSearchField2 = that.getSearchField2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField2", lhsSearchField2), LocatorUtils.property(thatLocator, "searchField2", rhsSearchField2), lhsSearchField2, rhsSearchField2, (this.searchField2 != null), (that.searchField2 != null))) {
                return false;
            }
        }
        {
            String lhsSearchField3;
            lhsSearchField3 = this.getSearchField3();
            String rhsSearchField3;
            rhsSearchField3 = that.getSearchField3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchField3", lhsSearchField3), LocatorUtils.property(thatLocator, "searchField3", rhsSearchField3), lhsSearchField3, rhsSearchField3, (this.searchField3 != null), (that.searchField3 != null))) {
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
