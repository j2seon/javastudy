package food;

public class Waitor extends Thread{
	String waitor;
	Food food;
	
	public Waitor(String waitor, Food food) {
		this.waitor = waitor;
		this.food = food;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			food.receiverOrder(waitor);
		}
	}
	
	
}
