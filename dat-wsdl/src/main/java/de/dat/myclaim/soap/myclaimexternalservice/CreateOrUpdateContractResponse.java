
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r createOrUpdateContractResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="createOrUpdateContractResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrUpdateContractResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "_return"
})
public class CreateOrUpdateContractResponse {

    @XmlElement(name = "return", namespace = "")
    protected long _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     */
    public long getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     */
    public void setReturn(long value) {
        this._return = value;
    }

}
