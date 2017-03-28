package com.netcracker.students_project.dao;

import com.netcracker.students_project.entity.CommentTask;
import com.netcracker.students_project.entity.Task;
import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.netcracker.students_project.interfaces.iEntityDao.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserDao extends GenericDao<User> implements IUserDao{

    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);
    @Override
    public List<User> findAllUsers() throws ExceptionDao {
        List<User> usersList = session.createQuery("from User ").list();
        for(User p : usersList){
            logger.info("User List::"+p);
        }
        return usersList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Task> findAllTask() {
//        List<Task> tasksList = session.createQuery(
//                "from Assignment role  " +
//                        "JOIN User user " +
//                        "on role='owner' " +
//                        "where role.role.name='owner'")
//                .list();
//        for(Task p : tasksList){
//            logger.info("User List::"+p);
//        }
        return null; //tasksList;
    }


    @Override
    public List<Task> findAllFinishedTask() throws ExceptionDao {
        return null;
    }

    @Override
    public List<Task> findAllMentorTask() throws ExceptionDao {
//        List<Task> tasksList = session.createQuery(
//                "from Task role  " +
//                        "JOIN User user " +
//                        "on role.name= 'mentor' " +
//                        "and role=user.id")
//                .list();
//        for(Task p : tasksList){
//            logger.info("User List::"+p);
//        }
        return null;//tasksList;
    }

    @Override
    public List<CommentTask> findAllComment() throws ExceptionDao {
        return null;
    }
}
