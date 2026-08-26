package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 * Ein Preis der für Budgets benutzt wird
 * 
 * <p>Java class for BudgetPrice complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BudgetPrice">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/common/1.0}Price">
 *       <sequence>
 *         <element name="rentScope" type="{http://rest.immobilienscout24.de/schema/common/1.0}RentScopeType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPrice", propOrder = {
    "rentScope"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class BudgetPrice
    extends Price
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Wenn der Preis-Typ BUDGET_RENT ist, dann Informiert
     *                                 dieses Element, welche Kosten in "value" enthalten sind.
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected RentScopeType rentScope;

    /**
     * Wenn der Preis-Typ BUDGET_RENT ist, dann Informiert
     *                                 dieses Element, welche Kosten in "value" enthalten sind.
     * 
     * @return
     *     possible object is
     *     {@link RentScopeType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public RentScopeType getRentScope() {
        return rentScope;
    }

    /**
     * Sets the value of the rentScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentScopeType }
     *     
     * @see #getRentScope()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRentScope(RentScopeType value) {
        this.rentScope = value;
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
            RentScopeType theRentScope;
            theRentScope = this.getRentScope();
            strategy.appendField(locator, this, "rentScope", buffer, theRentScope, (this.rentScope!= null));
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
        if (draftCopy instanceof BudgetPrice) {
            final BudgetPrice copy = ((BudgetPrice) draftCopy);
            {
                Boolean rentScopeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rentScope!= null));
                if (rentScopeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RentScopeType sourceRentScope;
                    sourceRentScope = this.getRentScope();
                    RentScopeType copyRentScope = ((RentScopeType) strategy.copy(LocatorUtils.property(locator, "rentScope", sourceRentScope), sourceRentScope, (this.rentScope!= null)));
                    copy.setRentScope(copyRentScope);
                } else {
                    if (rentScopeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rentScope = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new BudgetPrice();
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
        final BudgetPrice that = ((BudgetPrice) object);
        {
            RentScopeType lhsRentScope;
            lhsRentScope = this.getRentScope();
            RentScopeType rhsRentScope;
            rhsRentScope = that.getRentScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rentScope", lhsRentScope), LocatorUtils.property(thatLocator, "rentScope", rhsRentScope), lhsRentScope, rhsRentScope, (this.rentScope!= null), (that.rentScope!= null))) {
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
