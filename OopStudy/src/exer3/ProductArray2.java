package exer3;


public class ProductArray2 {

	public static int calcProQty(Product[] prod) {
		int total=0; //제품의 총수량

		for(int i=0; i<prod.length;i++) {
			total+=prod[i].getQty();
		}
		return total;
		
		       
	}
	public static void main(String[] args) {
		
		int toProd=0;
		Product[] product= new Product[3];
		product[0]=new Product();
		product[1]=new Product("0001","스마트폰","흰색",100);
		product[2]=new Product("0001","스마트폰ss","ss",100);
		
		toProd=calcProQty(product);
		System.out.println(toProd );
		
		
		
	}

}
