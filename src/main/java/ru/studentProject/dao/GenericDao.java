/*
package ru.studentProject.dao;


import org.springframework.stereotype.Repository;
import ru.studentProject.exception.ExceptionDao;

@Repository
public class GenericDao<T>  {
*/

  /*  @Autowired
    HibernateUtil hibernateUtil;
    @Inject
    public Session session = hibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public T get(long id) throws ExceptionDao {
        Class<T> persistentClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return (T) this.session.load(persistentClass, new Long(id));
    }


    @Transactional
    public T create(T entity) throws ExceptionDao {
        this.session.persist(entity);
        return entity;
    }
*/
   /* public void update(T entity) throws ExceptionDao {
        // this.session.update(model);
    }*/

   /* public void delete(long id) throws ExceptionDao {
        this.session.delete(id);
    }*/
//}
