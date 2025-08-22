package javathreads;

class Task1 implements Runnable{
	
	Task1(){
		System.out.println("Thread: " + Thread.currentThread().getName() + ", " +
	                        "State: New");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread: " + Thread.currentThread().getName() + ", " +
                "State: Running");
		for(int i = 4; i > 0; i--) {
			System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
		}
		System.out.println("Thread: " + Thread.currentThread().getName() + ", " +
                "State: Dead");
	}
	
}

public class ThreadsJoinDemo  {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread tObj1 = new Thread(new Task1(), "Scanning...");
		Thread tObj2 = new Thread(new Task1(), "Printing...");
		Thread tObj3 = new Thread(new Task1(), "Counting...");
		
		tObj1.start();
		tObj1.join();
		
		tObj2.start();
		tObj2.join();
		
		tObj3.start();		
	}
}
