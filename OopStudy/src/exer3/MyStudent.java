package exer3;

public class MyStudent {
	String name;
	int kor;
	int eng;
	int total;
	
	public MyStudent() {}

	@Override
	public String toString() {
		String info= name +"�� �������� >>"+ 
						"���� : "+kor+"���� : "+eng+"���� :"+total;
		return info;
	}
	
	
}
