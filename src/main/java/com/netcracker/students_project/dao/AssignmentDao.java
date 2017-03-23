package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.AssignmentEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AssignmentDao implements IDao<AssignmentEntity> {
    Long a;
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public AssignmentEntity get(long id) throws ExceptionDao {
         return this.sessionFactory.getCurrentSession().load(AssignmentEntity.class, new Long(id));
    }

    @Override
    public AssignmentEntity create(AssignmentEntity entity) throws ExceptionDao {
        this.sessionFactory.getCurrentSession().persist(entity);
        return entity;
    }

    @Override
    public void update(AssignmentEntity entity) throws ExceptionDao {
         this.sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(long id) throws ExceptionDao {
        this.sessionFactory.getCurrentSession().delete(id);
    }

    @Override
    public String toString(AssignmentEntity entity) {

        return String.format("AssignmentDao={ %1$d,%2$d,%3$s",
                entity.getUserId(),entity.getTaskId(),entity.getRoleEntity().getName());
    }
}
