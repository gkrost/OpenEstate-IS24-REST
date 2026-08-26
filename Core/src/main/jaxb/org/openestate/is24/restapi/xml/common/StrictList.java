package org.openestate.is24.restapi.xml.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="paging" type="{http://rest.immobilienscout24.de/schema/common/1.0}Paging" minOccurs="0"/>
 *         <element name="matchCountList" type="{http://rest.immobilienscout24.de/schema/common/1.0}MatchCountList" minOccurs="0"/>
 *         <element name="strictEntry" type="{http://rest.immobilienscout24.de/schema/common/1.0}StrictEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "paging",
    "matchCountList",
    "strictEntry"
})
@XmlRootElement(name = "strictList")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class StrictList implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Paging paging;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected MatchCountList matchCountList;
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected List<StrictEntry> strictEntry;

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the matchCountList property.
     * 
     * @return
     *     possible object is
     *     {@link MatchCountList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public MatchCountList getMatchCountList() {
        return matchCountList;
    }

    /**
     * Sets the value of the matchCountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchCountList }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMatchCountList(MatchCountList value) {
        this.matchCountList = value;
    }

    /**
     * Gets the value of the strictEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strictEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getStrictEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrictEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the strictEntry property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public List<StrictEntry> getStrictEntry() {
        if (strictEntry == null) {
            strictEntry = new ArrayList<>();
        }
        return this.strictEntry;
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
            Paging thePaging;
            thePaging = this.getPaging();
            strategy.appendField(locator, this, "paging", buffer, thePaging, (this.paging!= null));
        }
        {
            MatchCountList theMatchCountList;
            theMatchCountList = this.getMatchCountList();
            strategy.appendField(locator, this, "matchCountList", buffer, theMatchCountList, (this.matchCountList!= null));
        }
        {
            List<StrictEntry> theStrictEntry;
            theStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
            strategy.appendField(locator, this, "strictEntry", buffer, theStrictEntry, ((this.strictEntry!= null)&&(!this.strictEntry.isEmpty())));
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
        if (draftCopy instanceof StrictList) {
            final StrictList copy = ((StrictList) draftCopy);
            {
                Boolean pagingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.paging!= null));
                if (pagingShouldBeCopiedAndSet == Boolean.TRUE) {
                    Paging sourcePaging;
                    sourcePaging = this.getPaging();
                    Paging copyPaging = ((Paging) strategy.copy(LocatorUtils.property(locator, "paging", sourcePaging), sourcePaging, (this.paging!= null)));
                    copy.setPaging(copyPaging);
                } else {
                    if (pagingShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paging = null;
                    }
                }
            }
            {
                Boolean matchCountListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.matchCountList!= null));
                if (matchCountListShouldBeCopiedAndSet == Boolean.TRUE) {
                    MatchCountList sourceMatchCountList;
                    sourceMatchCountList = this.getMatchCountList();
                    MatchCountList copyMatchCountList = ((MatchCountList) strategy.copy(LocatorUtils.property(locator, "matchCountList", sourceMatchCountList), sourceMatchCountList, (this.matchCountList!= null)));
                    copy.setMatchCountList(copyMatchCountList);
                } else {
                    if (matchCountListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.matchCountList = null;
                    }
                }
            }
            {
                Boolean strictEntryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.strictEntry!= null)&&(!this.strictEntry.isEmpty())));
                if (strictEntryShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<StrictEntry> sourceStrictEntry;
                    sourceStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
                    @SuppressWarnings("unchecked")
                    List<StrictEntry> copyStrictEntry = ((List<StrictEntry> ) strategy.copy(LocatorUtils.property(locator, "strictEntry", sourceStrictEntry), sourceStrictEntry, ((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))));
                    copy.strictEntry = null;
                    if (copyStrictEntry!= null) {
                        List<StrictEntry> uniqueStrictEntryl = copy.getStrictEntry();
                        uniqueStrictEntryl.addAll(copyStrictEntry);
                    }
                } else {
                    if (strictEntryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.strictEntry = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new StrictList();
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
        final StrictList that = ((StrictList) object);
        {
            Paging lhsPaging;
            lhsPaging = this.getPaging();
            Paging rhsPaging;
            rhsPaging = that.getPaging();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paging", lhsPaging), LocatorUtils.property(thatLocator, "paging", rhsPaging), lhsPaging, rhsPaging, (this.paging!= null), (that.paging!= null))) {
                return false;
            }
        }
        {
            MatchCountList lhsMatchCountList;
            lhsMatchCountList = this.getMatchCountList();
            MatchCountList rhsMatchCountList;
            rhsMatchCountList = that.getMatchCountList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "matchCountList", lhsMatchCountList), LocatorUtils.property(thatLocator, "matchCountList", rhsMatchCountList), lhsMatchCountList, rhsMatchCountList, (this.matchCountList!= null), (that.matchCountList!= null))) {
                return false;
            }
        }
        {
            List<StrictEntry> lhsStrictEntry;
            lhsStrictEntry = (((this.strictEntry!= null)&&(!this.strictEntry.isEmpty()))?this.getStrictEntry():null);
            List<StrictEntry> rhsStrictEntry;
            rhsStrictEntry = (((that.strictEntry!= null)&&(!that.strictEntry.isEmpty()))?that.getStrictEntry():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strictEntry", lhsStrictEntry), LocatorUtils.property(thatLocator, "strictEntry", rhsStrictEntry), lhsStrictEntry, rhsStrictEntry, ((this.strictEntry!= null)&&(!this.strictEntry.isEmpty())), ((that.strictEntry!= null)&&(!that.strictEntry.isEmpty())))) {
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
