package com.exam.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TypeBien {

    @Id
    private Long id;
    private String nom;

    // Constructeur sans argument
    public TypeBien() {
    }

    // Constructeur avec arguments
    public TypeBien(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getter et Setter pour 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour 'nom'
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
