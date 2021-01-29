
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für partnerInst complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="partnerInst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="companyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="surname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="street" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="streetNr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="zip" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="city" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rateList" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                     &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetRef" form="qualified"/>
 *                     &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetInst" form="qualified"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="datAccount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="kind" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}addressKind" />
 *       &lt;attribute name="favoritePosition" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partnerInst", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "address",
    "rateList"
})
public class PartnerInst {

    protected PartnerInst.Address address;
    protected PartnerInst.RateList rateList;
    @XmlAttribute(name = "datAccount")
    protected String datAccount;
    @XmlAttribute(name = "kind", required = true)
    protected AddressKind kind;
    @XmlAttribute(name = "favoritePosition")
    protected Integer favoritePosition;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInst.Address }
     *     
     */
    public PartnerInst.Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInst.Address }
     *     
     */
    public void setAddress(PartnerInst.Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der rateList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartnerInst.RateList }
     *     
     */
    public PartnerInst.RateList getRateList() {
        return rateList;
    }

    /**
     * Legt den Wert der rateList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerInst.RateList }
     *     
     */
    public void setRateList(PartnerInst.RateList value) {
        this.rateList = value;
    }

    /**
     * Ruft den Wert der datAccount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatAccount() {
        return datAccount;
    }

    /**
     * Legt den Wert der datAccount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatAccount(String value) {
        this.datAccount = value;
    }

    /**
     * Ruft den Wert der kind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AddressKind }
     *     
     */
    public AddressKind getKind() {
        return kind;
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressKind }
     *     
     */
    public void setKind(AddressKind value) {
        this.kind = value;
    }

    /**
     * Ruft den Wert der favoritePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoritePosition() {
        return favoritePosition;
    }

    /**
     * Legt den Wert der favoritePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoritePosition(Integer value) {
        this.favoritePosition = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="companyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="surname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="street" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="streetNr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="zip" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="city" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="phone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="email" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Address {

        @XmlAttribute(name = "companyName", required = true)
        protected String companyName;
        @XmlAttribute(name = "firstName")
        protected String firstName;
        @XmlAttribute(name = "surname")
        protected String surname;
        @XmlAttribute(name = "street", required = true)
        protected String street;
        @XmlAttribute(name = "streetNr")
        protected String streetNr;
        @XmlAttribute(name = "zip", required = true)
        protected String zip;
        @XmlAttribute(name = "city", required = true)
        protected String city;
        @XmlAttribute(name = "phone", required = true)
        protected String phone;
        @XmlAttribute(name = "fax")
        protected String fax;
        @XmlAttribute(name = "email")
        protected String email;

        /**
         * Ruft den Wert der companyName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Legt den Wert der companyName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Ruft den Wert der firstName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Legt den Wert der firstName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Ruft den Wert der surname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurname() {
            return surname;
        }

        /**
         * Legt den Wert der surname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurname(String value) {
            this.surname = value;
        }

        /**
         * Ruft den Wert der street-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreet() {
            return street;
        }

        /**
         * Legt den Wert der street-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreet(String value) {
            this.street = value;
        }

        /**
         * Ruft den Wert der streetNr-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStreetNr() {
            return streetNr;
        }

        /**
         * Legt den Wert der streetNr-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStreetNr(String value) {
            this.streetNr = value;
        }

        /**
         * Ruft den Wert der zip-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZip() {
            return zip;
        }

        /**
         * Legt den Wert der zip-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZip(String value) {
            this.zip = value;
        }

        /**
         * Ruft den Wert der city-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Legt den Wert der city-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Ruft den Wert der phone-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Legt den Wert der phone-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Ruft den Wert der fax-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFax() {
            return fax;
        }

        /**
         * Legt den Wert der fax-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFax(String value) {
            this.fax = value;
        }

        /**
         * Ruft den Wert der email-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Legt den Wert der email-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
     *         &lt;choice maxOccurs="unbounded" minOccurs="0">
     *           &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetRef" form="qualified"/>
     *           &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetInst" form="qualified"/>
     *         &lt;/choice>
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
        "refOrRateSet"
    })
    public static class RateList {

        @XmlElements({
            @XmlElement(name = "ref", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", type = RateSetRef.class),
            @XmlElement(name = "rateSet", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", type = RateSetInst.class)
        })
        protected List<Object> refOrRateSet;

        /**
         * Gets the value of the refOrRateSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refOrRateSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefOrRateSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateSetRef }
         * {@link RateSetInst }
         * 
         * 
         */
        public List<Object> getRefOrRateSet() {
            if (refOrRateSet == null) {
                refOrRateSet = new ArrayList<Object>();
            }
            return this.refOrRateSet;
        }

    }

}
