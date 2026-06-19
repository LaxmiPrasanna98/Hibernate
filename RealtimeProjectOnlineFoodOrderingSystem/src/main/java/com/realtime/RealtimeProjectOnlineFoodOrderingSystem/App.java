package com.realtime.RealtimeProjectOnlineFoodOrderingSystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(OnlineFood.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        OnlineFood food = new OnlineFood();
        food.setId(10);
        food.setCustomerName("mani");
        food.setFoodItem("Chicken fry");
        food.setQuantity(1);
        food.setTotalAmount(200.0);
        food.setOrderDate("20-06-2026");
        food.setOrderStatus("On the way to Deliver");

        Transaction tx = session.beginTransaction();

//        session.persist(food);
//        session.merge(food);
//        System.out.println("Updated successfully");
//           OnlineFood f1=session.get(OnlineFood.class,10);
//           session.remove(f1);
       
//           System.out.println(f1);
        tx.commit();
//
//        System.out.println("Record Inserted Successfully!");

        session.close();
        factory.close();
    }
}