/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.HelloWorld;
import java.util.List;

/**
 *
 * @author rahul
 */
public interface HelloWorldDao {

    public void addMessage(HelloWorld message);
    public List<HelloWorld> getMessages();
    public HelloWorld getMessage(Long id);
    public void updateMessage(Long id, HelloWorld message);
    public void removeMessage(Long id);
}
