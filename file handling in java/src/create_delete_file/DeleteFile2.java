package create_delete_file;

import java.io.File;

public class DeleteFile2 {

	public static void main(String[] args) {
		String name = "demo.txt";
		File f = new File(name);
		boolean delete = f.delete();
		System.out.println("Status "+delete);

	}

}
