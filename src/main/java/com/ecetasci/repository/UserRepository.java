package com.ecetasci.repository;

import com.ecetasci.JpaUtility;
import com.ecetasci.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UserRepository extends RepositoryManager<User, Long> {

    private EntityManager entityManager;

    public UserRepository() {
        super();
        entityManager = JpaUtility.getEntityManager();
    }

    public List<User> findByAd(String ad) {
        String jpql = "SELECT u FROM User u WHERE u.ad LIKE :ad";
        return entityManager.createQuery(jpql, User.class).setParameter("ad", "%" + ad + "%").getResultList();
    }
    public List<User> findByAdres(String adres) {
        String jpql = "select u from User u where lower(u.adres) LIKE :adres";
        return entityManager.createQuery(jpql, User.class)
                .setParameter("adres", "%" + adres.toLowerCase() + "%")
                .getResultList();
    }

}
