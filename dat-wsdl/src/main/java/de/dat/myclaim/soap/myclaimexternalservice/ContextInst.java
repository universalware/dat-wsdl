
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für contextInst complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="contextInst">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forApplication" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="productVariant" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}productVariant" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forCountry" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="isoCountryCode" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}dataCountry" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forNetwork" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="network" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forFleet" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forVehicle" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="brand" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="mainType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="subType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forVehicleAge" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fromInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="toInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forInsurance" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forInsuranceType" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="type" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}insuranceType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forContractingAuthority" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="inverse" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contextInst", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "forApplication",
    "forCountry",
    "forNetwork",
    "forFleet",
    "forVehicle",
    "forVehicleAge",
    "forInsurance",
    "forInsuranceType",
    "forContractingAuthority"
})
@XmlSeeAlso({
    ContextDef.class
})
public class ContextInst {

    protected List<ContextInst.ForApplication> forApplication;
    protected List<ContextInst.ForCountry> forCountry;
    protected List<ContextInst.ForNetwork> forNetwork;
    protected List<ContextInst.ForFleet> forFleet;
    protected List<ContextInst.ForVehicle> forVehicle;
    protected List<ContextInst.ForVehicleAge> forVehicleAge;
    protected List<ContextInst.ForInsurance> forInsurance;
    protected List<ContextInst.ForInsuranceType> forInsuranceType;
    protected List<ContextInst.ForContractingAuthority> forContractingAuthority;
    @XmlAttribute(name = "inverse")
    protected Boolean inverse;

    /**
     * Gets the value of the forApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForApplication }
     * 
     * 
     */
    public List<ContextInst.ForApplication> getForApplication() {
        if (forApplication == null) {
            forApplication = new ArrayList<ContextInst.ForApplication>();
        }
        return this.forApplication;
    }

    /**
     * Gets the value of the forCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForCountry }
     * 
     * 
     */
    public List<ContextInst.ForCountry> getForCountry() {
        if (forCountry == null) {
            forCountry = new ArrayList<ContextInst.ForCountry>();
        }
        return this.forCountry;
    }

    /**
     * Gets the value of the forNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForNetwork }
     * 
     * 
     */
    public List<ContextInst.ForNetwork> getForNetwork() {
        if (forNetwork == null) {
            forNetwork = new ArrayList<ContextInst.ForNetwork>();
        }
        return this.forNetwork;
    }

    /**
     * Gets the value of the forFleet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forFleet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForFleet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForFleet }
     * 
     * 
     */
    public List<ContextInst.ForFleet> getForFleet() {
        if (forFleet == null) {
            forFleet = new ArrayList<ContextInst.ForFleet>();
        }
        return this.forFleet;
    }

    /**
     * Gets the value of the forVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForVehicle }
     * 
     * 
     */
    public List<ContextInst.ForVehicle> getForVehicle() {
        if (forVehicle == null) {
            forVehicle = new ArrayList<ContextInst.ForVehicle>();
        }
        return this.forVehicle;
    }

    /**
     * Gets the value of the forVehicleAge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forVehicleAge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehicleAge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForVehicleAge }
     * 
     * 
     */
    public List<ContextInst.ForVehicleAge> getForVehicleAge() {
        if (forVehicleAge == null) {
            forVehicleAge = new ArrayList<ContextInst.ForVehicleAge>();
        }
        return this.forVehicleAge;
    }

    /**
     * Gets the value of the forInsurance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forInsurance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForInsurance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForInsurance }
     * 
     * 
     */
    public List<ContextInst.ForInsurance> getForInsurance() {
        if (forInsurance == null) {
            forInsurance = new ArrayList<ContextInst.ForInsurance>();
        }
        return this.forInsurance;
    }

    /**
     * Gets the value of the forInsuranceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forInsuranceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForInsuranceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForInsuranceType }
     * 
     * 
     */
    public List<ContextInst.ForInsuranceType> getForInsuranceType() {
        if (forInsuranceType == null) {
            forInsuranceType = new ArrayList<ContextInst.ForInsuranceType>();
        }
        return this.forInsuranceType;
    }

    /**
     * Gets the value of the forContractingAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forContractingAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForContractingAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextInst.ForContractingAuthority }
     * 
     * 
     */
    public List<ContextInst.ForContractingAuthority> getForContractingAuthority() {
        if (forContractingAuthority == null) {
            forContractingAuthority = new ArrayList<ContextInst.ForContractingAuthority>();
        }
        return this.forContractingAuthority;
    }

