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
public class ItemDaoImpl implements ItemDao {

    private EntityManager entityManager = EntityManagerUtil.getEntityManager();

    @Override
    public void create(int sallerId, Item item) {
        try {
            entityManager.getTransaction().begin();
            Users user = entityManager.find(Users.class, sallerId);
            user.getItems().add(item);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }

    @Override
    public Item get(int id) {
        Item item = null;
        try {
            item = entityManager.find(Item.class, id);
        } catch (Exception e) {
        }
        return item;
    }

    @Override
    public List<Item> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
