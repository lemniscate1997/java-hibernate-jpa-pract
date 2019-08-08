/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernateorm;

import com.mycompany.dao.HelloWorldDao;
import com.mycompany.dao.HelloWorldDaoImpl;
import com.mycompany.model.HelloWorld;

/**
 *
 * @author rahul
 */
public class HibernateORMTest {
    public static void main(String[] args) {
        HelloWorldDao messageDom = new HelloWorldDaoImpl();
        
//        HelloWorld message = new HelloWorld();
//        message.setMessage("Hello World example!!!!!!!!!");
//        messageDom.addMessage(message);
//        

//        System.out.println("++++++++++++"+message);
//        System.out.println("------------"+messageDom.getMessages());        

//        message.setMessage("New example");
//        messageDom.updateMessage(message.getId(), message);
//        System.out.println("*****************"+messageDom.getMessages());

//        System.out.println("//////////"+messageDom.getMessage(Long.valueOf(7)));

//        messageDom.removeMessage(Long.valueOf(3));
//        System.out.println("*****************"+messageDom.getMessages());
    }
}
