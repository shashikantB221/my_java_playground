public class Str2 {

	public static void main(String[] args) {
		String str = "ABCD";
		String rev = "";
		
		System.out.println(" string : "+str);
		char[] a = str.toCharArray();
		for(int i = a.length-1 ; i>=0 ; i--)
		{
			rev = rev + a[i];
		}
		
		System.out.println("Reverse string : "+rev);

	}

}
