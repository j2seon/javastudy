package Exer2;

public class Number {
	private int num;
	static int numCount=10;
	public static int getNumCount() {
		return numCount;
	}
	
	public Number() {
		num=numCount;
	}
	public void increaseNum() {
		numCount++;
	}
	
	
}
