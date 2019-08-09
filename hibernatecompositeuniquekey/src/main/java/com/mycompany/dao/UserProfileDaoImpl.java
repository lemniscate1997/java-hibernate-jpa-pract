package com.mycompany.dao;

import com.mycompany.model.UserProfile;
import com.mycompany.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author rahul
 */
public class UserProfileDaoImpl implements UserProfileDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addUser(UserProfile user) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public List<UserProfile> getUsers() {
        List<UserProfile> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("from UserProfile ", UserProfile.class).getResultList();
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public void updateUser(Long id, UserProfile user) {
        try {
            entityManager.getTransaction().begin();
            UserProfile old = entityManager.find(UserProfile.class, id);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public UserProfile getUser(Long id) {
        UserProfile message = null;
        try {
            message = entityManager.find(UserProfile.class, id);
        } catch (Exception e) {
        }
        return message;
    }

    @Override
    public void removeUser(Long id) {
        try {
            entityManager.getTransaction().begin();
            UserProfile old = entityManager.find(UserProfile.class, id);
            entityManager.remove(old);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

}
