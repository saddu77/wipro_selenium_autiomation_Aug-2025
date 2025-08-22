package javawrapperclass;
//wrapper class
class Max{
	private int maxi = 0;
	private int size = 0;
	
	void insert(int x){
	 this.size++;
	 if(x <= this.maxi)
		 return;
	 this.maxi = x;
	}
	
	public int top() {
		return this.maxi;
	}
	
	public int elementNumber() {
		return this.size;
	}
}
public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max m = new Max();
		m.insert(12);
		m.insert(2);
		m.insert(44);
		
		System.out.println("Maximum ele: " + m.top());
		System.out.println("Number of elements inserted: " + m.elementNumber());
	}

}
