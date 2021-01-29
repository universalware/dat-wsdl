
package de.dat.glassrep.services.authentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für authenticationMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="authenticationMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="SIGNATURE"/>
 *     &lt;enumeration value="JWT"/>
 *     &lt;enumeration value="DO_LOGIN"/>
 *     &lt;enumeration value="NO_INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authenticationMethod")
@XmlEnum
public enum AuthenticationMethod {

    PASSWORD,
    SIGNATURE,
    JWT,
    DO_LOGIN,
    NO_INFO;

    public String value() {
        return name();
    }

    public static AuthenticationMethod fromValue(String v) {
        return valueOf(v);
    }

}
