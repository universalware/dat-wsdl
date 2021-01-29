
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dataCountry.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="dataCountry">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DO"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="JM"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="YU"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="ZR"/>
 *     &lt;enumeration value="ZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataCountry", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
@XmlEnum
public enum DataCountry {

    AT,
    AF,
    AL,
    AD,
    AO,
    AM,
    AZ,
    AU,
    BE,
    BD,
    BJ,
    BF,
    BG,
    BA,
    BY,
    BO,
    BR,
    CU,
    CM,
    CA,
    CH,
    LK,
    CO,
    CR,
    CY,
    CZ,
    DE,
    DK,
    DO,
    DZ,
    ES,
    KE,
    TZ,
    UG,
    EC,
    ER,
    SV,
    EG,
    ET,
    EE,
    FR,
    LI,
    GA,
    GB,
    GT,
    GE,
    GH,
    GR,
    HU,
    HN,
    HK,
    HR,
    IT,
    IL,
    IN,
    IR,
    IE,
    IQ,
    IS,
    JP,
    JM,
    JO,
    KH,
    KZ,
    KG,
    KW,
    LU,
    LA,
    LY,
    LR,
    LV,
    MT,
    MA,
    MK,
    MY,
    MC,
    MX,
    MZ,
    MD,
    MU,
    MW,
    NO,
    NA,
    NP,
    NI,
    NL,
    NZ,
    PT,
    PA,
    PE,
    PK,
    PL,
    PY,
    AR,
    BW,
    CF,
    CL,
    HT,
    ID,
    MR,
    LB,
    MG,
    ML,
    NE,
    RO,
    KR,
    UY,
    PH,
    CG,
    BI,
    RU,
    RW,
    SE,
    SA,
    FI,
    SG,
    SK,
    SI,
    SN,
    SO,
    SD,
    SY,
    TH,
    TJ,
    TD,
    TG,
    TN,
    TR,
    TM,
    AE,
    UA,
    US,
    UZ,
    VA,
    VN,
    CN,
    SL,
    NG,
    YE,
    YU,
    VE,
    ZM,
    ZA,
    ZR,
    ZW;

    public String value() {
        return name();
    }

    public static DataCountry fromValue(String v) {
        return valueOf(v);
    }

}
