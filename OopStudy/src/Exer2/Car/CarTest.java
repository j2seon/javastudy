package Exer2.Car;

public class CarTest {

	public static void main(String[] args) {
		
		MyCar m1 = new MySportCar(); //업캐스팅으로 사용가능
		MySportCar mySportCar = new MySportCar();
		MyCar m2 = new MyTruck();
		MyTruck myTruck = new MyTruck();
		
		
		System.out.println(MyCar.SAFE_SPEED);
		
		m1.speedUp();
		m2.speedUp();
		//m1.turbo();
		((MySportCar)m1).turbo(); //다운캐스팅
		mySportCar.speedDown();
		myTruck.stop();
		
		
		
	}

}
