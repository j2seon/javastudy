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
			System.out.println(horsenum+"�� ����"+100*i+"���� ����");
			if(horsenum==8 && i==5) {
				System.out.println("8���� yield()!!");
				Thread.yield();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}//end if
		}//end for
		System.out.println(horsenum+"�� ���� ��¼� ����");
	}

}
