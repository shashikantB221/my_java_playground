package codes;

import java.util.Scanner;

import javax.management.ValueExp;

public class Reversing_Num_By_using_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("reversed string :"+rev);
		
		

	}

}
