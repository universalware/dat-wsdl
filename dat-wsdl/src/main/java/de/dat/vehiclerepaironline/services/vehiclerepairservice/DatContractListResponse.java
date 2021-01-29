
package de.dat.vehiclerepaironline.services.vehiclerepairservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für datContractListResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datContractListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countOfContractslsFound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="countOfContractssReturned" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dossiers" minOccurs="0">
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
 *         &lt;element name="dossiersDatProcessInfos" type="{http://sphinx.dat.de/services/VehicleRepairService}dossiersDatProcessInfos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datContractListResponse", namespace = "http://sphinx.dat.de/services/VehicleRepairService", propOrder = {
    "countOfContractslsFound",
    "countOfContractssReturned",
    "dossiers",
    "dossiersDatProcessInfos"
})
public class DatContractListResponse {

    @XmlElementRef(name = "countOfContractslsFound", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countOfContractslsFound;
    @XmlElementRef(name = "countOfContractssReturned", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> countOfContractssReturned;
    @XmlElementRef(name = "dossiers", type = JAXBElement.class, required = false)
    protected JAXBElement<DatContractListResponse.Dossiers> dossiers;
    @XmlElementRef(name = "dossiersDatProcessInfos", type = JAXBElement.class, required = false)
    protected JAXBElement<DossiersDatProcessInfos> dossiersDatProcessInfos;

    /**
     * Ruft den Wert der countOfContractslsFound-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountOfContractslsFound() {
        return countOfContractslsFound;
    }

    /**
     * Legt den Wert der countOfContractslsFound-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountOfContractslsFound(JAXBElement<Integer> value) {
        this.countOfContractslsFound = value;
    }

    /**
     * Ruft den Wert der countOfContractssReturned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCountOfContractssReturned() {
        return countOfContractssReturned;
    }

    /**
     * Legt den Wert der countOfContractssReturned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCountOfContractssReturned(JAXBElement<Integer> value) {
        this.countOfContractssReturned = value;
    }

    /**
     * Ruft den Wert der dossiers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatContractListResponse.Dossiers }{@code >}
     *     
     */
    public JAXBElement<DatContractListResponse.Dossiers> getDossiers() {
        return dossiers;
    }

    /**
     * Legt den Wert der dossiers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatContractListResponse.Dossiers }{@code >}
     *     
     */
    public void setDossiers(JAXBElement<DatContractListResponse.Dossiers> value) {
        this.dossiers = value;
    }

    /**
     * Ruft den Wert der dossiersDatProcessInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DossiersDatProcessInfos }{@code >}
     *     
     */
    public JAXBElement<DossiersDatProcessInfos> getDossiersDatProcessInfos() {
        return dossiersDatProcessInfos;
    }

    /**
     * Legt den Wert der dossiersDatProcessInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DossiersDatProcessInfos }{@code >}
     *     
     */
    public void setDossiersDatProcessInfos(JAXBElement<DossiersDatProcessInfos> value) {
        this.dossiersDatProcessInfos = value;
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
    public static class Dossiers {

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
