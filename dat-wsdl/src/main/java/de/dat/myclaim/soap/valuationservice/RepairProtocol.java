
package de.dat.myclaim.soap.valuationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für repairProtocol complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="repairProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InvalidProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *         &lt;element name="UnspecificProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartOfCombinationProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *         &lt;element name="PartOfOtherProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *         &lt;element name="RemovedByCompositeProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *         &lt;element name="MissingLacquerInformationProcesses" type="{http://www.dat.de/vxs}repairProcessList" minOccurs="0" form="qualified"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repairProtocol", propOrder = {

})
public class RepairProtocol {

    @XmlElement(name = "InvalidProcesses")
    protected RepairProcessList invalidProcesses;
    @XmlElement(name = "UnspecificProcesses")
    protected RepairProcessList unspecificProcesses;
    @XmlElement(name = "PartOfCombinationProcesses")
    protected RepairProcessList partOfCombinationProcesses;
    @XmlElement(name = "PartOfOtherProcesses")
    protected RepairProcessList partOfOtherProcesses;
    @XmlElement(name = "RemovedByCompositeProcesses")
    protected RepairProcessList removedByCompositeProcesses;
    @XmlElement(name = "MissingLacquerInformationProcesses")
    protected RepairProcessList missingLacquerInformationProcesses;

    /**
     * Ruft den Wert der invalidProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getInvalidProcesses() {
        return invalidProcesses;
    }

    /**
     * Legt den Wert der invalidProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setInvalidProcesses(RepairProcessList value) {
        this.invalidProcesses = value;
    }

    /**
     * Ruft den Wert der unspecificProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getUnspecificProcesses() {
        return unspecificProcesses;
    }

    /**
     * Legt den Wert der unspecificProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setUnspecificProcesses(RepairProcessList value) {
        this.unspecificProcesses = value;
    }

    /**
     * Ruft den Wert der partOfCombinationProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getPartOfCombinationProcesses() {
        return partOfCombinationProcesses;
    }

    /**
     * Legt den Wert der partOfCombinationProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setPartOfCombinationProcesses(RepairProcessList value) {
        this.partOfCombinationProcesses = value;
    }

    /**
     * Ruft den Wert der partOfOtherProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getPartOfOtherProcesses() {
        return partOfOtherProcesses;
    }

    /**
     * Legt den Wert der partOfOtherProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setPartOfOtherProcesses(RepairProcessList value) {
        this.partOfOtherProcesses = value;
    }

    /**
     * Ruft den Wert der removedByCompositeProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getRemovedByCompositeProcesses() {
        return removedByCompositeProcesses;
    }

    /**
     * Legt den Wert der removedByCompositeProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setRemovedByCompositeProcesses(RepairProcessList value) {
        this.removedByCompositeProcesses = value;
    }

    /**
     * Ruft den Wert der missingLacquerInformationProcesses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RepairProcessList }
     *     
     */
    public RepairProcessList getMissingLacquerInformationProcesses() {
        return missingLacquerInformationProcesses;
    }

    /**
     * Legt den Wert der missingLacquerInformationProcesses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairProcessList }
     *     
     */
    public void setMissingLacquerInformationProcesses(RepairProcessList value) {
        this.missingLacquerInformationProcesses = value;
    }

}
