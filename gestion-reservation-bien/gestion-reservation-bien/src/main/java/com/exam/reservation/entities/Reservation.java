package com.exam.reservation.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Reservation {

    @Id
    private Long id;
    private Date dateReservation;
    private Date dateDebut;
    private Date dateFin;

    @ManyToOne
    private Propriete propriete;

    // Constructeur sans argument
    public Reservation() {
    }

    // Constructeur avec arguments
    public Reservation(Long id, Date dateReservation, Date dateDebut, Date dateFin, Propriete propriete) {
        this.id = id;
        this.dateReservation = dateReservation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.propriete = propriete;
    }

    // Getter et Setter pour 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour 'dateReservation'
    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    // Getter et Setter pour 'dateDebut'
    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    // Getter et Setter pour 'dateFin'
    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    // Getter et Setter pour 'propriete'
    public Propriete getPropriete() {
        return propriete;
    }

    public void setPropriete(Propriete propriete) {
        this.propriete = propriete;
    }
}
