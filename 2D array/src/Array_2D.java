import java.util.Arrays;

public class Array_2D {

	public static void main(String[] args) {
	
		int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		/*
		 * for(int[] arr : a) { System.out.println(Arrays.toString(arr)); }
		 */
		
		for(int row[] : a)
		{
			for(int j : row)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
