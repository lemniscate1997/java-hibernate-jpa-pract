/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.UserProfile;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface UserProfileDao {

    public void addUser(UserProfile user);
    public List<UserProfile> getUsers();
    public UserProfile getUser(Long id);
    public void updateUser(Long id, UserProfile user);
    public void removeUser(Long id);
}
