
package de.dat.myclaim.soap.myclaimexternalservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getPossibleNetworkStatusesResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getPossibleNetworkStatusesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PossibleNetworkStatuses" type="{http://www.dat.eu/myClaim/soap/MyClaimExternalService}contractStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPossibleNetworkStatusesResponse", namespace = "http://www.dat.eu/myClaim/soap/MyClaimExternalService", propOrder = {
    "possibleNetworkStatuses"
})
public class GetPossibleNetworkStatusesResponse {

    @XmlElement(name = "PossibleNetworkStatuses", namespace = "")
    protected List<ContractStatus> possibleNetworkStatuses;

    /**
     * Gets the value of the possibleNetworkStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleNetworkStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleNetworkStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractStatus }
     * 
     * 
     */
    public List<ContractStatus> getPossibleNetworkStatuses() {
        if (possibleNetworkStatuses == null) {
            possibleNetworkStatuses = new ArrayList<ContractStatus>();
        }
        return this.possibleNetworkStatuses;
    }

}
