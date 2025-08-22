package javagenerics;

class Test1<T,U>{
	T obj1;
	U obj2;
	
	Test1(T obj1, U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1<String,Integer> obj = new Test1<String,Integer>("John",101);
		obj.print();
	}

}
