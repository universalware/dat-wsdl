
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für listTemplatesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listTemplatesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportProduct" type="{http://sphinx.dat.de/services/VehicleRepairService}ExportProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listTemplatesResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "exportProduct"
})
public class ListTemplatesResponse {

    @XmlElement(name = "ExportProduct", namespace = "")
    protected List<ExportProduct> exportProduct;

    /**
     * Gets the value of the exportProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportProduct }
     * 
     * 
     */
    public List<ExportProduct> getExportProduct() {
        if (exportProduct == null) {
            exportProduct = new ArrayList<ExportProduct>();
        }
        return this.exportProduct;
    }

}
