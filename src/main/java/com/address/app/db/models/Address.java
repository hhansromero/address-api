package com.address.app.db.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String dni;
    @Column
    private String street;
    @Column
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    @Column
    private String country;
}
