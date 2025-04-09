package com.exam.reservation.repositories;

import com.exam.reservation.entities.Propriete;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class ProprieteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Méthode pour sauvegarder une Propriete
    @Transactional
    public void save(Propriete propriete) {
        entityManager.persist(propriete);
    }

    // Méthode pour trouver une Propriete par ID
    public Propriete findById(Long id) {
        return entityManager.find(Propriete.class, id);
    }

    // Méthode pour obtenir toutes les Proprietes
    public List<Propriete> findAll() {
        return entityManager.createQuery("SELECT p FROM Propriete p", Propriete.class).getResultList();
    }

    // Méthode pour supprimer une Propriete
    @Transactional
    public void delete(Propriete propriete) {
        entityManager.remove(entityManager.contains(propriete) ? propriete : entityManager.merge(propriete));
    }
}
