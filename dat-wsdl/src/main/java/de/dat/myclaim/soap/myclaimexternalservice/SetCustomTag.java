
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für setCustomTag complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="setCustomTag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tagAddRemoveReplaceAction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tagIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCustomTag", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "tagAddRemoveReplaceAction",
    "tagIdentification",
    "networkType",
    "contractId"
})
public class SetCustomTag {

    @XmlElement(namespace = "", required = true)
    protected String tagAddRemoveReplaceAction;
    @XmlElement(namespace = "", required = true)
    protected String tagIdentification;
    @XmlElement(namespace = "", required = true)
    protected String networkType;
    @XmlElement(namespace = "", required = true, nillable = true)
    protected List<Long> contractId;

    /**
     * Ruft den Wert der tagAddRemoveReplaceAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagAddRemoveReplaceAction() {
        return tagAddRemoveReplaceAction;
    }

    /**
     * Legt den Wert der tagAddRemoveReplaceAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagAddRemoveReplaceAction(String value) {
        this.tagAddRemoveReplaceAction = value;
    }

    /**
     * Ruft den Wert der tagIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagIdentification() {
        return tagIdentification;
    }

    /**
     * Legt den Wert der tagIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagIdentification(String value) {
        this.tagIdentification = value;
    }

    /**
     * Ruft den Wert der networkType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkType() {
        return networkType;
    }

    /**
     * Legt den Wert der networkType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkType(String value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getContractId() {
        if (contractId == null) {
            contractId = new ArrayList<Long>();
        }
        return this.contractId;
    }

}
