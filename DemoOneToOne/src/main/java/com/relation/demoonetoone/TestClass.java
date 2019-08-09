package com.relation.demoonetoone;

import com.relation.model.*;
import com.relation.pojo.StudentPojo;
import com.relation.pojo.StudentPojoImpl;
import com.relation.util.EntityManagerUtil;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author rahul
 */
public class TestClass {

    public static Logger logger = Logger.getLogger(TestClass.class.getName());
    
    public static void main(String[] args) {
        StudentPojo repository = new StudentPojoImpl();
        
        Education education =  new Education("B.Tech", "this is b.tech degree", "2019", "ddu");
        Address address = new Address("sad", "fdsdfd", "fdsfd", "sdfsd", "sfsdf", "395020");
        Student student = new Student("Rahul", "Raiyani", "", "", "rahul@gmail.com", "9856231264", address, education);
        repository.addStudent(student);
        logger.info("+++++"+student);
    }
    
    
}
