package org.openestate.is24.restapi.xml.common;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Auflistung der unterstuetzten ISO-3-Landescodes (Laenderkennzeichnung)
 * 
 * <p>Java class for CountryCode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CountryCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ABW"/>
 *     <enumeration value="AFG"/>
 *     <enumeration value="AGO"/>
 *     <enumeration value="AIA"/>
 *     <enumeration value="ALB"/>
 *     <enumeration value="AND"/>
 *     <enumeration value="ANT"/>
 *     <enumeration value="ARE"/>
 *     <enumeration value="ARG"/>
 *     <enumeration value="ARM"/>
 *     <enumeration value="ASM"/>
 *     <enumeration value="ATA"/>
 *     <enumeration value="ATG"/>
 *     <enumeration value="AUS"/>
 *     <enumeration value="AUT"/>
 *     <enumeration value="AZE"/>
 *     <enumeration value="BDI"/>
 *     <enumeration value="BEL"/>
 *     <enumeration value="BEN"/>
 *     <enumeration value="BFA"/>
 *     <enumeration value="BGD"/>
 *     <enumeration value="BGR"/>
 *     <enumeration value="BHR"/>
 *     <enumeration value="BHS"/>
 *     <enumeration value="BIH"/>
 *     <enumeration value="BLR"/>
 *     <enumeration value="BLZ"/>
 *     <enumeration value="BMU"/>
 *     <enumeration value="BOL"/>
 *     <enumeration value="BRA"/>
 *     <enumeration value="BRB"/>
 *     <enumeration value="BRN"/>
 *     <enumeration value="BTN"/>
 *     <enumeration value="BWA"/>
 *     <enumeration value="CAF"/>
 *     <enumeration value="CAN"/>
 *     <enumeration value="CCK"/>
 *     <enumeration value="CHE"/>
 *     <enumeration value="CHL"/>
 *     <enumeration value="CHN"/>
 *     <enumeration value="CIV"/>
 *     <enumeration value="CMR"/>
 *     <enumeration value="COD"/>
 *     <enumeration value="COG"/>
 *     <enumeration value="COK"/>
 *     <enumeration value="COL"/>
 *     <enumeration value="COM"/>
 *     <enumeration value="CPV"/>
 *     <enumeration value="CRI"/>
 *     <enumeration value="CUB"/>
 *     <enumeration value="CXR"/>
 *     <enumeration value="CYM"/>
 *     <enumeration value="CYP"/>
 *     <enumeration value="CZE"/>
 *     <enumeration value="DEU"/>
 *     <enumeration value="DJI"/>
 *     <enumeration value="DMA"/>
 *     <enumeration value="DNK"/>
 *     <enumeration value="DOM"/>
 *     <enumeration value="DZA"/>
 *     <enumeration value="ECU"/>
 *     <enumeration value="EGY"/>
 *     <enumeration value="ERI"/>
 *     <enumeration value="ESH"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="EST"/>
 *     <enumeration value="ETH"/>
 *     <enumeration value="FIN"/>
 *     <enumeration value="FJI"/>
 *     <enumeration value="FLK"/>
 *     <enumeration value="FRA"/>
 *     <enumeration value="FRO"/>
 *     <enumeration value="FSM"/>
 *     <enumeration value="GAB"/>
 *     <enumeration value="GBR"/>
 *     <enumeration value="GEO"/>
 *     <enumeration value="GHA"/>
 *     <enumeration value="GIB"/>
 *     <enumeration value="GIN"/>
 *     <enumeration value="GLP"/>
 *     <enumeration value="GMB"/>
 *     <enumeration value="GNB"/>
 *     <enumeration value="GNQ"/>
 *     <enumeration value="GRC"/>
 *     <enumeration value="GRD"/>
 *     <enumeration value="GRL"/>
 *     <enumeration value="GTM"/>
 *     <enumeration value="GUF"/>
 *     <enumeration value="GUM"/>
 *     <enumeration value="GUY"/>
 *     <enumeration value="HKG"/>
 *     <enumeration value="HMD"/>
 *     <enumeration value="HND"/>
 *     <enumeration value="HRV"/>
 *     <enumeration value="HTI"/>
 *     <enumeration value="HUN"/>
 *     <enumeration value="IDN"/>
 *     <enumeration value="IMN"/>
 *     <enumeration value="IND"/>
 *     <enumeration value="IRL"/>
 *     <enumeration value="IRN"/>
 *     <enumeration value="IRQ"/>
 *     <enumeration value="ISL"/>
 *     <enumeration value="ISR"/>
 *     <enumeration value="ITA"/>
 *     <enumeration value="JAM"/>
 *     <enumeration value="JOR"/>
 *     <enumeration value="JPN"/>
 *     <enumeration value="KAZ"/>
 *     <enumeration value="KEN"/>
 *     <enumeration value="KGZ"/>
 *     <enumeration value="KHM"/>
 *     <enumeration value="KIR"/>
 *     <enumeration value="KNA"/>
 *     <enumeration value="KOR"/>
 *     <enumeration value="KWT"/>
 *     <enumeration value="LAO"/>
 *     <enumeration value="LBN"/>
 *     <enumeration value="LBR"/>
 *     <enumeration value="LBY"/>
 *     <enumeration value="LCA"/>
 *     <enumeration value="LIE"/>
 *     <enumeration value="LKA"/>
 *     <enumeration value="LSO"/>
 *     <enumeration value="LTU"/>
 *     <enumeration value="LUX"/>
 *     <enumeration value="LVA"/>
 *     <enumeration value="MAC"/>
 *     <enumeration value="MAR"/>
 *     <enumeration value="MCO"/>
 *     <enumeration value="MDA"/>
 *     <enumeration value="MDG"/>
 *     <enumeration value="MDV"/>
 *     <enumeration value="MEX"/>
 *     <enumeration value="MHL"/>
 *     <enumeration value="MKD"/>
 *     <enumeration value="MLI"/>
 *     <enumeration value="MLT"/>
 *     <enumeration value="MMR"/>
 *     <enumeration value="MNE"/>
 *     <enumeration value="MNG"/>
 *     <enumeration value="MNP"/>
 *     <enumeration value="MOZ"/>
 *     <enumeration value="MRT"/>
 *     <enumeration value="MSR"/>
 *     <enumeration value="MTQ"/>
 *     <enumeration value="MUS"/>
 *     <enumeration value="MWI"/>
 *     <enumeration value="MYS"/>
 *     <enumeration value="MYT"/>
 *     <enumeration value="NAM"/>
 *     <enumeration value="NCL"/>
 *     <enumeration value="NER"/>
 *     <enumeration value="NFK"/>
 *     <enumeration value="NGA"/>
 *     <enumeration value="NIC"/>
 *     <enumeration value="NIU"/>
 *     <enumeration value="NLD"/>
 *     <enumeration value="NOR"/>
 *     <enumeration value="NPL"/>
 *     <enumeration value="NRU"/>
 *     <enumeration value="NZL"/>
 *     <enumeration value="OMN"/>
 *     <enumeration value="PAK"/>
 *     <enumeration value="PAN"/>
 *     <enumeration value="PCN"/>
 *     <enumeration value="PER"/>
 *     <enumeration value="PHL"/>
 *     <enumeration value="PLW"/>
 *     <enumeration value="PNG"/>
 *     <enumeration value="POL"/>
 *     <enumeration value="PRI"/>
 *     <enumeration value="PRK"/>
 *     <enumeration value="PRT"/>
 *     <enumeration value="PRY"/>
 *     <enumeration value="PYF"/>
 *     <enumeration value="QAT"/>
 *     <enumeration value="REU"/>
 *     <enumeration value="ROU"/>
 *     <enumeration value="RUS"/>
 *     <enumeration value="RWA"/>
 *     <enumeration value="SAU"/>
 *     <enumeration value="SDN"/>
 *     <enumeration value="SEN"/>
 *     <enumeration value="SGP"/>
 *     <enumeration value="SHN"/>
 *     <enumeration value="SJM"/>
 *     <enumeration value="SLB"/>
 *     <enumeration value="SLE"/>
 *     <enumeration value="SLV"/>
 *     <enumeration value="SMR"/>
 *     <enumeration value="SOM"/>
 *     <enumeration value="SPM"/>
 *     <enumeration value="SRB"/>
 *     <enumeration value="STP"/>
 *     <enumeration value="SUR"/>
 *     <enumeration value="SVK"/>
 *     <enumeration value="SVN"/>
 *     <enumeration value="SWE"/>
 *     <enumeration value="SWZ"/>
 *     <enumeration value="SYC"/>
 *     <enumeration value="SYR"/>
 *     <enumeration value="TCA"/>
 *     <enumeration value="TCD"/>
 *     <enumeration value="TGO"/>
 *     <enumeration value="THA"/>
 *     <enumeration value="TJK"/>
 *     <enumeration value="TKL"/>
 *     <enumeration value="TKM"/>
 *     <enumeration value="TMP"/>
 *     <enumeration value="TON"/>
 *     <enumeration value="TTO"/>
 *     <enumeration value="TUN"/>
 *     <enumeration value="TUR"/>
 *     <enumeration value="TUV"/>
 *     <enumeration value="TWN"/>
 *     <enumeration value="TZA"/>
 *     <enumeration value="UGA"/>
 *     <enumeration value="UKR"/>
 *     <enumeration value="URY"/>
 *     <enumeration value="USA"/>
 *     <enumeration value="UZB"/>
 *     <enumeration value="VAT"/>
 *     <enumeration value="VCT"/>
 *     <enumeration value="VEN"/>
 *     <enumeration value="VGB"/>
 *     <enumeration value="VIR"/>
 *     <enumeration value="VNM"/>
 *     <enumeration value="VUT"/>
 *     <enumeration value="WLF"/>
 *     <enumeration value="WSM"/>
 *     <enumeration value="YEM"/>
 *     <enumeration value="ZAF"/>
 *     <enumeration value="ZMB"/>
 *     <enumeration value="ZWE"/>
 *     <enumeration value="XKO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CountryCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.9", date = "2026-08-26T20:20:00+02:00")
