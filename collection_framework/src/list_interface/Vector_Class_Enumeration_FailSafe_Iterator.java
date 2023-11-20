package list_interface;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Class_Enumeration_FailSafe_Iterator {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		System.out.println(vec);
		Enumeration<Integer> e = vec.elements();
		Integer element = null;
		while(e.hasMoreElements())
		{
			element = e.nextElement();
			System.out.print(element+" ");
			
			if(element == 30)
				vec.add(100);
				
		
			
			
		}
		
		
		System.out.println(vec);
		

	}

}
