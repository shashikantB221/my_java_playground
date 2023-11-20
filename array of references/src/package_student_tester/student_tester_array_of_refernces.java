package package_student_tester;

import java.util.Scanner;

import package_student.Student;

public class student_tester_array_of_refernces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[5];

		System.out.println("Accept student===");
		for (int i = 0; i <= st.length - 1; i++) {
			st[i] = Student.acceptStudent();
		}

		System.out.println(" \n\n displaying student===");
		for (Student s : st) {
			System.out.println(s.toString());
		}

		sc.close();

	}

}
