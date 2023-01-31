package input_output_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("new.txt");
		String absolutePath=file.getAbsolutePath();
		
		try {
			FileWriter fWriter=new FileWriter(absolutePath);
			 BufferedWriter bWriter=new BufferedWriter(fWriter);
			bWriter.write("First line \nSecond line"); //write a text
			bWriter.append("\nThird line");            //append a text
			bWriter.close();
			fWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
		
		  
		
	}

}
