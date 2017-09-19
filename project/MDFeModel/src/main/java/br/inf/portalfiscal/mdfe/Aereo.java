//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 07:33:17 PM BRT 
//


package br.inf.portalfiscal.mdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nac">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="matr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="6"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nVoo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cAerEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cAerDes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dVoo" type="{http://www.portalfiscal.inf.br/mdfe}TData"/>
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
    "nac",
    "matr",
    "nVoo",
    "cAerEmb",
    "cAerDes",
    "dVoo"
})
@XmlRootElement(name = "aereo")
public class Aereo {

    @XmlElement(required = true)
    protected String nac;
    @XmlElement(required = true)
    protected String matr;
    @XmlElement(required = true)
    protected String nVoo;
    @XmlElement(required = true)
    protected String cAerEmb;
    @XmlElement(required = true)
    protected String cAerDes;
    @XmlElement(required = true)
    protected String dVoo;

    /**
     * Gets the value of the nac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNac() {
        return nac;
    }

    /**
     * Sets the value of the nac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNac(String value) {
        this.nac = value;
    }

    /**
     * Gets the value of the matr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatr() {
        return matr;
    }

    /**
     * Sets the value of the matr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatr(String value) {
        this.matr = value;
    }

    /**
     * Gets the value of the nVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVoo() {
        return nVoo;
    }

    /**
     * Sets the value of the nVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVoo(String value) {
        this.nVoo = value;
    }

    /**
     * Gets the value of the cAerEmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAerEmb() {
        return cAerEmb;
    }

    /**
     * Sets the value of the cAerEmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAerEmb(String value) {
        this.cAerEmb = value;
    }

    /**
     * Gets the value of the cAerDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAerDes() {
        return cAerDes;
    }

    /**
     * Sets the value of the cAerDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAerDes(String value) {
        this.cAerDes = value;
    }

    /**
     * Gets the value of the dVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVoo() {
        return dVoo;
    }

    /**
     * Sets the value of the dVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVoo(String value) {
        this.dVoo = value;
    }

}
