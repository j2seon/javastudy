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
		Product prod1=new Product("0002", "��Ʈ��", "���", 200);
		Product prod2=new Product("0003", "����ƮƼ��", "���",300);
		
		str[0]= "ȫ�浿";
		str[1]= "�̼���";
		str[2]= "�Ӳ���";
		
		//products[0]="ȫ�浿"; ProductŸ�Ը� �����ִ�.
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
			
			System.out.println("��ǰ��ȣ : "+ code);
			System.out.println("��ǰ�̸� : "+name);
			System.out.println("��ǰ���� : "+color);
			System.out.println("��ǰ���� : "+qty);
			System.out.println();
		}
		
	}

}
