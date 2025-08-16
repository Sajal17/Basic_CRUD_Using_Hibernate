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

      // delete data

        Transaction transaction=session.beginTransaction();

        Student s=session.find(Student.class,104);
        session.remove(s);
        transaction.commit();
        session.close();
        factory.close();

    }
}
