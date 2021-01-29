
package de.dat.datecodeselection.services.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für datrcbkb complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datrcbkb">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Authentication}datrcpda">
 *       &lt;sequence>
 *         &lt;element name="benuBes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="benuId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cbmdLnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cugrLnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cugrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fremdFr" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="idExtern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kzAktiv" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="lastFailedLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nrFailedLogins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="passwort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="standard" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="tempLocked" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="userStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zpLae" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="zpLlog" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datrcbkb", propOrder = {
    "benuBes",
    "benuId",
    "cbmdLnr",
    "cugrLnr",
    "cugrName",
    "customerNumber",
    "fremdFr",
    "idExtern",
    "kzAktiv",
    "lastFailedLogin",
    "lnr",
    "nrFailedLogins",
    "passwort",
    "standard",
    "tempLocked",
    "userStatus",
    "zpLae",
    "zpLlog"
})
public class Datrcbkb
    extends Datrcpda
{

    protected String benuBes;
    protected String benuId;
    protected Long cbmdLnr;
    protected Long cugrLnr;
    protected String cugrName;
    protected String customerNumber;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer fremdFr;
    protected String idExtern;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer kzAktiv;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastFailedLogin;
    protected Long lnr;
    protected Integer nrFailedLogins;
    protected String passwort;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer standard;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer tempLocked;
    protected boolean userStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zpLae;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zpLlog;

    /**
     * Ruft den Wert der benuBes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenuBes() {
        return benuBes;
    }

    /**
     * Legt den Wert der benuBes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenuBes(String value) {
        this.benuBes = value;
    }

    /**
     * Ruft den Wert der benuId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenuId() {
        return benuId;
    }

    /**
     * Legt den Wert der benuId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenuId(String value) {
        this.benuId = value;
    }

    /**
     * Ruft den Wert der cbmdLnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCbmdLnr() {
        return cbmdLnr;
    }

    /**
     * Legt den Wert der cbmdLnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCbmdLnr(Long value) {
        this.cbmdLnr = value;
    }

    /**
     * Ruft den Wert der cugrLnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCugrLnr() {
        return cugrLnr;
    }

    /**
     * Legt den Wert der cugrLnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCugrLnr(Long value) {
        this.cugrLnr = value;
    }

    /**
     * Ruft den Wert der cugrName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCugrName() {
        return cugrName;
    }

    /**
     * Legt den Wert der cugrName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCugrName(String value) {
        this.cugrName = value;
    }

    /**
     * Ruft den Wert der customerNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Legt den Wert der customerNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Ruft den Wert der fremdFr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFremdFr() {
        return fremdFr;
    }

    /**
     * Legt den Wert der fremdFr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFremdFr(Integer value) {
        this.fremdFr = value;
    }

    /**
     * Ruft den Wert der idExtern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExtern() {
        return idExtern;
    }

    /**
     * Legt den Wert der idExtern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExtern(String value) {
        this.idExtern = value;
    }

    /**
     * Ruft den Wert der kzAktiv-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKzAktiv() {
        return kzAktiv;
    }

    /**
     * Legt den Wert der kzAktiv-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKzAktiv(Integer value) {
        this.kzAktiv = value;
    }

    /**
     * Ruft den Wert der lastFailedLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastFailedLogin() {
        return lastFailedLogin;
    }

    /**
     * Legt den Wert der lastFailedLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastFailedLogin(XMLGregorianCalendar value) {
        this.lastFailedLogin = value;
    }

    /**
     * Ruft den Wert der lnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLnr() {
        return lnr;
    }

    /**
     * Legt den Wert der lnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLnr(Long value) {
        this.lnr = value;
    }

    /**
     * Ruft den Wert der nrFailedLogins-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrFailedLogins() {
        return nrFailedLogins;
    }

    /**
     * Legt den Wert der nrFailedLogins-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrFailedLogins(Integer value) {
        this.nrFailedLogins = value;
    }

    /**
     * Ruft den Wert der passwort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswort() {
        return passwort;
    }

    /**
     * Legt den Wert der passwort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswort(String value) {
        this.passwort = value;
    }

    /**
     * Ruft den Wert der standard-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStandard() {
        return standard;
    }

    /**
     * Legt den Wert der standard-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStandard(Integer value) {
        this.standard = value;
    }

    /**
     * Ruft den Wert der tempLocked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempLocked() {
        return tempLocked;
    }

    /**
     * Legt den Wert der tempLocked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempLocked(Integer value) {
        this.tempLocked = value;
    }

    /**
     * Ruft den Wert der userStatus-Eigenschaft ab.
     * 
     */
    public boolean isUserStatus() {
        return userStatus;
    }

    /**
     * Legt den Wert der userStatus-Eigenschaft fest.
     * 
     */
    public void setUserStatus(boolean value) {
        this.userStatus = value;
    }

    /**
     * Ruft den Wert der zpLae-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZpLae() {
        return zpLae;
    }

    /**
     * Legt den Wert der zpLae-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZpLae(XMLGregorianCalendar value) {
        this.zpLae = value;
    }

    /**
     * Ruft den Wert der zpLlog-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZpLlog() {
        return zpLlog;
    }

    /**
     * Legt den Wert der zpLlog-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZpLlog(XMLGregorianCalendar value) {
        this.zpLlog = value;
    }

}
