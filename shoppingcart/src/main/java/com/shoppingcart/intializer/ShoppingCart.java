package com.shoppingcart.intializer;

import com.shoppingcart.dao.*;
import com.shoppingcart.model.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rahul
 */
public class ShoppingCart {

    public static void main(String[] args) {
        AddressDao addressRepo = new AddressDaoImpl();
        BidDao bidRepo = new BidDaoImpl();
        BillingDetailsDao billingDetailsRepo = new BillingDetailsDaoImpl();
        CategoryDao categoryRepo = new CategoryDaoImpl();
        CommentDao commentRepo = new CommentDaoImpl();
        ItemDao itemRepo = new ItemDaoImpl();
        ShipmentDao shipmentRepo = new ShipmentDaoImpl();
        UserDao userRepo = new UserDaoImpl();
//
//        Users user = new Users();
//        user.setFirstname("Rahul");
//        user.setLastname("Raiyani");
//        user.setUsername("rraiyani");
//        user.setPassword("rahul");
//        user.setRanking(1);
//        user.setEmail("rahul.raiyani@gmail.com");
//        List<Address> addresses = new ArrayList<>();
//        addresses.add(new Address("first", "356232", "surat", AddressType.home));
//        user.setAddresses(addresses);
//        userRepo.create(user);

//        Address add = new Address("second", "356232", "surat", AddressType.work);
//        addressRepo.create(1, add);
//        CreditCard card = new CreditCard(CreditCardType.GoldCreditCard, "1232123212321232", "12", "2025");
//        BillingDetails billing = new BillingDetails("Nihar");
//        billing.setCredit_card_id(card);
//        billingDetailsRepo.create(1, billing);
//
//        Category category = new Category("itemcat");
//        Item item = new Item("Pencil", "dd", Long.MIN_VALUE, Long.MIN_VALUE, LocalDate.MAX, LocalDate.MAX, ItemState.dispatched, LocalDateTime.MIN, category);
//        itemRepo.create(1, item);
//
        
//        Bid bid = new Bid(Long.MAX_VALUE, LocalDate.MAX);
//        bidRepo.create(1, 1, bid);
//
//        Comment comment = new Comment(Rating.medium, "text", LocalDate.MAX);
//        commentRepo.create(1, 1, comment);

//        Shipment shipment = new Shipment(5, ShipmentState.dispatched, LocalDate.MAX);
//        shipmentRepo.create(1, 1, 1, 1, shipment);
//
//        Category category1 = categoryRepo.get(2);
//        Category category2 = new Category("new one");
//        category2.setParent(category1);
//        categoryRepo.create(category2);
    }
}
