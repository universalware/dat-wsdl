
package de.dat.vehiclerepaironline.services.vehicleselectionservice;

import java.util.ArrayList;
import java.util.List;
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
 *       &lt;sequence>
 *         &lt;element name="LacquerPosition" type="{http://www.dat.de/vxs}LacquerPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="LacquerWithPrepressPosition" type="{http://www.dat.de/vxs}LacquerPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element ref="{http://www.dat.de/vxs}SpotRepairPositions" minOccurs="0"/>
 *         &lt;element name="OpelGoodwillLacquerPosition" type="{http://www.dat.de/vxs}LacquerPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
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
    "lacquerPosition",
    "lacquerWithPrepressPosition",
    "spotRepairPositions",
    "opelGoodwillLacquerPosition"
})
@XmlRootElement(name = "LacquerPositions")
public class LacquerPositions {

    @XmlElement(name = "LacquerPosition")
    protected List<LacquerPosition> lacquerPosition;
    @XmlElement(name = "LacquerWithPrepressPosition")
    protected List<LacquerPosition> lacquerWithPrepressPosition;
    @XmlElement(name = "SpotRepairPositions")
    protected SpotRepairPositions spotRepairPositions;
    @XmlElement(name = "OpelGoodwillLacquerPosition")
    protected List<LacquerPosition> opelGoodwillLacquerPosition;

    /**
     * Gets the value of the lacquerPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacquerPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacquerPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacquerPosition }
     * 
     * 
     */
    public List<LacquerPosition> getLacquerPosition() {
        if (lacquerPosition == null) {
            lacquerPosition = new ArrayList<LacquerPosition>();
        }
        return this.lacquerPosition;
    }

    /**
     * Gets the value of the lacquerWithPrepressPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacquerWithPrepressPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacquerWithPrepressPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacquerPosition }
     * 
     * 
     */
    public List<LacquerPosition> getLacquerWithPrepressPosition() {
        if (lacquerWithPrepressPosition == null) {
            lacquerWithPrepressPosition = new ArrayList<LacquerPosition>();
        }
        return this.lacquerWithPrepressPosition;
    }

    /**
     * Ruft den Wert der spotRepairPositions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpotRepairPositions }
     *     
     */
    public SpotRepairPositions getSpotRepairPositions() {
        return spotRepairPositions;
    }

    /**
     * Legt den Wert der spotRepairPositions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpotRepairPositions }
     *     
     */
    public void setSpotRepairPositions(SpotRepairPositions value) {
        this.spotRepairPositions = value;
    }

    /**
     * Gets the value of the opelGoodwillLacquerPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opelGoodwillLacquerPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpelGoodwillLacquerPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacquerPosition }
     * 
     * 
     */
    public List<LacquerPosition> getOpelGoodwillLacquerPosition() {
        if (opelGoodwillLacquerPosition == null) {
            opelGoodwillLacquerPosition = new ArrayList<LacquerPosition>();
        }
        return this.opelGoodwillLacquerPosition;
    }

}
