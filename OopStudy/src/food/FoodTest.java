package food;

public class FoodTest {

	public static void main(String[] args) {
		Food food =new Food();
		
	
		Waitor waitor =new Waitor("점원1", food);
		Chef chef =new Chef("요리사", food);
		
		waitor.start();
		chef.start();
	}

}
