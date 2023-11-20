import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student{
	private int id;
	private String name;
	private String city;
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

public class StudentTester {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student(10, "BALRAM", "MATHURA");
		String pathname = "file.dat";
		ObjectOutputStream dos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(pathname))));
		
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(pathname))));

	}

}
