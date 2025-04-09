package com.exam.reservation.repositories;

import com.exam.reservation.entities.StatutBien;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class StatutBienRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Méthode pour sauvegarder un StatutBien
    @Transactional
    public void save(StatutBien statutBien) {
        entityManager.persist(statutBien);
    }

    // Méthode pour trouver un StatutBien par ID
    public StatutBien findById(Long id) {
        return entityManager.find(StatutBien.class, id);
    }

    // Méthode pour obtenir tous les StatutBien
    public List<StatutBien> findAll() {
        return entityManager.createQuery("SELECT s FROM StatutBien s", StatutBien.class).getResultList();
    }

    // Méthode pour supprimer un StatutBien
    @Transactional
    public void delete(StatutBien statutBien) {
        entityManager.remove(entityManager.contains(statutBien) ? statutBien : entityManager.merge(statutBien));
    }
}
