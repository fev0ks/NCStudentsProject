package com.netcracker.students_project.interfaces;

import com.netcracker.students_project.dao.RoleEntityDao;
import com.netcracker.students_project.dao.TaskEntityDao;
import com.netcracker.students_project.dao.UserEntityDao;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

/**
 * Created by mixa1 on 23.03.2017.
 */
public class IEntytiDao {

    // dao with inheritance from IDao
    interface IUserEntityDao extends IDao<UserEntityDao> {
        List<UserEntityDao> findAllUsers() throws ExceptionDao;
    }
    interface ITaskEntityDao extends IDao<TaskEntityDao> {
        List<UserEntityDao> findAllTasks() throws ExceptionDao;
    }
    interface IRoleEntityDao extends IDao<RoleEntityDao> {
        List<RoleEntityDao> findAllOwners() throws ExceptionDao;
        List<RoleEntityDao> findAllMentors() throws ExceptionDao;
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
