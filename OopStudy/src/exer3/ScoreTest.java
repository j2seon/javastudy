package exer3;

public class ScoreTest {

	
	public static MyStudent clacTotal(String name, int kor, int eng) {
		MyStudent s1 = new MyStudent();
		s1.name=name;
		s1.eng=eng;
		s1.kor=kor;
		s1.total=eng+kor;
		return s1;
	}
	
	public static void main(String[] args) {
		MyStudent lee;
		MyStudent hong;
		
		lee=clacTotal("이순신", 90, 90);
		hong=clacTotal("홍길동", 80, 75);
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
