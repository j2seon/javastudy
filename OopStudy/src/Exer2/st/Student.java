package Exer2.st;

public abstract class Student {
	String name;
	int grade;
	String teacher;	 //지도 담당선생님
	

	public Student() {
		System.out.println(" Student 생성자 호출 ");
	}


	public String getName() {
		return name;
	}


	public int getGrade() {
		return grade;
	}


	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudentInfo() 호출");
		return "이름은 : "+ name + " 학년은 : "+ grade+" 입니다.";  
	}
	
	
	//담당선생님이름을 출력하는 추상메소드
	public abstract String getTeacher();
	
}
