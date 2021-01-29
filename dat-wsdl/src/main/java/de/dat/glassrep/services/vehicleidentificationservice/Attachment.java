
package de.dat.glassrep.services.vehicleidentificationservice;

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
 *         &lt;element name="AttachmentType" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="Source" type="{http://www.dat.de/vxs}fieldString" minOccurs="0" form="qualified"/>
 *         &lt;element name="suffix" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="filename" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="filenameShort" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="b64Data" type="{http://www.dat.de/vxs}fieldString" minOccurs="0"/>
 *         &lt;element name="FileDate" type="{http://www.dat.de/vxs}fieldDateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="Name" type="{http://www.dat.de/vxs}fieldString20" minOccurs="0" form="qualified"/>
 *         &lt;element name="Number" type="{http://www.dat.de/vxs}fieldInteger" minOccurs="0" form="qualified"/>
 *         &lt;element name="Thumbnail" type="{http://www.dat.de/vxs}fieldBinary" minOccurs="0" form="qualified"/>
 *         &lt;element name="Usage" type="{http://www.dat.de/vxs}fieldString5" minOccurs="0" form="qualified"/>
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
@XmlRootElement(name = "Attachment")
public class Attachment {

    @XmlElement(name = "AttachmentType")
    protected FieldString attachmentType;
    @XmlElement(name = "Source")
    protected FieldString source;
    @XmlElement(namespace = "")
    protected FieldString suffix;
    @XmlElement(namespace = "")
    protected FieldString version;
    @XmlElement(namespace = "")
    protected FieldString filename;
    @XmlElement(namespace = "")
    protected FieldString filenameShort;
    @XmlElement(namespace = "")
    protected FieldInteger offset;
    @XmlElement(namespace = "")
    protected FieldInteger length;
    @XmlElement(namespace = "")
    protected FieldString description;
    @XmlElement(namespace = "")
    protected FieldString b64Data;
    @XmlElement(name = "FileDate")
    protected FieldDateTime fileDate;
    @XmlElement(name = "Name")
    protected FieldString20 name;
    @XmlElement(name = "Number")
    protected FieldInteger number;
    @XmlElement(name = "Thumbnail")
    protected FieldBinary thumbnail;
    @XmlElement(name = "Usage")
    protected FieldString5 usage;

    /**
     * Ruft den Wert der attachmentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getAttachmentType() {
        return attachmentType;
    }

    /**
     * Legt den Wert der attachmentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setAttachmentType(FieldString value) {
        this.attachmentType = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSource(FieldString value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der suffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getSuffix() {
        return suffix;
    }

    /**
     * Legt den Wert der suffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setSuffix(FieldString value) {
        this.suffix = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setVersion(FieldString value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der filename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFilename() {
        return filename;
    }

    /**
     * Legt den Wert der filename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFilename(FieldString value) {
        this.filename = value;
    }

    /**
     * Ruft den Wert der filenameShort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getFilenameShort() {
        return filenameShort;
    }

    /**
     * Legt den Wert der filenameShort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setFilenameShort(FieldString value) {
        this.filenameShort = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setOffset(FieldInteger value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setLength(FieldInteger value) {
        this.length = value;
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
     * Ruft den Wert der b64Data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString }
     *     
     */
    public FieldString getB64Data() {
        return b64Data;
    }

    /**
     * Legt den Wert der b64Data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString }
     *     
     */
    public void setB64Data(FieldString value) {
        this.b64Data = value;
    }

    /**
     * Ruft den Wert der fileDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldDateTime }
     *     
     */
    public FieldDateTime getFileDate() {
        return fileDate;
    }

    /**
     * Legt den Wert der fileDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldDateTime }
     *     
     */
    public void setFileDate(FieldDateTime value) {
        this.fileDate = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString20 }
     *     
     */
    public FieldString20 getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString20 }
     *     
     */
    public void setName(FieldString20 value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldInteger }
     *     
     */
    public FieldInteger getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldInteger }
     *     
     */
    public void setNumber(FieldInteger value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der thumbnail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldBinary }
     *     
     */
    public FieldBinary getThumbnail() {
        return thumbnail;
    }

    /**
     * Legt den Wert der thumbnail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldBinary }
     *     
     */
    public void setThumbnail(FieldBinary value) {
        this.thumbnail = value;
    }

    /**
     * Ruft den Wert der usage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldString5 }
     *     
     */
    public FieldString5 getUsage() {
        return usage;
    }

    /**
     * Legt den Wert der usage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldString5 }
     *     
     */
    public void setUsage(FieldString5 value) {
        this.usage = value;
    }

}
