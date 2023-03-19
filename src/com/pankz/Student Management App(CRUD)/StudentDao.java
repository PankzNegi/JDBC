package com.pankz.app;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static  boolean insertStudentToDB(Student st) { //make this function as static therefore no need to create object
	boolean f=false;
	
		//jdbc code
		try {
			Connection con=CP.createC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)"; //dynamic query(parameterized query)
			//Prepared Statements to fire above query
		PreparedStatement pstmt=con.prepareStatement(q); //Asking connection to give us the object of Prepared statement 
		
		//setting the value of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		//execute
		pstmt.executeUpdate();
		f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		
		//jdbc code
		try {
			Connection con=CP.createC();
			String q="delete from students where sid=?"; //dynamic query(parameterized query)
			//Prepared Statements to fire above query
		PreparedStatement pstmt=con.prepareStatement(q); //Asking connection to give us the object of Prepared statement 
		
		//setting the value of parameter
		pstmt.setInt(1, userId);
		
		//execute
		pstmt.executeUpdate();
		f=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllStudents() {
		

		
		//jdbc code
		try {
			Connection con=CP.createC();
			String q="select * from students"; 
		Statement stmt=con.createStatement(); //createStatement as their is no dynamic query
		ResultSet set=stmt.executeQuery(q); //here we are using executeQuery  becoz it brings the data
		while(set.next()) //run untill their is a next row in set
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			System.out.println("Phone : "+phone);
			System.out.println("City : "+city);
			System.out.println("+++++++++++++++++++");
			
		}
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
		
	}

		
		
	}

