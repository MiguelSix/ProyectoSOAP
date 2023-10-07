//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.07 a las 10:45:58 AM CST 
//


package com.itq.auctionService.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auctionID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="clientID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="providerID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="auctionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="initialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="finalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auctionID",
    "clientID",
    "providerID",
    "productID",
    "auctionDate",
    "initialPrice",
    "finalPrice",
    "status"
})
@XmlRootElement(name = "auction")
public class Auction {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String auctionID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String clientID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String providerID;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String productID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar auctionDate;
    @XmlElement(required = true)
    protected BigDecimal initialPrice;
    @XmlElement(required = true)
    protected BigDecimal finalPrice;
    protected boolean status;

    /**
     * Obtiene el valor de la propiedad auctionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuctionID() {
        return auctionID;
    }

    /**
     * Define el valor de la propiedad auctionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuctionID(String value) {
        this.auctionID = value;
    }

    /**
     * Obtiene el valor de la propiedad clientID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Define el valor de la propiedad clientID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientID(String value) {
        this.clientID = value;
    }

    /**
     * Obtiene el valor de la propiedad providerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Define el valor de la propiedad providerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Obtiene el valor de la propiedad productID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Define el valor de la propiedad productID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Obtiene el valor de la propiedad auctionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuctionDate() {
        return auctionDate;
    }

    /**
     * Define el valor de la propiedad auctionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuctionDate(XMLGregorianCalendar value) {
        this.auctionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad initialPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    /**
     * Define el valor de la propiedad initialPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInitialPrice(BigDecimal value) {
        this.initialPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad finalPrice.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    /**
     * Define el valor de la propiedad finalPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinalPrice(BigDecimal value) {
        this.finalPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}
