/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.dao;

import com.manish.utility.ConnectionPool;

/**
 *
 * @author DELL
 */
public class a2 {
    static Connection conn;
    public ArrayList<StudentBean>findAll(){
        conn=ConnectionPool.connectDB();
        ArrayList<StudentBean>list=new ArrayList<StudentBean>();
        String sql="select * from student";
        try
            Statment stmt=conn.createStatment();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                StudentBean();
                x.setSid(rs.get)
            
        }
    }
}
