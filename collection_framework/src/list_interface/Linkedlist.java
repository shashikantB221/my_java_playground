package list_interface;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		
		ListIterator<Integer> lt = ll.listIterator();
		
		System.out.print("List :");
		while(lt.hasNext())
		{
			//ll.add(100); 
			System.out.print(lt.next()+" ");
		}
		
		System.out.print("\nList :");
		
		while(lt.hasPrevious())
		{
			System.out.print(lt.previous()+" ");
		}
		
	}

}
