package food;

public class Food {
	public synchronized void receiverOrder(String waitor) {
		for(int i=0; i<5;i++) {
			System.out.println(waitor+"�� �ֹ��� �޽��ϴ�.");
		}
		System.out.println(waitor+"�� �ֹ��� �����մϴ�.");
		System.out.println();
	}
	
	public synchronized void makeFood(String chef) {
		for(int i=0; i<5;i++) {
			System.out.println(chef+"�� ������ ����ϴ�.");
		}
		System.out.println(chef+"�� ������ �ٸ�������ϴ�.");
		System.out.println();
	}
}
