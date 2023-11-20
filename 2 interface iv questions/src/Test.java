

public interface Test extends Test1,Test2,Test3 {
 default void ThisIsDefaultMtdOfTest() {
	 System.out.println("ThisIsDefaultMtdOfTest");
 }
}

interface Test1{
	void Method1();
	default void concreteMthd() {
		System.out.println("Concrete mtd of Test1 I/F");
	}
}

interface Test2{
	void Method2();
}

interface Test3{
	void Method3();
}

class A implements Test {

	
	
	@Override
	public void Method1() {
		System.out.println(" in A by  Method1()");
		
	}

	@Override
	public void Method2() {
		System.out.println(" in A by  Method2()");
		
	}

	@Override
	public void Method3() {
		System.out.println(" in A by  Method3()");
		
	}

	@Override
	public void concreteMthd() {
		System.out.println("From Class A");
	}
	
	
}

class Tester{
	public static void main(String[] args) {
		A a = new A();
		a.concreteMthd();
		a.Method1();
		a.Method2();
		a.Method3();
		a.ThisIsDefaultMtdOfTest();
		
//		Test t = new Test() {
//			
//			@Override
//			public void Method3() {
//				System.out.println("3");
//				
//			}
//			
//			@Override
//			public void Method2() {
//				System.out.println("2");
//				
//			}
//			
//			@Override
//			public void Method1() {
//				System.out.println("1");
//				
//			}
//		};
//		
//		t.Method1();
		
		
		
	}
}