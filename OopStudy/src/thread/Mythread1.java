package thread;

public class Mythread1 implements Runnable{

	
	@Override
	public void run() {
		System.out.println("run");
		first();
	}


	public void first() {
		System.out.println("first");
		second();
	}


	public void second() {
		System.out.println("second");
		
	}
		
}
