package com.exam.reservation.repositories;

import com.exam.reservation.entities.Bien;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class BienRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Méthode pour sauvegarder un Bien
    @Transactional
    public void save(Bien bien) {
        entityManager.persist(bien);
    }

    // Méthode pour trouver un Bien par ID
    public Bien findById(Long id) {
        return entityManager.find(Bien.class, id);
    }

    // Méthode pour obtenir tous les Biens
    public List<Bien> findAll() {
        return entityManager.createQuery("SELECT b FROM Bien b", Bien.class).getResultList();
    }

    // Méthode pour supprimer un Bien
    @Transactional
    public void delete(Bien bien) {
        entityManager.remove(entityManager.contains(bien) ? bien : entityManager.merge(bien));
    }
}
