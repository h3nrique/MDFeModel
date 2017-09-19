//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.19 at 07:15:56 PM BRT 
//


package br.inf.portalfiscal.mdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig_.SignatureType;
import org.w3c.dom.Element;


/**
 * Tipo Evento
 * 
 * <p>Java class for TEvento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infEvento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/mdfe}TCOrgaoIBGE"/>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/mdfe}TAmb"/>
 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/mdfe}TCnpj"/>
 *                   &lt;element name="chMDFe" type="{http://www.portalfiscal.inf.br/mdfe}TChMDFe"/>
 *                   &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/mdfe}TDateTimeUTC"/>
 *                   &lt;element name="tpEvento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nSeqEvento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="detEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='skip'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="versaoEvento" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerEvento" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="ID[0-9]{52}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerEvento" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEvento", propOrder = {
    "infEvento",
    "signature"
})
public class TEvento {

    @XmlElement(required = true)
    protected TEvento.InfEvento infEvento;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the infEvento property.
     * 
     * @return
     *     possible object is
     *     {@link TEvento.InfEvento }
     *     
     */
    public TEvento.InfEvento getInfEvento() {
        return infEvento;
    }

    /**
     * Sets the value of the infEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEvento.InfEvento }
     *     
     */
    public void setInfEvento(TEvento.InfEvento value) {
        this.infEvento = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


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
     *         &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/mdfe}TCOrgaoIBGE"/>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/mdfe}TAmb"/>
     *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/mdfe}TCnpj"/>
     *         &lt;element name="chMDFe" type="{http://www.portalfiscal.inf.br/mdfe}TChMDFe"/>
     *         &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/mdfe}TDateTimeUTC"/>
     *         &lt;element name="tpEvento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nSeqEvento">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="detEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='skip'/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="versaoEvento" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerEvento" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="ID[0-9]{52}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cOrgao",
        "tpAmb",
        "cnpj",
        "chMDFe",
        "dhEvento",
        "tpEvento",
        "nSeqEvento",
        "detEvento"
    })
    public static class InfEvento {

        @XmlElement(required = true)
        protected String cOrgao;
        @XmlElement(required = true)
        protected String tpAmb;
        @XmlElement(name = "CNPJ", required = true)
        protected String cnpj;
        @XmlElement(required = true)
        protected String chMDFe;
        @XmlElement(required = true)
        protected String dhEvento;
        @XmlElement(required = true)
        protected String tpEvento;
        @XmlElement(required = true)
        protected String nSeqEvento;
        @XmlElement(required = true)
        protected TEvento.InfEvento.DetEvento detEvento;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the cOrgao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOrgao() {
            return cOrgao;
        }

        /**
         * Sets the value of the cOrgao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOrgao(String value) {
            this.cOrgao = value;
        }

        /**
         * Gets the value of the tpAmb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpAmb() {
            return tpAmb;
        }

        /**
         * Sets the value of the tpAmb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpAmb(String value) {
            this.tpAmb = value;
        }

        /**
         * Gets the value of the cnpj property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Sets the value of the cnpj property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Gets the value of the chMDFe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChMDFe() {
            return chMDFe;
        }

        /**
         * Sets the value of the chMDFe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChMDFe(String value) {
            this.chMDFe = value;
        }

        /**
         * Gets the value of the dhEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhEvento() {
            return dhEvento;
        }

        /**
         * Sets the value of the dhEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhEvento(String value) {
            this.dhEvento = value;
        }

        /**
         * Gets the value of the tpEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpEvento() {
            return tpEvento;
        }

        /**
         * Sets the value of the tpEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpEvento(String value) {
            this.tpEvento = value;
        }

        /**
         * Gets the value of the nSeqEvento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSeqEvento() {
            return nSeqEvento;
        }

        /**
         * Sets the value of the nSeqEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSeqEvento(String value) {
            this.nSeqEvento = value;
        }

        /**
         * Gets the value of the detEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TEvento.InfEvento.DetEvento }
         *     
         */
        public TEvento.InfEvento.DetEvento getDetEvento() {
            return detEvento;
        }

        /**
         * Sets the value of the detEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEvento.InfEvento.DetEvento }
         *     
         */
        public void setDetEvento(TEvento.InfEvento.DetEvento value) {
            this.detEvento = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


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
         *         &lt;any processContents='skip'/>
         *       &lt;/sequence>
         *       &lt;attribute name="versaoEvento" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerEvento" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class DetEvento {

            @XmlAnyElement
            protected Element any;
            @XmlAttribute(name = "versaoEvento", required = true)
            protected String versaoEvento;

            /**
             * Gets the value of the any property.
             * 
             * @return
             *     possible object is
             *     {@link Element }
             *     
             */
            public Element getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Gets the value of the versaoEvento property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersaoEvento() {
                return versaoEvento;
            }

            /**
             * Sets the value of the versaoEvento property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVersaoEvento(String value) {
                this.versaoEvento = value;
            }

        }

    }

}
