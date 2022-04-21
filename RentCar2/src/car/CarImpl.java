package car;

import base.Base;
import common.*;
import mem.MemeberVo;
public class CarImpl extends Base implements Car {
	String carData;
	
	//���� ������ȸ �޼���
	public String checkCarInfo(CarVo vo) throws CarException {
		carData="�� ��ȣ : "+vo.carNumber+","+
				"�� �̸� : "+ vo.carName+","+
				"�� ũ�� : "+vo.carSize+","+
				"�� ���� : "+vo.carColor+","+
				"������ : "+vo.carmaker;
	
		DataUtil.decodeData(carData);
		System.out.println("���� ������ ��ȸ�� �ð� : "+ showTime());
		System.out.println("����ī ������ ����մϴ�.");
		return carData;
	
	}
	//���� ���
	public void regCarInfo(CarVo vo) throws CarException{
		carData= vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
	
		DataUtil.encodeData(carData);

		System.out.println("����� �ð� : "+showTime());
		System.out.println("���ο� ��Ʈī�� ����մϴ�.");
	}
	
	// ������ ����
	public void modCarInfo(CarVo vo) throws CarException{
		carData=vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
		
		DataUtil.decodeData(carData);

		System.out.println("������ �ð� : "+showTime());
		System.out.println("��Ʈī ������ �����մϴ�.");
	}
	
	//������ �����ϴ� �޼ҵ�
	public void delCarInfo(CarVo vo) throws CarException {
		carData=vo.carNumber+","+
				vo.carName+","+
				vo.carSize+","+
				vo.carColor+","+
				vo.carmaker;
		
		DataUtil.encodeData(carData);

		
		System.out.println("��Ʈī ���� ���� �ð� : "+showTime());
		System.out.println("��Ʈī ������ �����մϴ�.");
	}
	
	
	
	
	
}
