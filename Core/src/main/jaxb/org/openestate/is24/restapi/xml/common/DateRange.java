package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
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


/**
 * Datum von bis
 * 
 * <p>Java class for DateRange complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DateRange">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRange", propOrder = {

})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class DateRange implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * von Datum
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar dateFrom;
    /**
     * bis Datum
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Calendar dateTo;

    /**
     * von Datum
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getDateFrom()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDateFrom(Calendar value) {
        this.dateFrom = value;
    }

    /**
     * bis Datum
     * 
     * @return
     *     possible object is
     *     {@link Calendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Calendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendar }
     *     
     * @see #getDateTo()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDateTo(Calendar value) {
        this.dateTo = value;
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
            Calendar theDateFrom;
            theDateFrom = this.getDateFrom();
            strategy.appendField(locator, this, "dateFrom", buffer, theDateFrom, (this.dateFrom!= null));
        }
        {
            Calendar theDateTo;
            theDateTo = this.getDateTo();
            strategy.appendField(locator, this, "dateTo", buffer, theDateTo, (this.dateTo!= null));
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
        if (draftCopy instanceof DateRange) {
            final DateRange copy = ((DateRange) draftCopy);
            {
                Boolean dateFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateFrom!= null));
                if (dateFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateFrom;
                    sourceDateFrom = this.getDateFrom();
                    Calendar copyDateFrom = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateFrom", sourceDateFrom), sourceDateFrom, (this.dateFrom!= null)));
                    copy.setDateFrom(copyDateFrom);
                } else {
                    if (dateFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateFrom = null;
                    }
                }
            }
            {
                Boolean dateToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dateTo!= null));
                if (dateToShouldBeCopiedAndSet == Boolean.TRUE) {
                    Calendar sourceDateTo;
                    sourceDateTo = this.getDateTo();
                    Calendar copyDateTo = ((Calendar) strategy.copy(LocatorUtils.property(locator, "dateTo", sourceDateTo), sourceDateTo, (this.dateTo!= null)));
                    copy.setDateTo(copyDateTo);
                } else {
                    if (dateToShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateTo = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new DateRange();
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
        final DateRange that = ((DateRange) object);
        {
            Calendar lhsDateFrom;
            lhsDateFrom = this.getDateFrom();
            Calendar rhsDateFrom;
            rhsDateFrom = that.getDateFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateFrom", lhsDateFrom), LocatorUtils.property(thatLocator, "dateFrom", rhsDateFrom), lhsDateFrom, rhsDateFrom, (this.dateFrom!= null), (that.dateFrom!= null))) {
                return false;
            }
        }
        {
            Calendar lhsDateTo;
            lhsDateTo = this.getDateTo();
            Calendar rhsDateTo;
            rhsDateTo = that.getDateTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTo", lhsDateTo), LocatorUtils.property(thatLocator, "dateTo", rhsDateTo), lhsDateTo, rhsDateTo, (this.dateTo!= null), (that.dateTo!= null))) {
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
