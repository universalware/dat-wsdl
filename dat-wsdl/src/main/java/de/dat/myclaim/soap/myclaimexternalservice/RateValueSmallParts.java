
package de.dat.myclaim.soap.myclaimexternalservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rateValueSmallParts complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rateValueSmallParts">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd>rateValueDouble">
 *       &lt;attribute name="baseValue" type="{http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd}smallPartsBase" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateValueSmallParts", namespace = "http://myclaim.dat.eu/schema/v1.0/DATrepdb.xsd")
public class RateValueSmallParts
    extends RateValueDouble
{

    @XmlAttribute(name = "baseValue")
    protected SmallPartsBase baseValue;

    /**
     * Ruft den Wert der baseValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallPartsBase }
     *     
     */
    public SmallPartsBase getBaseValue() {
        return baseValue;
    }

    /**
     * Legt den Wert der baseValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallPartsBase }
     *     
     */
    public void setBaseValue(SmallPartsBase value) {
        this.baseValue = value;
    }

}
