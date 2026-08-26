package org.openestate.is24.restapi.xml.realestates;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.openestate.is24.restapi.xml.Adapter1;
import org.openestate.is24.restapi.xml.Adapter5;
import org.openestate.is24.restapi.xml.common.CommercializationType;
import org.openestate.is24.restapi.xml.common.CourtageInfo;
import org.openestate.is24.restapi.xml.common.LeaseIntervalType;
import org.openestate.is24.restapi.xml.common.Price;
import org.openestate.is24.restapi.xml.common.SiteConstructibleType;
import org.openestate.is24.restapi.xml.common.SiteDevelopmentType;
import org.openestate.is24.restapi.xml.common.SiteRecommendedUseTypes;


/**
 * Eigenschaften für den Immobilientyp "Wohngrundstück zum Kauf"
 * 
 * <p>Java class for LivingBuySite complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LivingBuySite">
 *   <complexContent>
 *     <extension base="{http://rest.immobilienscout24.de/schema/offer/realestates/1.0}RealEstate">
 *       <sequence>
 *         <group ref="{http://rest.immobilienscout24.de/schema/common/1.0}ExtendedLivingBuySiteGroup"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivingBuySite", propOrder = {
    "commercializationType",
    "recommendedUseTypes",
    "tenancy",
    "price",
    "plotArea",
    "minDivisible",
    "courtage",
    "freeFrom",
    "shortTermConstructible",
    "buildingPermission",
    "demolition",
    "siteDevelopmentType",
    "siteConstructibleType",
    "grz",
    "gfz",
    "leaseInterval"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public class LivingBuySite
    extends RealEstate
    implements Serializable, Cloneable, CopyTo, Equals, ToString
{

    /**
     * Vermarktungsart: Gibt an, ob ein Objekt zum Kauf, oder zur
     *                         Erbpacht steht
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CommercializationType commercializationType;
    /**
     * empfohlene Nutzungsarten
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected SiteRecommendedUseTypes recommendedUseTypes;
    /**
     * Heimfall nach
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    @XmlSchemaType(name = "int")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Long tenancy;
    /**
     * Preis, die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Price price;
    /**
     * Grundstücksfläche
     * 
     */
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal plotArea;
    /**
     * Teilbar ab
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal minDivisible;
    /**
     * Provisionselemente
     * 
     */
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected CourtageInfo courtage;
    /**
     * Bezugsfrei ab
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected String freeFrom;
    /**
     * Gibt an, ob das Grundstueck kurzfristig bebaubar ist
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean shortTermConstructible;
    /**
     * Baugenehmigung
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean buildingPermission;
    /**
     * Abriss
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected Boolean demolition;
    /**
     * Erschliessung
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected SiteDevelopmentType siteDevelopmentType;
    /**
     * Bebaubar nach
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected SiteConstructibleType siteConstructibleType;
    /**
     * Grundflaechenzahl
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal grz;
    /**
     * Geschossflaechenzahl
     * 
     */
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected BigDecimal gfz;
    /**
     * Pachtdauer Intervall Type (Nur für den GET Request)
     * 
     */
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    protected LeaseIntervalType leaseInterval;

    /**
     * Vermarktungsart: Gibt an, ob ein Objekt zum Kauf, oder zur
     *                         Erbpacht steht
     * 
     * @return
     *     possible object is
     *     {@link CommercializationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CommercializationType getCommercializationType() {
        return commercializationType;
    }

    /**
     * Sets the value of the commercializationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercializationType }
     *     
     * @see #getCommercializationType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCommercializationType(CommercializationType value) {
        this.commercializationType = value;
    }

    /**
     * empfohlene Nutzungsarten
     * 
     * @return
     *     possible object is
     *     {@link SiteRecommendedUseTypes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public SiteRecommendedUseTypes getRecommendedUseTypes() {
        return recommendedUseTypes;
    }

    /**
     * Sets the value of the recommendedUseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteRecommendedUseTypes }
     *     
     * @see #getRecommendedUseTypes()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setRecommendedUseTypes(SiteRecommendedUseTypes value) {
        this.recommendedUseTypes = value;
    }

    /**
     * Heimfall nach
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Long getTenancy() {
        return tenancy;
    }

    /**
     * Sets the value of the tenancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getTenancy()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setTenancy(Long value) {
        this.tenancy = value;
    }

    /**
     * Preis, die Attribute geben die Art, die Währung und den Intervall
     *                         an
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     * @see #getPrice()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Grundstücksfläche
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPlotArea()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setPlotArea(BigDecimal value) {
        this.plotArea = value;
    }

    /**
     * Teilbar ab
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getMinDivisible() {
        return minDivisible;
    }

    /**
     * Sets the value of the minDivisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMinDivisible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setMinDivisible(BigDecimal value) {
        this.minDivisible = value;
    }

    /**
     * Provisionselemente
     * 
     * @return
     *     possible object is
     *     {@link CourtageInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public CourtageInfo getCourtage() {
        return courtage;
    }

    /**
     * Sets the value of the courtage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtageInfo }
     *     
     * @see #getCourtage()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setCourtage(CourtageInfo value) {
        this.courtage = value;
    }

    /**
     * Bezugsfrei ab
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public String getFreeFrom() {
        return freeFrom;
    }

    /**
     * Sets the value of the freeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFreeFrom()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setFreeFrom(String value) {
        this.freeFrom = value;
    }

    /**
     * Gibt an, ob das Grundstueck kurzfristig bebaubar ist
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getShortTermConstructible() {
        return shortTermConstructible;
    }

    /**
     * Sets the value of the shortTermConstructible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getShortTermConstructible()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setShortTermConstructible(Boolean value) {
        this.shortTermConstructible = value;
    }

    /**
     * Baugenehmigung
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getBuildingPermission() {
        return buildingPermission;
    }

    /**
     * Sets the value of the buildingPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getBuildingPermission()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setBuildingPermission(Boolean value) {
        this.buildingPermission = value;
    }

    /**
     * Abriss
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Boolean getDemolition() {
        return demolition;
    }

    /**
     * Sets the value of the demolition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #getDemolition()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setDemolition(Boolean value) {
        this.demolition = value;
    }

    /**
     * Erschliessung
     * 
     * @return
     *     possible object is
     *     {@link SiteDevelopmentType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public SiteDevelopmentType getSiteDevelopmentType() {
        return siteDevelopmentType;
    }

    /**
     * Sets the value of the siteDevelopmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDevelopmentType }
     *     
     * @see #getSiteDevelopmentType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSiteDevelopmentType(SiteDevelopmentType value) {
        this.siteDevelopmentType = value;
    }

    /**
     * Bebaubar nach
     * 
     * @return
     *     possible object is
     *     {@link SiteConstructibleType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public SiteConstructibleType getSiteConstructibleType() {
        return siteConstructibleType;
    }

    /**
     * Sets the value of the siteConstructibleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteConstructibleType }
     *     
     * @see #getSiteConstructibleType()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setSiteConstructibleType(SiteConstructibleType value) {
        this.siteConstructibleType = value;
    }

    /**
     * Grundflaechenzahl
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getGrz() {
        return grz;
    }

    /**
     * Sets the value of the grz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGrz()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGrz(BigDecimal value) {
        this.grz = value;
    }

    /**
     * Geschossflaechenzahl
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public BigDecimal getGfz() {
        return gfz;
    }

    /**
     * Sets the value of the gfz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGfz()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setGfz(BigDecimal value) {
        this.gfz = value;
    }

    /**
     * Pachtdauer Intervall Type (Nur für den GET Request)
     * 
     * @return
     *     possible object is
     *     {@link LeaseIntervalType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public LeaseIntervalType getLeaseInterval() {
        return leaseInterval;
    }

    /**
     * Sets the value of the leaseInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaseIntervalType }
     *     
     * @see #getLeaseInterval()
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public void setLeaseInterval(LeaseIntervalType value) {
        this.leaseInterval = value;
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
            CommercializationType theCommercializationType;
            theCommercializationType = this.getCommercializationType();
            strategy.appendField(locator, this, "commercializationType", buffer, theCommercializationType, (this.commercializationType!= null));
        }
        {
            SiteRecommendedUseTypes theRecommendedUseTypes;
            theRecommendedUseTypes = this.getRecommendedUseTypes();
            strategy.appendField(locator, this, "recommendedUseTypes", buffer, theRecommendedUseTypes, (this.recommendedUseTypes!= null));
        }
        {
            Long theTenancy;
            theTenancy = this.getTenancy();
            strategy.appendField(locator, this, "tenancy", buffer, theTenancy, (this.tenancy!= null));
        }
        {
            Price thePrice;
            thePrice = this.getPrice();
            strategy.appendField(locator, this, "price", buffer, thePrice, (this.price!= null));
        }
        {
            BigDecimal thePlotArea;
            thePlotArea = this.getPlotArea();
            strategy.appendField(locator, this, "plotArea", buffer, thePlotArea, (this.plotArea!= null));
        }
        {
            BigDecimal theMinDivisible;
            theMinDivisible = this.getMinDivisible();
            strategy.appendField(locator, this, "minDivisible", buffer, theMinDivisible, (this.minDivisible!= null));
        }
        {
            CourtageInfo theCourtage;
            theCourtage = this.getCourtage();
            strategy.appendField(locator, this, "courtage", buffer, theCourtage, (this.courtage!= null));
        }
        {
            String theFreeFrom;
            theFreeFrom = this.getFreeFrom();
            strategy.appendField(locator, this, "freeFrom", buffer, theFreeFrom, (this.freeFrom!= null));
        }
        {
            Boolean theShortTermConstructible;
            theShortTermConstructible = this.getShortTermConstructible();
            strategy.appendField(locator, this, "shortTermConstructible", buffer, theShortTermConstructible, (this.shortTermConstructible!= null));
        }
        {
            Boolean theBuildingPermission;
            theBuildingPermission = this.getBuildingPermission();
            strategy.appendField(locator, this, "buildingPermission", buffer, theBuildingPermission, (this.buildingPermission!= null));
        }
        {
            Boolean theDemolition;
            theDemolition = this.getDemolition();
            strategy.appendField(locator, this, "demolition", buffer, theDemolition, (this.demolition!= null));
        }
        {
            SiteDevelopmentType theSiteDevelopmentType;
            theSiteDevelopmentType = this.getSiteDevelopmentType();
            strategy.appendField(locator, this, "siteDevelopmentType", buffer, theSiteDevelopmentType, (this.siteDevelopmentType!= null));
        }
        {
            SiteConstructibleType theSiteConstructibleType;
            theSiteConstructibleType = this.getSiteConstructibleType();
            strategy.appendField(locator, this, "siteConstructibleType", buffer, theSiteConstructibleType, (this.siteConstructibleType!= null));
        }
        {
            BigDecimal theGrz;
            theGrz = this.getGrz();
            strategy.appendField(locator, this, "grz", buffer, theGrz, (this.grz!= null));
        }
        {
            BigDecimal theGfz;
            theGfz = this.getGfz();
            strategy.appendField(locator, this, "gfz", buffer, theGfz, (this.gfz!= null));
        }
        {
            LeaseIntervalType theLeaseInterval;
            theLeaseInterval = this.getLeaseInterval();
            strategy.appendField(locator, this, "leaseInterval", buffer, theLeaseInterval, (this.leaseInterval!= null));
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
        if (draftCopy instanceof LivingBuySite) {
            final LivingBuySite copy = ((LivingBuySite) draftCopy);
            {
                Boolean commercializationTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.commercializationType!= null));
                if (commercializationTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CommercializationType sourceCommercializationType;
                    sourceCommercializationType = this.getCommercializationType();
                    CommercializationType copyCommercializationType = ((CommercializationType) strategy.copy(LocatorUtils.property(locator, "commercializationType", sourceCommercializationType), sourceCommercializationType, (this.commercializationType!= null)));
                    copy.setCommercializationType(copyCommercializationType);
                } else {
                    if (commercializationTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.commercializationType = null;
                    }
                }
            }
            {
                Boolean recommendedUseTypesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.recommendedUseTypes!= null));
                if (recommendedUseTypesShouldBeCopiedAndSet == Boolean.TRUE) {
                    SiteRecommendedUseTypes sourceRecommendedUseTypes;
                    sourceRecommendedUseTypes = this.getRecommendedUseTypes();
                    SiteRecommendedUseTypes copyRecommendedUseTypes = ((SiteRecommendedUseTypes) strategy.copy(LocatorUtils.property(locator, "recommendedUseTypes", sourceRecommendedUseTypes), sourceRecommendedUseTypes, (this.recommendedUseTypes!= null)));
                    copy.setRecommendedUseTypes(copyRecommendedUseTypes);
                } else {
                    if (recommendedUseTypesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.recommendedUseTypes = null;
                    }
                }
            }
            {
                Boolean tenancyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tenancy!= null));
                if (tenancyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Long sourceTenancy;
                    sourceTenancy = this.getTenancy();
                    Long copyTenancy = ((Long) strategy.copy(LocatorUtils.property(locator, "tenancy", sourceTenancy), sourceTenancy, (this.tenancy!= null)));
                    copy.setTenancy(copyTenancy);
                } else {
                    if (tenancyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.tenancy = null;
                    }
                }
            }
            {
                Boolean priceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.price!= null));
                if (priceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Price sourcePrice;
                    sourcePrice = this.getPrice();
                    Price copyPrice = ((Price) strategy.copy(LocatorUtils.property(locator, "price", sourcePrice), sourcePrice, (this.price!= null)));
                    copy.setPrice(copyPrice);
                } else {
                    if (priceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.price = null;
                    }
                }
            }
            {
                Boolean plotAreaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.plotArea!= null));
                if (plotAreaShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourcePlotArea;
                    sourcePlotArea = this.getPlotArea();
                    BigDecimal copyPlotArea = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "plotArea", sourcePlotArea), sourcePlotArea, (this.plotArea!= null)));
                    copy.setPlotArea(copyPlotArea);
                } else {
                    if (plotAreaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.plotArea = null;
                    }
                }
            }
            {
                Boolean minDivisibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minDivisible!= null));
                if (minDivisibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceMinDivisible;
                    sourceMinDivisible = this.getMinDivisible();
                    BigDecimal copyMinDivisible = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "minDivisible", sourceMinDivisible), sourceMinDivisible, (this.minDivisible!= null)));
                    copy.setMinDivisible(copyMinDivisible);
                } else {
                    if (minDivisibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.minDivisible = null;
                    }
                }
            }
            {
                Boolean courtageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.courtage!= null));
                if (courtageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CourtageInfo sourceCourtage;
                    sourceCourtage = this.getCourtage();
                    CourtageInfo copyCourtage = ((CourtageInfo) strategy.copy(LocatorUtils.property(locator, "courtage", sourceCourtage), sourceCourtage, (this.courtage!= null)));
                    copy.setCourtage(copyCourtage);
                } else {
                    if (courtageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.courtage = null;
                    }
                }
            }
            {
                Boolean freeFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.freeFrom!= null));
                if (freeFromShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFreeFrom;
                    sourceFreeFrom = this.getFreeFrom();
                    String copyFreeFrom = ((String) strategy.copy(LocatorUtils.property(locator, "freeFrom", sourceFreeFrom), sourceFreeFrom, (this.freeFrom!= null)));
                    copy.setFreeFrom(copyFreeFrom);
                } else {
                    if (freeFromShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.freeFrom = null;
                    }
                }
            }
            {
                Boolean shortTermConstructibleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.shortTermConstructible!= null));
                if (shortTermConstructibleShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceShortTermConstructible;
                    sourceShortTermConstructible = this.getShortTermConstructible();
                    Boolean copyShortTermConstructible = ((Boolean) strategy.copy(LocatorUtils.property(locator, "shortTermConstructible", sourceShortTermConstructible), sourceShortTermConstructible, (this.shortTermConstructible!= null)));
                    copy.setShortTermConstructible(copyShortTermConstructible);
                } else {
                    if (shortTermConstructibleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.shortTermConstructible = null;
                    }
                }
            }
            {
                Boolean buildingPermissionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.buildingPermission!= null));
                if (buildingPermissionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceBuildingPermission;
                    sourceBuildingPermission = this.getBuildingPermission();
                    Boolean copyBuildingPermission = ((Boolean) strategy.copy(LocatorUtils.property(locator, "buildingPermission", sourceBuildingPermission), sourceBuildingPermission, (this.buildingPermission!= null)));
                    copy.setBuildingPermission(copyBuildingPermission);
                } else {
                    if (buildingPermissionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.buildingPermission = null;
                    }
                }
            }
            {
                Boolean demolitionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.demolition!= null));
                if (demolitionShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceDemolition;
                    sourceDemolition = this.getDemolition();
                    Boolean copyDemolition = ((Boolean) strategy.copy(LocatorUtils.property(locator, "demolition", sourceDemolition), sourceDemolition, (this.demolition!= null)));
                    copy.setDemolition(copyDemolition);
                } else {
                    if (demolitionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.demolition = null;
                    }
                }
            }
            {
                Boolean siteDevelopmentTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.siteDevelopmentType!= null));
                if (siteDevelopmentTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    SiteDevelopmentType sourceSiteDevelopmentType;
                    sourceSiteDevelopmentType = this.getSiteDevelopmentType();
                    SiteDevelopmentType copySiteDevelopmentType = ((SiteDevelopmentType) strategy.copy(LocatorUtils.property(locator, "siteDevelopmentType", sourceSiteDevelopmentType), sourceSiteDevelopmentType, (this.siteDevelopmentType!= null)));
                    copy.setSiteDevelopmentType(copySiteDevelopmentType);
                } else {
                    if (siteDevelopmentTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.siteDevelopmentType = null;
                    }
                }
            }
            {
                Boolean siteConstructibleTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.siteConstructibleType!= null));
                if (siteConstructibleTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    SiteConstructibleType sourceSiteConstructibleType;
                    sourceSiteConstructibleType = this.getSiteConstructibleType();
                    SiteConstructibleType copySiteConstructibleType = ((SiteConstructibleType) strategy.copy(LocatorUtils.property(locator, "siteConstructibleType", sourceSiteConstructibleType), sourceSiteConstructibleType, (this.siteConstructibleType!= null)));
                    copy.setSiteConstructibleType(copySiteConstructibleType);
                } else {
                    if (siteConstructibleTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.siteConstructibleType = null;
                    }
                }
            }
            {
                Boolean grzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.grz!= null));
                if (grzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGrz;
                    sourceGrz = this.getGrz();
                    BigDecimal copyGrz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "grz", sourceGrz), sourceGrz, (this.grz!= null)));
                    copy.setGrz(copyGrz);
                } else {
                    if (grzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.grz = null;
                    }
                }
            }
            {
                Boolean gfzShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.gfz!= null));
                if (gfzShouldBeCopiedAndSet == Boolean.TRUE) {
                    BigDecimal sourceGfz;
                    sourceGfz = this.getGfz();
                    BigDecimal copyGfz = ((BigDecimal) strategy.copy(LocatorUtils.property(locator, "gfz", sourceGfz), sourceGfz, (this.gfz!= null)));
                    copy.setGfz(copyGfz);
                } else {
                    if (gfzShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.gfz = null;
                    }
                }
            }
            {
                Boolean leaseIntervalShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.leaseInterval!= null));
                if (leaseIntervalShouldBeCopiedAndSet == Boolean.TRUE) {
                    LeaseIntervalType sourceLeaseInterval;
                    sourceLeaseInterval = this.getLeaseInterval();
                    LeaseIntervalType copyLeaseInterval = ((LeaseIntervalType) strategy.copy(LocatorUtils.property(locator, "leaseInterval", sourceLeaseInterval), sourceLeaseInterval, (this.leaseInterval!= null)));
                    copy.setLeaseInterval(copyLeaseInterval);
                } else {
                    if (leaseIntervalShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.leaseInterval = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
    public Object createNewInstance() {
        return new LivingBuySite();
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
        final LivingBuySite that = ((LivingBuySite) object);
        {
            CommercializationType lhsCommercializationType;
            lhsCommercializationType = this.getCommercializationType();
            CommercializationType rhsCommercializationType;
            rhsCommercializationType = that.getCommercializationType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "commercializationType", lhsCommercializationType), LocatorUtils.property(thatLocator, "commercializationType", rhsCommercializationType), lhsCommercializationType, rhsCommercializationType, (this.commercializationType!= null), (that.commercializationType!= null))) {
                return false;
            }
        }
        {
            SiteRecommendedUseTypes lhsRecommendedUseTypes;
            lhsRecommendedUseTypes = this.getRecommendedUseTypes();
            SiteRecommendedUseTypes rhsRecommendedUseTypes;
            rhsRecommendedUseTypes = that.getRecommendedUseTypes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "recommendedUseTypes", lhsRecommendedUseTypes), LocatorUtils.property(thatLocator, "recommendedUseTypes", rhsRecommendedUseTypes), lhsRecommendedUseTypes, rhsRecommendedUseTypes, (this.recommendedUseTypes!= null), (that.recommendedUseTypes!= null))) {
                return false;
            }
        }
        {
            Long lhsTenancy;
            lhsTenancy = this.getTenancy();
            Long rhsTenancy;
            rhsTenancy = that.getTenancy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tenancy", lhsTenancy), LocatorUtils.property(thatLocator, "tenancy", rhsTenancy), lhsTenancy, rhsTenancy, (this.tenancy!= null), (that.tenancy!= null))) {
                return false;
            }
        }
        {
            Price lhsPrice;
            lhsPrice = this.getPrice();
            Price rhsPrice;
            rhsPrice = that.getPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "price", lhsPrice), LocatorUtils.property(thatLocator, "price", rhsPrice), lhsPrice, rhsPrice, (this.price!= null), (that.price!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsPlotArea;
            lhsPlotArea = this.getPlotArea();
            BigDecimal rhsPlotArea;
            rhsPlotArea = that.getPlotArea();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "plotArea", lhsPlotArea), LocatorUtils.property(thatLocator, "plotArea", rhsPlotArea), lhsPlotArea, rhsPlotArea, (this.plotArea!= null), (that.plotArea!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsMinDivisible;
            lhsMinDivisible = this.getMinDivisible();
            BigDecimal rhsMinDivisible;
            rhsMinDivisible = that.getMinDivisible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDivisible", lhsMinDivisible), LocatorUtils.property(thatLocator, "minDivisible", rhsMinDivisible), lhsMinDivisible, rhsMinDivisible, (this.minDivisible!= null), (that.minDivisible!= null))) {
                return false;
            }
        }
        {
            CourtageInfo lhsCourtage;
            lhsCourtage = this.getCourtage();
            CourtageInfo rhsCourtage;
            rhsCourtage = that.getCourtage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "courtage", lhsCourtage), LocatorUtils.property(thatLocator, "courtage", rhsCourtage), lhsCourtage, rhsCourtage, (this.courtage!= null), (that.courtage!= null))) {
                return false;
            }
        }
        {
            String lhsFreeFrom;
            lhsFreeFrom = this.getFreeFrom();
            String rhsFreeFrom;
            rhsFreeFrom = that.getFreeFrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFrom", lhsFreeFrom), LocatorUtils.property(thatLocator, "freeFrom", rhsFreeFrom), lhsFreeFrom, rhsFreeFrom, (this.freeFrom!= null), (that.freeFrom!= null))) {
                return false;
            }
        }
        {
            Boolean lhsShortTermConstructible;
            lhsShortTermConstructible = this.getShortTermConstructible();
            Boolean rhsShortTermConstructible;
            rhsShortTermConstructible = that.getShortTermConstructible();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shortTermConstructible", lhsShortTermConstructible), LocatorUtils.property(thatLocator, "shortTermConstructible", rhsShortTermConstructible), lhsShortTermConstructible, rhsShortTermConstructible, (this.shortTermConstructible!= null), (that.shortTermConstructible!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBuildingPermission;
            lhsBuildingPermission = this.getBuildingPermission();
            Boolean rhsBuildingPermission;
            rhsBuildingPermission = that.getBuildingPermission();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "buildingPermission", lhsBuildingPermission), LocatorUtils.property(thatLocator, "buildingPermission", rhsBuildingPermission), lhsBuildingPermission, rhsBuildingPermission, (this.buildingPermission!= null), (that.buildingPermission!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDemolition;
            lhsDemolition = this.getDemolition();
            Boolean rhsDemolition;
            rhsDemolition = that.getDemolition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demolition", lhsDemolition), LocatorUtils.property(thatLocator, "demolition", rhsDemolition), lhsDemolition, rhsDemolition, (this.demolition!= null), (that.demolition!= null))) {
                return false;
            }
        }
        {
            SiteDevelopmentType lhsSiteDevelopmentType;
            lhsSiteDevelopmentType = this.getSiteDevelopmentType();
            SiteDevelopmentType rhsSiteDevelopmentType;
            rhsSiteDevelopmentType = that.getSiteDevelopmentType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteDevelopmentType", lhsSiteDevelopmentType), LocatorUtils.property(thatLocator, "siteDevelopmentType", rhsSiteDevelopmentType), lhsSiteDevelopmentType, rhsSiteDevelopmentType, (this.siteDevelopmentType!= null), (that.siteDevelopmentType!= null))) {
                return false;
            }
        }
        {
            SiteConstructibleType lhsSiteConstructibleType;
            lhsSiteConstructibleType = this.getSiteConstructibleType();
            SiteConstructibleType rhsSiteConstructibleType;
            rhsSiteConstructibleType = that.getSiteConstructibleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "siteConstructibleType", lhsSiteConstructibleType), LocatorUtils.property(thatLocator, "siteConstructibleType", rhsSiteConstructibleType), lhsSiteConstructibleType, rhsSiteConstructibleType, (this.siteConstructibleType!= null), (that.siteConstructibleType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGrz;
            lhsGrz = this.getGrz();
            BigDecimal rhsGrz;
            rhsGrz = that.getGrz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grz", lhsGrz), LocatorUtils.property(thatLocator, "grz", rhsGrz), lhsGrz, rhsGrz, (this.grz!= null), (that.grz!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsGfz;
            lhsGfz = this.getGfz();
            BigDecimal rhsGfz;
            rhsGfz = that.getGfz();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gfz", lhsGfz), LocatorUtils.property(thatLocator, "gfz", rhsGfz), lhsGfz, rhsGfz, (this.gfz!= null), (that.gfz!= null))) {
                return false;
            }
        }
        {
            LeaseIntervalType lhsLeaseInterval;
            lhsLeaseInterval = this.getLeaseInterval();
            LeaseIntervalType rhsLeaseInterval;
            rhsLeaseInterval = that.getLeaseInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leaseInterval", lhsLeaseInterval), LocatorUtils.property(thatLocator, "leaseInterval", rhsLeaseInterval), lhsLeaseInterval, rhsLeaseInterval, (this.leaseInterval!= null), (that.leaseInterval!= null))) {
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
