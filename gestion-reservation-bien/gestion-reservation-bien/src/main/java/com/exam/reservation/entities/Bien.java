package com.exam.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bien {

    @Id
    private Long id;
    private String nom;

    @ManyToOne
    private Propriete propriete;

    // Constructeur sans argument
    public Bien() {
    }

    // Constructeur avec arguments
    public Bien(Long id, String nom, Propriete propriete) {
        this.id = id;
        this.nom = nom;
        this.propriete = propriete;
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

    // Getter et Setter pour 'propriete'
    public Propriete getPropriete() {
        return propriete;
    }

    public void setPropriete(Propriete propriete) {
        this.propriete = propriete;
    }
}
