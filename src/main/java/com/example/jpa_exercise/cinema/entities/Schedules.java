package com.example.jpa_exercise.cinema.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "schedules")
public class Schedules {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int scheduleId;
    private Date startTime;
}
