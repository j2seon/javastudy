package Exer2.st;

public class Elementary extends Student{
	public Elementary(String name, int grade, String teacher) {
		System.out.println("Elementary ������ ȣ��");
		super.name=name;
		super.grade=grade;
		super.teacher=teacher;
	}
	public Elementary() {
		this("ȫ�浿", 3, "�̼���");
		System.out.println("Elementary ������ ȣ�� ");
	}
	@Override
	public String getTeacher() {
		return "���Ӽ����� : "+super.teacher;
	}
	
	
	
	
	
}