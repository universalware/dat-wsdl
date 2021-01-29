
package de.dat.myclaim.soap.valuationservice;

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
 *         &lt;element ref="{http://www.dat.de/vxs}MarketplacePreparation" minOccurs="0"/>
 *         &lt;element name="SalesOfferList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.dat.de/vxs}SalesOffer" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "TradingAdditional")
public class TradingAdditional {

    @XmlElement(name = "MarketplacePreparation")
    protected MarketplacePreparation marketplacePreparation;
    @XmlElement(name = "SalesOfferList")
    protected TradingAdditional.SalesOfferList salesOfferList;

    /**
     * Ruft den Wert der marketplacePreparation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MarketplacePreparation }
     *     
     */
    public MarketplacePreparation getMarketplacePreparation() {
        return marketplacePreparation;
    }

    /**
     * Legt den Wert der marketplacePreparation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketplacePreparation }
     *     
     */
    public void setMarketplacePreparation(MarketplacePreparation value) {
        this.marketplacePreparation = value;
    }

    /**
     * Ruft den Wert der salesOfferList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingAdditional.SalesOfferList }
     *     
     */
    public TradingAdditional.SalesOfferList getSalesOfferList() {
        return salesOfferList;
    }

    /**
     * Legt den Wert der salesOfferList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingAdditional.SalesOfferList }
     *     
     */
    public void setSalesOfferList(TradingAdditional.SalesOfferList value) {
        this.salesOfferList = value;
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
     *         &lt;element ref="{http://www.dat.de/vxs}SalesOffer" maxOccurs="unbounded" minOccurs="0"/>
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
        "salesOffer"
    })
    public static class SalesOfferList {

        @XmlElement(name = "SalesOffer")
        protected List<SalesOffer> salesOffer;

        /**
         * Gets the value of the salesOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the salesOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSalesOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SalesOffer }
         * 
         * 
         */
        public List<SalesOffer> getSalesOffer() {
            if (salesOffer == null) {
                salesOffer = new ArrayList<SalesOffer>();
            }
            return this.salesOffer;
        }

    }

}
