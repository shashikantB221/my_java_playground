package com.student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome");
		
		  while(true) {
		  
		  System.out.println("1.add student"); System.out.println("2.delete student");
		  System.out.println("3.show student"); System.out.println("4.update student");
		  System.out.println("5.exit");
		  
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		  int  choice = Integer.parseInt(br.readLine()); 
		  if(choice == 1) 
		  {
			  //add student
			  System.out.println("Enter name");
			  String name = br.readLine();
			  System.out.println("Enter phone");
			  int phone = Integer.parseInt(br.readLine());
			  System.out.println("Enter city");
			  String city = br.readLine();
			  boolean addStudent = StudentDao.addStudent(new Student(name, phone, city));
			  if(addStudent)
				  System.out.println("Student added succesfully");
			  else
				  System.out.println("Something went wrong");
		  
		  } 
		  else if(choice == 2) {
		  
		  } else if(choice == 3) {
		  
		  } else if(choice == 4) {
		  
		  } else { System.out.println("Exited...."); break; }
		  
		  
		  
		  
		  }
		 
  
	}
}

