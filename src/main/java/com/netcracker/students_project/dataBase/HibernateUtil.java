package com.netcracker.students_project.dataBase;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;
    static {
        try {
            //Configuration configuration = new Configuration();
           // configuration.configure("hibernate.cfg.xml");
         //   ourSessionFactory = configuration.buildSessionFactory();
            ourSessionFactory =  new Configuration().configure().buildSessionFactory();

        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static SessionFactory getSessionF() throws HibernateException{
        return ourSessionFactory;//ourSessionFactory.openSession();

    }
    public static Session getSession() throws HibernateException{
        return ourSessionFactory.openSession();

    }

}
