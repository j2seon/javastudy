package exer3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FruitTest {

	public static void main(String[] args) {
		String [] fruit= {"사과","바나나","귤","수박","사과","사과","귤","수박","바나나",
						"귤","사과","사과","배","배","바나나","바나나","사과","귤","귤"};
	
		boolean isExisted = false; //저장할 과일이 있는지 확인
		String fruitName = null; //저장할 과일이름
		int value=1; //과일의 갯수
		
		HashMap<String , Integer> map = new HashMap<>() ; //과일을 담을 곳!
		
		for(int i=0; i<fruit.length; i++) {
			fruitName= fruit[i]; //배열에 있는 과일이름을 하나씩 꺼낼거임.
			Set set = map.keySet(); //map의 키값을 가지고 와서
			Iterator iterator = set.iterator(); //배열의 값과 비교함.
			
			while(iterator.hasNext()) { //hashmap에 저장된 key를 순서대로 꺼냄.
				String name=(String) iterator.next();
				if(fruitName.equals(name)) { //같으면 value의 값만 증가해야한다.
					value=map.get(name); //헤당 이름으로 저장되어있는 맵의 value 값을 가져와서 재지정할거다.
					map.put(name, ++value);
					isExisted=true ;// 값이 있기 때문에 true 
					break; //값이 있어서 나가면된다.
				}
			}//end while
			
			//while을 다 돌았는데도 해당이름의 값이 없으면 새로 등록하면된다.
			if(isExisted==false) {
				map.put(fruitName, value);
			}
			value=1; //다음에 들어갈 애도 0이 되어야되서 
			isExisted=false;
		}//end for
		
		//출력하는 방법
		System.out.println("과일개수출력하기");
		System.out.println("================");
		
		//저장되어진 map을 꺼내면된다/
		Set set= map.keySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			fruitName=(String) iterator.next();
			value= map.get(fruitName);
			
			System.out.println(fruitName+" : "+ value+"개");
		}
		
	}
}
