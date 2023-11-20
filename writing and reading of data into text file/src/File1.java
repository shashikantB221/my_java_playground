import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class File1 {

	public static void main(String[] args) {
		//BufferWriter --> fos -->
		String filename = "test.txt";
		
		try(BufferedWriter bw =  new BufferedWriter(new FileWriter(new File(filename)));
				BufferedReader br  = new  BufferedReader(new FileReader(new File(filename)));) 
		{
			
			
			bw.write("hello this is written in file");
			bw.newLine();
			bw.write("HELLO WORLD");
			
			System.out.println("File written........");
			
			
			String line = "";
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			System.out.println("File read..........");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}

	}

}
