
package de.dat.myclaim.soap.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getMaintenanceIntervalsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getMaintenanceIntervalsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maintenance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}Dossier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "getMaintenanceIntervalsResponse", namespace = "http://www.dat.eu/myClaim/soap/v2/VehicleRepairService", propOrder = {
    "maintenance"
})
public class GetMaintenanceIntervalsResponse {

    @XmlElement(namespace = "")
    protected GetMaintenanceIntervalsResponse.Maintenance maintenance;

    /**
     * Ruft den Wert der maintenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GetMaintenanceIntervalsResponse.Maintenance }
     *     
     */
    public GetMaintenanceIntervalsResponse.Maintenance getMaintenance() {
        return maintenance;
    }

    /**
     * Legt den Wert der maintenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMaintenanceIntervalsResponse.Maintenance }
     *     
     */
    public void setMaintenance(GetMaintenanceIntervalsResponse.Maintenance value) {
        this.maintenance = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}Dossier" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dossier"
    })
    public static class Maintenance {

        @XmlElement(name = "Dossier")
        protected List<Dossier> dossier;
        @XmlAttribute(name = "source")
        protected String source;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the dossier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dossier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDossier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dossier }
         * 
         * 
         */
        public List<Dossier> getDossier() {
            if (dossier == null) {
                dossier = new ArrayList<Dossier>();
            }
            return this.dossier;
        }

        /**
         * Ruft den Wert der source-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Legt den Wert der source-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
