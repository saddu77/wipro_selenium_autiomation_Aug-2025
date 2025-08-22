package javafilehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("myFile.txt");
			writer.write("Learning File Hanlding in Java !!!");
			writer.close();
			System.out.println("Successfully written...");
		}catch(IOException ex) {
			System.out.println("An error has occured...");
			ex.printStackTrace();
		}
	}

}
