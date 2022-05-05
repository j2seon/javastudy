package socreWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScoreWrite {
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		//���Ϸ� �л��� ���� ������ ����ϱ�
		
		int count=1; // ��� �Է��ߴ��� Ȯ���� ����
		String scoreData ="";//�л��� ������ ���� ����
		String s=null; 
		int num=0; // �Է��ϰ����ϴ� �л��� ����
		File file = new File("J:/temp/aaa/scoreData.txt");

			// �Է��ϰ����ϴ� ���� ���� 
			System.out.println("�л��� ���� �Է����ּ��� : ");
			num= scanner.nextInt();
			//�ֿܼ� �Է��ؼ� ���Ϸ� ������
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));
			
			do {
				System.out.println(count+"��° ������ �Է����ּ���");
				s=in.readLine();//���� ������ s�� ������ �Ҵ�
				if(checkNum(s)) {
					if(count!=num) {
						scoreData+=s+",";
					}else {
						scoreData+=s;
					}
					count++;
				}else { 
					System.out.println("���ڸ� �Է����ּ���");
				}
			}while(count<=num);
			
			out.println(scoreData);
			in.close();
			out.close();
		} catch (Exception e) {}
		System.out.println("���������� ���Ͽ� ����մϴ�.");
	}
	public static boolean checkNum(String str) { //�ֿܼ� �޴°� �������� Ȯ���ϴ� �޼ҵ�
		try {
			Integer.parseInt(str);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
