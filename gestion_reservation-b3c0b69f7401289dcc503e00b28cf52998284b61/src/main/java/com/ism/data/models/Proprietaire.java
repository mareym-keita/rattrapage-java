package com.ism.data.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@Entity
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nom;

    @NotBlank
    private String prenom;

    @Pattern(regexp = "^\\d{9}$", message = "Le téléphone doit comporter exactement 9 chiffres")
    private String telephone;

    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL)
    private List<Bien> biens;

    // Getters & Setters

    // Constructeurs
    public Proprietaire() {}

    public Proprietaire(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }
}
