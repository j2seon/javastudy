package exer3;

public class ThrowTest {
	public static void main(String[] args) {
		ArrayUtill t= new ArrayUtill();
		try {
			t.call();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		
	}

}