public enum CountryCode {


    /**
     * Aruba
     * 
     */
    ABW,

    /**
     * Afghanistan
     * 
     */
    AFG,

    /**
     * Angola
     * 
     */
    AGO,

    /**
     * Anguilla
     * 
     */
    AIA,

    /**
     * Albanien
     * 
     */
    ALB,

    /**
     * Andorra
     * 
     */
    AND,

    /**
     * Niederlaendische Antillen
     * 
     */
    ANT,

    /**
     * Vereinigte Arabische Emirate
     * 
     */
    ARE,

    /**
     * Argentinien
     * 
     */
    ARG,

    /**
     * Armenien
     * 
     */
    ARM,

    /**
     * Amerikanisch-Samoa
     * 
     */
    ASM,

    /**
     * Antarktis (Sonderstatus durch Antarktis-Vertrag)
     * 
     */
    ATA,

    /**
     * Antigua und Barbuda
     * 
     */
    ATG,

    /**
     * Australien
     * 
     */
    AUS,

    /**
     * Oesterreich
     * 
     */
    AUT,

    /**
     * Aserbaidschan
     * 
     */
    AZE,

    /**
     * Burundi
     * 
     */
    BDI,

    /**
     * Belgien
     * 
     */
    BEL,

    /**
     * Benin
     * 
     */
    BEN,

