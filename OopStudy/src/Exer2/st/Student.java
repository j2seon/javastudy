package Exer2.st;

public abstract class Student {
	String name;
	int grade;
	String teacher;	 //���� ��缱����
	

	public Student() {
		System.out.println(" Student ������ ȣ�� ");
	}


	public String getName() {
		return name;
	}


	public int getGrade() {
		return grade;
	}


	public String getStudInfo() {
		System.out.println("Student Ŭ������ getStudentInfo() ȣ��");
		return "�̸��� : "+ name + " �г��� : "+ grade+" �Դϴ�.";  
	}
	
	
	//��缱�����̸��� ����ϴ� �߻�޼ҵ�
	public abstract String getTeacher();
	
}
