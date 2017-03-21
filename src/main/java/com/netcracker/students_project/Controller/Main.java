package com.netcracker.students_project.Controller;

import com.netcracker.students_project.entity.Student;
import com.netcracker.students_project.dataBase.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by mixa1 on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            Student student = new Student("Hibernate", 42, 12793);
            session.save(student);
            session.getTransaction().commit();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }


        List<Student> listStudent = null;
        try (Session session = HibernateUtil.getSession()) {
            session.beginTransaction();
            Query query=session.createQuery(" from Student ");
            listStudent=(List<Student>) query.getResultList();
            session.getTransaction().commit();;
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        if(listStudent!=null && !listStudent.isEmpty()){
            for (Student student : listStudent
                    ) {
                System.out.println(student);

            }
        }
    }
}
