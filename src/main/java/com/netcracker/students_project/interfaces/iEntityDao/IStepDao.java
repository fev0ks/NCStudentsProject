package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.dao.StepDao;
import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.IDao;

import java.util.List;

public interface IStepDao extends IDao<StepDao> {
    List<UserEntity> findAllCheckedMentor() throws ExceptionDao;
    List<UserEntity> findAllUnCheckedMentor() throws ExceptionDao;
}