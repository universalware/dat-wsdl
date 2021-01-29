
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für importManualPositions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="importManualPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}DatCategory" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.dat.de/vxs}DatPosition" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "importManualPositions", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "request"
})
public class ImportManualPositions {

    @XmlElement(namespace = "")
    protected ImportManualPositions.Request request;

    /**
     * Ruft den Wert der request-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImportManualPositions.Request }
     *     
     */
    public ImportManualPositions.Request getRequest() {
        return request;
    }

    /**
     * Legt den Wert der request-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportManualPositions.Request }
     *     
     */
    public void setRequest(ImportManualPositions.Request value) {
        this.request = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}DatCategory" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.dat.de/vxs}DatPosition" maxOccurs="unbounded" minOccurs="0"/>
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
        "datCategory",
        "datPosition"
    })
    public static class Request {

        @XmlElement(name = "DatCategory")
        protected List<DatCategory> datCategory;
        @XmlElement(name = "DatPosition")
        protected List<DatPosition> datPosition;

        /**
         * Gets the value of the datCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatCategory }
         * 
         * 
         */
        public List<DatCategory> getDatCategory() {
            if (datCategory == null) {
                datCategory = new ArrayList<DatCategory>();
            }
            return this.datCategory;
        }

        /**
         * Gets the value of the datPosition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datPosition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatPosition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatPosition }
         * 
         * 
         */
        public List<DatPosition> getDatPosition() {
            if (datPosition == null) {
                datPosition = new ArrayList<DatPosition>();
            }
            return this.datPosition;
        }

    }

}
