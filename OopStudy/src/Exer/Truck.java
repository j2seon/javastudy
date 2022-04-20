package Exer;

public class Truck extends Car{
	
	private int load; // 화물량
	
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

		//1톤씩 운반가
	public void carLoad() {
		if(load>0) {
			load++;
		}else {
			load=0;
		}
	}

	@Override
	public String getCarInfo() {
		
		return "차이름" + carName+ "속도"+ velocity +" 적재량은 "+ load+ "입니다";
	}
	
	
}
