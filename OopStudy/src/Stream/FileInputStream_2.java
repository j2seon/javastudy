package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException   {

		//�Է��� ���� �����
		File file = new File("J:/temp/text_1.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("������ ������ ���߽��ϴ�.");
			}
		}
		
		//���� try catch ������ ����Ѵ�.
		InputStream is1 = null;
//		
//		try {
//			is1= new FileInputStream(file);
//			int data;
//			while((data=is1.read())!=-1) {
//				System.out.print((char)data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�о���� ���߽��ϴ�.");
//		}
		
		
		//�ѱ۷� ���� �� �ְԉ�. �ش������� ���� utf-8�̿��� utf-8Ÿ������ ���� �� �ִ�.
		byte [] b1 = new byte[100];
		int data;
		try {
			is1= new FileInputStream(file);
			while((data=is1.read(b1))!=-1) {
				String str= new String(b1,0, data, Charset.forName("UTF-8"));
				System.out.println(str);
			}
		}catch (Exception e) {
		}finally {
			if(is1!=null) {
				try {
					is1.close();
				}catch (Exception e) {}
			}
		}
		
		//���� ! ������ byte �迭�� ���� �ʰ� char�� ��ȯ�ϸ� ����� ���������� �ѱ��� �ƴ�
		//���� byte�迭�� ������ �� �����͸� � ���ڷ� �����ò��� �����ؾ��Ѵ�.
		
		
		
		
		
		
	}

}
