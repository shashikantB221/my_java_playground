package inheritance_;

 class Person {

	 int age;
	 String name;
	 
	 public Person()
	 {
		 System.out.println("Inside Person() ctor");
	 }
	 
	 public void display()
	 {
		 System.out.println("age "+this.age+"name "+this.name);
		 
	 }
}

 class Employee extends Person
 {
	 int salary;
	 String city;
	 
	 
	 public Employee()
	 {
		 System.out.println("Inside Employee() ctor");
	 }
	 
	 public void display()
	 {
		 System.out.println("age "+this.age+"name "+this.name+" salary "+this.salary+" city "+this.city);
		 
	 }
	 
	 
 }