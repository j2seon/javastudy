import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1. �л� �� : 5 ������ ���� �Է����� �� ArrayList�� capacity ũ������
 * 2. �����Է� : �Է¹��� �л����� ���� �����Է�. ArrayList�� ��ü�� ����
 * 3. ��������Ʈ : ArrayList�� ����� Student��ü�� �����ͼ� score ���
 * 4. �м� : �ְ��� : , ������� : 
 * 5. ����
 * */

class Student{
	int score;		//������ �Է� , �ʵ��� �� �Ҵ�(1. ��ü���� �� ����, 2. private(������, Setter,Getter�� ���ؼ�)

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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();		
            
            switch(selectNo) {
            case 1:
            	System.out.print("�л� ���� �Է��ϼ��� : ");
            	num=scanner.nextInt();
            	arr= new ArrayList<Student>(num);
            	System.out.println("�Է¿Ϸ�");
            	break;
            case 2:
            	for(int i=0; i<num; i++) {
            		System.out.println((i+1)+"��° �л��� ������ �Է����ּ���");
            		int sco = scanner.nextInt();
            		Student student = new Student(sco);
            		arr.add(student);
            		System.out.println("�Է¿Ϸ�");
            	}
            	break; 
            case 3:
            	for(int i=0; i<arr.size(); i++) {
            		Student student=arr.get(i);
            		System.out.println((i+1)+"��° �л��� ������ "+student.getScore()+"��");
            	}
            	break;
            case 4:
            	for(Student student : arr) {
            		if(max<student.getScore()) {
            			max=student.getScore();
            			sum+=student.getScore();
            		}
            	}
            	System.out.println("�ְ����� : "+max);
            	System.out.println("����� : "+(double)(sum/num));
            	break;
            case 5:
            	break;
            }
        }
        System.out.println("���α׷�����");
        scanner.close();
	}
}