    /**
     * Ruft den Wert der inverse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInverse() {
        return inverse;
    }

    /**
     * Legt den Wert der inverse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverse(Boolean value) {
        this.inverse = value;
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
     *       &lt;attribute name="productVariant" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}productVariant" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForApplication {

        @XmlAttribute(name = "productVariant", required = true)
        protected ProductVariant productVariant;

        /**
         * Ruft den Wert der productVariant-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link ProductVariant }
         *     
         */
        public ProductVariant getProductVariant() {
            return productVariant;
        }

        /**
         * Legt den Wert der productVariant-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductVariant }
         *     
         */
        public void setProductVariant(ProductVariant value) {
            this.productVariant = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForContractingAuthority {

        @XmlAttribute(name = "name", required = true)
        protected String name;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="isoCountryCode" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}dataCountry" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForCountry {

        @XmlAttribute(name = "isoCountryCode", required = true)
        protected DataCountry isoCountryCode;

        /**
         * Ruft den Wert der isoCountryCode-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DataCountry }
         *     
         */
        public DataCountry getIsoCountryCode() {
            return isoCountryCode;
        }

        /**
         * Legt den Wert der isoCountryCode-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DataCountry }
         *     
         */
        public void setIsoCountryCode(DataCountry value) {
            this.isoCountryCode = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForFleet {

        @XmlAttribute(name = "id")
        protected String id;

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
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForInsurance {

        @XmlAttribute(name = "id", required = true)
        protected long id;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         */
        public long getId() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         */
        public void setId(long value) {
            this.id = value;
        }

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}insuranceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForInsuranceType {

        @XmlAttribute(name = "type", required = true)
        protected InsuranceType type;

        /**
         * Ruft den Wert der type-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceType }
         *     
         */
        public InsuranceType getType() {
            return type;
        }

        /**
         * Legt den Wert der type-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceType }
         *     
         */
        public void setType(InsuranceType value) {
            this.type = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="network" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForNetwork {

        @XmlAttribute(name = "network", required = true)
        protected String network;

        /**
         * Ruft den Wert der network-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNetwork() {
            return network;
        }

        /**
         * Legt den Wert der network-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNetwork(String value) {
            this.network = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="brand" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="mainType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="subType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForVehicle {

        @XmlAttribute(name = "vehicleType")
        protected String vehicleType;
        @XmlAttribute(name = "brand", required = true)
        protected String brand;
        @XmlAttribute(name = "mainType")
        protected String mainType;
        @XmlAttribute(name = "subType")
        protected String subType;

        /**
         * Ruft den Wert der vehicleType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVehicleType() {
            return vehicleType;
        }

        /**
         * Legt den Wert der vehicleType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVehicleType(String value) {
            this.vehicleType = value;
        }

        /**
         * Ruft den Wert der brand-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBrand() {
            return brand;
        }

        /**
         * Legt den Wert der brand-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * Ruft den Wert der mainType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainType() {
            return mainType;
        }

        /**
         * Legt den Wert der mainType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMainType(String value) {
            this.mainType = value;
        }

        /**
         * Ruft den Wert der subType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubType() {
            return subType;
        }

        /**
         * Legt den Wert der subType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubType(String value) {
            this.subType = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="from" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fromInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="to" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="toInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForVehicleAge {

        @XmlAttribute(name = "from")
        protected String from;
        @XmlAttribute(name = "fromInclusive")
        protected Boolean fromInclusive;
        @XmlAttribute(name = "to")
        protected String to;
        @XmlAttribute(name = "toInclusive")
        protected Boolean toInclusive;

        /**
         * Ruft den Wert der from-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrom() {
            return from;
        }

        /**
         * Legt den Wert der from-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrom(String value) {
            this.from = value;
        }

        /**
         * Ruft den Wert der fromInclusive-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFromInclusive() {
            return fromInclusive;
        }

        /**
         * Legt den Wert der fromInclusive-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFromInclusive(Boolean value) {
            this.fromInclusive = value;
        }

        /**
         * Ruft den Wert der to-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * Legt den Wert der to-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * Ruft den Wert der toInclusive-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isToInclusive() {
            return toInclusive;
        }

        /**
         * Legt den Wert der toInclusive-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setToInclusive(Boolean value) {
            this.toInclusive = value;
        }

    }

}
