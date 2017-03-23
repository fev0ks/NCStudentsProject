package com.netcracker.students_project.interfaces.iEntityDao;

import com.netcracker.students_project.entity.StepEntity;
import com.netcracker.students_project.entity.UserEntity;
import com.netcracker.students_project.entity.exception.ExceptionDao;

import java.util.List;

public interface IStepDao {
    List<UserEntity> findAllCheckedMentor() throws ExceptionDao;
    List<UserEntity> findAllUnCheckedMentor() throws ExceptionDao;
    String toString(StepEntity entity);
}