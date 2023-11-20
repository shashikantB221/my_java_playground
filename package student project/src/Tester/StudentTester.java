package Tester;

import java.util.Scanner;

import P1.Student;
import P1.StudentUtility;

public class StudentTester {

	public static void main(String[] args) {
		// int id, String name, int age, String email, double marks1, double marks2,
		// double marks3
		Scanner sc = new Scanner(System.in);
		StudentUtility s = new StudentUtility();
		s.AcceptStudent(120, "Shashikant", 23, "Sb@mail.com", 81.00, 80.00, 90.00);
		s.displayStudent(120);
//		double avg = s.calculateAverage(81, 80.00, 90.00);
		System.out.println("Enter Student id for calculate average");
		
		int id = sc.nextInt();
		String calcAvg = s.calcAvg(id);
		System.out.println(""+calcAvg);
//		System.out.println("Average = "+avg);

	}

}
