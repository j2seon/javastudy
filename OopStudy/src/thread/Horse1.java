package thread;

public class Horse1 implements Runnable {
	private int horsenum;
	
	
	public Horse1(int horsenum) {
		super();
		this.horsenum = horsenum;
	}

	@Override
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println(horsenum+"번 말이"+100*i+"미터 도착");
			if(horsenum==8 && i==5) {
				System.out.println("8번말 yield()!!");
				Thread.yield();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//end if
		}//end for
		System.out.println(horsenum+"번 말이 결승선 도착");
	}

}
