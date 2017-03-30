package com.netcracker.students_project.dataBase;

import org.hibernate.SessionFactory;

import javax.annotation.Resource;

public class HibernateUtil {

    //    private SessionFactory ourSessionFactory;
////    static {
////        try {
////            ourSessionFactory =  new Configuration().configure().buildSessionFactory();
////        } catch (Throwable ex) {
////            throw new ExceptionInInitializerError(ex);
////        }
////    }
//
//    public Session getSession() throws HibernateException{
//        return ourSessionFactory.openSession();
//    }
    @Resource("sessionFactory")
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
