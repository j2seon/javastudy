package exer3;

public class ProductArray1 {

	public static void main(String[] args) {

		String color=null;
		String code=null;
		String name=null; 
		int qty=0; //
	
		
		String[] str = new String[3];
		Product[] products= new Product[3];
		
		Product prod0=new Product();
		Product prod1=new Product("0002", "노트북", "노랑", 200);
		Product prod2=new Product("0003", "스마트티비", "흰색",300);
		
		str[0]= "홍길동";
		str[1]= "이순신";
		str[2]= "임꺽정";
		
		//products[0]="홍길동"; Product타입만 들어갈수있다.
		products[0]=prod0;
		products[1]=prod1;
		products[2]=prod2;
		System.out.println();
		
		for(int i=0; i<products.length;i++) {
			Product prod= products[i];
			code=prod.getCode();
			name=prod.getName();
			color=prod.getColor();
			qty=prod.getQty();
			
			System.out.println("제품번호 : "+ code);
			System.out.println("제품이름 : "+name);
			System.out.println("제품색상 : "+color);
			System.out.println("제품수량 : "+qty);
			System.out.println();
		}
		
	}

}
