package com.mycompany.intializer;

import com.mycompany.dao.UserProfileDao;
import com.mycompany.dao.UserProfileDaoImpl;
import com.mycompany.model.UserProfile;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class TestClass {

    public static Logger logger = Logger.getLogger(TestClass.class.getName());

    public static void main(String[] args) {
        UserProfileDao repository = new UserProfileDaoImpl();

        logger.info("+++++" + repository.getUsers());
        UserProfile user = new UserProfile("rahul", "rahul.patel@gmail.com", "9656239636");
        repository.addUser(user);
    }
}
