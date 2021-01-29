
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für customerRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="customerRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPAIRER"/>
 *     &lt;enumeration value="INSURANCE"/>
 *     &lt;enumeration value="EXPERT"/>
 *     &lt;enumeration value="MANUFACTURER"/>
 *     &lt;enumeration value="GUEST"/>
 *     &lt;enumeration value="LAWYER"/>
 *     &lt;enumeration value="FLEET"/>
 *     &lt;enumeration value="OTHER_PARTNER"/>
 *     &lt;enumeration value="SERVICE_PROVIDER"/>
 *     &lt;enumeration value="CG_REPAIRER"/>
 *     &lt;enumeration value="CG_EXPERT"/>
 *     &lt;enumeration value="PAINT_SHOP"/>
 *     &lt;enumeration value="TOWING_SERVICE"/>
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="LEASING_COMPANY"/>
 *     &lt;enumeration value="NETWORK_ADMINISTRATOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerRole", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum CustomerRole {

    REPAIRER,
    INSURANCE,
    EXPERT,
    MANUFACTURER,
    GUEST,
    LAWYER,
    FLEET,
    OTHER_PARTNER,
    SERVICE_PROVIDER,
    CG_REPAIRER,
    CG_EXPERT,
    PAINT_SHOP,
    TOWING_SERVICE,
    BANK,
    LEASING_COMPANY,
    NETWORK_ADMINISTRATOR;

    public String value() {
        return name();
    }

    public static CustomerRole fromValue(String v) {
        return valueOf(v);
    }

}
