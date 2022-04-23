import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1. 학생 수 : 5 임의의 값을 입력했을 때 ArrayList의 capacity 크기지정
 * 2. 점수입력 : 입력받은 학생수에 따라서 점수입력. ArrayList에 객체를 저장
 * 3. 점수리스트 : ArrayList에 저장된 Student객체를 가져와서 score 출력
 * 4. 분석 : 최고정 : , 평균점수 : 
 * 5. 종료
 * */

class Student{
	int score;		//점수를 입력 , 필드의 값 할당(1. 객체생성 후 직접, 2. private(생성자, Setter,Getter을 통해서)

	public int getScore() {
		return score;
	}
	public Student(int score) {
		this.score=score;
	}
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		int sum=0;
		int num=0;
		int max=0;
		
        boolean run = true;
        while(run) {			
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();		
            
            switch(selectNo) {
            case 1:
            	System.out.print("학생 수를 입력하세요 : ");
            	num=scanner.nextInt();
            	arr= new ArrayList<Student>(num);
            	System.out.println("입력완료");
            	break;
            case 2:
            	for(int i=0; i<num; i++) {
            		System.out.println((i+1)+"번째 학생의 점수를 입력해주세요");
            		int sco = scanner.nextInt();
            		Student student = new Student(sco);
            		arr.add(student);
            		System.out.println("입력완료");
            	}
            	break; 
            case 3:
            	for(int i=0; i<arr.size(); i++) {
            		Student student=arr.get(i);
            		System.out.println((i+1)+"번째 학생의 점수는 "+student.getScore()+"점");
            	}
            	break;
            case 4:
            	for(Student student : arr) {
            		if(max<student.getScore()) {
            			max=student.getScore();
            			sum+=student.getScore();
            		}
            	}
            	System.out.println("최고점은 : "+max);
            	System.out.println("평균은 : "+(double)(sum/num));
            	break;
            case 5:
            	break;
            }
        }
        System.out.println("프로그램종료");
        scanner.close();
	}
}

