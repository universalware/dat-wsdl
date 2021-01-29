
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für listNotifications complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listNotifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimsNewerThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notificationsNewerThan" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="notificationTypes" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}notificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listNotifications", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "claimsNewerThan",
    "notificationsNewerThan",
    "notificationTypes"
})
public class ListNotifications {

    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar claimsNewerThan;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notificationsNewerThan;
    @XmlElement(namespace = "", nillable = true)
    @XmlSchemaType(name = "string")
    protected List<NotificationType> notificationTypes;

    /**
     * Ruft den Wert der claimsNewerThan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClaimsNewerThan() {
        return claimsNewerThan;
    }

    /**
     * Legt den Wert der claimsNewerThan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClaimsNewerThan(XMLGregorianCalendar value) {
        this.claimsNewerThan = value;
    }

    /**
     * Ruft den Wert der notificationsNewerThan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotificationsNewerThan() {
        return notificationsNewerThan;
    }

    /**
     * Legt den Wert der notificationsNewerThan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotificationsNewerThan(XMLGregorianCalendar value) {
        this.notificationsNewerThan = value;
    }

    /**
     * Gets the value of the notificationTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationType }
     * 
     * 
     */
    public List<NotificationType> getNotificationTypes() {
        if (notificationTypes == null) {
            notificationTypes = new ArrayList<NotificationType>();
        }
        return this.notificationTypes;
    }

}
