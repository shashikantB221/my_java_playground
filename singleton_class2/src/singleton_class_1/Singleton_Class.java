package singleton_class_1;

public class Singleton_Class {

	static Singleton_Class SCL = new Singleton_Class();
	
	private Singleton_Class()
	{
		System.out.println("Singleton class ctor invoked==()==>{}");
	}
	
	public static Singleton_Class getSingleton_ClassInstance()
	{
		return SCL;
	}

}


/*
 class Singleton_main {

	public static void main(String[] args) {
		Singleton_Class sc1 = Singleton_Class.getSingleton_ClassInstance();
		Singleton_Class sc2 = Singleton_Class.getSingleton_ClassInstance();
		Singleton_Class sc3 = Singleton_Class.getSingleton_ClassInstance();
		Singleton_Class sc4 = Singleton_Class.getSingleton_ClassInstance();
		
		
			
	}

}

*/

