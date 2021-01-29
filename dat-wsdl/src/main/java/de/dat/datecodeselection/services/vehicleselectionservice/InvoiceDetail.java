
package de.dat.datecodeselection.services.vehicleselectionservice;

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
 *       &lt;sequence>
 *         &lt;element name="SourceOfInvoice" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
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
    "sourceOfInvoice"
})
@XmlRootElement(name = "InvoiceDetail")
public class InvoiceDetail {

    @XmlElement(name = "SourceOfInvoice")
    protected FieldString sourceOfInvoice;

    /**
     * Ruft den Wert der sourceOfInvoice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSourceOfInvoice() {
        return sourceOfInvoice;
    }

    /**
     * Legt den Wert der sourceOfInvoice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSourceOfInvoice(FieldString value) {
        this.sourceOfInvoice = value;
    }

}
