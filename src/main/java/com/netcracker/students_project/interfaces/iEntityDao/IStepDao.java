package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface IStepDao {
    List<User> findAllCheckedMentor() throws ExceptionDao;
    List<User> findAllUnCheckedMentor() throws ExceptionDao;

}