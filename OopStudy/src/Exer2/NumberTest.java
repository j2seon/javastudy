package Exer2;

public class NumberTest {

	public static void main(String[] args) {

		System.out.println("numCount 바로접근 : " + Number.numCount);
		
		Number number1= new Number();
		number1.increaseNum();
		System.out.println("numCount 바로접근 : " + Number.numCount);

		Number number2= new Number();
		number2.increaseNum();
		System.out.println("numCount 바로접근 : " + Number.numCount);



	}

}
