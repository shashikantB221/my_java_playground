package create_delete_file;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filename = "demo.txt";
		File fobj = new File(filename);
		
		boolean status = false;
		
	status	= fobj.createNewFile();
		System.out.println("Status :"+status);
		

	}

}
