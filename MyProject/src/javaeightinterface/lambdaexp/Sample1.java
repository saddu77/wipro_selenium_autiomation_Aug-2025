package javaeightinterface.lambdaexp;
//interfaces with single abstract method

@FunctionalInterface
interface FuncInterface{
	
	void abstractFun(int x);
	
	default void func() {
		System.out.println("default function...");
	}
}
public class Sample1 {
//It represents the instances of functional interfaces
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                    // Lambda Expression
		FuncInterface obj = (int x) -> System.out.println(2 * x);
		obj.abstractFun(5);
	}
}
