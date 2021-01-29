
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r listNotificationsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listNotificationsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}notificationsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listNotificationsResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "_return"
})
public class ListNotificationsResponse {

    @XmlElement(name = "return", namespace = "")
    protected NotificationsResponse _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NotificationsResponse }
     *     
     */
    public NotificationsResponse getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationsResponse }
     *     
     */
    public void setReturn(NotificationsResponse value) {
        this._return = value;
    }

}
