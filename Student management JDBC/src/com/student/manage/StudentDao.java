package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

	public static boolean addStudent(Student student) {
		
		
		
		try {
			
			boolean status = false;
			String q = "INSERT INTO students(sname,sphone,scity) VALUES(?,?,?)";
			Connection con = ConnectionClass.createConnection();
			PreparedStatement pst  = con.prepareStatement(q);
			pst.execute();
			status =  true;
			return status;
		
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

}
