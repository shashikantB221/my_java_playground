import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bianry1 {

	public static void main(String[] args) {
		final String filename = "data.dat";
		byte data = 123;
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try 
		{
			//write file
			fos = new FileOutputStream(new File(filename));
			fos.write(data);
			System.out.println("File written successfully");
			
			//read file
			fis = new FileInputStream(filename);
			byte read_data= (byte) fis.read();
			System.out.println("Data from file: "+read_data);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}

	}

}
