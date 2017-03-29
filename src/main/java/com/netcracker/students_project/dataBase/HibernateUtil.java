package com.netcracker.students_project.dataBase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;


public class HibernateUtil {
    @Inject
    private SessionFactory ourSessionFactory;
//    static {
//        try {
//            ourSessionFactory =  new Configuration().configure().buildSessionFactory();
//        } catch (Throwable ex) {
//            throw new ExceptionInInitializerError(ex);
//        }
//    }

    public Session getSession() throws HibernateException{
        return ourSessionFactory.openSession();
    }
}
