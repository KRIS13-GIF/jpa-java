package com.example.jpa_exercise.cinema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seatId;
    private int seatRow;
    private int seatNumber;


}
