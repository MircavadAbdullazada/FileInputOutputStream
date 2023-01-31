package input_output_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		 try {
	            // "First" adlı fayl yaratmaq
	            File file = new File("First.txt");
	            if (file.createNewFile()) {
	                System.out.println("Fayl uğurla yaradıldı.");
	            } else {
	                System.out.println("Fayl artıq mövcuddur.");
	            }
	            
	            // Fayla "Hello world+fayl adı" yazmaq
	            FileWriter writer = new FileWriter(file);
	            writer.write("Hello world First.txt");
	            writer.close();
	            
	            System.out.println("Məlumat fayla yazıldı.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	
	try {
        // Yaradılmış "First.txt" faylından oxumaq
        FileReader inputFile = new FileReader("First.txt");
        BufferedReader reader = new BufferedReader(inputFile);
        String line;
        
        // Yeni fayl yaratmaq
        FileWriter outputFile = new FileWriter("Second.txt");
        BufferedWriter writer = new BufferedWriter(outputFile);
        
        // Oxunan məlumatı yeni faylda yazmaq
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
        
        // Faylları bağlamaq
        reader.close();
        writer.close();
        
        System.out.println("Fayl uğurla yazıldı.");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
	
}	
	
