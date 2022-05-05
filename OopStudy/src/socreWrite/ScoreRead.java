package socreWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ScoreRead {

	public static void main(String[] args) {
		// 파일에서 점수를 읽어와서 평균 총점 구하기
		
		int sum =0; //총점
		double avg=0; //평균
		int count=0; //갯수
		
		File file = new File("J:/temp/aaa/scoreData.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s=in.readLine();
			if(s!=null) {
				System.out.println("시험점수 : "+s); //입력한 점수가 쭉 적힘
				StringTokenizer st =new StringTokenizer(s,","); //문자를 자를수 있도록하는 기능이있다.
				while(st.hasMoreTokens()) {
					sum+=Integer.parseInt(st.nextToken());
					count++;//몇명인지 숫자
				}
				System.out.println("총점 : "+ sum);
				System.out.println("인원 : "+ count);
			
				avg=(double)sum/count;
				System.out.println("평균 : "+ avg);
			}
			in.close();
			
		} catch (Exception e) {}
		
		
	}

}
