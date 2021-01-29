
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für notificationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="notificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="assigned"/>
 *     &lt;enumeration value="documents"/>
 *     &lt;enumeration value="terms"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="claimOpen"/>
 *     &lt;enumeration value="calculationUploaded"/>
 *     &lt;enumeration value="newVersionCalculation"/>
 *     &lt;enumeration value="calculationPublished"/>
 *     &lt;enumeration value="claimClosed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notificationType", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
@XmlEnum
public enum NotificationType {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("assigned")
    ASSIGNED("assigned"),
    @XmlEnumValue("documents")
    DOCUMENTS("documents"),
    @XmlEnumValue("terms")
    TERMS("terms"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("claimOpen")
    CLAIM_OPEN("claimOpen"),
    @XmlEnumValue("calculationUploaded")
    CALCULATION_UPLOADED("calculationUploaded"),
    @XmlEnumValue("newVersionCalculation")
    NEW_VERSION_CALCULATION("newVersionCalculation"),
    @XmlEnumValue("calculationPublished")
    CALCULATION_PUBLISHED("calculationPublished"),
    @XmlEnumValue("claimClosed")
    CLAIM_CLOSED("claimClosed");
    private final String value;

    NotificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationType fromValue(String v) {
        for (NotificationType c: NotificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
