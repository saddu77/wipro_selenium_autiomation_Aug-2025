package javaacessmodifers;

public class Sample1 {
	
	 static private int number = 20; //private
	 static int number1 = 30; // default
	 static protected int  number2 = 40; //protected
	 static public int number3 = 50; //public
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number is : " + number);
		System.out.println("Number1 is : " + number1);
		System.out.println("Numner2 is : " + number2);
		System.out.println("NUmber3 is : " + number3);
	}
}
