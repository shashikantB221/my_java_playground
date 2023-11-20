package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	
	
	public static Connection createConnection() throws SQLException, ClassNotFoundException
	{
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/student_manage";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection(username, password, url);
		return cn;
	}
}
