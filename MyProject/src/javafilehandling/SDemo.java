package javafilehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Task implements Serializable{
	int num;
	String name;
	
	public Task(int num, String name) {
		
		this.num = num;
		this.name = name;
	}
	
	
}
public class SDemo {

	public static void main(String[] args) {
		Task tObj = new Task(101, "Alex");
		String filename ="my_file";
		
		// TODO Auto-generated method stub
		//serialization
		
		try {
			FileOutputStream f = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(f);
			out.writeObject(tObj);
			out.close();
			System.out.println("Object has been serilized ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Deserialization
		Task tObj1 = null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(fis);
			tObj1 = (Task) in.readObject();
			fis.close();
			in.close();
			System.out.println("Object has been De serialized");
			System.out.println("num= " + tObj1.num);
			System.out.println("name= " + tObj1.name);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
