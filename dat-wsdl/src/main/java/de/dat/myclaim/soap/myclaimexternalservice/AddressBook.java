
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addressBook complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="addressBook">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPerson" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}PossibleContactPersons" minOccurs="0"/>
 *         &lt;element name="contactPersonVehicles" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}contactPersonVehicle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressBook", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "contactPerson",
    "contactPersonVehicles"
})
public class AddressBook {

    @XmlElement(namespace = "")
    protected PossibleContactPersons contactPerson;
    @XmlElement(namespace = "", nillable = true)
    protected List<ContactPersonVehicle> contactPersonVehicles;

    /**
     * Ruft den Wert der contactPerson-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PossibleContactPersons }
     *     
     */
    public PossibleContactPersons getContactPerson() {
        return contactPerson;
    }

    /**
     * Legt den Wert der contactPerson-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleContactPersons }
     *     
     */
    public void setContactPerson(PossibleContactPersons value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactPersonVehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonVehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonVehicle }
     * 
     * 
     */
    public List<ContactPersonVehicle> getContactPersonVehicles() {
        if (contactPersonVehicles == null) {
            contactPersonVehicles = new ArrayList<ContactPersonVehicle>();
        }
        return this.contactPersonVehicles;
    }

}
