///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.manish.dao;
//
//
import com.manish.bean.StudentBean;

import com.manish.utility.ConnectionPool;
import java.sql.*;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

//
//public class StudentDAO{
// static Connection conn;
//public int addStudent(StudentBean sb){
//    int r=0;
//    //step1:
//    //step2:
//    conn=ConnectionPool.connectDB();
//    //step3: Wrtite SQL Query
//    int total=sb.getP()+sb.getC()+sb.getE()+sb.getH()+sb.getM();
//    float per=total/5.0f;
//    String sql="insert into student values('"+sb.getSid()+"','"+sb.getName()+"','"+sb.getEnroll()+"','"+sb.getP()+"','"+sb.getC()+"','"+sb.getM()+"','"+sb.getH()+"','"+sb.getE()+"','"+total+"','"+per+"')";
//     try {
//         //step4: Create Object of Statement
//         Statement stmt=conn.createStatement();
//         //step5: call executeUpdate()
//         r=stmt.executeUpdate(sql);
//         //step6: close the connection
//         conn.close();
//     } catch (SQLException ex) {
//         Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
//     }
//   return r;
//}
// public ArrayList<StudentBean>findAll(){
//        conn=ConnectionPool.connectDB();
//        ArrayList<StudentBean>list=new ArrayList<StudentBean>();
//        String sql="select * from student";
//       
////          
//// 
//    public static void main(String[] args) {
//        StudentBean sb=new StudentBean();
//        sb.setC(67);
//        sb.setE(78);
//        sb.setEnroll("123CS123");
//        sb.setH(67);
//        sb.setM(55);
//        sb.setName("Kartik");
//        sb.setP(66);
//        sb.setSid(1001);
//        StudentDAO sd=new StudentDAO();
//        int result=sd.addStudent(sb);
//        if(result>0){
//            System.out.println("Student Added Success");
//        }else{
//            System.out.println("Student Not Added");
//        }
//    }
//}
//
//







public StudentBean findBYID(int id){
    //Step1:
    //step2:
    StudentBean x=new StudentBean();
    conn = Connectionpool.connectDB();
 
    
    //step3: write sql query select 
    String sql = "select * from student where sid='"+id+"'";
        try {
            //step 4: create an object of Statement
            Statement stmt = conn.createStatement();
            // step5: call executequery method
            ResultSet rs = stmt.executeQuery(sql);
            //Step6: Extract data from the Resultset and add into ArrayList
            while(rs.next()){
                
                //Step 1: Fatch data from ressultSet and set into the bean
                x.setSid(rs.getInt("sid"));
                x.setName(rs.getString("name"));
                x.setEnroll(rs.getString("enroll"));
                x.setP(rs.getInt("p"));
                x.setC(rs.getInt("c"));
                x.setM(rs.getInt("m"));
                x.setH(rs.getInt("h"));
                x.setE(rs.getInt("e"));
                x.setTotal(rs.getInt("total"));
                x.setPer(rs.getFloat("per"));
                //step 2: add bean object into list
                return x;
                
             
            }
            //step7: close the connection
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return list;
    
 }
    public static void main(String[] args) {
        //4.call findall method
        StudentDAO sd = new StudentDAO();
        StudentBean sb =sd.findBYID(103);
       
            System.out.println("\t"+sb.getSid()+"\t"+sb.getName()+"\t"+s.getEnroll()+"\t"+s.getP()+"\t"+s.getC()+"\t"+s.getM()+"\t"+s.getH()+"\t"+s.getE()+"\t"+s.getTotal()+"\t"+s.getPer());
            
      
    }
}