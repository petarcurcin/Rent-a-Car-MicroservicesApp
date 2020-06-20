//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 05:26:20 PM CEST 
//


package com.rent.soap.code;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rentRequestStatus" type="{http://localhost:8095/microservices/rent}rentRequestStatus" minOccurs="0"/&gt;
 *         &lt;element name="cars" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="advertisementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="rated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="commented" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="numberOfUnseen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id",
        "startDateTime",
        "endDateTime",
        "startDateString",
        "endDateString",
        "rentRequestStatus",
        "cars",
        "senderId",
        "advertisementId",
        "rated",
        "commented",
        "numberOfUnseen"
})
@XmlRootElement(name = "physicalRentRequest")
public class PhysicalRentRequest {

    protected Long id;
    protected String startDateTime;
    protected String endDateTime;
    protected String startDateString;
    protected String endDateString;
    @XmlSchemaType(name = "string")
    protected RentRequestStatus rentRequestStatus;
    protected String cars;
    protected Long senderId;
    protected Long advertisementId;
    protected boolean rated;
    protected boolean commented;
    protected Integer numberOfUnseen;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the startDateTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the startDateString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getStartDateString() {
        return startDateString;
    }

    /**
     * Sets the value of the startDateString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStartDateString(String value) {
        this.startDateString = value;
    }

    /**
     * Gets the value of the endDateString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEndDateString() {
        return endDateString;
    }

    /**
     * Sets the value of the endDateString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEndDateString(String value) {
        this.endDateString = value;
    }

    /**
     * Gets the value of the rentRequestStatus property.
     *
     * @return possible object is
     * {@link RentRequestStatus }
     */
    public RentRequestStatus getRentRequestStatus() {
        return rentRequestStatus;
    }

    /**
     * Sets the value of the rentRequestStatus property.
     *
     * @param value allowed object is
     *              {@link RentRequestStatus }
     */
    public void setRentRequestStatus(RentRequestStatus value) {
        this.rentRequestStatus = value;
    }

    /**
     * Gets the value of the cars property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCars() {
        return cars;
    }

    /**
     * Sets the value of the cars property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCars(String value) {
        this.cars = value;
    }

    /**
     * Gets the value of the senderId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setSenderId(Long value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the advertisementId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getAdvertisementId() {
        return advertisementId;
    }

    /**
     * Sets the value of the advertisementId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setAdvertisementId(Long value) {
        this.advertisementId = value;
    }

    /**
     * Gets the value of the rated property.
     */
    public boolean isRated() {
        return rated;
    }

    /**
     * Sets the value of the rated property.
     */
    public void setRated(boolean value) {
        this.rated = value;
    }

    /**
     * Gets the value of the commented property.
     */
    public boolean isCommented() {
        return commented;
    }

    /**
     * Sets the value of the commented property.
     */
    public void setCommented(boolean value) {
        this.commented = value;
    }

    /**
     * Gets the value of the numberOfUnseen property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getNumberOfUnseen() {
        return numberOfUnseen;
    }

    /**
     * Sets the value of the numberOfUnseen property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setNumberOfUnseen(Integer value) {
        this.numberOfUnseen = value;
    }

}
