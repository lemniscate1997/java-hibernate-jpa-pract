package com.shoppingcart.dao;

import com.shoppingcart.model.BankAccount;
import com.shoppingcart.model.BillingDetails;
import com.shoppingcart.model.CreditCard;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface BillingDetailsDao {
    public void createCreditCard(int userId, CreditCard creditCard);
    public void createBankAccount(int userId, BankAccount bankAccount);
    public BillingDetails get(int id);
    public List<BillingDetails> getAll();
}
