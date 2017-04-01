package ru.studentProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.studentProject.controller.vk.StartVK;
import ru.studentProject.dao.interfaces.UserDao;
import ru.studentProject.exception.ExceptionDao;
import ru.studentProject.model.User;
import ru.studentProject.service.interfaces.UserService;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    public User create(User user) throws ExceptionDao {
     return  userDao.create(user);
    }
    @Transactional
    private User isExist(User user) throws ExceptionDao {
      return userDao.findUserOnVKid(user.getVkId());
    }

    public User getOrGiveUser(String codeForVk)  {
        StartVK startVK = new StartVK();
        User userVk = startVK.startVkApi(codeForVk);
        User user=null;
        try {
            user=isExist(userVk);
            if (user==null) {
                user = create(userVk);
            }
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
        return user;
    }
}
