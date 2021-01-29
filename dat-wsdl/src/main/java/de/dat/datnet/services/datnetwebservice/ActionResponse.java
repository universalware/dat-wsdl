
package de.dat.datnet.services.datnetwebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ActionResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Error" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ErrMessage" type="{http://www.dat.de/DAT-NET-Webservice}Notice"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IsTechErr" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="IsProcessErr" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="StatusAck" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ProcessKey" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ActionResponse", propOrder = {
    "error"
})
public class ActionResponse {

    @XmlElement(name = "Error")
    protected ActionResponse.Error error;
    @XmlAttribute(name = "ProcessKey", required = true)
    protected String processKey;
    @XmlAttribute(name = "StatusNow")
    protected String statusNow;
    @XmlAttribute(name = "StatusBefore")
    protected String statusBefore;
    @XmlAttribute(name = "ActionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actionDate;

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionResponse.Error }
     *     
     */
    public ActionResponse.Error getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionResponse.Error }
     *     
     */
    public void setError(ActionResponse.Error value) {
        this.error = value;
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
     *         &lt;element name="ErrMessage" type="{http://www.dat.de/DAT-NET-Webservice}Notice"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IsTechErr" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="IsProcessErr" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="StatusAck" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errMessage"
    })
    public static class Error {

        @XmlElement(name = "ErrMessage", required = true)
        protected Notice errMessage;
        @XmlAttribute(name = "IsTechErr", required = true)
        protected boolean isTechErr;
        @XmlAttribute(name = "IsProcessErr", required = true)
        protected boolean isProcessErr;
        @XmlAttribute(name = "StatusAck", required = true)
        protected String statusAck;

        /**
         * Ruft den Wert der errMessage-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Notice }
         *     
         */
        public Notice getErrMessage() {
            return errMessage;
        }

        /**
         * Legt den Wert der errMessage-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Notice }
         *     
         */
        public void setErrMessage(Notice value) {
            this.errMessage = value;
        }

        /**
         * Ruft den Wert der isTechErr-Eigenschaft ab.
         * 
         */
        public boolean isIsTechErr() {
            return isTechErr;
        }

        /**
         * Legt den Wert der isTechErr-Eigenschaft fest.
         * 
         */
        public void setIsTechErr(boolean value) {
            this.isTechErr = value;
        }

        /**
         * Ruft den Wert der isProcessErr-Eigenschaft ab.
         * 
         */
        public boolean isIsProcessErr() {
            return isProcessErr;
        }

        /**
         * Legt den Wert der isProcessErr-Eigenschaft fest.
         * 
         */
        public void setIsProcessErr(boolean value) {
            this.isProcessErr = value;
        }

        /**
         * Ruft den Wert der statusAck-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusAck() {
            return statusAck;
        }

        /**
         * Legt den Wert der statusAck-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusAck(String value) {
            this.statusAck = value;
        }

    }

}
