package tester;

import shapes.*;

public class Main {
	public static void main(String[] args) {
		
	Shape sh[] = {new Circle(), new Rectangle()};
		
	//abstract class reference is used to store object of extended base classes
	
	sh[0].area();
	System.out.println();
	sh[1].area();
		  
		 
		
	}
}