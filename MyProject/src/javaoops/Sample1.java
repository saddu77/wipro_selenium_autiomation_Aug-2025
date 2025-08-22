package javaoops;

class Person{
	int id=101;
	String name="Alex";
	
	void getInfo() {
		System.out.println(id + " " + name);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.getInfo();
	}

}
