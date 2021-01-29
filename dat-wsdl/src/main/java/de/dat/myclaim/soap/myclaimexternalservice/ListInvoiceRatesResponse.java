
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
 * <p>Java-Klasse für listInvoiceRatesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="listInvoiceRatesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="share" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                   &lt;element name="context" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}contextDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                   &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                   &lt;element name="rateList" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
 *                             &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                               &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetRef" form="qualified"/>
 *                               &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetInst" form="qualified"/>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="partnerList" maxOccurs="unbounded" minOccurs="0" form="qualified">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
 *                             &lt;element name="partner" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}partnerInst" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="shareRatesWithPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "listInvoiceRatesResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "_return"
})
public class ListInvoiceRatesResponse {

    @XmlElement(name = "return", namespace = "")
    protected ListInvoiceRatesResponse.Return _return;

    /**
     * Ruft den Wert der return-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ListInvoiceRatesResponse.Return }
     *     
     */
    public ListInvoiceRatesResponse.Return getReturn() {
        return _return;
    }

    /**
     * Legt den Wert der return-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInvoiceRatesResponse.Return }
     *     
     */
    public void setReturn(ListInvoiceRatesResponse.Return value) {
        this._return = value;
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
     *         &lt;element name="share" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
     *         &lt;element name="context" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}contextDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
     *         &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetDef" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
     *         &lt;element name="rateList" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
     *                   &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                     &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetRef" form="qualified"/>
     *                     &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetInst" form="qualified"/>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="partnerList" maxOccurs="unbounded" minOccurs="0" form="qualified">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
     *                   &lt;element name="partner" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}partnerInst" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="shareRatesWithPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    @XmlType(name = "", propOrder = {
        "share",
        "context",
        "rateSet",
        "rateList",
        "partnerList"
    })
    public static class Return {

        @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
        protected List<ShareDef> share;
        @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
        protected List<ContextDef> context;
        @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
        protected List<RateSetDef> rateSet;
        @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
        protected List<ListInvoiceRatesResponse.Return.RateList> rateList;
        @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
        protected List<ListInvoiceRatesResponse.Return.PartnerList> partnerList;

        /**
         * Gets the value of the share property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the share property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShare().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ShareDef }
         * 
         * 
         */
        public List<ShareDef> getShare() {
            if (share == null) {
                share = new ArrayList<ShareDef>();
            }
            return this.share;
        }

        /**
         * Gets the value of the context property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the context property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContextDef }
         * 
         * 
         */
        public List<ContextDef> getContext() {
            if (context == null) {
                context = new ArrayList<ContextDef>();
            }
            return this.context;
        }

        /**
         * Gets the value of the rateSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateSetDef }
         * 
         * 
         */
        public List<RateSetDef> getRateSet() {
            if (rateSet == null) {
                rateSet = new ArrayList<RateSetDef>();
            }
            return this.rateSet;
        }

        /**
         * Gets the value of the rateList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListInvoiceRatesResponse.Return.RateList }
         * 
         * 
         */
        public List<ListInvoiceRatesResponse.Return.RateList> getRateList() {
            if (rateList == null) {
                rateList = new ArrayList<ListInvoiceRatesResponse.Return.RateList>();
            }
            return this.rateList;
        }

        /**
         * Gets the value of the partnerList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partnerList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartnerList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListInvoiceRatesResponse.Return.PartnerList }
         * 
         * 
         */
        public List<ListInvoiceRatesResponse.Return.PartnerList> getPartnerList() {
            if (partnerList == null) {
                partnerList = new ArrayList<ListInvoiceRatesResponse.Return.PartnerList>();
            }
            return this.partnerList;
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
         *         &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
         *         &lt;element name="partner" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}partnerInst" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="shareRatesWithPartners" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "shareWith",
            "partner"
        })
        public static class PartnerList {

            @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
            protected ShareWith shareWith;
            @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
            protected List<PartnerInst> partner;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "shareRatesWithPartners")
            protected Boolean shareRatesWithPartners;

            /**
             * Ruft den Wert der shareWith-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ShareWith }
             *     
             */
            public ShareWith getShareWith() {
                return shareWith;
            }

            /**
             * Legt den Wert der shareWith-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ShareWith }
             *     
             */
            public void setShareWith(ShareWith value) {
                this.shareWith = value;
            }

            /**
             * Gets the value of the partner property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the partner property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPartner().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PartnerInst }
             * 
             * 
             */
            public List<PartnerInst> getPartner() {
                if (partner == null) {
                    partner = new ArrayList<PartnerInst>();
                }
                return this.partner;
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
             * Ruft den Wert der shareRatesWithPartners-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isShareRatesWithPartners() {
                return shareRatesWithPartners;
            }

            /**
             * Legt den Wert der shareRatesWithPartners-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setShareRatesWithPartners(Boolean value) {
                this.shareRatesWithPartners = value;
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
         *         &lt;element name="shareWith" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareWith" minOccurs="0" form="qualified"/>
         *         &lt;choice maxOccurs="unbounded" minOccurs="0">
         *           &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetRef" form="qualified"/>
         *           &lt;element name="rateSet" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}rateSetInst" form="qualified"/>
         *         &lt;/choice>
         *       &lt;/sequence>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "shareWith",
            "refOrRateSet"
        })
        public static class RateList {

            @XmlElement(namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService")
            protected ShareWith shareWith;
            @XmlElements({
                @XmlElement(name = "ref", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", type = RateSetRef.class),
                @XmlElement(name = "rateSet", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", type = RateSetInst.class)
            })
            protected List<Object> refOrRateSet;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Ruft den Wert der shareWith-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ShareWith }
             *     
             */
            public ShareWith getShareWith() {
                return shareWith;
            }

            /**
             * Legt den Wert der shareWith-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ShareWith }
             *     
             */
            public void setShareWith(ShareWith value) {
                this.shareWith = value;
            }

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

    }

}
