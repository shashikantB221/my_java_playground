package p1;

 class TestGeneric<T> {

	T obj;
	
	TestGeneric(T obj)
	{
		this.obj = obj;
	}
	
	void display()
	{
		System.out.println(this.obj);
	}
}

public class Test
{
	public static void main(String[] args) {
		TestGeneric<String> str = new TestGeneric<String>("Shashii..can");
		str.display();
		
		TestGeneric<Double> t2 = new TestGeneric<Double>(12.256);
		t2.display();
		System.out.println(t2.getClass());
	}
}