    /**
     * Burkina Faso
     * 
     */
    BFA,

    /**
     * Bangladesch
     * 
     */
    BGD,

    /**
     * Bulgarien
     * 
     */
    BGR,

    /**
     * Bahrain
     * 
     */
    BHR,

    /**
     * Bahamas
     * 
     */
    BHS,

    /**
     * Bosnien und Herzegowina
     * 
     */
    BIH,

    /**
     * Belarus (Weissrussland; BYS)
     * 
     */
    BLR,

    /**
     * Belize
     * 
     */
    BLZ,

    /**
     * Bermuda
     * 
     */
    BMU,

    /**
     * Bolivien
     * 
     */
    BOL,

    /**
     * Brasilien
     * 
     */
    BRA,

    /**
     * Barbados
     * 
     */
    BRB,

    /**
     * Brunei Darussalam
     * 
     */
    BRN,

    /**
     * Bhutan
     * 
     */
    BTN,

    /**
     * Botswana
     * 
     */
    BWA,

    /**
     * Zentralafrikanische Republik
     * 
     */
    CAF,

    /**
     * Kanada
     * 
     */
    CAN,

    /**
     * Kokosinseln
     * 
     */
    CCK,

    /**
     * Schweiz (Confoederatio Helvetica)
     * 
     */
    CHE,

    /**
     * Chile
     * 
     */
    CHL,

    /**
     * Volksrepublik China
     * 
     */
    CHN,

