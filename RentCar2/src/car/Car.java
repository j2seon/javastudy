package car;


public interface Car {
	public abstract String checkCarInfo(CarVo vo) throws CarException ; //����������ȸ
	public abstract void regCarInfo(CarVo vo) throws CarException;//�������
	public abstract void modCarInfo(CarVo vo) throws CarException;//������������
	public abstract void delCarInfo(CarVo vo) throws CarException;//�������� ����
}
