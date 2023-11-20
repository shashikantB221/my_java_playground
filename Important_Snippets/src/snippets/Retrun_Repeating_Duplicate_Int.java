package snippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Retrun_Repeating_Duplicate_Int {

	public static void main(String[] args) {

		
		int arr[] = { 1,1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int size = arr.length;
		int ans[] = returnDupRep(arr, size);
		System.out.println("final ans : "+Arrays.toString(ans));

	}

	static int[] returnDupRep(int arr[], int size) 
	{
		int repeatedNum = -1;
		int missingNum = -1;
		for (int i = 0; i < size - 1; i++) 
		{
			for (int j = i + 1; j < size; j++) 
			{
				if (arr[i] == arr[j])
					repeatedNum = arr[j];
			}
		}
		
		System.out.println("repeatedNum :"+repeatedNum);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i : arr)
			ar.add(i);
		
		System.out.println("with duplicates :"+ar);
		ar.remove(repeatedNum);
		System.out.println("removed duplicate :"+ar);
		
		int arr2[] = new int[ar.size()];
		for(int i=0; i< ar.size(); i++)
		{
			arr2[i] = ar.get(i);
		}
		
		System.out.print("arr2 :"+Arrays.toString(arr2));
		System.out.println();
		
		
		for(int i = 0; i<= arr2.length-1; i++)
		{
			if(arr[i+1] - arr[i] != 1)
				missingNum = arr[i]+1;
				
		}
		
		System.out.println("missingNum :"+missingNum);
		
		int returnArr[] = {repeatedNum,missingNum};
		return returnArr;

	}

}
