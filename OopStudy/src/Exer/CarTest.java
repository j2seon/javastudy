package Exer;

public class CarTest {

	public static void main(String[] args) {
		//1. ��������
		Sedan sedan;
		Truck truck;
		Bus bus;
		
		//2. �ν��Ͻ�
		sedan= new Sedan("�ƹ���", 60, 2000);
		truck = new Truck("1�� Ʈ��", 60, 2000, 1);
		bus = new Bus("100�� ����", 60 , 2000, 20, 1000);
		
		//������
		System.out.println(sedan.getCarInfo()+"�Դϴ�.");
//		System.out.println(truck.getCarInfo()+"�Դϴ�. "+" ���緮 : "+truck.getLoad());
		System.out.println(truck.getCarInfo());
		//�ӵ�����
		truck.speedup(10);//Ʈ�� �ӵ�����
		truck.carLoad();;
		System.out.println(truck.getCarInfo());
		System.out.println("���緮 : "+truck.getLoad());
		
		//�°�
		System.out.println(bus.getCarInfo()+"�°� �� : "+ bus.getPassenger()+ " ��� : "+bus.getFee() );
		bus.ridePassenger(); //�Ѹ�ž��
		System.out.println("�°��� : "+bus.getPassenger());
		
		
		bus.ridePassenger(5);
		System.out.println(bus.getPassenger());System.out.println(bus.getFee());
		
	}

}