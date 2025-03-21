/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.databaseoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class InsertData {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1: Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //step2: Create the Connection
        String url ="jdbc:mysql://localhost:3306/jan23";
        String un ="root";
        String ps="8797898075";
        Connection conn=DriverManager.getConnection(url, un, ps);
        //step3: Write Sql insert query
int sid=104;
String name="Shivam";
String enroll="123CS3";
int p=81;
int c=78;
int m=69;
int h=50;
int e=49;
int total=p+c+m+h+e;
float per=total/5.0f;
String sql="insert into student"
        + "

    
        
        
    }
    
}
