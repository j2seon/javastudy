package Exer2.st;

public class StudentTest {

	public static void main(String[] args) {
		
		//Student student = new Student() ;
		Student student = new University("주진선", 1, "노경화", 18);
		Elementary elementary = new Elementary("이순신", 2, "차범근");
		
		//대학생의 정보
		System.out.println("대학생의 이름 >> "+student.getName());
		System.out.println(student.getTeacher());
		System.out.println(elementary.getTeacher());
		System.out.println(student.getStudInfo());
 		
	}

}
