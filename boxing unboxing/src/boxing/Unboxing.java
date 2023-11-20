package boxing;

public class Unboxing {

	public static void main(String[] args) {
		String str = "1245";
		System.out.println(str);
		
		int int1 = Integer.parseInt(str);
		
		System.out.println("int1 = "+int1 );
		System.out.println(int1 + 10);
		
		Integer x = 10;
		 int x1 = x.intValue();
		 System.out.println("x1 = "+x1);
		 
		 String Str2 = "123456";
		 System.out.println("Str2 = "+Str2);
		 
		 Integer i1 = Integer.valueOf(Str2);
		 System.out.println("i1 = "+i1);
		 System.out.println("i1+2 = "+(i1+2));

	}

}
