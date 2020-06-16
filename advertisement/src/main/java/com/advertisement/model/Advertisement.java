package com.advertisement.model;


import com.advertisement.adapter.LocalDateAdapter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Advertisement", namespace = "https://localhost:8084/microservices/advertisement")
@XmlRootElement(name = "advertisementClass")
public class Advertisement {
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    @XmlElement
    public Car car;
    @Column
    @XmlElement
    public Long ownerId;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @XmlElement
    public PriceList priceList;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlElement
    private Long id;
    @Column
    @XmlElement
    private Integer kilometresLimit;
    @Column
    @XmlElement
    private Integer discount;
    @Column
    @XmlElement
    private String place;
    @Column
    @XmlElement
    private Boolean cdw;
    @Column(name = "startDate", nullable = false)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    @XmlElement
    private LocalDate startDate;
    @Column(name = "endDate", nullable = false)
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    @XmlElement
    private LocalDate endDate;

    @OneToMany(mappedBy = "advertisement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @XmlElement
    private Set<Term> terms;

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", kilometresLimit=" + kilometresLimit +
                ", car=" + car +
                ", ownerId=" + ownerId +
                ", priceList=" + priceList +
                ", discount=" + discount +
                ", place='" + place + '\'' +
                ", cdw=" + cdw +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
