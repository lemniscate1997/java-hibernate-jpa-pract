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
public class CategoryDaoImpl implements CategoryDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void create(Category category) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(category);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Category get(int id) {
        Category category = null;
        try {
            category = entityManager.find(Category.class, id);
        } catch (Exception e) {
        }
        return category;
    }

    @Override
    public List<Category> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
