
package com.rent.soap.code;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="rentRequest" type="{http://localhost:8095/microservices/rent}RentRequest" maxOccurs="unbounded" minOccurs="0"/>
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
    "rentRequest"
})
@XmlRootElement(name = "getRentRequestResponse", namespace = "http://localhost:8095/microservices/rent")
public class GetRentRequestResponse {

    @XmlElement(namespace = "http://localhost:8095/microservices/rent")
    protected List<RentRequest> rentRequest;

    /**
     * Gets the value of the rentRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRentRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentRequest }
     * 
     * 
     */
    public List<RentRequest> getRentRequest() {
        if (rentRequest == null) {
            rentRequest = new ArrayList<RentRequest>();
        }
        return this.rentRequest;
    }

}
