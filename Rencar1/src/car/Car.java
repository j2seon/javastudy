package car;

import base.Base;

public class Car extends Base {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carmaker;
	
	//���� ������ȸ �޼���
	public String checkCarInfo() {
		System.out.println("��Ʈī ���� ��ȸ �ð� : "+showTime());
		System.out.println("��Ʈī ������ ��ȸ�մϴ�.");
	
		return "��ȸ�� ����������µɰž�";
	
	}
	//���� ���
	public void regCarInfo() {
		System.out.println("����� �ð� : "+showTime());
		System.out.println("���ο� ��Ʈī�� ����մϴ�.");
	}
	
	// ������ ����
	public void modCarInfo() {
		System.out.println("������ �ð� : "+showTime());
		System.out.println("��Ʈī ������ �����մϴ�.");
	}
	
	//������ �����ϴ� �޼ҵ�
	public void delCarInfo() {
		System.out.println("��Ʈī ���� ���� �ð� : "+showTime());
		System.out.println("��Ʈī ������ �����մϴ�.");
	}
	
	
	
	
	
}