    /**
     * Cote d'Ivoire (Elfenbeinküste)
     * 
     */
    CIV,

    /**
     * Kamerun
     * 
     */
    CMR,

    /**
     * Demokratische Republik Kongo (ehem. Zaire)
     * 
     */
    COD,

    /**
     * Republik Kongo
     * 
     */
    COG,

    /**
     * Cookinseln
     * 
     */
    COK,

    /**
     * Kolumbien
     * 
     */
    COL,

    /**
     * Komoren
     * 
     */
    COM,

    /**
     * Kap Verde
     * 
     */
    CPV,

    /**
     * Costa Rica
     * 
     */
    CRI,

    /**
     * Kuba
     * 
     */
    CUB,

    /**
     * Weihnachtsinseln
     * 
     */
    CXR,

    /**
     * Kaimaninseln
     * 
     */
    CYM,

    /**
     * Zypern
     * 
     */
    CYP,

    /**
     * Tschechische Republik
     * 
     */
    CZE,

    /**
     * Deutschland
     * 
     */
    DEU,

    /**
     * Dschibuti
     * 
     */
    DJI,

    /**
     * Dominica
     * 
     */
    DMA,

    /**
     * Daenemark
     * 
     */
    DNK,

    /**
     * Dominikanische Republik
     * 
     */
    DOM,

    /**
     * Algerien
     * 
     */
    DZA,

    /**
     * Ecuador
     * 
     */
    ECU,

    /**
     * Aegypten
     * 
     */
    EGY,

    /**
     * Eritrea
     * 
     */
    ERI,

    /**
     * Westsahara
     * 
     */
    ESH,

    /**
     * Spanien
     * 
     */
    ESP,

    /**
     * Estland
     * 
     */
    EST,

    /**
     * Aethiopien
     * 
     */
    ETH,

    /**
     * Finnland
     * 
     */
    FIN,

    /**
     * Fidschi
     * 
     */
    FJI,

    /**
     * Falklandinseln
     * 
     */
    FLK,

    /**
     * Frankreich
     * 
     */
    FRA,

    /**
     * Faroer
     * 
     */
    FRO,

    /**
     * Mikronesien
     * 
     */
    FSM,

    /**
     * Gabun
     * 
     */
    GAB,

    /**
     * Vereinigtes Koenigreich Grossbritannien und Nordirland
     * 
     */
    GBR,

    /**
     * Georgien
     * 
     */
    GEO,

    /**
     * Ghana
     * 
     */
    GHA,

    /**
     * Gibraltar
     * 
     */
    GIB,

    /**
     * Guinea
     * 
     */
    GIN,

    /**
     * Guadeloupe
     * 
     */
    GLP,

    /**
     * Gambia
     * 
     */
    GMB,

    /**
     * Guinea-Bissau
     * 
     */
    GNB,

    /**
     * Aequatorialguinea
     * 
     */
    GNQ,

    /**
     * Griechenland
     * 
     */
    GRC,

    /**
     * Grenada
     * 
     */
    GRD,

    /**
     * Groenland
     * 
     */
    GRL,

    /**
     * Guatemala
     * 
     */
    GTM,

    /**
     * Franzoesisch-Guayana
     * 
     */
    GUF,

    /**
     * Guam
     * 
     */
    GUM,

    /**
     * Guyana
     * 
     */
    GUY,

    /**
     * Hongkong
     * 
     */
    HKG,

    /**
     * Heard und McDonaldinseln
     * 
     */
    HMD,

    /**
     * Honduras
     * 
     */
    HND,

    /**
     * Kroatien
     * 
     */
    HRV,

    /**
     * Haiti
     * 
     */
    HTI,

    /**
     * Ungarn
     * 
     */
    HUN,

    /**
     * Indonesien
     * 
     */
    IDN,

    /**
     * Insel Man
     * 
     */
    IMN,

    /**
     * Indien
     * 
     */
    IND,

    /**
     * Irland
     * 
     */
    IRL,

    /**
     * Islamische Republik Iran
     * 
     */
    IRN,

    /**
     * Irak
     * 
     */
    IRQ,

    /**
     * Island
     * 
     */
    ISL,

    /**
     * Israel
     * 
     */
    ISR,

    /**
     * Italien
     * 
     */
    ITA,

    /**
     * Jamaika
     * 
     */
    JAM,

    /**
     * Jordanien
     * 
     */
    JOR,

