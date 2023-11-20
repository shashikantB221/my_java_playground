package package_student;

import java.util.Date;
import java.util.Scanner;

public class Student {

	static Scanner sc = new Scanner(System.in);
	private String name;
	private String email;
	private static int rollNo;
	private String dob;
	private static String clgNm;
	
	static {
		rollNo = rollNo + 1;
	}

	public Student(String name, String email, String dob, String clgNm) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		Student.clgNm = clgNm;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", dob=" + dob + ", clgNm=" + clgNm + "]";
	}
	
	
	public static Student acceptStudent()
	{
		System.out.println("Enter name, email, dob(YYYY-MM-DD), clgNm");
		@SuppressWarnings("deprecation")
		Student s = new Student(sc.next(), sc.next(),sc.next(), sc.next());
		return s;
	}
	
	
	

}
