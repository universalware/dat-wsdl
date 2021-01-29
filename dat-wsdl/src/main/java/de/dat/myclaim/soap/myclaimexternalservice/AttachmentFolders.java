
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für attachmentFolders complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="attachmentFolders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentFolder" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}attachmentFolder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachmentFolders", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "attachmentFolder"
})
public class AttachmentFolders {

    @XmlElement(namespace = "", nillable = true)
    protected List<AttachmentFolder> attachmentFolder;

    /**
     * Gets the value of the attachmentFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentFolder }
     * 
     * 
     */
    public List<AttachmentFolder> getAttachmentFolder() {
        if (attachmentFolder == null) {
            attachmentFolder = new ArrayList<AttachmentFolder>();
        }
        return this.attachmentFolder;
    }

}
