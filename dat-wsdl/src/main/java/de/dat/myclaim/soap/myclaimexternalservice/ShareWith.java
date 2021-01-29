
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für shareWith complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shareWith">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="ref" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareRef" form="qualified"/>
 *           &lt;element name="share" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}shareInst" form="qualified"/>
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
@XmlType(name = "shareWith", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd", propOrder = {
    "refOrShare"
})
public class ShareWith {

    @XmlElements({
        @XmlElement(name = "ref", type = ShareRef.class),
        @XmlElement(name = "share", type = ShareInst.class)
    })
    protected List<Object> refOrShare;

    /**
     * Gets the value of the refOrShare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refOrShare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefOrShare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareRef }
     * {@link ShareInst }
     * 
     * 
     */
    public List<Object> getRefOrShare() {
        if (refOrShare == null) {
            refOrShare = new ArrayList<Object>();
        }
        return this.refOrShare;
    }

}
