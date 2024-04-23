package day06Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try{
			findTheFile();
		} 
		catch(IOException e){
			System.out.println("there is no such file.");
            e.printStackTrace();
			System.out.println(e);
		}
	}
	
	public static void findTheFile() throws IOException{
		
		File newFile=new File("tejkbst.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	}
}
