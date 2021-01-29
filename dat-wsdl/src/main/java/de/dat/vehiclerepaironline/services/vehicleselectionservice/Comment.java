
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

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
 *         &lt;element name="CommentType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Text" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="comment1" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="comment2" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="kz" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0"/>
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
@XmlRootElement(name = "Comment")
public class Comment {

    @XmlElement(name = "CommentType")
    protected FieldString commentType;
    @XmlElement(name = "Description")
    protected FieldString description;
    @XmlElement(name = "Text")
    protected FieldString text;
    @XmlElement(namespace = "")
    protected FieldString comment1;
    @XmlElement(namespace = "")
    protected FieldString comment2;
    @XmlElement(namespace = "")
    protected FieldInteger kz;

    /**
     * Ruft den Wert der commentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getCommentType() {
        return commentType;
    }

    /**
     * Legt den Wert der commentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setCommentType(FieldString value) {
        this.commentType = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setDescription(FieldString value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setText(FieldString value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der comment1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getComment1() {
        return comment1;
    }

    /**
     * Legt den Wert der comment1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setComment1(FieldString value) {
        this.comment1 = value;
    }

    /**
     * Ruft den Wert der comment2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getComment2() {
        return comment2;
    }

    /**
     * Legt den Wert der comment2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setComment2(FieldString value) {
        this.comment2 = value;
    }

    /**
     * Ruft den Wert der kz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getKz() {
        return kz;
    }

    /**
     * Legt den Wert der kz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setKz(FieldInteger value) {
        this.kz = value;
    }

}
