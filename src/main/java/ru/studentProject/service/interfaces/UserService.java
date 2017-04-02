package ru.studentProject.service.interfaces;

import ru.studentProject.exception.ExceptionDao;
import ru.studentProject.model.User;

public interface UserService {
    User create(User user) throws ExceptionDao;

    User getOrGiveUser(String codeForVk);

    User get(long id);
}
