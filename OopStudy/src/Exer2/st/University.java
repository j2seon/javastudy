package Exer2.st;

public class University extends Student{
	private int course ;
	public University(String name, int grade, String teacher,int course) {
		System.out.println("University 생성자 호출");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
		this.course=course;
	}
	
	public University() {
		this("홍길동", 2, "이순신", 20);
	}

	public int getCourse() {
		return course;
	}

	
	public String getStudInfo() {
		System.out.println(" University 클래스의 getStudentInfo() 호출");
		return "이름은 : "+ name + " 학년은 : "+ grade+" 신청학점 은 : "+course+"입니다.";  
	}
	
	
	@Override
	public String getTeacher() {
		System.out.println("University 클래스의 getTeacher()메소드");

		return "지도교수님 : "+super.teacher;
	}
	
	
}
