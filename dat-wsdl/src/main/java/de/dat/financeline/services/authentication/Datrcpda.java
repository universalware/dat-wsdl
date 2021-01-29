
package de.dat.financeline.services.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für datrcpda complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="datrcpda">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sphinx.dat.de/services/Authentication}baseBusinessObject">
 *       &lt;sequence>
 *         &lt;element name="cpdaLnr" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="defaultDatrcpkk" type="{http://sphinx.dat.de/services/Authentication}datrcpkk" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datrcpda", propOrder = {
    "cpdaLnr",
    "defaultDatrcpkk"
})
@XmlSeeAlso({
    Datrcbkb.class
})
public class Datrcpda
    extends BaseBusinessObject
{

    protected Long cpdaLnr;
    protected Datrcpkk defaultDatrcpkk;

    /**
     * Ruft den Wert der cpdaLnr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCpdaLnr() {
        return cpdaLnr;
    }

    /**
     * Legt den Wert der cpdaLnr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCpdaLnr(Long value) {
        this.cpdaLnr = value;
    }

    /**
     * Ruft den Wert der defaultDatrcpkk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Datrcpkk }
     *     
     */
    public Datrcpkk getDefaultDatrcpkk() {
        return defaultDatrcpkk;
    }

    /**
     * Legt den Wert der defaultDatrcpkk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Datrcpkk }
     *     
     */
    public void setDefaultDatrcpkk(Datrcpkk value) {
        this.defaultDatrcpkk = value;
    }

}
