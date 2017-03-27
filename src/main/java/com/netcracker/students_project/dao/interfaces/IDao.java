package com.netcracker.students_project.dao.interfaces;


import com.netcracker.students_project.entity.exception.ExceptionDao;

public interface IDao<T> {

        T get(long id) throws ExceptionDao;
        T create(T entity) throws ExceptionDao;
        void update(T entity) throws ExceptionDao;
        void delete(long id) throws ExceptionDao;
}
