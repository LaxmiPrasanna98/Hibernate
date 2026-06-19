package com.employee.EmployeeProject;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.student.StudentProject.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Employee e1=new Employee();
       e1.setEmpid(9);
       e1.setEmpname("maika");
       e1.setEmpdep("CSE");
       e1.setEmpsal(10000);
       e1.setJoiningDate(LocalDate.of(2027, 10, 1));
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       config.addAnnotatedClass(Employee.class);

       SessionFactory factory = config.buildSessionFactory();

       Session session = factory.openSession();
//       session.persist(e1);
//       session.merge(e1);
       Employee e=session.find(Employee.class,4);
       session.remove(e);
       Transaction tx = session.beginTransaction();
       tx.commit();
       
//       System.out.println(e1);
       session.close();
       factory.close();
    }
}
