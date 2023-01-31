package input_output_stream;

import java.io.File;

public class File_IsExistApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("new.txt");
		
		if (file.exists()) {
			System.out.println(file.getName() +" file exists!");
			System.out.println(file.getPath());  // get pathname into a pathname string
			System.out.println(file.getAbsolutePath()); // get location of file
			System.out.println(file.isFile()); // check file is true(file) or false(folder)
			file.delete(); //delete file
		}else {
			System.out.println(file.getName() +" file doesn't exists!");
		}
	     
	
	
	}
}
