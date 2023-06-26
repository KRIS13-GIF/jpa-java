package com.example.jpa_exercise.cinema.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private TicketCategories ticketCategories;
    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seats seats;
    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedules schedules;

}
