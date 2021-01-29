
package de.dat.financeline.services.dossier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LabourPositions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabourPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabourPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentPrepressPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentDtCommPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentDtCommSumPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentBvatPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentAXAWinterthurPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentFCRPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentVFFSPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentVaudoisePosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentZurichPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentATPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="DentOWNPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="OpelGoodwillLabourPosition" type="{http://www.dat.de/vxs}LabourPosition" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabourPositions", propOrder = {
    "labourPosition",
    "dentPrepressPosition",
    "dentDtCommPosition",
    "dentDtCommSumPosition",
    "dentBvatPosition",
    "dentAXAWinterthurPosition",
    "dentFCRPosition",
    "dentVFFSPosition",
    "dentVaudoisePosition",
    "dentZurichPosition",
    "dentATPosition",
    "dentOWNPosition",
    "opelGoodwillLabourPosition"
})
public class LabourPositions {

    @XmlElement(name = "LabourPosition")
    protected List<LabourPosition> labourPosition;
    @XmlElement(name = "DentPrepressPosition")
    protected List<LabourPosition> dentPrepressPosition;
    @XmlElement(name = "DentDtCommPosition")
    protected List<LabourPosition> dentDtCommPosition;
    @XmlElement(name = "DentDtCommSumPosition")
    protected List<LabourPosition> dentDtCommSumPosition;
    @XmlElement(name = "DentBvatPosition")
    protected List<LabourPosition> dentBvatPosition;
    @XmlElement(name = "DentAXAWinterthurPosition")
    protected List<LabourPosition> dentAXAWinterthurPosition;
    @XmlElement(name = "DentFCRPosition")
    protected List<LabourPosition> dentFCRPosition;
    @XmlElement(name = "DentVFFSPosition")
    protected List<LabourPosition> dentVFFSPosition;
    @XmlElement(name = "DentVaudoisePosition")
    protected List<LabourPosition> dentVaudoisePosition;
    @XmlElement(name = "DentZurichPosition")
    protected List<LabourPosition> dentZurichPosition;
    @XmlElement(name = "DentATPosition")
    protected List<LabourPosition> dentATPosition;
    @XmlElement(name = "DentOWNPosition")
    protected List<LabourPosition> dentOWNPosition;
    @XmlElement(name = "OpelGoodwillLabourPosition")
    protected List<LabourPosition> opelGoodwillLabourPosition;

    /**
     * Gets the value of the labourPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labourPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabourPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getLabourPosition() {
        if (labourPosition == null) {
            labourPosition = new ArrayList<LabourPosition>();
        }
        return this.labourPosition;
    }

    /**
     * Gets the value of the dentPrepressPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentPrepressPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentPrepressPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentPrepressPosition() {
        if (dentPrepressPosition == null) {
            dentPrepressPosition = new ArrayList<LabourPosition>();
        }
        return this.dentPrepressPosition;
    }

    /**
     * Gets the value of the dentDtCommPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentDtCommPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentDtCommPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentDtCommPosition() {
        if (dentDtCommPosition == null) {
            dentDtCommPosition = new ArrayList<LabourPosition>();
        }
        return this.dentDtCommPosition;
    }

    /**
     * Gets the value of the dentDtCommSumPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentDtCommSumPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentDtCommSumPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentDtCommSumPosition() {
        if (dentDtCommSumPosition == null) {
            dentDtCommSumPosition = new ArrayList<LabourPosition>();
        }
        return this.dentDtCommSumPosition;
    }

    /**
     * Gets the value of the dentBvatPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentBvatPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentBvatPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentBvatPosition() {
        if (dentBvatPosition == null) {
            dentBvatPosition = new ArrayList<LabourPosition>();
        }
        return this.dentBvatPosition;
    }

    /**
     * Gets the value of the dentAXAWinterthurPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentAXAWinterthurPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentAXAWinterthurPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentAXAWinterthurPosition() {
        if (dentAXAWinterthurPosition == null) {
            dentAXAWinterthurPosition = new ArrayList<LabourPosition>();
        }
        return this.dentAXAWinterthurPosition;
    }

    /**
     * Gets the value of the dentFCRPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentFCRPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentFCRPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentFCRPosition() {
        if (dentFCRPosition == null) {
            dentFCRPosition = new ArrayList<LabourPosition>();
        }
        return this.dentFCRPosition;
    }

    /**
     * Gets the value of the dentVFFSPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentVFFSPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentVFFSPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentVFFSPosition() {
        if (dentVFFSPosition == null) {
            dentVFFSPosition = new ArrayList<LabourPosition>();
        }
        return this.dentVFFSPosition;
    }

    /**
     * Gets the value of the dentVaudoisePosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentVaudoisePosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentVaudoisePosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentVaudoisePosition() {
        if (dentVaudoisePosition == null) {
            dentVaudoisePosition = new ArrayList<LabourPosition>();
        }
        return this.dentVaudoisePosition;
    }

    /**
     * Gets the value of the dentZurichPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentZurichPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentZurichPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentZurichPosition() {
        if (dentZurichPosition == null) {
            dentZurichPosition = new ArrayList<LabourPosition>();
        }
        return this.dentZurichPosition;
    }

    /**
     * Gets the value of the dentATPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentATPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentATPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentATPosition() {
        if (dentATPosition == null) {
            dentATPosition = new ArrayList<LabourPosition>();
        }
        return this.dentATPosition;
    }

    /**
     * Gets the value of the dentOWNPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentOWNPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentOWNPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getDentOWNPosition() {
        if (dentOWNPosition == null) {
            dentOWNPosition = new ArrayList<LabourPosition>();
        }
        return this.dentOWNPosition;
    }

    /**
     * Gets the value of the opelGoodwillLabourPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opelGoodwillLabourPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpelGoodwillLabourPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabourPosition }
     * 
     * 
     */
    public List<LabourPosition> getOpelGoodwillLabourPosition() {
        if (opelGoodwillLabourPosition == null) {
            opelGoodwillLabourPosition = new ArrayList<LabourPosition>();
        }
        return this.opelGoodwillLabourPosition;
    }

}
