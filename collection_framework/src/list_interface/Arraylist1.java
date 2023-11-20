package list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,23,0,30,3,0,3,0,5,6};
		System.out.println("arr[] :"+Arrays.toString(arr));
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(Integer i : arr)
			al.add(i);
		
		System.out.println("ArrayList :"+al.toString());
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		

	}

}
