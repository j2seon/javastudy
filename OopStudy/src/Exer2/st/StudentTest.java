package Exer2.st;

public class StudentTest {

	public static void main(String[] args) {
		
		//Student student = new Student() ;
		Student student = new University("������", 1, "���ȭ", 18);
		Elementary elementary = new Elementary("�̼���", 2, "������");
		
		//���л��� ����
		System.out.println("���л��� �̸� >> "+student.getName());
		System.out.println(student.getTeacher());
		System.out.println(elementary.getTeacher());
		System.out.println(student.getStudInfo());
 		
	}

}