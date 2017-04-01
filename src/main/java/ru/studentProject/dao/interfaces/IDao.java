package ru.studentProject.dao.interfaces;


import ru.studentProject.exception.ExceptionDao;

public interface IDao<T> {

    T get(long id) throws ExceptionDao;

    T create(T entity) throws ExceptionDao;

    void update(T entity) throws ExceptionDao;

    void delete(long id) throws ExceptionDao;
}

