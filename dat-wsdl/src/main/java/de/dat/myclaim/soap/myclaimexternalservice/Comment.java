
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für comment complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="comment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimCommentType" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}claimCommentType"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comment", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "claimCommentType",
    "text"
})
public class Comment {

    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "string")
    protected ClaimCommentType claimCommentType;
    @XmlElement(namespace = "", required = true)
    protected String text;

    /**
     * Ruft den Wert der claimCommentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClaimCommentType }
     *     
     */
    public ClaimCommentType getClaimCommentType() {
        return claimCommentType;
    }

    /**
     * Legt den Wert der claimCommentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimCommentType }
     *     
     */
    public void setClaimCommentType(ClaimCommentType value) {
        this.claimCommentType = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
