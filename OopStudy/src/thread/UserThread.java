package thread;

public class UserThread extends Thread{
	private String tName=null;
	long sleepTime=0;
	
	public UserThread(String tName) {
		this.tName=tName;
	}

	@Override
	public void run() {
		if(tName.equals("first")) {
			sleepTime=500;
		}else if(tName.equals("second")) {
			sleepTime=300;
		}else if(tName.equals("Third")) {
			sleepTime=100;
		}
		
		System.out.println(tName+"¿Ã"+sleepTime+"∏∏≈≠ sleep..");
		
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1; i<=5; i++) {
			System.out.println(tName);
		}
	}
	
	
}
