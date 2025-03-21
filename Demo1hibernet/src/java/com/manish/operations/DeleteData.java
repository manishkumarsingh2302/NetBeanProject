
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.operations;

import com.manish.bean.Student;
import com.manish.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Admin
 */
public class DeleteData {
    public static void main(String[] args) {
        //step1:
        SessionFactory sf=HibernateUtil.getSessionFactory();
        //step2:
        Session session=sf.openSession();
        //step3:
        Student sb=new Student(121);
        //step4:
        session.delete(sb);
        Transaction tx=session.beginTransaction();
        //step5:
        tx.commit();
        System.out.println("Data deleted success");
        session.close();
        sf.close();
    }
 
}