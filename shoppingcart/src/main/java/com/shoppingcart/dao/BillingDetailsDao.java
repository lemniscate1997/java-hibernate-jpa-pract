package com.shoppingcart.dao;

import com.shoppingcart.model.BillingDetails;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface BillingDetailsDao {
    public void create(int userId, BillingDetails billingDetail);
    public BillingDetails get(int id);
    public List<BillingDetails> getAll();
}
