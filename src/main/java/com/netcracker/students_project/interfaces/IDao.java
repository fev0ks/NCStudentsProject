package com.netcracker.students_project.interfaces;


import com.netcracker.students_project.entity.exception.ExceptionDao;

public interface IDao<T> {

        void get(T entity) throws ExceptionDao;
        T create(T entity) throws ExceptionDao;
        void update(T entity) throws ExceptionDao;
        void delete(T entity) throws ExceptionDao;
        String toString(T entity);
}
