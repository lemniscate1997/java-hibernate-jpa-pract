package com.mycompany.hibernatejpa;

import com.mycompany.dao.HelloWorldDao;
import com.mycompany.dao.HelloWorldDaoImpl;
import com.mycompany.model.HelloWorld;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class HibernateJPATest {

    public static Logger logger = Logger.getLogger(HibernateJPATest.class.getName());

    public static void main(String[] args) {
        HelloWorldDao messageDom = new HelloWorldDaoImpl();

//        logger.info("+++++++++" + messageDom.getMessage(Long.valueOf(1)));
        logger.info("---------" + messageDom.getMessages());

        HelloWorld message = new HelloWorld();
        message.setMessage("Hello brother");
        messageDom.addMessage(message);
//        logger.info("***********"+messageDom.getMessage(message.getId()));

//        HelloWorld message = new HelloWorld();
//        message.setMessage("Hello litle brother");
//        messageDom.updateMessage(Long.valueOf(8), message);
//        messageDom.removeMessage(Long.valueOf(2));
//        logger.info("---------" + messageDom.getMessages());
    }
}
