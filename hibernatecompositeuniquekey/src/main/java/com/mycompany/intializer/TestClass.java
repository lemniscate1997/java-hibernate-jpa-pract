/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intializer;

import com.mycompany.dao.UserProfileDao;
import com.mycompany.dao.UserProfileDaoImpl;
import com.mycompany.model.UserProfile;

/**
 *
 * @author rahul
 */
public class TestClass {
    public static void main(String[] args) {
        UserProfileDao repository = new UserProfileDaoImpl();
        
        System.out.println("+++++"+repository.getUsers());
        UserProfile user = new UserProfile("rahul", "rahul.patel@gmail.com", "9656239636");
        repository.addUser(user);
    }
}
