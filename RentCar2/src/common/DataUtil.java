package common;

public class DataUtil { // ȭ�鿡�� ȸ���� �Է��ϴ� ������ ��ȣȭ�ϰ� ��ȣȭ�Ѵ�.
	// static���� �����ؼ� ������ �������϶� ���� ����� �� �ֵ��� ���� >> static �� ������ jvm�� �ڵ����� main�޼ҵ尡 ���۵ɶ� ���� ���۵ǵ��� �����. (��, ��� �����͸� �޴� ���·� ����)
	public static void encodeData(String data) { 
		System.out.println(data+"�� ��ȣȭ�մϴ�."); //���޹��� �����͸� ��ȣȭ�ؼ� ������Ű��
	}
	public static void decodeData(String data) { //��ȣȭ�� �����͸� �б� ���� ��ȣȭ �ϱ�
		System.out.println(data+"�� ��ȣȭ�մϴ�.");
	}
	

}
