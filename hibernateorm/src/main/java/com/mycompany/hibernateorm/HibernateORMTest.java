package com.mycompany.hibernateorm;

import com.mycompany.dao.HelloWorldDao;
import com.mycompany.dao.HelloWorldDaoImpl;
import com.mycompany.model.HelloWorld;
import java.util.logging.Logger;

/**
 *
 * @author rahul
 */
public class HibernateORMTest {

    public static Logger logger = Logger.getLogger(HibernateORMTest.class.getName());

    public static void main(String[] args) {
        HelloWorldDao messageDom = new HelloWorldDaoImpl();

//        HelloWorld message = new HelloWorld();
//        message.setMessage("Hello World example!!!!!!!!!");
//        messageDom.addMessage(message);
//        
//        Logger.getLogger("++++++++++++"+message);
        logger.info("------------" + messageDom.getMessages());

//        message.setMessage("New example");
//        messageDom.updateMessage(message.getId(), message);
//        logger.info("*****************"+messageDom.getMessages());
//        logger.info("//////////"+messageDom.getMessage(Long.valueOf(7)));
//        messageDom.removeMessage(Long.valueOf(3));
//        logger.info("*****************"+messageDom.getMessages());
    }
}
