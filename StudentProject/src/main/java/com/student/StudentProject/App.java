package com.student.StudentProject;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setStuid(10);
        s1.setStuname("swami");
        s1.setStuemail("swami@gmail.com");
        s1.setStucourse("CSE");
        s1.setStuage(50);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Student.class);

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
//           Student s2=session.find(Student.class,4);
           
//        session.persist(s1);
//          session.merge(s1);
//           session.remove(s2);
             
        tx.commit();

//        System.out.println(s1);
        String hql = "from Student";

        List<Student> students =
                session.createQuery(hql, Student.class)
                       .getResultList();

        for(Student s : students) {
            System.out.println(s);
        }

        session.close();
        factory.close();
    }
}