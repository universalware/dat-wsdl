
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dossierDatProcessInfos complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dossierDatProcessInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dossierId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dvnInfos" type="{http://sphinx.dat.de/services/VehicleRepairService}datProcessInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dossierDatProcessInfos", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "dossierId",
    "dvnInfos"
})
public class DossierDatProcessInfos {

    @XmlElementRef(name = "dossierId", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dossierId;
    @XmlElement(namespace = "", nillable = true)
    protected List<DatProcessInfo> dvnInfos;

    /**
     * Ruft den Wert der dossierId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDossierId() {
        return dossierId;
    }

    /**
     * Legt den Wert der dossierId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDossierId(JAXBElement<Long> value) {
        this.dossierId = value;
    }

    /**
     * Gets the value of the dvnInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dvnInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDvnInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatProcessInfo }
     * 
     * 
     */
    public List<DatProcessInfo> getDvnInfos() {
        if (dvnInfos == null) {
            dvnInfos = new ArrayList<DatProcessInfo>();
        }
        return this.dvnInfos;
    }

}
