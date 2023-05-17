package com.EXAMPLE.LIBRARY.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String email;

    @Column(name = "fist_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;


    private String password;
}
