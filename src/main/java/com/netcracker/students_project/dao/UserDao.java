package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserDao extends GenericDao<UserEntity> implements IUserDao{

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    @Override
    public List<UserEntity> findAllUsers() throws ExceptionDao {
        List<UserEntity> usersList = session.createQuery("from UserEntity ").list();
        for(UserEntity p : usersList){
            logger.info("UserEntity List::"+p);
        }
        return usersList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<TaskEntity> findAllTask() {
        List<TaskEntity> tasksList = session.createQuery(
                "from AssignmentEntity role  " +
                        "JOIN UserEntity user " +
                        "on role.userId=user.id " +
                        "where role.roleEntity.name='owner'")
                .list();
        for(TaskEntity p : tasksList){
            logger.info("UserEntity List::"+p);
        }
        return tasksList;
    }


    @Override
    public List<TaskEntity> findAllFinishedTask() throws ExceptionDao {
        return null;
    }

    @Override
    public List<TaskEntity> findAllMentorTask() throws ExceptionDao {
        List<TaskEntity> tasksList = session.createQuery(
                "from TaskEntity role  " +
                        "JOIN UserEntity user " +
                        "on role.roleEntity.name= 'mentor' " +
                        "and role.userId=user.id")
                .list();
        for(TaskEntity p : tasksList){
            logger.info("UserEntity List::"+p);
        }
        return tasksList;
    }

    @Override
    public List<CommentsTaskEntity> findAllComment() throws ExceptionDao {
        return null;
    }
}
