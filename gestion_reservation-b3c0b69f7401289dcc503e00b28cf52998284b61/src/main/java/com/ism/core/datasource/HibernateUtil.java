package com.ism.core.datasource;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("org.hibernate.gestion_reservation");
        } catch (Throwable ex) {
            System.err.println("Initialisation de l'EntityManagerFactory échouée." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
