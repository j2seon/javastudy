package Exer2.st;

public class Elementary extends Student{
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary 생성자 호출");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	public Elementary() {
		this("홍길동", 3, "이순신");
		System.out.println("Elementary 생성자 호출 ");
	}
	@Override
	public String getTeacher() {
		return "담임선생님 : "+super.teacher;
	}
	
	
	
	
	
}
