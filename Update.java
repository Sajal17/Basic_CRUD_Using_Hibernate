package com.sa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

       /* Student s=new Student();
        s.setSid(104);
        s.setName("Mina");
        s.setSub("Biology"); */

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session=factory.openSession();


        // create a data

        // Transaction transaction=session.beginTransaction();
       // session.persist(s);
        //transaction.commit();

        // fetch the data

       // Student s1= session.find(Student.class,102);  //eager
      //  Student s2=session.byId(Student.class).load(103);
      //  Student s3=session.byId(Student.class).getReference(103); //lazy fetching
      //  System.out.println(s2);

      // Update data

     // Transaction transaction= session.beginTransaction();
     // session.merge(s);
     // transaction.commit();

      // delete data

        Transaction transaction=session.beginTransaction();

        Student s=session.find(Student.class,104);
        session.remove(s);
        transaction.commit();
        session.close();
        factory.close();

    }
}