
package de.dat.financeline.services.vehicleselectionservice;

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
 *         &lt;element name="TireRepairType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="TireValuationType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Axles" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}Axle" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "Tires")
public class Tires {

    @XmlElement(name = "TireRepairType")
    protected FieldString tireRepairType;
    @XmlElement(name = "TireValuationType")
    protected FieldString tireValuationType;
    @XmlElement(name = "Axles")
    protected Tires.Axles axles;

    /**
     * Ruft den Wert der tireRepairType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireRepairType() {
        return tireRepairType;
    }

    /**
     * Legt den Wert der tireRepairType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireRepairType(FieldString value) {
        this.tireRepairType = value;
    }

    /**
     * Ruft den Wert der tireValuationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getTireValuationType() {
        return tireValuationType;
    }

    /**
     * Legt den Wert der tireValuationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setTireValuationType(FieldString value) {
        this.tireValuationType = value;
    }

    /**
     * Ruft den Wert der axles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Tires.Axles }
     *     
     */
    public Tires.Axles getAxles() {
        return axles;
    }

    /**
     * Legt den Wert der axles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Tires.Axles }
     *     
     */
    public void setAxles(Tires.Axles value) {
        this.axles = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}Axle" maxOccurs="unbounded" minOccurs="0"/>
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
        "axle"
    })
    public static class Axles {

        @XmlElement(name = "Axle")
        protected List<Axle> axle;

        /**
         * Gets the value of the axle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the axle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAxle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Axle }
         * 
         * 
         */
        public List<Axle> getAxle() {
            if (axle == null) {
                axle = new ArrayList<Axle>();
            }
            return this.axle;
        }

    }

}
