
package de.dat.myclaim.soap.myclaimexternalservice;

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
 *         &lt;element name="DaysOnLot" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatDaysOnLot" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="TonnageClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="DatTonnageClass" type="{http://www.dat.de/vxs}fieldString2" minOccurs="0" form="qualified"/>
 *         &lt;element name="ValueInfluencingFactors" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}ValueInfluencingFactor" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "Parameters")
public class Parameters {

    @XmlElement(name = "DaysOnLot")
    protected FieldInteger daysOnLot;
    @XmlElement(name = "DatDaysOnLot")
    protected FieldInteger datDaysOnLot;
    @XmlElement(name = "TonnageClass")
    protected FieldString2 tonnageClass;
    @XmlElement(name = "DatTonnageClass")
    protected FieldString2 datTonnageClass;
    @XmlElement(name = "ValueInfluencingFactors")
    protected Parameters.ValueInfluencingFactors valueInfluencingFactors;

    /**
     * Ruft den Wert der daysOnLot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDaysOnLot() {
        return daysOnLot;
    }

    /**
     * Legt den Wert der daysOnLot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDaysOnLot(FieldInteger value) {
        this.daysOnLot = value;
    }

    /**
     * Ruft den Wert der datDaysOnLot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getDatDaysOnLot() {
        return datDaysOnLot;
    }

    /**
     * Legt den Wert der datDaysOnLot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setDatDaysOnLot(FieldInteger value) {
        this.datDaysOnLot = value;
    }

    /**
     * Ruft den Wert der tonnageClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getTonnageClass() {
        return tonnageClass;
    }

    /**
     * Legt den Wert der tonnageClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setTonnageClass(FieldString2 value) {
        this.tonnageClass = value;
    }

    /**
     * Ruft den Wert der datTonnageClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString2 }
     *     
     */
    public FieldString2 getDatTonnageClass() {
        return datTonnageClass;
    }

    /**
     * Legt den Wert der datTonnageClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString2 }
     *     
     */
    public void setDatTonnageClass(FieldString2 value) {
        this.datTonnageClass = value;
    }

    /**
     * Ruft den Wert der valueInfluencingFactors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Parameters.ValueInfluencingFactors }
     *     
     */
    public Parameters.ValueInfluencingFactors getValueInfluencingFactors() {
        return valueInfluencingFactors;
    }

    /**
     * Legt den Wert der valueInfluencingFactors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters.ValueInfluencingFactors }
     *     
     */
    public void setValueInfluencingFactors(Parameters.ValueInfluencingFactors value) {
        this.valueInfluencingFactors = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}ValueInfluencingFactor" maxOccurs="unbounded" minOccurs="0"/>
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
        "valueInfluencingFactor"
    })
    public static class ValueInfluencingFactors {

        @XmlElement(name = "ValueInfluencingFactor")
        protected List<ValueInfluencingFactor> valueInfluencingFactor;

        /**
         * Gets the value of the valueInfluencingFactor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the valueInfluencingFactor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValueInfluencingFactor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ValueInfluencingFactor }
         * 
         * 
         */
        public List<ValueInfluencingFactor> getValueInfluencingFactor() {
            if (valueInfluencingFactor == null) {
                valueInfluencingFactor = new ArrayList<ValueInfluencingFactor>();
            }
            return this.valueInfluencingFactor;
        }

    }

}
