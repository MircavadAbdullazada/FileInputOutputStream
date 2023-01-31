package input_output_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // FileReader = read the contents of a file as a stream of characters. 
  //              read() returns an int value which contains the byte value
  //              when read() returns -1, there is no more data to be r
		
		
		File file=new File("new.txt");
		String absolutePath=file.getAbsolutePath();
		
		try {
			FileReader fReader=new FileReader(absolutePath);
			BufferedReader bReader=new BufferedReader(fReader);
			int data=fReader.read();
			while(data!=-1) {
				System.out.print((char)data);
				 data=fReader.read();
			}
				fReader.close();
				bReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

}
