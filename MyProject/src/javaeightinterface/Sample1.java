package javaeightinterface;

interface I1{
	void m();
	
	default void log(String msg) {
		System.out.println("I1 log:: " + msg);
	}
}
public class Sample1 implements I1{

	public void m() {
		System.out.println("method() invoked !!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj = new Sample1();
		obj.log("start of a program");
		obj.m();
	}

}
