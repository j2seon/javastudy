package threadflag;

public class Blue implements Runnable{
	int count=0; //메시지 출력 횟수
	@Override
	public void run() {
		while(true) {
			System.out.println("청기올려");
			count++;
			
			int ranNum=(int)(Math.random()*500);
			
			if(ranNum%2==0) {
				Thread.yield();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(count==5) {
				count=0;
				Thread.yield();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
