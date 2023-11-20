
public class Student {

	String name;
	int rno;
	int marks;
	
	Student()
	{
		this("shashikant",1,60);
	}
	
	public Student(String name, int rno, int marks) {
		super();
		this.name = name;
		this.rno = rno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rno=" + rno + ", marks=" + marks + "]";
	}


    
 	
}

