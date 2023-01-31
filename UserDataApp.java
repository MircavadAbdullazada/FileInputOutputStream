package input_output_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Name:"); String name=in.next();
		System.out.print("Surname:"); String surname=in.next();
		
		//get path of file
		File file=new File("user.txt");
		 String absolutePath= file.getAbsolutePath();
		 
		 //write to file
		 try(FileWriter fWriter =new FileWriter(absolutePath);
			BufferedWriter bWriter=new BufferedWriter(fWriter)){ 
			 bWriter.write("Name:"+name+"\n");
			 bWriter.write("Surname:"+surname);
			
		 }
		 	//read from file
		  try( FileReader fReader=new FileReader(absolutePath);
		   BufferedReader bReader=new BufferedReader(fReader)){
		   int data=fReader.read();
		   while(data!=-1) {
			   System.out.print((char)data);
			   data=fReader.read();
		   }
		  }
	}
}
