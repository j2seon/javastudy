package thread;

public class ATM implements Runnable {
	private long depositeMoney=10000;
	
	
	public long getDepositeMoney() {
		return depositeMoney;
	}


	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i <10 ; i++) {
				if(getDepositeMoney()<=0) break;
				withDraw(1000);
				if(getDepositeMoney()==2000||getDepositeMoney()==4000||
				getDepositeMoney()==6000||getDepositeMoney()==8000) {
					try {
						System.out.println("this.wait()ȣ��");
						this.wait();
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}else {
					System.out.println("this.notify() ȣ��");
					this.notify();
				}
			}
		}
	}
	public void withDraw(long money) {
		if(getDepositeMoney()>0) {
			depositeMoney-=money;
			System.out.println(Thread.currentThread().getName()+" : ");
			System.out.println("�ܾ� : "+ getDepositeMoney()+"��");
		}else {
			System.out.println(Thread.currentThread().getName()+" : ");
			System.out.println("�ܾ��� �����մϴ�.");

		}
	}
	

}
