
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für soapFile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="soapFile">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}baseSoapFile">
 *       &lt;sequence>
 *         &lt;element name="binaryData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapFile", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "binaryData"
})
@XmlSeeAlso({
    AttachmentItem.class
})
public class SoapFile
    extends BaseSoapFile
{

    @XmlElement(namespace = "", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler binaryData;

    /**
     * Ruft den Wert der binaryData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getBinaryData() {
        return binaryData;
    }

    /**
     * Legt den Wert der binaryData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setBinaryData(DataHandler value) {
        this.binaryData = value;
    }

}
