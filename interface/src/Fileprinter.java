
public class Fileprinter implements IPrinter{

	@Override
	public void print() {
		
		System.out.println("In FilePrinter class");
		System.out.println("a = "+IPrinter.a);
		
	}

}
