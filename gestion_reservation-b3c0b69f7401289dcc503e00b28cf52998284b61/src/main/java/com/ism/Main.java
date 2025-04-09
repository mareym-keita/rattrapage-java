package com.ism;

import com.ism.core.datasource.HibernateUtil;
import com.ism.menu.MainMenu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateUtil.getEntityManagerFactory();
        EntityManager em = null;

        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            MainMenu.start();

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }

        }
    }
}