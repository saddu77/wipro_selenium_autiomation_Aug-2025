package javafilehandling;

import java.io.File;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("myfile.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("File created: " + obj.getName());
			}else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
