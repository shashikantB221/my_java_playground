import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{

			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();

			int result = num1 / num2;
			System.out.println("result : " + result);
			
			
			
			System.out.println("Code reached here on last line");
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		

	}

}
