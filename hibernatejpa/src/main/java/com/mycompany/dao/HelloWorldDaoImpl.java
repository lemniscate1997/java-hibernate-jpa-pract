/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.HelloWorld;
import com.mycompany.util.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author rahul
 */
public class HelloWorldDaoImpl implements HelloWorldDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void addMessage(HelloWorld message) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(message);
            System.out.println("########### Created");
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public List<HelloWorld> getMessages() {
        List<HelloWorld> list = new ArrayList<>();
        try {
            list = entityManager.createQuery("from HelloWorld ", HelloWorld.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateMessage(Long id, HelloWorld message) {
        try {
            entityManager.getTransaction().begin();
            HelloWorld old = entityManager.find(HelloWorld.class, id);
            old.setMessage(message.getMessage());
            entityManager.getTransaction().commit();
            System.out.println("########### Updated");
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public HelloWorld getMessage(Long id) {
        HelloWorld message = null;
        try {
            message = entityManager.find(HelloWorld.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }

    @Override
    public void removeMessage(Long id) {
        try {
            entityManager.getTransaction().begin();
            HelloWorld old = entityManager.find(HelloWorld.class, id);
            entityManager.remove(old);
            entityManager.getTransaction().commit();
            System.out.println("########### Removed");
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }

}
