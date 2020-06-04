package com.advertisement.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TransmissionType {

    @OneToMany(mappedBy = "transmissionType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Car> car;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Boolean active = true;

    public TransmissionType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
