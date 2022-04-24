package exer3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FruitTest1 {

	public static void main(String[] args) {
		String [] fruit= {"사과","바나나","귤","수박","사과",
					"사과","배","수박","바나나","배",
					"귤","배","사과","멜론","귤","바나나","레몬","사과","귤","귤"};
		
		
		String fruitname=null;
		int num=1;
		
		HashMap<String , Integer> map = new HashMap<>();
		
		for(int i=0; i<fruit.length; i++) {
			fruitname=fruit[i];
			Set set =map.keySet();
			Iterator<String> iterator = set.iterator();
			String name=null; //저장되어있는 과일의 이름 불러오기
			while(iterator.hasNext()) {
				name= iterator.next();
				 if(fruitname.equals(name)) {
					num= map.get(name);
					map.put(name, ++num);
					break;
				 }
			}//end while
			if(!fruitname.equals(name)) {
				map.put(fruitname, num);
			}
			num=1;
			
			
		}//end for
		
		System.out.println("과일개수출력하기");
		System.out.println("================");
	
		Set set= map.keySet();
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			fruitname=iterator.next();
			num= map.get(fruitname);
			
			System.out.println(fruitname+" : "+ num+"개");
			
		
		}
	}

}
