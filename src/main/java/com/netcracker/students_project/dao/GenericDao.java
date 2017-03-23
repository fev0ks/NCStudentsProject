package com.netcracker.students_project.dao;

import com.netcracker.students_project.dataBase.HibernateUtil;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.lang.reflect.ParameterizedType;


public class GenericDao<T> implements IDao<T>{

    public Session session= HibernateUtil.getSession();
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public T get(long id) throws ExceptionDao {

        Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return this.session.load(persistentClass, new Long(id));
    }

    @Override
    public T create(T entity) throws ExceptionDao {
        return entity;
    }

    @Override
    public void update(T entity) throws ExceptionDao {
       // this.session.update(entity);
    }

    @Override
    public void delete(long id) throws ExceptionDao {
        //this.session.delete(id);
    }
}
