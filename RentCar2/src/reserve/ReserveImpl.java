package reserve;

import base.Base;
import common.DataUtil;

public class ReserveImpl extends Base implements Reserve{
	String resData;
	
	
	//���� ����
	public String ReserveCar(ReserveVo vo)throws ReserveException {
		resData=vo.resCarNumber +","+
				 vo.resDate+","+
				 vo.useBeginDate+","+
				 vo.retrunDate+",";
		
		DataUtil.encodeData(resData);
		System.out.println("��Ʈī ����ð� : "+showTime());
		System.out.println("��Ʈī�� �����մϴ�.");
		return resData;
				
	}
	
	//������������ �����ϴ¸޼ҵ�
	public void ModReserveCarInfo(ReserveVo vo)throws ReserveException {
		resData="������ȣ : "+vo.resCarNumber+","+
				"�������೯ : "+vo.resDate+","+
				"������۳�¥ : "+vo.useBeginDate +","+
				"�ݳ��ҳ�¥ : "+vo.retrunDate+",";
		
		DataUtil.decodeData(resData);
		System.out.println("��Ʈī ���� ���� ������ �ð� : "+showTime());
		System.out.println("������ �����մϴ�.");
	}
	
	//������ ���
	public void CancelReserveCarInfo(ReserveVo vo)throws ReserveException {
		resData=vo.resCarNumber +","+
				 vo.resDate+","+
				 vo.useBeginDate+","+
				 vo.retrunDate+",";
		
		DataUtil.decodeData(resData);
		
		System.out.println("��Ʈī ���� ����� �ð� : "+showTime());
		System.out.println("��������մϴ�.");
	}

	
	
	
}
