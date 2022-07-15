package com.example.Decode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    private String sequenceNo;
    private String line1;
    private String line2;
    private String line3;
    private String line4;
    private String code;
    private String type;
}
