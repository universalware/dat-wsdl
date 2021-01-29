
package de.dat.datecodeselection.services.authentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für httpMethodEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="httpMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="HEAD"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="OPTIONS"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="TRACE"/>
 *     &lt;enumeration value="CONNECT"/>
 *     &lt;enumeration value="MOVE"/>
 *     &lt;enumeration value="PROXY"/>
 *     &lt;enumeration value="PRI"/>
 *     &lt;enumeration value="UNKOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "httpMethodEnum")
@XmlEnum
public enum HttpMethodEnum {

    GET,
    POST,
    HEAD,
    PUT,
    OPTIONS,
    DELETE,
    TRACE,
    CONNECT,
    MOVE,
    PROXY,
    PRI,
    UNKOWN;

    public String value() {
        return name();
    }

    public static HttpMethodEnum fromValue(String v) {
        return valueOf(v);
    }

}
