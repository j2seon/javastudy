package exer3;

public class ObjectArray3 {

	public static void main(String[] args) {

		String color=null;
		String code=null;
		String name=null; 
		int qty=0; //
		
		Object[] ob = new Object[5];
		Product prod = new Product();
		Product prod1=new Product("0002", "노트북", "노랑", 200);
		Product prod2=new Product("0003", "스마트티비", "흰색",300);
		
		ob[0]= "홍길동";
		ob[1]= prod;
		ob[2]= prod1;
		ob[3]= prod2;
		ob[4]= new Integer(123);
		System.out.println();
		
		for(int i=0; i<ob.length; i++) {
			if(ob[i] instanceof Product) {
				Product product=(Product)ob[i];
				color=product.getColor();
				code=product.getCode();
				name=product.getName();
				qty=product.getQty();
				
				System.out.println("제품번호 : "+ code);
				System.out.println("제품이름 : "+name);
				System.out.println("제품색상 : "+color);
				System.out.println("제품수량 : "+qty);
				System.out.println();
			}
		}
		
		
	}

}
