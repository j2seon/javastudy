package exer3;

public class Product {
	private String code; //��ǰ��ȣ
	private String name; // ��ǰ�̸�
	private String color; //��ǰ����
	private int qty; //��ǰ�԰����

	public Product() {
		this("0001","����Ʈ��","���",100);
	}
	
	public Product(String code, String name, String color, int qty) {
		this.code = code;
		this.name = name;
		this.color = color;
		this.qty = qty;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
}
