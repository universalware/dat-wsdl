
package de.dat.vehiclerepaironline.services.dossier;

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
 *       &lt;sequence>
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
    "valueInfluencingFactors"
})
@XmlRootElement(name = "Parameters")
public class Parameters {

    @XmlElement(name = "ValueInfluencingFactors")
    protected Parameters.ValueInfluencingFactors valueInfluencingFactors;

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
