package Exer;

public class Car {
	 String carName;
	 int velocity;
	 int carSize;
	 
	 
	 Car(){
		 System.out.println(" CAR�� ������ ȣ�� ");
	 }
	 //���� ������
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
		 return carName + "�� �ӵ��� "+ velocity;
	 }
	 
	 
	 
}
