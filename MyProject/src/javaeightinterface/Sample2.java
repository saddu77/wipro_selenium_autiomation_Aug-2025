package javaeightinterface;

interface I2{
	void m2();
	
	default void log(String msg) {
		System.out.println("I2 log:: " + msg);
	}
}
public class Sample2 implements I1,I2{
	
	public void m() {
		System.out.println("method() invoked !!!");
	}
	public void m2() {
		System.out.println("method2() invoked !!!");
	}
	
	@Override
	public void log(String str){
		System.out.println("Sample2 log::" + str);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2 obj = new Sample2();
		obj.m();
		obj.m2();
		obj.log("Start from a Sample2 Program !!!");
	}

}
