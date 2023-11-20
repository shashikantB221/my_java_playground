package P1;

public class StudentUtility  {
	
	Student s;
	

	public void AcceptStudent(int id, String name, int age, String email, double marks1, double marks2, double marks3)
	{
		 s = new Student(id,name,age,email,marks1,marks2,marks3);
	}
	
	public void displayStudent(int id)
	{
		if(s.getId() == id)
		{
			System.out.println(s.toString());
		}
	}

	public double calculateAverage(double marks1, double marks2, double marks3)
	{
		double avg = marks1 + marks2 + marks3;
		return avg;
	}
	
	public String calcAvg(int id)
	{
		double avg=0.00;
		if(s.getId() == id) 
		{
			double[] tempMarks = s.getMarks(); 
			 avg = tempMarks[0]+tempMarks[1]+tempMarks[2];
			 return "average = "+avg;
		}
		else 
		return "Student does not exist!!!!";
	}
}
