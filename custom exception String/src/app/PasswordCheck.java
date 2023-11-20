package app;

import java.util.Scanner;

import Exception.PasswordMismatchException;

public class PasswordCheck {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("[Enter New Password]");

			String enter_password = sc.next();

			System.out.println("[Confirm Password]");
			String re_enter_password = sc.next();

			if (enter_password.equals(re_enter_password))
				System.out.println("[=]{LOGIN SUCCESSFULL}[=]");
			else
				throw new PasswordMismatchException(" ");
		}catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			System.out.println("APP ENDED =================");
		}
	
	}

}
