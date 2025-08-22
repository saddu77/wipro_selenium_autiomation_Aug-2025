package javaoops.interfce;
//Multiple Inheritance through interfaces
interface I2{
	void addition();
}

interface I3{
	void substraction();
}

public class Sample3 implements I2,I3 {
	public void addition() {
		System.out.println("Addition function");
	}
	
	public void substraction() {
		System.out.println("Substraction function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		obj.addition();
		obj.substraction();
	}
}
