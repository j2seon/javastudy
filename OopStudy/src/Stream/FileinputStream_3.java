package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileinputStream_3 {

	public static void main(String[] args) {

		// try with resource �����̿� --> close�� �ʿ���Եȴ�/
		
		//���� ����(ms949) -->�ش� ������ ms949
		File file = new File("J:/temp/text_2.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {}
		}
		
		//�迭����� try ������ inputstram ����
		byte [] b1 = new byte[100];
		int data;
		
		try (InputStream is=new FileInputStream(file)){
			while((data=is.read(b1))!=-1) {
				String str= new String(b1,0,data,Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {}
		
		
		//���� ����(utf-8) -->�ش� ������ ms949

		File file1 = new File("J:/temp/text_3.txt");
		
		byte b2[] = new byte[100];
		int data_1;
		
		try (InputStream is1 = new FileInputStream(file1)){
			while((data_1=is1.read(b2))!=-1) {
				String str1 = new String(b2,0,data_1,Charset.forName("UTF-8"));
				System.out.println(str1);
			}
		} catch (Exception e) {}
		
		
		
		
		
	}

}
