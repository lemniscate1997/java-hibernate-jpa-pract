package com.shoppingcart.dao;

import com.shoppingcart.model.Address;
import com.shoppingcart.model.Bid;
import com.shoppingcart.model.BillingDetails;
import com.shoppingcart.model.Category;
import com.shoppingcart.model.Comment;
import com.shoppingcart.model.Item;
import com.shoppingcart.model.Shipment;
import com.shoppingcart.model.Users;
import com.shoppingcart.util.EntityManagerUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author rahul
 */
public class UserDaoImpl implements UserDao{

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void create(Users user) {
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
    public Users get(int id) {
        Users person = null;
        try {
            person = entityManager.find(Users.class, id);
            System.out.println(""+person);
        } catch (Exception e) {
        }
        return person;
    }

    @Override
    public List<Users> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
