
package de.dat.vehiclerepaironline.dossierservice;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;all>
 *         &lt;element name="ProjectedAcceptanceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ProjectedSalesDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkshopInDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ActualAcceptanceDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="ActualSalesDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="WorkshopOutDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="RepairCostType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="SalesPreparationDate" type="{http://www.dat.de/vxs}fieldDate" minOccurs="0" form="qualified"/>
 *         &lt;element name="Location" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="OwnType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="ActualRepairCostList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}ActualRepairCost" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "PlanData")
public class PlanData {

    @XmlElement(name = "ProjectedAcceptanceDate")
    protected FieldDate projectedAcceptanceDate;
    @XmlElement(name = "ProjectedSalesDate")
    protected FieldDate projectedSalesDate;
    @XmlElement(name = "WorkshopInDate")
    protected FieldDate workshopInDate;
    @XmlElement(name = "ActualAcceptanceDate")
    protected FieldDate actualAcceptanceDate;
    @XmlElement(name = "ActualSalesDate")
    protected FieldDate actualSalesDate;
    @XmlElement(name = "WorkshopOutDate")
    protected FieldDate workshopOutDate;
    @XmlElement(name = "RepairCostType")
    protected FieldString repairCostType;
    @XmlElement(name = "SalesPreparationDate")
    protected FieldDate salesPreparationDate;
    @XmlElement(name = "Location")
    protected FieldString location;
    @XmlElement(name = "OwnType")
    protected FieldString ownType;
    @XmlElement(name = "ActualRepairCostList")
    protected PlanData.ActualRepairCostList actualRepairCostList;

    /**
     * Ruft den Wert der projectedAcceptanceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getProjectedAcceptanceDate() {
        return projectedAcceptanceDate;
    }

    /**
     * Legt den Wert der projectedAcceptanceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setProjectedAcceptanceDate(FieldDate value) {
        this.projectedAcceptanceDate = value;
    }

    /**
     * Ruft den Wert der projectedSalesDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getProjectedSalesDate() {
        return projectedSalesDate;
    }

    /**
     * Legt den Wert der projectedSalesDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setProjectedSalesDate(FieldDate value) {
        this.projectedSalesDate = value;
    }

    /**
     * Ruft den Wert der workshopInDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getWorkshopInDate() {
        return workshopInDate;
    }

    /**
     * Legt den Wert der workshopInDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setWorkshopInDate(FieldDate value) {
        this.workshopInDate = value;
    }

    /**
     * Ruft den Wert der actualAcceptanceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getActualAcceptanceDate() {
        return actualAcceptanceDate;
    }

    /**
     * Legt den Wert der actualAcceptanceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setActualAcceptanceDate(FieldDate value) {
        this.actualAcceptanceDate = value;
    }

    /**
     * Ruft den Wert der actualSalesDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getActualSalesDate() {
        return actualSalesDate;
    }

    /**
     * Legt den Wert der actualSalesDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setActualSalesDate(FieldDate value) {
        this.actualSalesDate = value;
    }

    /**
     * Ruft den Wert der workshopOutDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getWorkshopOutDate() {
        return workshopOutDate;
    }

    /**
     * Legt den Wert der workshopOutDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setWorkshopOutDate(FieldDate value) {
        this.workshopOutDate = value;
    }

    /**
     * Ruft den Wert der repairCostType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getRepairCostType() {
        return repairCostType;
    }

    /**
     * Legt den Wert der repairCostType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setRepairCostType(FieldString value) {
        this.repairCostType = value;
    }

    /**
     * Ruft den Wert der salesPreparationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDate }
     *     
     */
    public FieldDate getSalesPreparationDate() {
        return salesPreparationDate;
    }

    /**
     * Legt den Wert der salesPreparationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDate }
     *     
     */
    public void setSalesPreparationDate(FieldDate value) {
        this.salesPreparationDate = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setLocation(FieldString value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der ownType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getOwnType() {
        return ownType;
    }

    /**
     * Legt den Wert der ownType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setOwnType(FieldString value) {
        this.ownType = value;
    }

    /**
     * Ruft den Wert der actualRepairCostList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlanData.ActualRepairCostList }
     *     
     */
    public PlanData.ActualRepairCostList getActualRepairCostList() {
        return actualRepairCostList;
    }

    /**
     * Legt den Wert der actualRepairCostList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanData.ActualRepairCostList }
     *     
     */
    public void setActualRepairCostList(PlanData.ActualRepairCostList value) {
        this.actualRepairCostList = value;
    }


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
     *         &lt;element ref="{http://www.dat.de/vxs}ActualRepairCost" maxOccurs="unbounded" minOccurs="0"/>
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
        "actualRepairCost"
    })
    public static class ActualRepairCostList {

        @XmlElement(name = "ActualRepairCost")
        protected List<ActualRepairCost> actualRepairCost;

        /**
         * Gets the value of the actualRepairCost property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actualRepairCost property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActualRepairCost().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActualRepairCost }
         * 
         * 
         */
        public List<ActualRepairCost> getActualRepairCost() {
            if (actualRepairCost == null) {
                actualRepairCost = new ArrayList<ActualRepairCost>();
            }
            return this.actualRepairCost;
        }

    }

}
