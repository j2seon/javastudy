package Exer2.Car;

public class MySportCar implements MyCar{

	@Override
	public void speedUp() {
		System.out.println("SportsCar speedup");
	}

	@Override
	public void speedDown() {
		System.out.println("SportsCar speedDown");
		
	}

	@Override
	public void stop() {
		System.out.println("SportsCar stop");
		
	}
	public void turbo () {
		System.out.println("SportsCar turbo ");
	}

}
