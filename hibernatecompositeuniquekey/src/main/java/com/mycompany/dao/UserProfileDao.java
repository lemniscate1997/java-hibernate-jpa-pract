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
