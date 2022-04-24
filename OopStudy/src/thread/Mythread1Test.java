package thread;

public class Mythread1Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" start");
		Runnable r1 = new Mythread1();
		Thread t1 = new Thread(r1);
		
		t1.start();

		try {
			t1.join(); //���ν����带 �����·� ������ t1������ ���۵�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(Thread.currentThread().getName()+ " end");
	}

}
