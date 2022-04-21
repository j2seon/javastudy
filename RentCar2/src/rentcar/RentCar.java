package rentcar;

import car.Car;
import car.CarImpl;
import car.CarVo;
import common2.RentException;
import mem.Member;
import mem.MemberImpl;
import mem.MemeberVo;
import reserve.Reserve;
import reserve.ReserveImpl;
import reserve.ReserveVo;
import base.Base;

public class RentCar {

	public static void main(String[] args) {
		String memInfo; //회원 조회
		String carInfo; 
		String resInfo;
		
		//회원가입
		//회원이 입력한 정보가 vo에 적히고
		try {
			MemeberVo memvo = new MemeberVo("","1234", "홍길동" , "서울시 구로구" , "010-123-3333");
			//vo에 있는 정보는 memberimpl 클래스에 전달
			Member member = new MemberImpl(); //업캐스팅
			//등록하기
			member.regMember(memvo);
			
			//가입된 회원정보 조회
			memInfo=member.viewMember(memvo);
			//멤버는 인터페이스기때문에 displaydata가 없음.
			//memberimp이상속받는 base에 해당 메소드가 위치해있다.
			//따라서 impl로 만든 member를 base로 바꿔야한다.
			((Base)member).displayData(memInfo);
		}catch(RentException e) {
			System.out.println(e.getRentExceptioninfo());
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
//		//차량 등록하기
//		CarVo carvo = new CarVo("이순신", "1111", "red", 1000, "기아");
//		//Car 인터페이스타입으로 구현하고 있는 CarImpl타입으로 선언
//		Car car= new CarImpl();	
//	
//		car.regCarInfo(carvo);
//		
//		//등록된 차량 정보 불러오기
//		carInfo=car.checkCarInfo(carvo);
//		//car 인터페이스 안에는 display가 없어서 이를 바꿔줘야한다.
//		((Base)car).displayData(carInfo);
//		
//		//차량 예약
//		ReserveVo resvo = new ReserveVo("1212", "2022.4.21", "2022.5.5", "2022.5.6");
//		Reserve reserve= new ReserveImpl();
//		reserve.ReserveCar(resvo);
//		
//		//예약수정 
//		reserve.ModReserveCarInfo(resvo);
		
		
		
	}

}
