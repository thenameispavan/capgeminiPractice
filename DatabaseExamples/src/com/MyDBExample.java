package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDBExample {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini","root","root@123");
			System.out.println("connected");
			Statement st= c.createStatement();
			ResultSet rs= st.executeQuery("select name,doj from ems");
			while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getDate(2));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
