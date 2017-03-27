package com.netcracker.students_project.dataBase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;


public class HibernateUtil {

    @Autowired
    private static final SessionFactory sessionFactory;
    static {
        try {
          //  sessionFactory =  new Configuration().configure().buildSessionFactory();
            sessionFactory =new Configuration().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException{
//        return sessionFactory.openSession();
        return sessionFactory.getCurrentSession();
    }
    public static SessionFactory getSessionFactory() throws HibernateException{
        return sessionFactory;
    }
}
