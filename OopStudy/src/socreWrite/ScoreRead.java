package socreWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class ScoreRead {

	public static void main(String[] args) {
		// ���Ͽ��� ������ �о�ͼ� ��� ���� ���ϱ�
		
		int sum =0; //����
		double avg=0; //���
		int count=0; //����
		
		File file = new File("J:/temp/aaa/scoreData.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s=in.readLine();
			if(s!=null) {
				System.out.println("�������� : "+s); //�Է��� ������ �� ����
				StringTokenizer st =new StringTokenizer(s,","); //���ڸ� �ڸ��� �ֵ����ϴ� ������ִ�.
				while(st.hasMoreTokens()) {
					sum+=Integer.parseInt(st.nextToken());
					count++;//������� ����
				}
				System.out.println("���� : "+ sum);
				System.out.println("�ο� : "+ count);
			
				avg=(double)sum/count;
				System.out.println("��� : "+ avg);
			}
			in.close();
			
		} catch (Exception e) {}
		
		
	}

}
