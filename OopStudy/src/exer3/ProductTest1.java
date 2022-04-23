package exer3;

import java.util.ArrayList;
import java.util.List;

public class ProductTest1 {

	public static void getProdInfo(List<Product> list) {
		Product prod=null;
		String color=null;
		String code=null;
		String name=null; 
		int qty=0; 
		
		for(int i =0; i<list.size(); i++) {
			prod=list.get(i);
			code=prod.getCode();
			color=prod.getColor();
			name=prod.getName();
			qty=prod.getQty();
			System.out.println("¡¶«∞π¯»£ "+code);
			System.out.println("¡¶«ƒ¿Ã∏ß "+name);
			System.out.println("¡¶«∞ªˆ±Ú "+color);
			System.out.println("¡¶«∞ºˆ∑Æ "+qty);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Product> arr = new ArrayList<Product>();
		
		Product product1 = new Product();
		Product product2 = new Product("0002", "≥Î∆Æ∫œ", "≥Î∂˚", 200);
		Product product3 = new Product("00021", "≥Î∆Æ∫œ", "»Ú§¿§°", 200);
		
		arr.add(product1); arr.add(product2);arr.add(product3);
		
		getProdInfo(arr);
		
	}

}
