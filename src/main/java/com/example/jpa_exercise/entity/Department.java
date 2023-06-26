package com.example.jpa_exercise.entity;

import com.example.jpa_exercise.enumerations.DepartmentName;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

    public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private String id;
        @Enumerated(EnumType.STRING) // this here converts to string in order to save it as a string in db
        private DepartmentName name;
        private String empid;
    }

