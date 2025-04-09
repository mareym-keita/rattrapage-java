package com.exam.reservation.views;

import com.exam.reservation.services.BienService; // Exemple d'import d'un service
import com.exam.reservation.entities.Bien;       // Exemple d'import d'une entité
import com.exam.reservation.utils.JPAUtil;       // Exemple d'import d'un utilitaire JPA

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Message d'accueil
        System.out.println("Bienvenue dans l'application de gestion de réservation de biens !");
        
        // Exemple de création d'une connexion avec la base de données (JPA)
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionReservation");
        EntityManager em = emf.createEntityManager();

        // Exemple d'utilisation d'un service pour récupérer des biens
        BienService bienService = new BienService(em);
        List<Bien> biens = bienService.getAllBiens();

        // Affichage des biens récupérés
        System.out.println("Liste des biens disponibles:");
        for (Bien bien : biens) {
            System.out.println(bien);
        }

        // Fermeture de l'EntityManager
        em.close();
        emf.close();
    }
}
