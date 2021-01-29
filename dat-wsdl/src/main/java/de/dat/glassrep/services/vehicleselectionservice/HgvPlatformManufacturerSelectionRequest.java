
package de.dat.glassrep.services.vehicleselectionservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für hgvPlatformManufacturerSelectionRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="hgvPlatformManufacturerSelectionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/VehicleSelectionService}basicSelectionRequest">
 *       &lt;sequence>
 *         &lt;element name="hgvPlatformType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hgvPlatformManufacturerSelectionRequest", namespace = "http://sphinx.dat.de/services/VehicleSelectionService", propOrder = {
    "hgvPlatformType"
})
@XmlSeeAlso({
    HgvPlatformBaseModelSelectionRequest.class
})
public class HgvPlatformManufacturerSelectionRequest
    extends BasicSelectionRequest
{

    @XmlElement(namespace = "")
    protected int hgvPlatformType;

    /**
     * Ruft den Wert der hgvPlatformType-Eigenschaft ab.
     * 
     */
    public int getHgvPlatformType() {
        return hgvPlatformType;
    }

    /**
     * Legt den Wert der hgvPlatformType-Eigenschaft fest.
     * 
     */
    public void setHgvPlatformType(int value) {
        this.hgvPlatformType = value;
    }

}
