package javafilehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File obj = new File("myfile.txt");
			Scanner reader = new Scanner(obj);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}
