package com.student.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.student.bean.Student;


public class StudentDao {

	static Connection c;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/capgemini","root","root@123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Student> getAllStudents(){
		List<Student> li=new ArrayList<Student>();
		Statement s;
		try {
			s = c.createStatement();
			ResultSet rs=s.executeQuery("select * from students");
			while(rs.next()) {
				li.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
