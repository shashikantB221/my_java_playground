package shapes;

public class Circle extends Shape {

	@Override
	public void area() 
	{
		double radius;
		System.out.println("Enter radius ");
		radius = sc.nextDouble();
		System.out.printf("Area = %f",(Math.PI*radius*radius));
				
	}

}
