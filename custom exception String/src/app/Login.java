package app;

import java.util.Scanner;

import Exception.InvalidNameException;

public class Login {
	
	public static void main(String[] args) throws InvalidNameException {
		
		try(Scanner sc = new Scanner(System.in))
		{
		System.out.println("Enter First name");
		String fname = sc.next();
		System.out.println("Enter Last name");
		String lname = sc.next();
		
		if(fname.length()>=15 && lname.length()>=15)
			throw new InvalidNameException("Please enter valid name");
		else
			System.out.println(fname+" "+lname);
		
		}
		catch (InvalidNameException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
