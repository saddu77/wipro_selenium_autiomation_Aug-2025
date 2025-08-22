package javafilehandling;

import java.io.File;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File obj = new File("info.txt");
		System.out.println("File created!!!");
		System.out.println(obj.getAbsolutePath());
	}

}
