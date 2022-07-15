package com.example.Decode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@javax.persistence.Entity
public class Entity {

    @Id
    private String id;
    private String name;
    private String surname;
    private Integer age;
    private Integer height;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "addresses_id")
    private List<Address>
            addresses;
    private String idNumber;
    private String passportNumber;
    private String nationality;
    private String dateCreated;
    private String lastUpdate;
    private boolean active;
    private String lastUpdated;
    private String expiryDate;



}
