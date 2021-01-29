
package de.dat.glassrep.services.dmscreatecontract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DeductionsSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeductionsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DeductionsTotalGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeductionsTotalNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="DeductionsTotalVAT" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoGeneralSumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoGeneralSumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoMaterialSumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoMaterialSumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoLacquerSumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="NfoLacquerSumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PreDamageSumGross" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *         &lt;element name="PreDamageSumNet" type="{http://www.dat.de/vxs}fieldDecimal" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeductionsSummary", propOrder = {

})
public class DeductionsSummary {

    @XmlElement(name = "DeductionsTotalGross")
    protected FieldDecimal deductionsTotalGross;
    @XmlElement(name = "DeductionsTotalNet")
    protected FieldDecimal deductionsTotalNet;
    @XmlElement(name = "DeductionsTotalVAT")
    protected FieldDecimal deductionsTotalVAT;
    @XmlElement(name = "NfoGeneralSumGross")
    protected FieldDecimal nfoGeneralSumGross;
    @XmlElement(name = "NfoGeneralSumNet")
    protected FieldDecimal nfoGeneralSumNet;
    @XmlElement(name = "NfoMaterialSumGross")
    protected FieldDecimal nfoMaterialSumGross;
    @XmlElement(name = "NfoMaterialSumNet")
    protected FieldDecimal nfoMaterialSumNet;
    @XmlElement(name = "NfoLacquerSumGross")
    protected FieldDecimal nfoLacquerSumGross;
    @XmlElement(name = "NfoLacquerSumNet")
    protected FieldDecimal nfoLacquerSumNet;
    @XmlElement(name = "PreDamageSumGross")
    protected FieldDecimal preDamageSumGross;
    @XmlElement(name = "PreDamageSumNet")
    protected FieldDecimal preDamageSumNet;

    /**
     * Ruft den Wert der deductionsTotalGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDeductionsTotalGross() {
        return deductionsTotalGross;
    }

    /**
     * Legt den Wert der deductionsTotalGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDeductionsTotalGross(FieldDecimal value) {
        this.deductionsTotalGross = value;
    }

    /**
     * Ruft den Wert der deductionsTotalNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDeductionsTotalNet() {
        return deductionsTotalNet;
    }

    /**
     * Legt den Wert der deductionsTotalNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDeductionsTotalNet(FieldDecimal value) {
        this.deductionsTotalNet = value;
    }

    /**
     * Ruft den Wert der deductionsTotalVAT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getDeductionsTotalVAT() {
        return deductionsTotalVAT;
    }

    /**
     * Legt den Wert der deductionsTotalVAT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setDeductionsTotalVAT(FieldDecimal value) {
        this.deductionsTotalVAT = value;
    }

    /**
     * Ruft den Wert der nfoGeneralSumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoGeneralSumGross() {
        return nfoGeneralSumGross;
    }

    /**
     * Legt den Wert der nfoGeneralSumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoGeneralSumGross(FieldDecimal value) {
        this.nfoGeneralSumGross = value;
    }

    /**
     * Ruft den Wert der nfoGeneralSumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoGeneralSumNet() {
        return nfoGeneralSumNet;
    }

    /**
     * Legt den Wert der nfoGeneralSumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoGeneralSumNet(FieldDecimal value) {
        this.nfoGeneralSumNet = value;
    }

    /**
     * Ruft den Wert der nfoMaterialSumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoMaterialSumGross() {
        return nfoMaterialSumGross;
    }

    /**
     * Legt den Wert der nfoMaterialSumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoMaterialSumGross(FieldDecimal value) {
        this.nfoMaterialSumGross = value;
    }

    /**
     * Ruft den Wert der nfoMaterialSumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoMaterialSumNet() {
        return nfoMaterialSumNet;
    }

    /**
     * Legt den Wert der nfoMaterialSumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoMaterialSumNet(FieldDecimal value) {
        this.nfoMaterialSumNet = value;
    }

    /**
     * Ruft den Wert der nfoLacquerSumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoLacquerSumGross() {
        return nfoLacquerSumGross;
    }

    /**
     * Legt den Wert der nfoLacquerSumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoLacquerSumGross(FieldDecimal value) {
        this.nfoLacquerSumGross = value;
    }

    /**
     * Ruft den Wert der nfoLacquerSumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getNfoLacquerSumNet() {
        return nfoLacquerSumNet;
    }

    /**
     * Legt den Wert der nfoLacquerSumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setNfoLacquerSumNet(FieldDecimal value) {
        this.nfoLacquerSumNet = value;
    }

    /**
     * Ruft den Wert der preDamageSumGross-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPreDamageSumGross() {
        return preDamageSumGross;
    }

    /**
     * Legt den Wert der preDamageSumGross-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPreDamageSumGross(FieldDecimal value) {
        this.preDamageSumGross = value;
    }

    /**
     * Ruft den Wert der preDamageSumNet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDecimal }
     *     
     */
    public FieldDecimal getPreDamageSumNet() {
        return preDamageSumNet;
    }

    /**
     * Legt den Wert der preDamageSumNet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDecimal }
     *     
     */
    public void setPreDamageSumNet(FieldDecimal value) {
        this.preDamageSumNet = value;
    }

}
