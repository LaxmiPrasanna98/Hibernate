package com.demo.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {

     Alien a1 = new Alien();
    a1.setAid(7);
     a1.setAname("pandu");
      a1.setTech("EEE");
//      a1.setAid(6);
//      a1.setAname("vani");
//       a1.setTech("hibernate");

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(Alien.class);

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
                 session.persist(a1);
        session.beginTransaction();
//        session.merge(a1);
     
       System.out.println(a1);
//        Alien a=session.find(Alien.class,2);
//        session.remove(a);
       session.getTransaction().commit();
       
        session.close();
        factory.close();

    }
}