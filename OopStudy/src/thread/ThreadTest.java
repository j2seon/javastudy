package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1= new UserThread("first");
		Thread t2= new UserThread("second");
		Thread t3= new UserThread("Third");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
