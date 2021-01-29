
package de.dat.datnet.services.datnetwebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Info complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="DeclarationOfAssignment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PreTaxDeductionRight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Info")
public class Info {

    @XmlAttribute(name = "DeclarationOfAssignment")
    protected String declarationOfAssignment;
    @XmlAttribute(name = "PreTaxDeductionRight")
    protected String preTaxDeductionRight;

    /**
     * Ruft den Wert der declarationOfAssignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationOfAssignment() {
        return declarationOfAssignment;
    }

    /**
     * Legt den Wert der declarationOfAssignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationOfAssignment(String value) {
        this.declarationOfAssignment = value;
    }

    /**
     * Ruft den Wert der preTaxDeductionRight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreTaxDeductionRight() {
        return preTaxDeductionRight;
    }

    /**
     * Legt den Wert der preTaxDeductionRight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreTaxDeductionRight(String value) {
        this.preTaxDeductionRight = value;
    }

}
