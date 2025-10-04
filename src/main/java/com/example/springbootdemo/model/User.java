package com.example.springbootdemo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstName")
    @Pattern(regexp = "^[A-Za-z]+$", message = "First name must contain only letters A-Z or a-z")
    private String firstName;

    @Column(name = "lastName")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Last name must contain only letters A-Z or a-z")
    private String lastName;
}