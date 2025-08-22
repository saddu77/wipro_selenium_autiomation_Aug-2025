package javaeightinterface.lambdaexp;

@FunctionalInterface
interface Calculate{
	int operation(int x,int y);
}
public class Sample3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate add= (x,y) -> x + y;
		Calculate multiply= (x,y) -> x * y;
		Calculate subs= (x,y) -> x - y;
		Calculate div= (x,y) -> x / y;
		
		System.out.println(add.operation(10,20));
		System.out.println(multiply.operation(3, 4));
		System.out.println(subs.operation(50, 25));
		System.out.println(div.operation(100, 20));
	}
}
