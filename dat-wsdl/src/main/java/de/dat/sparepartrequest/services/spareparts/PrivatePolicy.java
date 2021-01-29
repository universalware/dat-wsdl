
package de.dat.sparepartrequest.services.spareparts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Address" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PolicyDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="EMail" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhoneBusiness" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhoneMobile" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="PhonePrivate" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Time" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="User" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="UserNumber" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="UserShort" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "PrivatePolicy")
public class PrivatePolicy {

    @XmlElement(name = "Address")
    protected FieldString address;
    @XmlElement(name = "PolicyDate")
    protected FieldDate policyDate;
    @XmlElement(name = "EMail")
    protected FieldString eMail;
    @XmlElement(name = "PhoneBusiness")
    protected FieldString phoneBusiness;
    @XmlElement(name = "PhoneMobile")
    protected FieldString phoneMobile;
    @XmlElement(name = "PhonePrivate")
    protected FieldString phonePrivate;
    @XmlElement(name = "Time")
    protected FieldDateTime time;
    @XmlElement(name = "User")
    protected FieldString user;
    @XmlElement(name = "UserNumber")
    protected FieldInteger userNumber;
    @XmlElement(name = "UserShort")
    protected FieldString userShort;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAddress(FieldString value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der policyDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getPolicyDate() {
        return policyDate;
    }

    /**
     * Legt den Wert der policyDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setPolicyDate(FieldDate value) {
        this.policyDate = value;
    }

    /**
     * Ruft den Wert der eMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getEMail() {
        return eMail;
    }

    /**
     * Legt den Wert der eMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setEMail(FieldString value) {
        this.eMail = value;
    }

    /**
     * Ruft den Wert der phoneBusiness-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhoneBusiness() {
        return phoneBusiness;
    }

    /**
     * Legt den Wert der phoneBusiness-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhoneBusiness(FieldString value) {
        this.phoneBusiness = value;
    }

    /**
     * Ruft den Wert der phoneMobile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * Legt den Wert der phoneMobile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhoneMobile(FieldString value) {
        this.phoneMobile = value;
    }

    /**
     * Ruft den Wert der phonePrivate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getPhonePrivate() {
        return phonePrivate;
    }

    /**
     * Legt den Wert der phonePrivate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setPhonePrivate(FieldString value) {
        this.phonePrivate = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setTime(FieldDateTime value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUser(FieldString value) {
        this.user = value;
    }

    /**
     * Ruft den Wert der userNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getUserNumber() {
        return userNumber;
    }

    /**
     * Legt den Wert der userNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setUserNumber(FieldInteger value) {
        this.userNumber = value;
    }

    /**
     * Ruft den Wert der userShort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getUserShort() {
        return userShort;
    }

    /**
     * Legt den Wert der userShort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setUserShort(FieldString value) {
        this.userShort = value;
    }

}
