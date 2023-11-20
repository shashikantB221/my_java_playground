
enum Color
{
	RED(1000),GREEN(100),BLUE(5456);

	private int i;

	Color(int i) {
		this.i = i;
	}
}


public class Enum1 {
	
	public static void main(String args[]) {

		System.out.println(Color.valueOf("BLUE"));
		System.out.println(Color.values());
	}
	
	
}