package com.netcracker.students_project.interfaces;

import com.netcracker.students_project.dao.RoleDao;
import com.netcracker.students_project.dao.TaskDao;
import com.netcracker.students_project.dao.UserDao;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

/**
 * Created by mixa1 on 23.03.2017.
 */
public class IEntityDao {

    // dao with inheritance from IDao
    interface IUserEntityDao extends IDao<UserDao> {
        List<UserDao> findAllUsers() throws ExceptionDao;
    }
    interface ITaskEntityDao extends IDao<TaskDao> {
        List<UserDao> findAllTasks() throws ExceptionDao;
    }
    interface IRoleEntityDao extends IDao<RoleDao> {
        List<RoleDao> findAllOwners() throws ExceptionDao;
        List<RoleDao> findAllMentors() throws ExceptionDao;
    }


//    // dao without inheritance from IDao
//    interface IEntityBDao {
//
//        // find entity by name and user id
//        EntityB get(String name, String userId) throws DaoException;
//
//        List<EntityB> findAll() throws DaoException;
//    }
}
