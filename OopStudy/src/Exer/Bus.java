package Exer;

public class Bus extends Car{
	private int passenger;
	private int fee;
	
	public Bus(String carName, int velocity,int carSize,int passenger, int fee) {
		System.out.println("����������ȣ��");
		super.carName=carName;
		super.velocity=velocity;
		super.carSize=carSize;
		this.passenger=passenger;
		this.fee=fee*passenger;
	
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	public void ridePassenger() {
		if(passenger>0) { 
			passenger++;
		    fee+=1000;
		}
	}
	public void ridePassenger(int pass) {
		passenger+=pass;
		fee+=pass*1000;
	}
	
}