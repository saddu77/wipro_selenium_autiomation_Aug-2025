package javaoops.encapsulation;

//POJO class: Plain Old Java Object
public class Employee {
	
	private int emp_id;
	private String emp_name;
	private String emp_email;
	
	//setters and getters
	
	void setEmpId(int emp_id){
		this.emp_id = emp_id;		
	}
	
	int getEmpId(){
		return this.emp_id;
	}
	
	void setEmpName(String emp_name) {
		this.emp_name = emp_name;
	}
	
	String getEmpName(){
		return this.emp_name;
	}
	
	void setEmpEmail(String emp_email){
		this.emp_email = emp_email;
	}
	
	String getEmpEmail() {
		return this.emp_email;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_email=" + emp_email + "]";
	}

	
	

	
	
	
}
