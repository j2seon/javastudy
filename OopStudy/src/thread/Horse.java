package thread;

public class Horse implements Runnable {
	private int horsenum;
	
	public Horse(int horsenum) {
		this.horsenum = horsenum;
	}

	@Override
	public void run() {
		long sleepTime = (long)(Math.random()*500);
		System.out.println(horsenum+"번 말이"+sleepTime+"만큼 sleep");
		
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {}
		
		for(int i=1; i<=10; i++) {
			System.out.println(horsenum+"번 말이"+100*i+"미터 도착");
		}
		System.out.println(horsenum+"번 말이 결승선 도착");
		
	}



}
