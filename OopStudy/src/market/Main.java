package market;

public class Main {

	public static void main(String[] args) {
		MarketGood g1 = new MarketGood("MacBook Air", 1250000);
		MarketGood g2 = new MarketGood("MacBook Pro", 2990000, 15);
		MarketGood g3 = new MarketGood("iPhone 7", 920000, 20);
		
		System.out.println(g1.name+ "�� ������: " + g1.getDiscountRate() + "%");
		System.out.println(g2.name+"�� ������: " + g2.getDiscountRate() + "%");
		System.out.println(g3.name+"�� ���� ����: " + g3.retailPrice+"��");
		System.out.println(g3.name + "�� ���� ����: " + g3.getDiscountedPrice() + "��");
		System.out.println("���� ��ü�� �������� " + g3.name + "�� �������� 35%�� �ö����ϴ�.");
		g3.setDiscountRate(35);
		System.out.println(g3.name + "�� ���� ����: " + g3.getDiscountedPrice() + "��");
	}

}
