package javaoops;

class Employee1{
	int emp_id;
	String emp_name;
	static String emp_company="Wipro";
	
	Employee1(int emp_id,String emp_name){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	void getEmpInfo(){
		System.out.println(this.emp_id + " " + this.emp_name + " " 
							+ emp_company);
	}
}


public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 empObj1 = new Employee1(101, "Alex");
		Employee1 empObj2 = new Employee1(102, "Bob");
		Employee1 empObj3 = new Employee1(103, "Clare");
		Employee1 empObj4 = new Employee1(104, "Emily");
		Employee1 empObj5 = new Employee1(105, "Daniel");
		
		empObj1.getEmpInfo();
		empObj2.getEmpInfo();
		empObj3.getEmpInfo();
		empObj4.getEmpInfo();
		empObj5.getEmpInfo();
	}

}
