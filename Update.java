package com.sa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session=factory.openSession();

      // Update data

      Transaction transaction= session.beginTransaction();
      session.merge(s);
      transaction.commit();

        session.close();
        factory.close();

    }
}
