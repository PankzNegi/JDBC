package com.pankz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {


	/*public void createTable() {
		try
		{
			Class.forName("org.postgresql.Driver");
			//STEP2: CREATE THE CONNECTION
			String user="postgres";
			String password="postgres";
			String url="jdbc:postgresql://localhost:5432/db";
			Connection con =DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
		
			String q="create table student (sid int, sname  VARCHAR(500), semail VARCHAR(500))";
			stmt.execute(q);
			System.out.println("Table created successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}*/

	public void createData() {
		try
		{
			Class.forName("org.postgresql.Driver");
			//STEP2: CREATE THE CONNECTION
			String user="postgres";
			String password="postgres";
			String url="jdbc:postgresql://localhost:5432/db";
			Connection con =DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
		
			String q="insert into student (sid,sname,semail) values(3,'Kushargra','kushagra@gmail.com')";
		
			stmt.executeUpdate(q); //insert new data
			System.out.println("inserted successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public void readData() {
		try
		{
			Class.forName("org.postgresql.Driver");
			//STEP2: CREATE THE CONNECTION
			String user="postgres";
			String password="postgres";
			String url="jdbc:postgresql://localhost:5432/db";
			Connection con =DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
		
			String q="select * from student";
			ResultSet rs=stmt.executeQuery(q); 
			while(rs.next())
			{

				System.out.println("id="+rs.getInt(1));
				System.out.println("name="+rs.getString(2));
				System.out.println("email="+rs.getString(3));
				System.out.println("++++++++++++++++++");
			}
			
			
			System.out.println("Read successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		
	}

	public void updateData() {
		try
		{
			Class.forName("org.postgresql.Driver");
			//STEP2: CREATE THE CONNECTION
			String user="postgres";
			String password="postgres";
			String url="jdbc:postgresql://localhost:5432/db";
			Connection con =DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
		
			String q="update student set sid='4' where sname='Kushargra'";
		
			stmt.execute(q); 
			System.out.println("updated successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
	
		
	}
	}

	public void deleteData() {
		try
		{
			Class.forName("org.postgresql.Driver");
			//STEP2: CREATE THE CONNECTION
			String user="postgres";
			String password="postgres";
			String url="jdbc:postgresql://localhost:5432/db";
			Connection con =DriverManager.getConnection(url, user, password);
			Statement stmt=con.createStatement();
		
			String q="delete from student where sid='4'";
		
			stmt.execute(q); 
			System.out.println("deleted successfully");
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
	
		
	}
		
	}
}
