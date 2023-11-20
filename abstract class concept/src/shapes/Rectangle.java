package shapes;

public class Rectangle extends Shape {

	
	
	@Override
	public void area() 
	{
		double length, breadth, area;
		System.out.println("Enter length");
		length = sc.nextDouble();
		System.out.println("Enter breadth");
		breadth = sc.nextDouble();
		area = length * breadth;
		System.out.println("Area of rectangle = "+area+" units sq.");
		
	}

}


