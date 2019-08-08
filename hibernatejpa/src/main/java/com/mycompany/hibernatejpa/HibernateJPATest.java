/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatejpa;

import com.mycompany.dao.HelloWorldDao;
import com.mycompany.dao.HelloWorldDaoImpl;
import com.mycompany.model.HelloWorld;

/**
 *
 * @author rahul
 */
public class HibernateJPATest {

    public static void main(String[] args) {
        HelloWorldDao messageDom = new HelloWorldDaoImpl();

        System.out.println("+++++++++" + messageDom.getMessage(Long.valueOf(1)));
        System.out.println("---------" + messageDom.getMessages());

//        HelloWorld message = new HelloWorld();
//        message.setMessage("Hello brother");
//        messageDom.addMessage(message);
//        System.out.println("***********"+messageDom.getMessage(message.getId()));

//        HelloWorld message = new HelloWorld();
//        message.setMessage("Hello litle brother");
//        messageDom.updateMessage(Long.valueOf(8), message);

//        messageDom.removeMessage(Long.valueOf(2));
//        System.out.println("---------" + messageDom.getMessages());

    }
}
