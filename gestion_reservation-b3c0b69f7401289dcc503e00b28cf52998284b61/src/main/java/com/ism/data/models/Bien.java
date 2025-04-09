package com.ism.data.models;

import com.ism.data.enums.StatutBien;
import com.ism.data.enums.TypeBien;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.util.List;

@Entity
public class Bien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String reference;

    private String adresse;

    @Positive(message = "Le prix doit être positif")
    private double prix;

    @Enumerated(EnumType.STRING)
    private TypeBien type;

    @Enumerated(EnumType.STRING)
    private StatutBien statut;

    @ManyToOne
    @JoinColumn(name = "proprietaire_id")
    private Proprietaire proprietaire;

    @OneToMany(mappedBy = "bien", cascade = CascadeType.ALL)
    private List<Reserv> reservations;

    // Getters & Setters

    // Constructeurs
    public Bien() {}

    public Bien(String reference, String adresse, double prix, TypeBien type, StatutBien statut, Proprietaire proprietaire) {
        this.reference = reference;
        this.adresse = adresse;
        this.prix = prix;
        this.type = type;
        this.statut = statut;
        this.proprietaire = proprietaire;
    }
}
