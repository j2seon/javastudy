package food;

public class FoodTest {

	public static void main(String[] args) {
		Food food =new Food();
		
	
		Waitor waitor =new Waitor("����1", food);
		Chef chef =new Chef("�丮��", food);
		
		waitor.start();
		chef.start();
	}

}
