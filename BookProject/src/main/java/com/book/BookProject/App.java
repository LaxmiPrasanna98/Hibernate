package com.book.BookProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

       
        Book b1 = new Book();
        b1.setBid(100);
        b1.setBtitle("Monodb");
        b1.setBauthor("Vani ");
        b1.setBcategory("Programming");
        b1.setBprice(1000);
        b1.setBavaliablecopies(20);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Book.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

//       
//        session.persist(b1);
//        session.merge(b1);

//        Book b=session.get(Book.class,100);
//        System.out.println("Data fetced successfully");
        Book b=session.find(Book.class,100);
//        System.out.println(b);
        session.remove(b);

        tx.commit();

//        System.out.println("Book inserted successfully!");

        session.close();
        factory.close();
    }
}