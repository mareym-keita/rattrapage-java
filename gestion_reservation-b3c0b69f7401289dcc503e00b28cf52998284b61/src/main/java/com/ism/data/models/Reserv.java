package com.ism.data.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Reserv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String client;

    private LocalDate dateReservation;

    @ManyToOne
    @JoinColumn(name = "bien_id")
    private Bien bien;

    // Getters & Setters

    // Constructeurs
    public Reserv() {}

    public Reserv(String client, LocalDate dateReservation, Bien bien) {
        this.client = client;
        this.dateReservation = dateReservation;
        this.bien = bien;
    }
}
