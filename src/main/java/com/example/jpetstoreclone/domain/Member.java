package com.example.jpetstoreclone.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    @Embedded
    private Address address;


}
