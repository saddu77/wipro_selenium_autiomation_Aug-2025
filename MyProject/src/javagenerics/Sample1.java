package javagenerics;

class Test<T>{
	
	T obj;
	
	Test(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> iObj = new Test<Integer>(20);
		System.out.println(iObj.getObject());
		
		Test<String> sObj = new Test<String>("welcome");
		System.out.println(sObj.getObject());
		
		
	}

}