    /**
     * Japan
     * 
     */
    JPN,

    /**
     * Kasachstan
     * 
     */
    KAZ,

    /**
     * Kenia
     * 
     */
    KEN,

    /**
     * Kirgisistan
     * 
     */
    KGZ,

    /**
     * Kambodscha
     * 
     */
    KHM,

    /**
     * Kiribati
     * 
     */
    KIR,

    /**
     * St. Kitts und Nevis
     * 
     */
    KNA,

    /**
     * Republik Korea (Suedkorea)
     * 
     */
    KOR,

    /**
     * Kuwait
     * 
     */
    KWT,

    /**
     * Laos
     * 
     */
    LAO,

    /**
     * Libanon
     * 
     */
    LBN,

    /**
     * Liberia
     * 
     */
    LBR,

    /**
     * Libysch-Arabische Dschamahirija (Libyen)
     * 
     */
    LBY,

    /**
     * St. Lucia
     * 
     */
    LCA,

    /**
     * Liechtenstein
     * 
     */
    LIE,

    /**
     * Sri Lanka
     * 
     */
    LKA,

    /**
     * Lesotho
     * 
     */
    LSO,

    /**
     * Litauen
     * 
     */
    LTU,

    /**
     * Luxemburg
     * 
     */
    LUX,

    /**
     * Lettland
     * 
     */
    LVA,

    /**
     * Macao
     * 
     */
    MAC,

    /**
     * Marokko
     * 
     */
    MAR,

    /**
     * Monaco
     * 
     */
    MCO,

    /**
     * Republik Moldau (Moldawien)
     * 
     */
    MDA,

    /**
     * Madagaskar
     * 
     */
    MDG,

    /**
     * Malediven
     * 
     */
    MDV,

    /**
     * Mexiko
     * 
     */
    MEX,

    /**
     * Marshallinseln
     * 
     */
    MHL,

    /**
     * Mazedonien
     * 
     */
    MKD,

    /**
     * Mali
     * 
     */
    MLI,

    /**
     * Malta
     * 
     */
    MLT,

    /**
     * Myanmar (Burma)
     * 
     */
    MMR,

    /**
     * Montenegro
     * 
     */
    MNE,

    /**
     * Mongolei
     * 
     */
    MNG,

    /**
     * Noerdliche Marianen
     * 
     */
    MNP,

    /**
     * Mosambik
     * 
     */
    MOZ,

    /**
     * Mauretanien
     * 
     */
    MRT,

    /**
     * Montserrat
     * 
     */
    MSR,

    /**
     * Martinique
     * 
     */
    MTQ,

    /**
     * Mauritius
     * 
     */
    MUS,

    /**
     * Malawi
     * 
     */
    MWI,

    /**
     * Malaysia
     * 
     */
    MYS,

    /**
     * Mayotte
     * 
     */
    MYT,

    /**
     * Namibia
     * 
     */
    NAM,

    /**
     * Neukaledonien
     * 
     */
    NCL,

    /**
     * Niger
     * 
     */
    NER,

    /**
     * Norfolkinseln
     * 
     */
    NFK,

    /**
     * Nigeria
     * 
     */
    NGA,

    /**
     * Nicaragua
     * 
     */
    NIC,

    /**
     * Niue
     * 
     */
    NIU,

    /**
     * Niederlande
     * 
     */
    NLD,

    /**
     * Norwegen
     * 
     */
    NOR,

    /**
     * Nepal
     * 
     */
    NPL,

    /**
     * Nauru
     * 
     */
    NRU,

    /**
     * Neuseeland
     * 
     */
    NZL,

    /**
     * Oman
     * 
     */
    OMN,

    /**
     * Pakistan
     * 
     */
    PAK,

    /**
     * Panama
     * 
     */
    PAN,

    /**
     * Pitcairninseln
     * 
     */
    PCN,

    /**
     * Peru
     * 
     */
    PER,

    /**
     * Philippinen
     * 
     */
    PHL,

    /**
     * Palau
     * 
     */
    PLW,

    /**
     * Papua New Guinea
     * 
     */
    PNG,

    /**
     * Polen
     * 
     */
    POL,

    /**
     * Puerto Rico
     * 
     */
    PRI,

    /**
     * Demokratische Volksrepublik Korea (Nordkorea)
     * 
     */
    PRK,

