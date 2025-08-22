package javafilehandling;

import java.io.File;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("myfile.txt");
		if(obj.delete()) {
			System.out.println("Deleted File is: " + obj.getName());
		}else {
			System.out.println("Failed to delete a file...");
		}
	}

}
