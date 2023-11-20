package day7_2;

import java.util.Objects;

class Employee
{
	int empid;
	String name;
	Employee()
	{
		
	}
	Employee(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empid, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(name, other.name);
	}
	

	
	
	
}
public class Day7_2 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee(123,"akshita");
		Employee e2=new Employee(123,"akshita");
		System.out.println("E1 = "+e1+" E2 = "+e2);
		System.out.println("E1 == E2 "+(e1 == e2));
		System.out.println("E1.equals(e2) "+e1.equals(e2));
		System.out.println("E1 = "+e1.hashCode());
		System.out.println("E2 = "+e2.hashCode());
//		Employee e3=e1; //reference copy 
//		System.out.println("E1 == E3 "+(e1==e3));
//		System.out.println("E1.equals(e3) "+e1.equals(e3));
//		System.out.println("E1 = "+e1.hashCode());
//		System.out.println("E3 = "+e3.hashCode());
		
	}

}
