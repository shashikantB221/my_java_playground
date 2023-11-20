public class Str1 {

	public static void main(String[] args) {
		String str = "ABCD";
		String str_rev = "";
		
		
		
		int length = str.length();
		
		
		for (int i = length-1 ; i>=0; i--) 
		{
			str_rev = str_rev + str.charAt(i);
		}
		
		System.out.println(str_rev);

	}

}
