package exer3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FruitTest1 {

	public static void main(String[] args) {
		String [] fruit= {"���","�ٳ���","��","����","���",
					"���","��","����","�ٳ���","��",
					"��","��","���","���","��","�ٳ���","����","���","��","��"};
		
		
		String fruitname=null;
		int num=1;
		
		HashMap<String , Integer> map = new HashMap<>();
		
		for(int i=0; i<fruit.length; i++) {
			fruitname=fruit[i];
			Set set =map.keySet();
			Iterator<String> iterator = set.iterator();
			String name=null; //����Ǿ��ִ� ������ �̸� �ҷ�����
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
		
		System.out.println("���ϰ�������ϱ�");
		System.out.println("================");
	
		Set set= map.keySet();
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			fruitname=iterator.next();
			num= map.get(fruitname);
			
			System.out.println(fruitname+" : "+ num+"��");
			
		
		}
	}

}
