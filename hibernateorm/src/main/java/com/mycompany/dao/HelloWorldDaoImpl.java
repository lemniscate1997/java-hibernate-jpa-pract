package com.mycompany.dao;

import com.mycompany.model.HelloWorld;
import com.mycompany.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author rahul
 */
public class HelloWorldDaoImpl implements HelloWorldDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void addMessage(HelloWorld message) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(message);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<HelloWorld> getMessages() {
        Session session = sessionFactory.openSession();
        List<HelloWorld> list = new ArrayList<>();
        try {
            list = session.createCriteria(HelloWorld.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            return list;
        }
    }

    @Override
    public void updateMessage(Long id, HelloWorld message) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            HelloWorld old = session.get(HelloWorld.class, id);
            old.setMessage(message.getMessage());
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public HelloWorld getMessage(Long id) {
        Session session = sessionFactory.openSession();
        HelloWorld message = null;
        try {
            message = session.get(HelloWorld.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return message;
    }

    @Override
    public void removeMessage(Long id) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            HelloWorld old = session.get(HelloWorld.class, id);
            session.remove(old);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}
