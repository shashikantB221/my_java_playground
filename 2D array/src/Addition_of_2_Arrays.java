import java.util.Arrays;
import java.util.Scanner;

public class Addition_of_2_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];

		System.out.println("Enter array1 elemts");
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		

		int b[][] = new int[3][3];
		System.out.println("Enter array2 elemts");
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		

		int arr_c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				arr_c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		
		
		System.out.println("arr_c :");
		for(int[] ar : arr_c){System.out.println(Arrays.toString(ar));}

	}

}