    /**
     * Portugal
     * 
     */
    PRT,

    /**
     * Paraguay
     * 
     */
    PRY,

    /**
     * Franzoesisch-Polynesien
     * 
     */
    PYF,

    /**
     * Katar
     * 
     */
    QAT,

    /**
     * Reunion
     * 
     */
    REU,

    /**
     * Rumaenien (ROM)
     * 
     */
    ROU,

    /**
     * Russische Foederation
     * 
     */
    RUS,

    /**
     * Ruanda
     * 
     */
    RWA,

    /**
     * Saudi-Arabien
     * 
     */
    SAU,

    /**
     * Sudan
     * 
     */
    SDN,

    /**
     * Senegal
     * 
     */
    SEN,

    /**
     * Singapur
     * 
     */
    SGP,

    /**
     * St. Helena
     * 
     */
    SHN,

    /**
     * Svalbard und Jan Mayen
     * 
     */
    SJM,

    /**
     * Salomonen
     * 
     */
    SLB,

    /**
     * Sierra Leone
     * 
     */
    SLE,

    /**
     * El Salvador
     * 
     */
    SLV,

    /**
     * San Marino
     * 
     */
    SMR,

    /**
     * Somalia
     * 
     */
    SOM,

    /**
     * St. Pierre und Miquelon
     * 
     */
    SPM,

    /**
     * Serbien
     * 
     */
    SRB,

    /**
     * Sao Tome und Principe
     * 
     */
    STP,

    /**
     * Suriname
     * 
     */
    SUR,

    /**
     * Slowakei
     * 
     */
    SVK,

    /**
     * Slowenien
     * 
     */
    SVN,

    /**
     * Schweden
     * 
     */
    SWE,

    /**
     * Swasiland
     * 
     */
    SWZ,

    /**
     * Seychellen
     * 
     */
    SYC,

    /**
     * Arabische Republik Syrien
     * 
     */
    SYR,

    /**
     * Turks- und Caicosinseln
     * 
     */
    TCA,

    /**
     * Tschad
     * 
     */
    TCD,

    /**
     * Togo
     * 
     */
    TGO,

    /**
     * Thailand
     * 
     */
    THA,

    /**
     * Tadschikistan
     * 
     */
    TJK,

    /**
     * Tokelau
     * 
     */
    TKL,

    /**
     * Turkmenistan
     * 
     */
    TKM,

    /**
     * Osttimor (Timor-Leste; TLS)
     * 
     */
    TMP,

    /**
     * Tonga
     * 
     */
    TON,

    /**
     * Trinidad und Tobago
     * 
     */
    TTO,

    /**
     * Tunesien
     * 
     */
    TUN,

    /**
     * Tuerkei
     * 
     */
    TUR,

    /**
     * Tuvalu
     * 
     */
    TUV,

    /**
     * Republik China (Taiwan)
     * 
     */
    TWN,

    /**
     * Vereinigte Republik Tansania
     * 
     */
    TZA,

    /**
     * Uganda
     * 
     */
    UGA,

    /**
     * Ukraine
     * 
     */
    UKR,

    /**
     * Uruguay
     * 
     */
    URY,

    /**
     * Vereinigte Staaten von Amerika
     * 
     */
    USA,

    /**
     * Usbekistan
     * 
     */
    UZB,

    /**
     * Vatikanstadt
     * 
     */
    VAT,

    /**
     * St. Vincent und Grenadinen
     * 
     */
    VCT,

    /**
     * Venezuela
     * 
     */
    VEN,

    /**
     * Britische Jungferninseln
     * 
     */
    VGB,

    /**
     * Amerikanische Jungferninseln
     * 
     */
    VIR,

    /**
     * Vietnam
     * 
     */
    VNM,

    /**
     * Vanuatu
     * 
     */
    VUT,

    /**
     * Wallis und Futuna
     * 
     */
    WLF,

    /**
     * Samoa
     * 
     */
    WSM,

    /**
     * Jemen
     * 
     */
    YEM,

    /**
     * Suedafrika
     * 
     */
    ZAF,

    /**
     * Sambia
     * 
     */
    ZMB,

    /**
     * Zimbabwe
     * 
     */
    ZWE,

    /**
     * Kosovo
     * 
     */
    XKO;

    public String value() {
        return name();
    }

    public static CountryCode fromValue(String v) {
        return valueOf(v);
    }

}
