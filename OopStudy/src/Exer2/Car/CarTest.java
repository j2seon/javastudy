package Exer2.Car;

public class CarTest {

	public static void main(String[] args) {
		
		MyCar m1 = new MySportCar(); //��ĳ�������� ��밡��
		MySportCar mySportCar = new MySportCar();
		MyCar m2 = new MyTruck();
		MyTruck myTruck = new MyTruck();
		
		
		System.out.println(MyCar.SAFE_SPEED);
		
		m1.speedUp();
		m2.speedUp();
		//m1.turbo();
		((MySportCar)m1).turbo(); //�ٿ�ĳ����
		mySportCar.speedDown();
		myTruck.stop();
		
		
		
	}

}