package javaoops;

class Employee{
	int e_id;
	String e_name;
    // Default constructor
	Employee(){
		System.out.println("Default constructor executed!!!");
	}
	//Parameterized constructor
	Employee(int e_id,String e_name){
		this.e_id = e_id;
		this.e_name = e_name;
	}
	
	void getInfo(){
		System.out.println(this.e_id + " " + this.e_name);
	}
	
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eObj = new Employee(101,"Alex");
		eObj.getInfo();
		
		Employee eObj1 = new Employee(102,"Bob");
		eObj1.getInfo();
		
	}

}
