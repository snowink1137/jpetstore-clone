package com.example.jpetstoreclone.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String state;
    private String zipcode;
    private String country;

    protected Address() {
    }

    public Address(String city, String state, String zipcode, String country) {
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
}
