package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.AssignmentEntity;
import com.netcracker.students_project.interfaces.IDao;

public class AssignmentDao extends GenericDao<AssignmentEntity> implements IDao<AssignmentEntity> {

    public String toString(AssignmentEntity entity) {

        return String.format("AssignmentDao={ %1$d,%2$d,%3$s",
                entity.getUserId(),entity.getTaskId(),entity.getRoleEntity().getName());
    }
}
