package com.netcracker.students_project.dao;

import com.netcracker.students_project.dataBase.HibernateUtil;
import org.hibernate.Session;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


@Deprecated
public class StudentDAO {

    public String insertStudent(Student student) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        return "insert: " + student.toString() + " done";
    }
//
//    public List<Student> selectAllStudents() {
//        List<Student> listStudent = null;
//        try (Session session = HibernateUtil.getSession()) {
//            session.beginTransaction();
//            Query query = session.createQuery(" from Student ");
//            listStudent = (List<Student>) query.getResultList();
//            session.getTransaction().commit();
//            ;
//        } catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//        return listStudent;
//    }
//
//    public int getStudentID(Student student) {
//        try (Session session = HibernateUtil.getSession()) {
//            session.beginTransaction();
//            Query query = session.createQuery("select id from Student  where name=:name and age=:age");
//            query.setParameter("name",student.getName());
//            query.setParameter("age",student.getAge());
//            List<Integer> results = (List<Integer>) query.getResultList();
//            for (int i:results
//                 ) {
//                System.out.println(i);
//            }
//            if (results.isEmpty()) return -1;
//            else if (results.size() != 0) {
//
//                return results.get(0);
//            }
//            session.getTransaction().begin();
//        } catch (Throwable ex) {
//            ex.printStackTrace();
//        }
//      return -1;
//    }
}
