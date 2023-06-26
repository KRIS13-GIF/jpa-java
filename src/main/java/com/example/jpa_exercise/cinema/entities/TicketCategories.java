package com.example.jpa_exercise.cinema.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket_categories")
public class TicketCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketCategoryId;
    private String type;
    private int price;

}
