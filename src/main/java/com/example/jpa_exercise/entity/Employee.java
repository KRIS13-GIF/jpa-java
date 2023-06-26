package com.example.jpa_exercise.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String fname;

    @ManyToOne // this is a relationship in JavaSpringboot
    private Department department;



}
