package Exer;

public class CarTest {

	public static void main(String[] args) {
		//1. 변수선언
		Sedan sedan;
		Truck truck;
		Bus bus;
		
		//2. 인스턴스
		sedan= new Sedan("아반테", 60, 2000);
		truck = new Truck("1톤 트럭", 60, 2000, 1);
		bus = new Bus("100번 버스", 60 , 2000, 20, 1000);
		
		//차정보
		System.out.println(sedan.getCarInfo()+"입니다.");
//		System.out.println(truck.getCarInfo()+"입니다. "+" 적재량 : "+truck.getLoad());
		System.out.println(truck.getCarInfo());
		//속도증가
		truck.speedup(10);//트럭 속도증가
		truck.carLoad();;
		System.out.println(truck.getCarInfo());
		System.out.println("적재량 : "+truck.getLoad());
		
		//승객
		System.out.println(bus.getCarInfo()+"승객 수 : "+ bus.getPassenger()+ " 요금 : "+bus.getFee() );
		bus.ridePassenger(); //한명탑승
		System.out.println("승객수 : "+bus.getPassenger());
		
		
		bus.ridePassenger(5);
		System.out.println(bus.getPassenger());System.out.println(bus.getFee());
		
	}

}
