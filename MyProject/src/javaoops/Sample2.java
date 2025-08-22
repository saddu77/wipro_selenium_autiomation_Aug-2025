package javaoops;

class Student{
	int s_id;
	String s_name;
	
	//Default constructor
	Student(){
		s_id=101;
		s_name="John";
		
		System.out.println("Default constructor gets executed...");
	}
	
	void getInfo() {
		System.out.println(s_id + " " + s_name);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sObj = new Student();
		sObj.getInfo();
	}

}
