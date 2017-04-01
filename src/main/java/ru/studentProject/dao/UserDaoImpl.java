package ru.studentProject.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.studentProject.dao.interfaces.UserDao;
import ru.studentProject.exception.ExceptionDao;
import ru.studentProject.model.Task;
import ru.studentProject.model.User;

import javax.persistence.Query;
import java.util.List;
import java.util.Set;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public User create(User user) throws ExceptionDao {
        getCurrectSession().persist(user);
        return user;
    }

    @Override
    public void update(User entity) throws ExceptionDao {

    }

    @Override
    public User get(long id) throws ExceptionDao {
        return null;
    }

    @Override
    public void delete(long id) throws ExceptionDao {

    }

    @Override
    public List<User> findAllUsers() throws ExceptionDao {
        return null;
    }

    public List<Task> findAllFinishedTask(long id) throws ExceptionDao {
        return null;
    }

    public List<Task> findAllMentorTask() throws ExceptionDao {
        return null;
    }

    @Override
    public User findUserOnVKid(long vk_id) {
        Query query = (Query) getCurrectSession().createQuery("from User where vkId=:vkIdCurrentUser");
        query.setParameter("vkIdCurrentUser", vk_id);
        List<User> list = query.getResultList();
        if (list != null && !list.isEmpty())
            return list.get(0);
        else
            return null;
    }

    public Set<Task> findAllTask(long id) throws ExceptionDao {
        Set<Task> tasks = null;

        Criteria criteria = sessionFactory.openSession().createCriteria(Task.class);
        return null;
    }

    public UserDaoImpl() {
    }

    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private Session getCurrectSession() {
        return getSessionFactory().getCurrentSession();
    }
}

//    Session session = HibernateUtil.openSession();
