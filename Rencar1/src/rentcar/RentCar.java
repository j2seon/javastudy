package rentcar;

import car.Car;
import mem.Member;
import reserve.Reserve;

public class RentCar {

	public static void main(String[] args) {
		String carInfo; //차정보
		String resDate; //예약정보조회 데이터
		
		//회원가입
		Member member= new Member();
		member.regMember();
		
		//렌트카를 조회한다.
		Car car = new Car();
		carInfo = car.checkCarInfo();
		car.displayData(carInfo);
		
		//예약
		Reserve reserve =new Reserve();
		resDate=reserve.reserveCar();
		reserve.displayData(resDate);
	}

}
