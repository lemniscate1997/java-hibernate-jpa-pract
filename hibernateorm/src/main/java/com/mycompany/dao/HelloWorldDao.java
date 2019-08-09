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
