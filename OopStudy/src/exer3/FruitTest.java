package exer3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FruitTest {

	public static void main(String[] args) {
		String [] fruit= {"���","�ٳ���","��","����","���","���","��","����","�ٳ���",
						"��","���","���","��","��","�ٳ���","�ٳ���","���","��","��"};
	
		boolean isExisted = false; //������ ������ �ִ��� Ȯ��
		String fruitName = null; //������ �����̸�
		int value=1; //������ ����
		
		HashMap<String , Integer> map = new HashMap<>() ; //������ ���� ��!
		
		for(int i=0; i<fruit.length; i++) {
			fruitName= fruit[i]; //�迭�� �ִ� �����̸��� �ϳ��� ��������.
			Set set = map.keySet(); //map�� Ű���� ������ �ͼ�
			Iterator iterator = set.iterator(); //�迭�� ���� ����.
			
			while(iterator.hasNext()) { //hashmap�� ����� key�� ������� ����.
				String name=(String) iterator.next();
				if(fruitName.equals(name)) { //������ value�� ���� �����ؾ��Ѵ�.
					value=map.get(name); //��� �̸����� ����Ǿ��ִ� ���� value ���� �����ͼ� �������ҰŴ�.
					map.put(name, ++value);
					isExisted=true ;// ���� �ֱ� ������ true 
					break; //���� �־ ������ȴ�.
				}
			}//end while
			
			//while�� �� ���Ҵµ��� �ش��̸��� ���� ������ ���� ����ϸ�ȴ�.
			if(isExisted==false) {
				map.put(fruitName, value);
			}
			value=1; //������ �� �ֵ� 0�� �Ǿ�ߵǼ� 
			isExisted=false;
		}//end for
		
		//����ϴ� ���
		System.out.println("���ϰ�������ϱ�");
		System.out.println("================");
		
		//����Ǿ��� map�� ������ȴ�/
		Set set= map.keySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			fruitName=(String) iterator.next();
			value= map.get(fruitName);
			
			System.out.println(fruitName+" : "+ value+"��");
		}
		
	}
}
