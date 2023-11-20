import java.util.Date;

public class Employee {

	private int empid;
	private String name;
	private Date dob;
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dob=" + dob + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employee(int empid, String name, Date dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.dob = dob;
	}
	
	
	
	
}