package Exer;

public class Car {
	 String carName;
	 int velocity;
	 int carSize;
	 
	 
	 Car(){
		 System.out.println(" CAR의 생성자 호출 ");
	 }
	 //차의 공통기능
	 public void speedup(int speed) {
		 velocity+=speed;
		 
	 }
	 public void speedDown(int speed) {
		 velocity-=speed;
	 }
	 public void stop() {
		 velocity=0;
	 }
	 public String  getCarInfo() {
		 return carName + "의 속도는 "+ velocity;
	 }
	 
	 
	 
}
