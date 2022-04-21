package exer3;

public class MyStudent {
	String name;
	int kor;
	int eng;
	int total;
	
	public MyStudent() {}

	@Override
	public String toString() {
		String info= name +"의 시험점수 >>"+ 
						"국어 : "+kor+"영어 : "+eng+"총점 :"+total;
		return info;
	}
	
	
}
