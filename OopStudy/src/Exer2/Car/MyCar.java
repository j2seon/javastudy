package Exer2.Car;

public interface MyCar {
	public static final int SAFE_SPEED =60; //도로주행 규정 속도
	//public int SAFE_SPEED=60; 가능 
	
	//차의 기본기능을 하는 메서드 
	public abstract void speedUp(); // 차의 속도를 높이는 메소드
	public abstract void speedDown();//차의 속도를 낮추는 메소드
	public abstract void stop(); //차를 정지시키는 메소드
}
