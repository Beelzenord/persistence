/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author fauzianordlund
 */
public class StudentDAO {
    static  Session session = null; 
    
    public static void insert(Student s){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        tx.commit();
      //  session.flush();
        session.close();
    }
    public static void main(String[] args){
        Student student = new Student("John","Smith");
        insert(student);
    }
}
