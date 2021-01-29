
package de.dat.glassrep.services.dmsgetcontracts;

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
 *         &lt;element ref="{http://www.dat.de/vxs}MarketplaceImageList" minOccurs="0"/>
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
    "marketplaceImageList"
})
@XmlRootElement(name = "SalesPreparation")
public class SalesPreparation {

    @XmlElement(name = "MarketplaceImageList")
    protected MarketplaceImageList marketplaceImageList;

    /**
     * Ruft den Wert der marketplaceImageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplaceImageList }
     *     
     */
    public MarketplaceImageList getMarketplaceImageList() {
        return marketplaceImageList;
    }

    /**
     * Legt den Wert der marketplaceImageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplaceImageList }
     *     
     */
    public void setMarketplaceImageList(MarketplaceImageList value) {
        this.marketplaceImageList = value;
    }

}
