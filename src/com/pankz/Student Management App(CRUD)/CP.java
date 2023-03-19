package com.pankz.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC() //This method gives us connection after creating it
	{
		// STEP 1:LOAD THE DRIVER
		//their is a forName method in class name "Class" give the name of that driver inside it.
	try
	{
		Class.forName("org.postgresql.Driver");
		//STEP2: CREATE THE CONNECTION
		String user="postgres";
		String password="postgres";
		String url="jdbc:postgresql://localhost:5432/Management";
		 con =DriverManager.getConnection(url, user, password);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	return con; //returning connection
	}

}
