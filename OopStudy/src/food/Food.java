package food;

public class Food {
	public synchronized void receiverOrder(String waitor) {
		for(int i=0; i<5;i++) {
			System.out.println(waitor+"이 주문을 받습니다.");
		}
		System.out.println(waitor+"가 주문을 전달합니다.");
		System.out.println();
	}
	
	public synchronized void makeFood(String chef) {
		for(int i=0; i<5;i++) {
			System.out.println(chef+"가 음식을 만듭니다.");
		}
		System.out.println(chef+"가 음식을 다만들었습니다.");
		System.out.println();
	}
}
