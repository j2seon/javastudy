package Exer;

public class Truck extends Car{
	
	private int load; // ȭ����
	
	public Truck(String carName, int velocity,int carSize,int load) {
		super.carName=carName;
		super.velocity=velocity;
		super.carSize=carSize;
		this.load=load;
		
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}

		//1�澿 ��ݰ�
	public void carLoad() {
		if(load>0) {
			load++;
		}else {
			load=0;
		}
	}

	@Override
	public String getCarInfo() {
		
		return "���̸�" + carName+ "�ӵ�"+ velocity +" ���緮�� "+ load+ "�Դϴ�";
	}
	
	
}