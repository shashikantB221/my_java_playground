package create_directory_or_folder;

import java.io.File;

public class Dir {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "MyDirectory";
		File f = new File(name);
		boolean Status = f.mkdir();
		System.out.println("Status "+ Status);
		
		
	}

}
