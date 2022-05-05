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
		//파일로 학생의 시험 점수를 출력하기
		
		int count=1; // 몇개를 입력했는지 확인할 변수
		String scoreData ="";//학생의 점수를 넣을 변수
		String s=null; 
		int num=0; // 입력하고자하는 학생의 숫자
		File file = new File("J:/temp/aaa/scoreData.txt");

			// 입력하고자하는 숫자 적기 
			System.out.println("학생의 수를 입력해주세요 : ");
			num= scanner.nextInt();
			//콘솔에 입력해서 파일로 보내기
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(file,false));
			
			do {
				System.out.println(count+"번째 점수를 입력해주세요");
				s=in.readLine();//적은 점수가 s의 변수에 할당
				if(checkNum(s)) {
					if(count!=num) {
						scoreData+=s+",";
					}else {
						scoreData+=s;
					}
					count++;
				}else { 
					System.out.println("숫자만 입력해주세요");
				}
			}while(count<=num);
			
			out.println(scoreData);
			in.close();
			out.close();
		} catch (Exception e) {}
		System.out.println("시험점수를 파일에 출력합니다.");
	}
	public static boolean checkNum(String str) { //콘솔에 받는게 숫자인지 확인하는 메소드
		try {
			Integer.parseInt(str);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

}
