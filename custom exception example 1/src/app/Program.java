package app;

import java.util.Scanner;

import custom_exception.NumberGreaterThanLimitException;

public class Program {

	public static void main(String[] args) throws NumberGreaterThanLimitException {
	
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number less than 100");
			
			int num = Integer.parseInt(sc.next());
			if(num > 100)
				throw new NumberGreaterThanLimitException("Number exceeding 100");
			else
				System.out.println("Final num"+num);
			
			
		}
		catch (NumberGreaterThanLimitException e) {
			System.out.println("Number greater than 100");
			
		}
		

	}

}
