package Exer2.st;

public class University extends Student{
	private int course ;
	public University(String name, int grade, String teacher,int course) {
		System.out.println("University ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
		this.course=course;
	}
	
	public University() {
		this("ȫ�浿", 2, "�̼���", 20);
	}

	public int getCourse() {
		return course;
	}

	
	public String getStudInfo() {
		System.out.println(" University Ŭ������ getStudentInfo() ȣ��");
		return "�̸��� : "+ name + " �г��� : "+ grade+" ��û���� �� : "+course+"�Դϴ�.";  
	}
	
	
	@Override
	public String getTeacher() {
		System.out.println("University Ŭ������ getTeacher()�޼ҵ�");

		return "���������� : "+super.teacher;
	}
	
	
}