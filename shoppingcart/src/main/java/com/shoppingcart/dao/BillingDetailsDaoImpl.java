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
public class BillingDetailsDaoImpl implements BillingDetailsDao{

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void create(int userId, BillingDetails billing) {
        try {
            entityManager.getTransaction().begin();
            Users user = entityManager.find(Users.class, userId);
            user.getBillings().add(billing);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public BillingDetails get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BillingDetails> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
