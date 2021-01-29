
package de.dat.myclaim.soap.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für calculateContractRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="calculateContractRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contractID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="datProcessInfo" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}datProcessInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.dat.eu/myClaim/soap/v2/VehicleRepairService}locale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateContractRequest", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "comment",
    "contractID",
    "datProcessInfo",
    "includeAttachments",
    "includeComments",
    "locale"
})
public class CalculateContractRequest {

    @XmlElementRef(name = "comment", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(namespace = "")
    protected long contractID;
    @XmlElement(namespace = "")
    protected List<DatProcessInfo> datProcessInfo;
    @XmlElement(namespace = "", defaultValue = "false")
    protected Boolean includeAttachments;
    @XmlElement(namespace = "", defaultValue = "false")
    protected Boolean includeComments;
    @XmlElementRef(name = "locale", type = JAXBElement.class, required = false)
    protected JAXBElement<Locale> locale;

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der contractID-Eigenschaft ab.
     * 
     */
    public long getContractID() {
        return contractID;
    }

    /**
     * Legt den Wert der contractID-Eigenschaft fest.
     * 
     */
    public void setContractID(long value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the datProcessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datProcessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatProcessInfo }
     * 
     * 
     */
    public List<DatProcessInfo> getDatProcessInfo() {
        if (datProcessInfo == null) {
            datProcessInfo = new ArrayList<DatProcessInfo>();
        }
        return this.datProcessInfo;
    }

    /**
     * Ruft den Wert der includeAttachments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAttachments() {
        return includeAttachments;
    }

    /**
     * Legt den Wert der includeAttachments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAttachments(Boolean value) {
        this.includeAttachments = value;
    }

    /**
     * Ruft den Wert der includeComments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeComments() {
        return includeComments;
    }

    /**
     * Legt den Wert der includeComments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeComments(Boolean value) {
        this.includeComments = value;
    }

    /**
     * Ruft den Wert der locale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public JAXBElement<Locale> getLocale() {
        return locale;
    }

    /**
     * Legt den Wert der locale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Locale }{@code >}
     *     
     */
    public void setLocale(JAXBElement<Locale> value) {
        this.locale = value;
    }

}
