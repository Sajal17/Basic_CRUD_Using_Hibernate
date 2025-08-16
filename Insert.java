package com.sa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        Student s=new Student();
        s.setSid(104);
        s.setName("Mina");
        s.setSub("Biology");

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session=factory.openSession();


        // create a data or insert data

        Transaction transaction=session.beginTransaction();
        session.persist(s);
        transaction.commit();

        session.close();
        factory.close();

    }
}
