
package de.dat.datnet.services.datnetwebservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ActionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActionRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Info" type="{http://www.dat.de/DAT-NET-Webservice}Info" minOccurs="0"/>
 *         &lt;element name="Notice" type="{http://www.dat.de/DAT-NET-Webservice}Notice" minOccurs="0"/>
 *         &lt;element name="Attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attachment" type="{http://www.dat.de/DAT-NET-Webservice}Attachment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="login" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="password" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProcessKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActionName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StatusNow" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StatusBefore" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRequest", propOrder = {
    "info",
    "notice",
    "attachments"
})
public class ActionRequest {

    @XmlElement(name = "Info")
    protected Info info;
    @XmlElement(name = "Notice")
    protected Notice notice;
    @XmlElement(name = "Attachments")
    protected ActionRequest.Attachments attachments;
    @XmlAttribute(name = "login", required = true)
    protected String login;
    @XmlAttribute(name = "password", required = true)
    protected String password;
    @XmlAttribute(name = "ProcessKey", required = true)
    protected String processKey;
    @XmlAttribute(name = "ActionName", required = true)
    protected String actionName;
    @XmlAttribute(name = "StatusNow")
    protected String statusNow;
    @XmlAttribute(name = "StatusBefore")
    protected String statusBefore;
    @XmlAttribute(name = "ActionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionDate;

    /**
     * Ruft den Wert der info-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Legt den Wert der info-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Ruft den Wert der notice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Notice }
     *     
     */
    public Notice getNotice() {
        return notice;
    }

    /**
     * Legt den Wert der notice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Notice }
     *     
     */
    public void setNotice(Notice value) {
        this.notice = value;
    }

    /**
     * Ruft den Wert der attachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionRequest.Attachments }
     *     
     */
    public ActionRequest.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Legt den Wert der attachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRequest.Attachments }
     *     
     */
    public void setAttachments(ActionRequest.Attachments value) {
        this.attachments = value;
    }

    /**
     * Ruft den Wert der login-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Legt den Wert der login-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der processKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessKey() {
        return processKey;
    }

    /**
     * Legt den Wert der processKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessKey(String value) {
        this.processKey = value;
    }

    /**
     * Ruft den Wert der actionName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Legt den Wert der actionName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Ruft den Wert der statusNow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusNow() {
        return statusNow;
    }

    /**
     * Legt den Wert der statusNow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusNow(String value) {
        this.statusNow = value;
    }

    /**
     * Ruft den Wert der statusBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBefore() {
        return statusBefore;
    }

    /**
     * Legt den Wert der statusBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBefore(String value) {
        this.statusBefore = value;
    }

    /**
     * Ruft den Wert der actionDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionDate() {
        return actionDate;
    }

    /**
     * Legt den Wert der actionDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionDate(XMLGregorianCalendar value) {
        this.actionDate = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Attachment" type="{http://www.dat.de/DAT-NET-Webservice}Attachment" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment", required = true)
        protected List<Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attachment }
         * 
         * 
         */
        public List<Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<Attachment>();
            }
            return this.attachment;
        }

    }

}
