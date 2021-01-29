
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getCalculatedSparePartsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCalculatedSparePartsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dat.de/vxs}spareParts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalculatedSparePartsResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "spareParts"
})
public class GetCalculatedSparePartsResponse {

    @XmlElement(namespace = "http://www.dat.de/vxs")
    protected MaterialPositions spareParts;

    /**
     * Ruft den Wert der spareParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MaterialPositions }
     *     
     */
    public MaterialPositions getSpareParts() {
        return spareParts;
    }

    /**
     * Legt den Wert der spareParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialPositions }
     *     
     */
    public void setSpareParts(MaterialPositions value) {
        this.spareParts = value;
    }

}
