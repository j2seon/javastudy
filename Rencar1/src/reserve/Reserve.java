package reserve;

import base.Base;

public class Reserve extends Base{
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String retrunDate;
	
	//���� ����
	public String reserveCar() {
		System.out.println("��Ʈī ����ð� : "+showTime());
		System.out.println("��Ʈī�� �����մϴ�.");
		return "����� ���� ������µɰž�";
				
	}
	
	//������������ �����ϴ¸޼ҵ�
	public void modReserveCarInfo() {
		System.out.println("��Ʈī ���� ���� ������ �ð� : "+showTime());
		System.out.println("������ �����մϴ�.");
	}
	
	//������ ���
	public void cancelReserveCarInfo() {
		System.out.println("��Ʈī ���� ����� �ð� : "+showTime());
		System.out.println("��������մϴ�.");
	}
	
	
}