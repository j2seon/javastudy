package threadflag;

public class FlagTest {

	public static void main(String[] args) {
		White white = new White();
		Blue blue = new Blue();
		
		Thread t1=new Thread(white);
		Thread t2=new Thread(blue);
		
		t1.start();
		t2.start();
		
	}

}
