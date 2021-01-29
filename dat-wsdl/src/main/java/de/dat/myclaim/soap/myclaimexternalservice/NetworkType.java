
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für networkType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="networkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="VW"/>
 *     &lt;enumeration value="HUK"/>
 *     &lt;enumeration value="NISSAN"/>
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="IFERT"/>
 *     &lt;enumeration value="AUDI"/>
 *     &lt;enumeration value="POSTFLEET"/>
 *     &lt;enumeration value="DUERKOP"/>
 *     &lt;enumeration value="CSP"/>
 *     &lt;enumeration value="ANIA"/>
 *     &lt;enumeration value="CZ_CEBICOM"/>
 *     &lt;enumeration value="CZ_ASTRA"/>
 *     &lt;enumeration value="CZ_DEKRA"/>
 *     &lt;enumeration value="ALLIANZ"/>
 *     &lt;enumeration value="SPN"/>
 *     &lt;enumeration value="CZ_CESKA"/>
 *     &lt;enumeration value="SVS"/>
 *     &lt;enumeration value="GR_ETHNIKI"/>
 *     &lt;enumeration value="CAR_EXPERT"/>
 *     &lt;enumeration value="SafetyBroker"/>
 *     &lt;enumeration value="CCE"/>
 *     &lt;enumeration value="FAIRGARAGE"/>
 *     &lt;enumeration value="ALFASTRAKHOVANIE"/>
 *     &lt;enumeration value="AUTECO"/>
 *     &lt;enumeration value="VWBANKHELLAS"/>
 *     &lt;enumeration value="UNION"/>
 *     &lt;enumeration value="MERCEDES_BENZ"/>
 *     &lt;enumeration value="INGOSSTRAKH"/>
 *     &lt;enumeration value="FHD"/>
 *     &lt;enumeration value="CH_BMW"/>
 *     &lt;enumeration value="CH_MB"/>
 *     &lt;enumeration value="CZ_SERVISNI"/>
 *     &lt;enumeration value="VGH"/>
 *     &lt;enumeration value="DAT"/>
 *     &lt;enumeration value="SUPPORT"/>
 *     &lt;enumeration value="ES_ALLIANZ"/>
 *     &lt;enumeration value="EUROHOLD"/>
 *     &lt;enumeration value="ASSET"/>
 *     &lt;enumeration value="SILVERDATGLASS"/>
 *     &lt;enumeration value="DELLO"/>
 *     &lt;enumeration value="MADSEN"/>
 *     &lt;enumeration value="DPF_Maintenance"/>
 *     &lt;enumeration value="TOPLIS"/>
 *     &lt;enumeration value="DATHELLAS"/>
 *     &lt;enumeration value="DATRUSSIA"/>
 *     &lt;enumeration value="IMPERIAL"/>
 *     &lt;enumeration value="TOYOTA_PL"/>
 *     &lt;enumeration value="CRO_ES"/>
 *     &lt;enumeration value="SYNETERISTIKI"/>
 *     &lt;enumeration value="VIG_EKSPERT"/>
 *     &lt;enumeration value="BDK"/>
 *     &lt;enumeration value="BMW_HELLAS"/>
 *     &lt;enumeration value="MINETTA"/>
 *     &lt;enumeration value="CUSTOM_NT_54"/>
 *     &lt;enumeration value="CUSTOM_NT_55"/>
 *     &lt;enumeration value="VGIC"/>
 *     &lt;enumeration value="DATPL"/>
 *     &lt;enumeration value="DATHU"/>
 *     &lt;enumeration value="DHLNL"/>
 *     &lt;enumeration value="SCHADE_NLNET"/>
 *     &lt;enumeration value="OPEL_KASKO"/>
 *     &lt;enumeration value="ARVAL"/>
 *     &lt;enumeration value="DATTR"/>
 *     &lt;enumeration value="OEVBS"/>
 *     &lt;enumeration value="ARMEEC"/>
 *     &lt;enumeration value="BULINS"/>
 *     &lt;enumeration value="CZ_TICKETS"/>
 *     &lt;enumeration value="DATAU"/>
 *     &lt;enumeration value="OSP"/>
 *     &lt;enumeration value="ALLIANZ_HU"/>
 *     &lt;enumeration value="GROUPAMA"/>
 *     &lt;enumeration value="EUROCLAIMS"/>
 *     &lt;enumeration value="SKODA_CN"/>
 *     &lt;enumeration value="TUV_SUD"/>
 *     &lt;enumeration value="BERTANI"/>
 *     &lt;enumeration value="ROSGOSSTRAKH"/>
 *     &lt;enumeration value="SOGAZ"/>
 *     &lt;enumeration value="TINKOFF_RUS"/>
 *     &lt;enumeration value="TUWTUZ"/>
 *     &lt;enumeration value="BSS"/>
 *     &lt;enumeration value="DAT_IB"/>
 *     &lt;enumeration value="SURGUTNG_RUS"/>
 *     &lt;enumeration value="BMW"/>
 *     &lt;enumeration value="SETOA"/>
 *     &lt;enumeration value="BVDP"/>
 *     &lt;enumeration value="GROUPAMA_CZ"/>
 *     &lt;enumeration value="OPEL_CZECH"/>
 *     &lt;enumeration value="OPEL_SK"/>
 *     &lt;enumeration value="PORSCHE_SK"/>
 *     &lt;enumeration value="SKODA_CZ"/>
 *     &lt;enumeration value="SKODA_SK"/>
 *     &lt;enumeration value="SBM_TR"/>
 *     &lt;enumeration value="AXA_IT"/>
 *     &lt;enumeration value="KLUCHAUTO"/>
 *     &lt;enumeration value="DAT_CZ"/>
 *     &lt;enumeration value="DAT_SK"/>
 *     &lt;enumeration value="DAT_ROMANIA"/>
 *     &lt;enumeration value="SCHADEHERSTELMEESTER"/>
 *     &lt;enumeration value="PRESENT"/>
 *     &lt;enumeration value="BB_INSURANCE"/>
 *     &lt;enumeration value="PROXIMITY"/>
 *     &lt;enumeration value="BIK_SERWIS"/>
 *     &lt;enumeration value="CSOB_CZ"/>
 *     &lt;enumeration value="UNIQA_SK"/>
 *     &lt;enumeration value="REASONBROAD"/>
 *     &lt;enumeration value="EXPERT_PARTNER"/>
 *     &lt;enumeration value="ALLIANZ_TIRIAC"/>
 *     &lt;enumeration value="EUROPCAR_GREECE"/>
 *     &lt;enumeration value="DINNEBIER"/>
 *     &lt;enumeration value="SD3_PRO_ROMANIA"/>
 *     &lt;enumeration value="UNIQA_CZ"/>
 *     &lt;enumeration value="AUTO_I"/>
 *     &lt;enumeration value="SCHMITT_UND_KOCH"/>
 *     &lt;enumeration value="OEVO"/>
 *     &lt;enumeration value="AXA_DE"/>
 *     &lt;enumeration value="FLEETPOINT"/>
 *     &lt;enumeration value="WAHL"/>
 *     &lt;enumeration value="SILVERDAT3_PL"/>
 *     &lt;enumeration value="SIXTNL"/>
 *     &lt;enumeration value="EXPERT_UNIO"/>
 *     &lt;enumeration value="KRUELL"/>
 *     &lt;enumeration value="CH_ALLIANZ"/>
 *     &lt;enumeration value="WARTA"/>
 *     &lt;enumeration value="MB_CHARTERWAY"/>
 *     &lt;enumeration value="INTER_CARS_CZ"/>
 *     &lt;enumeration value="LEASEPLAN_HELLAS"/>
 *     &lt;enumeration value="GENERALI_HELLAS"/>
 *     &lt;enumeration value="DAT_FRANCE"/>
 *     &lt;enumeration value="SCHADE"/>
 *     &lt;enumeration value="DEKRA_HU"/>
 *     &lt;enumeration value="PROVINZIAL"/>
 *     &lt;enumeration value="DAT_KR"/>
 *     &lt;enumeration value="GROUPAMA_HU"/>
 *     &lt;enumeration value="ERGO_RUS"/>
 *     &lt;enumeration value="CARGLASS_IT"/>
 *     &lt;enumeration value="DAT_LT"/>
 *     &lt;enumeration value="AIOI"/>
 *     &lt;enumeration value="EMIL_FREY_CH"/>
 *     &lt;enumeration value="STANDARD_DAT_1"/>
 *     &lt;enumeration value="STANDARD_DAT_2"/>
 *     &lt;enumeration value="STANDARD_DAT_3"/>
 *     &lt;enumeration value="STANDARD_DAT_4"/>
 *     &lt;enumeration value="STANDARD_DAT_5"/>
 *     &lt;enumeration value="STANDARD_DAT_6"/>
 *     &lt;enumeration value="STANDARD_DAT_7"/>
 *     &lt;enumeration value="STANDARD_DAT_8"/>
 *     &lt;enumeration value="STANDARD_DAT_9"/>
 *     &lt;enumeration value="STANDARD_DAT_10"/>
 *     &lt;enumeration value="VSK_RUS"/>
 *     &lt;enumeration value="SOGLASIE_RUS"/>
 *     &lt;enumeration value="UGORIA_RUS"/>
 *     &lt;enumeration value="DAT_CHINA"/>
 *     &lt;enumeration value="RENINS_RUS"/>
 *     &lt;enumeration value="ACKO_RUS"/>
 *     &lt;enumeration value="AUTOTAL_HU"/>
 *     &lt;enumeration value="ZETTA_RUS"/>
 *     &lt;enumeration value="CYPRUS_NETWORK"/>
 *     &lt;enumeration value="HU_4CONTROL"/>
 *     &lt;enumeration value="RESO_RUS"/>
 *     &lt;enumeration value="LIBERTY_RUS"/>
 *     &lt;enumeration value="GUIDEH_RUS"/>
 *     &lt;enumeration value="DENMARK"/>
 *     &lt;enumeration value="AEV"/>
 *     &lt;enumeration value="PORSCHE_HU"/>
 *     &lt;enumeration value="PZU"/>
 *     &lt;enumeration value="MAKC_RUS"/>
 *     &lt;enumeration value="ROMANIA_INSURANCE_NET"/>
 *     &lt;enumeration value="GLASS_CZ"/>
 *     &lt;enumeration value="ALLIANZ_POLSKA"/>
 *     &lt;enumeration value="DAT_PT"/>
 *     &lt;enumeration value="RENAULT_CZ"/>
 *     &lt;enumeration value="DAT_HELLAS_ACT"/>
 *     &lt;enumeration value="EXPERTA_SK"/>
 *     &lt;enumeration value="SLAVIA_CZ"/>
 *     &lt;enumeration value="DAT_CZ2"/>
 *     &lt;enumeration value="DIRECT_CZ"/>
 *     &lt;enumeration value="AXA_CZ"/>
 *     &lt;enumeration value="DAT_MANUFACTURER_CZ"/>
 *     &lt;enumeration value="DAT_MANUFACTURER_SK"/>
 *     &lt;enumeration value="GENERALI_SK"/>
 *     &lt;enumeration value="ALLIANZ_SK"/>
 *     &lt;enumeration value="DAT_SK2"/>
 *     &lt;enumeration value="MOBEXO"/>
 *     &lt;enumeration value="DAT_BULGARIA"/>
 *     &lt;enumeration value="DAT_CZ3"/>
 *     &lt;enumeration value="DAT_SK3"/>
 *     &lt;enumeration value="GLOBAL_EXPERT_CZ"/>
 *     &lt;enumeration value="SOVKOMBANK_RUS"/>
 *     &lt;enumeration value="MOBI_NETZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "networkType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum NetworkType {

    OPEN("OPEN"),
    VW("VW"),
    HUK("HUK"),
    NISSAN("NISSAN"),
    MOBILE("MOBILE"),
    IFERT("IFERT"),
    AUDI("AUDI"),
    POSTFLEET("POSTFLEET"),
    DUERKOP("DUERKOP"),
    CSP("CSP"),
    ANIA("ANIA"),
    CZ_CEBICOM("CZ_CEBICOM"),
    CZ_ASTRA("CZ_ASTRA"),
    CZ_DEKRA("CZ_DEKRA"),
    ALLIANZ("ALLIANZ"),
    SPN("SPN"),
    CZ_CESKA("CZ_CESKA"),
    SVS("SVS"),
    GR_ETHNIKI("GR_ETHNIKI"),
    CAR_EXPERT("CAR_EXPERT"),
    @XmlEnumValue("SafetyBroker")
    SAFETY_BROKER("SafetyBroker"),
    CCE("CCE"),
    FAIRGARAGE("FAIRGARAGE"),
    ALFASTRAKHOVANIE("ALFASTRAKHOVANIE"),
    AUTECO("AUTECO"),
    VWBANKHELLAS("VWBANKHELLAS"),
    UNION("UNION"),
    MERCEDES_BENZ("MERCEDES_BENZ"),
    INGOSSTRAKH("INGOSSTRAKH"),
    FHD("FHD"),
    CH_BMW("CH_BMW"),
    CH_MB("CH_MB"),
    CZ_SERVISNI("CZ_SERVISNI"),
    VGH("VGH"),
    DAT("DAT"),
    SUPPORT("SUPPORT"),
    ES_ALLIANZ("ES_ALLIANZ"),
    EUROHOLD("EUROHOLD"),
    ASSET("ASSET"),
    SILVERDATGLASS("SILVERDATGLASS"),
    DELLO("DELLO"),
    MADSEN("MADSEN"),
    @XmlEnumValue("DPF_Maintenance")
    DPF_MAINTENANCE("DPF_Maintenance"),
    TOPLIS("TOPLIS"),
    DATHELLAS("DATHELLAS"),
    DATRUSSIA("DATRUSSIA"),
    IMPERIAL("IMPERIAL"),
    TOYOTA_PL("TOYOTA_PL"),
    CRO_ES("CRO_ES"),
    SYNETERISTIKI("SYNETERISTIKI"),
    VIG_EKSPERT("VIG_EKSPERT"),
    BDK("BDK"),
    BMW_HELLAS("BMW_HELLAS"),
    MINETTA("MINETTA"),
    CUSTOM_NT_54("CUSTOM_NT_54"),
    CUSTOM_NT_55("CUSTOM_NT_55"),
    VGIC("VGIC"),
    DATPL("DATPL"),
    DATHU("DATHU"),
    DHLNL("DHLNL"),
    SCHADE_NLNET("SCHADE_NLNET"),
    OPEL_KASKO("OPEL_KASKO"),
    ARVAL("ARVAL"),
    DATTR("DATTR"),
    OEVBS("OEVBS"),
    ARMEEC("ARMEEC"),
    BULINS("BULINS"),
    CZ_TICKETS("CZ_TICKETS"),
    DATAU("DATAU"),
    OSP("OSP"),
    ALLIANZ_HU("ALLIANZ_HU"),
    GROUPAMA("GROUPAMA"),
    EUROCLAIMS("EUROCLAIMS"),
    SKODA_CN("SKODA_CN"),
    TUV_SUD("TUV_SUD"),
    BERTANI("BERTANI"),
    ROSGOSSTRAKH("ROSGOSSTRAKH"),
    SOGAZ("SOGAZ"),
    TINKOFF_RUS("TINKOFF_RUS"),
    TUWTUZ("TUWTUZ"),
    BSS("BSS"),
    DAT_IB("DAT_IB"),
    SURGUTNG_RUS("SURGUTNG_RUS"),
    BMW("BMW"),
    SETOA("SETOA"),
    BVDP("BVDP"),
    GROUPAMA_CZ("GROUPAMA_CZ"),
    OPEL_CZECH("OPEL_CZECH"),
    OPEL_SK("OPEL_SK"),
    PORSCHE_SK("PORSCHE_SK"),
    SKODA_CZ("SKODA_CZ"),
    SKODA_SK("SKODA_SK"),
    SBM_TR("SBM_TR"),
    AXA_IT("AXA_IT"),
    KLUCHAUTO("KLUCHAUTO"),
    DAT_CZ("DAT_CZ"),
    DAT_SK("DAT_SK"),
    DAT_ROMANIA("DAT_ROMANIA"),
    SCHADEHERSTELMEESTER("SCHADEHERSTELMEESTER"),
    PRESENT("PRESENT"),
    BB_INSURANCE("BB_INSURANCE"),
    PROXIMITY("PROXIMITY"),
    BIK_SERWIS("BIK_SERWIS"),
    CSOB_CZ("CSOB_CZ"),
    UNIQA_SK("UNIQA_SK"),
    REASONBROAD("REASONBROAD"),
    EXPERT_PARTNER("EXPERT_PARTNER"),
    ALLIANZ_TIRIAC("ALLIANZ_TIRIAC"),
    EUROPCAR_GREECE("EUROPCAR_GREECE"),
    DINNEBIER("DINNEBIER"),
    @XmlEnumValue("SD3_PRO_ROMANIA")
    SD_3_PRO_ROMANIA("SD3_PRO_ROMANIA"),
    UNIQA_CZ("UNIQA_CZ"),
    AUTO_I("AUTO_I"),
    SCHMITT_UND_KOCH("SCHMITT_UND_KOCH"),
    OEVO("OEVO"),
    AXA_DE("AXA_DE"),
    FLEETPOINT("FLEETPOINT"),
    WAHL("WAHL"),
    @XmlEnumValue("SILVERDAT3_PL")
    SILVERDAT_3_PL("SILVERDAT3_PL"),
    SIXTNL("SIXTNL"),
    EXPERT_UNIO("EXPERT_UNIO"),
    KRUELL("KRUELL"),
    CH_ALLIANZ("CH_ALLIANZ"),
    WARTA("WARTA"),
    MB_CHARTERWAY("MB_CHARTERWAY"),
    INTER_CARS_CZ("INTER_CARS_CZ"),
    LEASEPLAN_HELLAS("LEASEPLAN_HELLAS"),
    GENERALI_HELLAS("GENERALI_HELLAS"),
    DAT_FRANCE("DAT_FRANCE"),
    SCHADE("SCHADE"),
    DEKRA_HU("DEKRA_HU"),
    PROVINZIAL("PROVINZIAL"),
    DAT_KR("DAT_KR"),
    GROUPAMA_HU("GROUPAMA_HU"),
    ERGO_RUS("ERGO_RUS"),
    CARGLASS_IT("CARGLASS_IT"),
    DAT_LT("DAT_LT"),
    AIOI("AIOI"),
    EMIL_FREY_CH("EMIL_FREY_CH"),
    STANDARD_DAT_1("STANDARD_DAT_1"),
    STANDARD_DAT_2("STANDARD_DAT_2"),
    STANDARD_DAT_3("STANDARD_DAT_3"),
    STANDARD_DAT_4("STANDARD_DAT_4"),
    STANDARD_DAT_5("STANDARD_DAT_5"),
    STANDARD_DAT_6("STANDARD_DAT_6"),
    STANDARD_DAT_7("STANDARD_DAT_7"),
    STANDARD_DAT_8("STANDARD_DAT_8"),
    STANDARD_DAT_9("STANDARD_DAT_9"),
    STANDARD_DAT_10("STANDARD_DAT_10"),
    VSK_RUS("VSK_RUS"),
    SOGLASIE_RUS("SOGLASIE_RUS"),
    UGORIA_RUS("UGORIA_RUS"),
    DAT_CHINA("DAT_CHINA"),
    RENINS_RUS("RENINS_RUS"),
    ACKO_RUS("ACKO_RUS"),
    AUTOTAL_HU("AUTOTAL_HU"),
    ZETTA_RUS("ZETTA_RUS"),
    CYPRUS_NETWORK("CYPRUS_NETWORK"),
    @XmlEnumValue("HU_4CONTROL")
    HU_4_CONTROL("HU_4CONTROL"),
    RESO_RUS("RESO_RUS"),
    LIBERTY_RUS("LIBERTY_RUS"),
    GUIDEH_RUS("GUIDEH_RUS"),
    DENMARK("DENMARK"),
    AEV("AEV"),
    PORSCHE_HU("PORSCHE_HU"),
    PZU("PZU"),
    MAKC_RUS("MAKC_RUS"),
    ROMANIA_INSURANCE_NET("ROMANIA_INSURANCE_NET"),
    GLASS_CZ("GLASS_CZ"),
    ALLIANZ_POLSKA("ALLIANZ_POLSKA"),
    DAT_PT("DAT_PT"),
    RENAULT_CZ("RENAULT_CZ"),
    DAT_HELLAS_ACT("DAT_HELLAS_ACT"),
    EXPERTA_SK("EXPERTA_SK"),
    SLAVIA_CZ("SLAVIA_CZ"),
    @XmlEnumValue("DAT_CZ2")
    DAT_CZ_2("DAT_CZ2"),
    DIRECT_CZ("DIRECT_CZ"),
    AXA_CZ("AXA_CZ"),
    DAT_MANUFACTURER_CZ("DAT_MANUFACTURER_CZ"),
    DAT_MANUFACTURER_SK("DAT_MANUFACTURER_SK"),
    GENERALI_SK("GENERALI_SK"),
    ALLIANZ_SK("ALLIANZ_SK"),
    @XmlEnumValue("DAT_SK2")
    DAT_SK_2("DAT_SK2"),
    MOBEXO("MOBEXO"),
    DAT_BULGARIA("DAT_BULGARIA"),
    @XmlEnumValue("DAT_CZ3")
    DAT_CZ_3("DAT_CZ3"),
    @XmlEnumValue("DAT_SK3")
    DAT_SK_3("DAT_SK3"),
    GLOBAL_EXPERT_CZ("GLOBAL_EXPERT_CZ"),
    SOVKOMBANK_RUS("SOVKOMBANK_RUS"),
    MOBI_NETZ("MOBI_NETZ");
    private final String value;

    NetworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkType fromValue(String v) {
        for (NetworkType c: NetworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
