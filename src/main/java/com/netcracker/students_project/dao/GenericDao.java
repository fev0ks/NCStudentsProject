package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;


public class GenericDao<T> implements IDao<T>{
    private Class<T> persistentClass;
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public T get(long id) throws ExceptionDao {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return this.sessionFactory.getCurrentSession().load(persistentClass, new Long(id));
    }

    @Override
    public T create(T entity) throws ExceptionDao {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public void update(T entity) throws ExceptionDao {
        this.sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(long id) throws ExceptionDao {
        this.sessionFactory.getCurrentSession().delete(id);
    }
}
