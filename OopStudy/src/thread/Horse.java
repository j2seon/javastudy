package thread;

public class Horse implements Runnable {
	private int horsenum;
	
	public Horse(int horsenum) {
		this.horsenum = horsenum;
	}

	@Override
	public void run() {
		long sleepTime = (long)(Math.random()*500);
		System.out.println(horsenum+"�� ����"+sleepTime+"��ŭ sleep");
		
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {}
		
		for(int i=1; i<=10; i++) {
			System.out.println(horsenum+"�� ����"+100*i+"���� ����");
		}
		System.out.println(horsenum+"�� ���� ��¼� ����");
		
	}



}
