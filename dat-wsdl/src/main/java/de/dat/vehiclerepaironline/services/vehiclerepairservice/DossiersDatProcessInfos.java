
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dossiersDatProcessInfos complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="dossiersDatProcessInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datProcesInfos" type="{http://sphinx.dat.de/services/VehicleRepairService}dossierDatProcessInfos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dossiersDatProcessInfos", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "datProcesInfos"
})
public class DossiersDatProcessInfos {

    @XmlElement(namespace = "", nillable = true)
    protected List<DossierDatProcessInfos> datProcesInfos;

    /**
     * Gets the value of the datProcesInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datProcesInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatProcesInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierDatProcessInfos }
     * 
     * 
     */
    public List<DossierDatProcessInfos> getDatProcesInfos() {
        if (datProcesInfos == null) {
            datProcesInfos = new ArrayList<DossierDatProcessInfos>();
        }
        return this.datProcesInfos;
    }

}
