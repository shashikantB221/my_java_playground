interface Executer
{
	public int execute(int a, int b);
}
public class Program2 {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) 
	{
		
	       Program2 pr = new Program2();
	       Executer ex = pr::add;
	      int result = ex.execute(10, 10);
	      System.out.println("res "+result);
	      
	      ex = pr::sub;
	     result = ex.execute(10, 10);
	     System.out.println("res "+result);

	}

}
