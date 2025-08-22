package javacollections;

class Employee{
	String emp_name;
	int emp_id;
	
	public Employee(String emp_name, int emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) 
			return true;
		
		
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		Employee employee = (Employee) obj;
		return (employee.emp_name == this.emp_name && employee.emp_id == this.emp_id);
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.emp_id;
	}
	
}
public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Alex", 101);
		Employee emp2 = new Employee("Alen", 102);
		
		if(emp1.hashCode() == emp2.hashCode()) {
			if(emp1.equals(emp2)) {
				System.out.println("Both Objects are Equal");
			}else {
				System.out.println("Both Objects are Not Equal");
			}
		}else {
			System.out.println("Both Objecs are not equal. ");
		}
		
	}

}
