package car;

public interface Car {
	public abstract String checkCarInfo(CarVo vo); //����������ȸ
	public abstract void regCarInfo(CarVo vo);//�������
	public abstract void modCarInfo(CarVo vo);//������������
	public abstract void delCarInfo(CarVo vo);//�������� ����
}
