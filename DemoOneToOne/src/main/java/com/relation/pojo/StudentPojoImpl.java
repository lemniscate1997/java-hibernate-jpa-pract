package com.relation.pojo;

import com.relation.model.Student;
import com.relation.util.EntityManagerUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author rahul
 */
public class StudentPojoImpl implements StudentPojo{
    
    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    
    @Override
    public void addStudent(Student student) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            if (entityManager.getTransaction() != null) {
                entityManager.getTransaction().rollback();
            }
        }
    }
}
