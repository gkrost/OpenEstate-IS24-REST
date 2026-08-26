package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * Liste der Trefferzahlen zu den Verfeinerungskriterien.
 * 
 * <p>Java class for MatchCountList complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MatchCountList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="matchCount" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchCountList", propOrder = {
    "matchCount"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class MatchCountList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<MatchCount> matchCount;

    /**
     * Gets the value of the matchCount property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the matchCount property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMatchCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchCount }
     * </p>
     * 
     * 
     * @return
     *     The value of the matchCount property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<MatchCount> getMatchCount() {
        if (matchCount == null) {
            matchCount = new ArrayList<>();
        }
        return this.matchCount;
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
            List<MatchCount> theMatchCount;
            theMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
            strategy.appendField(locator, this, "matchCount", buffer, theMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())));
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
        if (draftCopy instanceof MatchCountList) {
            final MatchCountList copy = ((MatchCountList) draftCopy);
            {
                Boolean matchCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())));
                if (matchCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MatchCount> sourceMatchCount;
                    sourceMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
                    @SuppressWarnings("unchecked")
                    List<MatchCount> copyMatchCount = ((List<MatchCount> ) strategy.copy(LocatorUtils.property(locator, "matchCount", sourceMatchCount), sourceMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty()))));
                    copy.matchCount = null;
                    if (copyMatchCount!= null) {
                        List<MatchCount> uniqueMatchCountl = copy.getMatchCount();
                        uniqueMatchCountl.addAll(copyMatchCount);
                    }
                } else {
                    if (matchCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.matchCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new MatchCountList();
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
        final MatchCountList that = ((MatchCountList) object);
        {
            List<MatchCount> lhsMatchCount;
            lhsMatchCount = (((this.matchCount!= null)&&(!this.matchCount.isEmpty()))?this.getMatchCount():null);
            List<MatchCount> rhsMatchCount;
            rhsMatchCount = (((that.matchCount!= null)&&(!that.matchCount.isEmpty()))?that.getMatchCount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchCount", lhsMatchCount), LocatorUtils.property(thatLocator, "matchCount", rhsMatchCount), lhsMatchCount, rhsMatchCount, ((this.matchCount!= null)&&(!this.matchCount.isEmpty())), ((that.matchCount!= null)&&(!that.matchCount.isEmpty())))) {
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
