
public class Tester {

	public static void main(String[] args) {
		
		Fileprinter fp = new Fileprinter();
		fp.print();
		
		Networkprinter np = new Networkprinter();
		np.print();
		
		IPrinter ip[] = {new Networkprinter(), new Fileprinter()};
		
		for(IPrinter Ipr : ip)
		{
			if(Ipr instanceof Networkprinter)
				Ipr.print();
			else 
				System.out.println("Not a reference");
		}

	}

}
