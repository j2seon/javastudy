package rentcar;

import car.Car;
import mem.Member;
import reserve.Reserve;

public class RentCar {

	public static void main(String[] args) {
		String carInfo; //������
		String resDate; //����������ȸ ������
		
		//ȸ������
		Member member= new Member();
		member.regMember();
		
		//��Ʈī�� ��ȸ�Ѵ�.
		Car car = new Car();
		carInfo = car.checkCarInfo();
		car.displayData(carInfo);
		
		//����
		Reserve reserve =new Reserve();
		resDate=reserve.reserveCar();
		reserve.displayData(resDate);
	}

}