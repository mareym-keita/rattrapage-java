package com.exam.reservation.repositories;

import com.exam.reservation.entities.TypeBien;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class TypeBienRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Méthode pour sauvegarder un TypeBien
    @Transactional
    public void save(TypeBien typeBien) {
        entityManager.persist(typeBien);
    }

    // Méthode pour trouver un TypeBien par ID
    public TypeBien findById(Long id) {
        return entityManager.find(TypeBien.class, id);
    }

    // Méthode pour obtenir tous les TypeBien
    public List<TypeBien> findAll() {
        return entityManager.createQuery("SELECT t FROM TypeBien t", TypeBien.class).getResultList();
    }

    // Méthode pour supprimer un TypeBien
    @Transactional
    public void delete(TypeBien typeBien) {
        entityManager.remove(entityManager.contains(typeBien) ? typeBien : entityManager.merge(typeBien));
    }
}
