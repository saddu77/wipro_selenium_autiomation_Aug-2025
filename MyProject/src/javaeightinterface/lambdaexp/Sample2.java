package javaeightinterface.lambdaexp;

@FunctionalInterface
interface ZeroParameter{
	void display();
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroParameter obj = () -> System.out.println("This is zero-parmter lambda expression");
		obj.display();
	}

}
