package Exer2.Car;

public interface MyCar {
	public static final int SAFE_SPEED =60; //�������� ���� �ӵ�
	//public int SAFE_SPEED=60; ���� 
	
	//���� �⺻����� �ϴ� �޼��� 
	public abstract void speedUp(); // ���� �ӵ��� ���̴� �޼ҵ�
	public abstract void speedDown();//���� �ӵ��� ���ߴ� �޼ҵ�
	public abstract void stop(); //���� ������Ű�� �޼ҵ�
}