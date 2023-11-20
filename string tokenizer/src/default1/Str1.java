package default1;

import java.util.StringTokenizer;

public class Str1 {

	public static void main(String[] args) {
		String st3 = "one,two,three,four,five";
		
		StringTokenizer st = new StringTokenizer("I | am | batman","|");
		StringTokenizer stk = new StringTokenizer(st3, ",");
		String bf = "";
		while(stk.hasMoreTokens())
		{
			 bf = stk.nextToken();
			System.out.println(bf);
		}
		
		System.out.println(bf+"...");
//		String token = null;
//		while(st.hasMoreTokens())
//		{
//			token = st.nextToken();
//			System.out.println(token);
//		}

	}

}
