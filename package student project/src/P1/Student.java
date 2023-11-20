package P1;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private int age;
	private String email;
	private double[] marks = new double[3];

//	public Student(int id, String name, int age, String email, double[] marks) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.marks = marks;
//	}

	public Student(int id2, String name2, int age2, String email2, double marks1, double marks2, double marks3) {
		this.id = id2;
		this.name = name2;
		this.age = age2;
		this.email = email2;
		this.marks[0] = marks1;
		this.marks[1] = marks2;
		this.marks[2] = marks3;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", marks="
				+ Arrays.toString(marks) + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

}
