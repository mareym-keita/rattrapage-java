package com.exam.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Propriete {

    @Id
    private Long id;
    private String adresse;
    private int superficie;

    @ManyToOne
    private TypeBien typeBien;

    @ManyToOne
    private StatutBien statutBien;

    // Constructeur sans argument
    public Propriete() {
    }

    // Constructeur avec arguments
    public Propriete(Long id, String adresse, int superficie, TypeBien typeBien, StatutBien statutBien) {
        this.id = id;
        this.adresse = adresse;
        this.superficie = superficie;
        this.typeBien = typeBien;
        this.statutBien = statutBien;
    }

    // Getter et Setter pour 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour 'adresse'
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter et Setter pour 'superficie'
    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    // Getter et Setter pour 'typeBien'
    public TypeBien getTypeBien() {
        return typeBien;
    }

    public void setTypeBien(TypeBien typeBien) {
        this.typeBien = typeBien;
    }

    // Getter et Setter pour 'statutBien'
    public StatutBien getStatutBien() {
        return statutBien;
    }

    public void setStatutBien(StatutBien statutBien) {
        this.statutBien = statutBien;
    }
}
