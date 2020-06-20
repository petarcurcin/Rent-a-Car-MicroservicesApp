//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 12:41:41 PM CEST 
//


package com.rent.soap.code;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rentRequestStatus.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rentRequestStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="PAID"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "rentRequestStatus")
@XmlEnum
public enum RentRequestStatus {

    PENDING,
    RESERVED,
    PAID,
    CANCELED;

    public static RentRequestStatus fromValue(String v) {
        return valueOf(v);
    }

    public String value() {
        return name();
    }

}
