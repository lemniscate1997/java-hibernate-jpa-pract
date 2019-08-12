package com.shoppingcart.dao;

import com.shoppingcart.model.Address;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface AddressDao {
    public void create(int userId, Address address);
    public Address get(int id);
    public List<Address> getAll();
}
