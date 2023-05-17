package com.EXAMPLE.LIBRARY.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;

    @Column(name = "first_name")
    private String FirstName;

    @Column(name = "last_name")
    private String LastName;


    private String password;
}
