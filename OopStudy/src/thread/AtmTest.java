package thread;

public class AtmTest {

	public static void main(String[] args) {
		ATM atm =new ATM();
		Thread hong = new Thread(atm,"ȫ�浿");
		Thread lee = new Thread(atm,"�̼���");
		
		
		hong.start();
		lee.start();
	}

}
