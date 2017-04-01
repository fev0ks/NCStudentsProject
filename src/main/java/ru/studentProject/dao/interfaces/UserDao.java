package ru.studentProject.dao.interfaces;

import ru.studentProject.exception.ExceptionDao;
import ru.studentProject.model.Task;
import ru.studentProject.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao extends IDao<User> {
    List<User> findAllUsers() throws ExceptionDao;

    Set<Task> findAllTask(long id) throws ExceptionDao;

    List<Task> findAllFinishedTask(long id) throws ExceptionDao;

    List<Task> findAllMentorTask() throws ExceptionDao;

    User findUserOnVKid(long vk_id);
    //List<Comments>  findAllComment() throws ExceptionDao;
}
