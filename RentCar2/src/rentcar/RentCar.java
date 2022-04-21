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
		String memInfo; //ȸ�� ��ȸ
		String carInfo; 
		String resInfo;
		
		//ȸ������
		//ȸ���� �Է��� ������ vo�� ������
		try {
			MemeberVo memvo = new MemeberVo("","1234", "ȫ�浿" , "����� ���α�" , "010-123-3333");
			//vo�� �ִ� ������ memberimpl Ŭ������ ����
			Member member = new MemberImpl(); //��ĳ����
			//����ϱ�
			member.regMember(memvo);
			
			//���Ե� ȸ������ ��ȸ
			memInfo=member.viewMember(memvo);
			//����� �������̽��⶧���� displaydata�� ����.
			//memberimp�̻�ӹ޴� base�� �ش� �޼ҵ尡 ��ġ���ִ�.
			//���� impl�� ���� member�� base�� �ٲ���Ѵ�.
			((Base)member).displayData(memInfo);
		}catch(RentException e) {
			System.out.println(e.getRentExceptioninfo());
		}catch(Exception e2) {
			e2.printStackTrace();
		}
		
//		//���� ����ϱ�
//		CarVo carvo = new CarVo("�̼���", "1111", "red", 1000, "���");
//		//Car �������̽�Ÿ������ �����ϰ� �ִ� CarImplŸ������ ����
//		Car car= new CarImpl();	
//	
//		car.regCarInfo(carvo);
//		
//		//��ϵ� ���� ���� �ҷ�����
//		carInfo=car.checkCarInfo(carvo);
//		//car �������̽� �ȿ��� display�� ��� �̸� �ٲ�����Ѵ�.
//		((Base)car).displayData(carInfo);
//		
//		//���� ����
//		ReserveVo resvo = new ReserveVo("1212", "2022.4.21", "2022.5.5", "2022.5.6");
//		Reserve reserve= new ReserveImpl();
//		reserve.ReserveCar(resvo);
//		
//		//������� 
//		reserve.ModReserveCarInfo(resvo);
		
		
		
	}

}
