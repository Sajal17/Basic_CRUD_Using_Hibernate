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
        
        // fetch the data

         Student s1= session.find(Student.class,102);  //eager
         Student s2=session.byId(Student.class).load(103);
         Student s3=session.byId(Student.class).getReference(103); //lazy fetching
         System.out.println(s2);

        session.close();
        factory.close();

    }
}
