@FunctionalInterface
interface add
{
	public int add(int a, int b);
}
public class Program {

	public static void main(String[] args) {
		
	add addition = (a,b) -> {return (a+b);};
	
	System.out.println(" addition of 5 + 7 = "+addition.add(5, 7));
	
		
	}

}
