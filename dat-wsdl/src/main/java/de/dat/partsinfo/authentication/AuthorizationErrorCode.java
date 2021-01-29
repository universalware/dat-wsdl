
package de.dat.partsinfo.authentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für authorizationErrorCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="authorizationErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORIZATION_PARAMETERS_ARE_NOT_COMPLETE"/>
 *     &lt;enumeration value="SESSION_ALREADY_INVALIDATED"/>
 *     &lt;enumeration value="SIGNATURE_CHECK_FAILED"/>
 *     &lt;enumeration value="USER_MANAGEMENT_SERVER_AUTHORIZATION_FAILED"/>
 *     &lt;enumeration value="USER_HAS_NO_PERMISSIONS"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="COUNCURRENT_USER_COUNT_EXHAUSTED"/>
 *     &lt;enumeration value="USER_HAS_NO_VALID_LOGIN"/>
 *     &lt;enumeration value="USER_LOCKED_TEMPORARILY"/>
 *     &lt;enumeration value="USER_LOCKED_PERMANENTLY"/>
 *     &lt;enumeration value="USER_NOT_ACTIVE"/>
 *     &lt;enumeration value="USER_DELETED"/>
 *     &lt;enumeration value="INTERFACE_PARTNER_SIGNATURE_CHECK_FAILED"/>
 *     &lt;enumeration value="INTERFACE_PARTNER_HAS_NO_PERMISSION"/>
 *     &lt;enumeration value="TOKEN_EXPIRED"/>
 *     &lt;enumeration value="TOKEN_CHECK_FAILED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authorizationErrorCode")
@XmlEnum
public enum AuthorizationErrorCode {

    AUTHORIZATION_PARAMETERS_ARE_NOT_COMPLETE,
    SESSION_ALREADY_INVALIDATED,
    SIGNATURE_CHECK_FAILED,
    USER_MANAGEMENT_SERVER_AUTHORIZATION_FAILED,
    USER_HAS_NO_PERMISSIONS,
    UNKNOWN_ERROR,
    COUNCURRENT_USER_COUNT_EXHAUSTED,
    USER_HAS_NO_VALID_LOGIN,
    USER_LOCKED_TEMPORARILY,
    USER_LOCKED_PERMANENTLY,
    USER_NOT_ACTIVE,
    USER_DELETED,
    INTERFACE_PARTNER_SIGNATURE_CHECK_FAILED,
    INTERFACE_PARTNER_HAS_NO_PERMISSION,
    TOKEN_EXPIRED,
    TOKEN_CHECK_FAILED;

    public String value() {
        return name();
    }

    public static AuthorizationErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
