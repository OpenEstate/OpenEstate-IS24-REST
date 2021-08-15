
package org.openestate.is24.restapi.xml.common;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABW"/&gt;
 *     &lt;enumeration value="AFG"/&gt;
 *     &lt;enumeration value="AGO"/&gt;
 *     &lt;enumeration value="AIA"/&gt;
 *     &lt;enumeration value="ALB"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="ANT"/&gt;
 *     &lt;enumeration value="ARE"/&gt;
 *     &lt;enumeration value="ARG"/&gt;
 *     &lt;enumeration value="ARM"/&gt;
 *     &lt;enumeration value="ASM"/&gt;
 *     &lt;enumeration value="ATA"/&gt;
 *     &lt;enumeration value="ATG"/&gt;
 *     &lt;enumeration value="AUS"/&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="AZE"/&gt;
 *     &lt;enumeration value="BDI"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="BFA"/&gt;
 *     &lt;enumeration value="BGD"/&gt;
 *     &lt;enumeration value="BGR"/&gt;
 *     &lt;enumeration value="BHR"/&gt;
 *     &lt;enumeration value="BHS"/&gt;
 *     &lt;enumeration value="BIH"/&gt;
 *     &lt;enumeration value="BLR"/&gt;
 *     &lt;enumeration value="BLZ"/&gt;
 *     &lt;enumeration value="BMU"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BRA"/&gt;
 *     &lt;enumeration value="BRB"/&gt;
 *     &lt;enumeration value="BRN"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BWA"/&gt;
 *     &lt;enumeration value="CAF"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CCK"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="CHL"/&gt;
 *     &lt;enumeration value="CHN"/&gt;
 *     &lt;enumeration value="CIV"/&gt;
 *     &lt;enumeration value="CMR"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="COG"/&gt;
 *     &lt;enumeration value="COK"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="CPV"/&gt;
 *     &lt;enumeration value="CRI"/&gt;
 *     &lt;enumeration value="CUB"/&gt;
 *     &lt;enumeration value="CXR"/&gt;
 *     &lt;enumeration value="CYM"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZE"/&gt;
 *     &lt;enumeration value="DEU"/&gt;
 *     &lt;enumeration value="DJI"/&gt;
 *     &lt;enumeration value="DMA"/&gt;
 *     &lt;enumeration value="DNK"/&gt;
 *     &lt;enumeration value="DOM"/&gt;
 *     &lt;enumeration value="DZA"/&gt;
 *     &lt;enumeration value="ECU"/&gt;
 *     &lt;enumeration value="EGY"/&gt;
 *     &lt;enumeration value="ERI"/&gt;
 *     &lt;enumeration value="ESH"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FJI"/&gt;
 *     &lt;enumeration value="FLK"/&gt;
 *     &lt;enumeration value="FRA"/&gt;
 *     &lt;enumeration value="FRO"/&gt;
 *     &lt;enumeration value="FSM"/&gt;
 *     &lt;enumeration value="GAB"/&gt;
 *     &lt;enumeration value="GBR"/&gt;
 *     &lt;enumeration value="GEO"/&gt;
 *     &lt;enumeration value="GHA"/&gt;
 *     &lt;enumeration value="GIB"/&gt;
 *     &lt;enumeration value="GIN"/&gt;
 *     &lt;enumeration value="GLP"/&gt;
 *     &lt;enumeration value="GMB"/&gt;
 *     &lt;enumeration value="GNB"/&gt;
 *     &lt;enumeration value="GNQ"/&gt;
 *     &lt;enumeration value="GRC"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GRL"/&gt;
 *     &lt;enumeration value="GTM"/&gt;
 *     &lt;enumeration value="GUF"/&gt;
 *     &lt;enumeration value="GUM"/&gt;
 *     &lt;enumeration value="GUY"/&gt;
 *     &lt;enumeration value="HKG"/&gt;
 *     &lt;enumeration value="HMD"/&gt;
 *     &lt;enumeration value="HND"/&gt;
 *     &lt;enumeration value="HRV"/&gt;
 *     &lt;enumeration value="HTI"/&gt;
 *     &lt;enumeration value="HUN"/&gt;
 *     &lt;enumeration value="IDN"/&gt;
 *     &lt;enumeration value="IMN"/&gt;
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="IRL"/&gt;
 *     &lt;enumeration value="IRN"/&gt;
 *     &lt;enumeration value="IRQ"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="ISR"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="JAM"/&gt;
 *     &lt;enumeration value="JOR"/&gt;
 *     &lt;enumeration value="JPN"/&gt;
 *     &lt;enumeration value="KAZ"/&gt;
 *     &lt;enumeration value="KEN"/&gt;
 *     &lt;enumeration value="KGZ"/&gt;
 *     &lt;enumeration value="KHM"/&gt;
 *     &lt;enumeration value="KIR"/&gt;
 *     &lt;enumeration value="KNA"/&gt;
 *     &lt;enumeration value="KOR"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LBN"/&gt;
 *     &lt;enumeration value="LBR"/&gt;
 *     &lt;enumeration value="LBY"/&gt;
 *     &lt;enumeration value="LCA"/&gt;
 *     &lt;enumeration value="LIE"/&gt;
 *     &lt;enumeration value="LKA"/&gt;
 *     &lt;enumeration value="LSO"/&gt;
 *     &lt;enumeration value="LTU"/&gt;
 *     &lt;enumeration value="LUX"/&gt;
 *     &lt;enumeration value="LVA"/&gt;
 *     &lt;enumeration value="MAC"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MCO"/&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="MDG"/&gt;
 *     &lt;enumeration value="MDV"/&gt;
 *     &lt;enumeration value="MEX"/&gt;
 *     &lt;enumeration value="MHL"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MLI"/&gt;
 *     &lt;enumeration value="MLT"/&gt;
 *     &lt;enumeration value="MMR"/&gt;
 *     &lt;enumeration value="MNE"/&gt;
 *     &lt;enumeration value="MNG"/&gt;
 *     &lt;enumeration value="MNP"/&gt;
 *     &lt;enumeration value="MOZ"/&gt;
 *     &lt;enumeration value="MRT"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MTQ"/&gt;
 *     &lt;enumeration value="MUS"/&gt;
 *     &lt;enumeration value="MWI"/&gt;
 *     &lt;enumeration value="MYS"/&gt;
 *     &lt;enumeration value="MYT"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NER"/&gt;
 *     &lt;enumeration value="NFK"/&gt;
 *     &lt;enumeration value="NGA"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NIU"/&gt;
 *     &lt;enumeration value="NLD"/&gt;
 *     &lt;enumeration value="NOR"/&gt;
 *     &lt;enumeration value="NPL"/&gt;
 *     &lt;enumeration value="NRU"/&gt;
 *     &lt;enumeration value="NZL"/&gt;
 *     &lt;enumeration value="OMN"/&gt;
 *     &lt;enumeration value="PAK"/&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="PCN"/&gt;
 *     &lt;enumeration value="PER"/&gt;
 *     &lt;enumeration value="PHL"/&gt;
 *     &lt;enumeration value="PLW"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="PRK"/&gt;
 *     &lt;enumeration value="PRT"/&gt;
 *     &lt;enumeration value="PRY"/&gt;
 *     &lt;enumeration value="PYF"/&gt;
 *     &lt;enumeration value="QAT"/&gt;
 *     &lt;enumeration value="REU"/&gt;
 *     &lt;enumeration value="ROU"/&gt;
 *     &lt;enumeration value="RUS"/&gt;
 *     &lt;enumeration value="RWA"/&gt;
 *     &lt;enumeration value="SAU"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SGP"/&gt;
 *     &lt;enumeration value="SHN"/&gt;
 *     &lt;enumeration value="SJM"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SLE"/&gt;
 *     &lt;enumeration value="SLV"/&gt;
 *     &lt;enumeration value="SMR"/&gt;
 *     &lt;enumeration value="SOM"/&gt;
 *     &lt;enumeration value="SPM"/&gt;
 *     &lt;enumeration value="SRB"/&gt;
 *     &lt;enumeration value="STP"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="SVK"/&gt;
 *     &lt;enumeration value="SVN"/&gt;
 *     &lt;enumeration value="SWE"/&gt;
 *     &lt;enumeration value="SWZ"/&gt;
 *     &lt;enumeration value="SYC"/&gt;
 *     &lt;enumeration value="SYR"/&gt;
 *     &lt;enumeration value="TCA"/&gt;
 *     &lt;enumeration value="TCD"/&gt;
 *     &lt;enumeration value="TGO"/&gt;
 *     &lt;enumeration value="THA"/&gt;
 *     &lt;enumeration value="TJK"/&gt;
 *     &lt;enumeration value="TKL"/&gt;
 *     &lt;enumeration value="TKM"/&gt;
 *     &lt;enumeration value="TMP"/&gt;
 *     &lt;enumeration value="TON"/&gt;
 *     &lt;enumeration value="TTO"/&gt;
 *     &lt;enumeration value="TUN"/&gt;
 *     &lt;enumeration value="TUR"/&gt;
 *     &lt;enumeration value="TUV"/&gt;
 *     &lt;enumeration value="TWN"/&gt;
 *     &lt;enumeration value="TZA"/&gt;
 *     &lt;enumeration value="UGA"/&gt;
 *     &lt;enumeration value="UKR"/&gt;
 *     &lt;enumeration value="URY"/&gt;
 *     &lt;enumeration value="USA"/&gt;
 *     &lt;enumeration value="UZB"/&gt;
 *     &lt;enumeration value="VAT"/&gt;
 *     &lt;enumeration value="VCT"/&gt;
 *     &lt;enumeration value="VEN"/&gt;
 *     &lt;enumeration value="VGB"/&gt;
 *     &lt;enumeration value="VIR"/&gt;
 *     &lt;enumeration value="VNM"/&gt;
 *     &lt;enumeration value="VUT"/&gt;
 *     &lt;enumeration value="WLF"/&gt;
 *     &lt;enumeration value="WSM"/&gt;
 *     &lt;enumeration value="YEM"/&gt;
 *     &lt;enumeration value="ZAF"/&gt;
 *     &lt;enumeration value="ZMB"/&gt;
 *     &lt;enumeration value="ZWE"/&gt;
 *     &lt;enumeration value="XKO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCode")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2021-08-07T09:44:49+02:00", comments = "JAXB RI v2.3.0")
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
     * Cote d'Ivoire (Elfenbeink\u00fcste)
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
