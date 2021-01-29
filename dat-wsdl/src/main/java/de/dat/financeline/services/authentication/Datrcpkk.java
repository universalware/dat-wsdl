
package de.dat.financeline.services.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für datrcpkk complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datrcpkk">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Authentication}baseBusinessObject">
 *       &lt;sequence>
 *         &lt;element name="agericht" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anrede" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anredeDru" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cpkkLnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defaultAddress" type="{http://sphinx.dat.de/services/Authentication}datrcpan" minOccurs="0"/>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geburt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gfuehrer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameGeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameKurz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ortGeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telGesch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telMobil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telPrivat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vorname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datrcpkk", propOrder = {
    "agericht",
    "anrede",
    "anredeDru",
    "cpkkLnr",
    "defaultAddress",
    "eMail",
    "firma",
    "geburt",
    "gfuehrer",
    "lnr",
    "name",
    "name1",
    "name2",
    "name3",
    "nameGeb",
    "nameKurz",
    "nameLang",
    "ortGeb",
    "telFax",
    "telGesch",
    "telMobil",
    "telPrivat",
    "typ",
    "vorname"
})
public class Datrcpkk
    extends BaseBusinessObject
{

    protected String agericht;
    protected String anrede;
    protected String anredeDru;
    protected Long cpkkLnr;
    protected Datrcpan defaultAddress;
    @XmlElement(name = "EMail")
    protected String eMail;
    protected String firma;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar geburt;
    protected String gfuehrer;
    protected Long lnr;
    protected String name;
    protected String name1;
    protected String name2;
    protected String name3;
    protected String nameGeb;
    protected String nameKurz;
    protected String nameLang;
    protected String ortGeb;
    protected String telFax;
    protected String telGesch;
    protected String telMobil;
    protected String telPrivat;
    protected int typ;
    protected String vorname;

    /**
     * Ruft den Wert der agericht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgericht() {
        return agericht;
    }

    /**
     * Legt den Wert der agericht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgericht(String value) {
        this.agericht = value;
    }

    /**
     * Ruft den Wert der anrede-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Legt den Wert der anrede-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnrede(String value) {
        this.anrede = value;
    }

    /**
     * Ruft den Wert der anredeDru-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnredeDru() {
        return anredeDru;
    }

    /**
     * Legt den Wert der anredeDru-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnredeDru(String value) {
        this.anredeDru = value;
    }

    /**
     * Ruft den Wert der cpkkLnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpkkLnr() {
        return cpkkLnr;
    }

    /**
     * Legt den Wert der cpkkLnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpkkLnr(Long value) {
        this.cpkkLnr = value;
    }

    /**
     * Ruft den Wert der defaultAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Datrcpan }
     *     
     */
    public Datrcpan getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * Legt den Wert der defaultAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Datrcpan }
     *     
     */
    public void setDefaultAddress(Datrcpan value) {
        this.defaultAddress = value;
    }

    /**
     * Ruft den Wert der eMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Legt den Wert der eMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Ruft den Wert der firma-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Legt den Wert der firma-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

    /**
     * Ruft den Wert der geburt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeburt() {
        return geburt;
    }

    /**
     * Legt den Wert der geburt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeburt(XMLGregorianCalendar value) {
        this.geburt = value;
    }

    /**
     * Ruft den Wert der gfuehrer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGfuehrer() {
        return gfuehrer;
    }

    /**
     * Legt den Wert der gfuehrer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGfuehrer(String value) {
        this.gfuehrer = value;
    }

    /**
     * Ruft den Wert der lnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLnr() {
        return lnr;
    }

    /**
     * Legt den Wert der lnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLnr(Long value) {
        this.lnr = value;
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
     * Ruft den Wert der name1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Legt den Wert der name1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Ruft den Wert der name2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Legt den Wert der name2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Ruft den Wert der name3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Legt den Wert der name3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
    }

    /**
     * Ruft den Wert der nameGeb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameGeb() {
        return nameGeb;
    }

    /**
     * Legt den Wert der nameGeb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameGeb(String value) {
        this.nameGeb = value;
    }

    /**
     * Ruft den Wert der nameKurz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKurz() {
        return nameKurz;
    }

    /**
     * Legt den Wert der nameKurz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKurz(String value) {
        this.nameKurz = value;
    }

    /**
     * Ruft den Wert der nameLang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLang() {
        return nameLang;
    }

    /**
     * Legt den Wert der nameLang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLang(String value) {
        this.nameLang = value;
    }

    /**
     * Ruft den Wert der ortGeb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrtGeb() {
        return ortGeb;
    }

    /**
     * Legt den Wert der ortGeb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrtGeb(String value) {
        this.ortGeb = value;
    }

    /**
     * Ruft den Wert der telFax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelFax() {
        return telFax;
    }

    /**
     * Legt den Wert der telFax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelFax(String value) {
        this.telFax = value;
    }

    /**
     * Ruft den Wert der telGesch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelGesch() {
        return telGesch;
    }

    /**
     * Legt den Wert der telGesch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelGesch(String value) {
        this.telGesch = value;
    }

    /**
     * Ruft den Wert der telMobil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelMobil() {
        return telMobil;
    }

    /**
     * Legt den Wert der telMobil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelMobil(String value) {
        this.telMobil = value;
    }

    /**
     * Ruft den Wert der telPrivat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelPrivat() {
        return telPrivat;
    }

    /**
     * Legt den Wert der telPrivat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelPrivat(String value) {
        this.telPrivat = value;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     */
    public int getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     */
    public void setTyp(int value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der vorname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Wert der vorname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVorname(String value) {
        this.vorname = value;
    }

}
