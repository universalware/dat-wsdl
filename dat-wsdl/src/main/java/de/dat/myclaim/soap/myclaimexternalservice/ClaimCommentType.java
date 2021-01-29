
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für claimCommentType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="claimCommentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FOREIGN_ORDER_COMMENT"/>
 *     &lt;enumeration value="HISTORY_COMMENT"/>
 *     &lt;enumeration value="FOREIGN_TEMPLATE_COMMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claimCommentType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum ClaimCommentType {

    FOREIGN_ORDER_COMMENT,
    HISTORY_COMMENT,
    FOREIGN_TEMPLATE_COMMENT;

    public String value() {
        return name();
    }

    public static ClaimCommentType fromValue(String v) {
        return valueOf(v);
    }

}
