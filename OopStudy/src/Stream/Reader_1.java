package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Reader_1 {

	public static void main(String[] args) {

		//���ڸ� ���� �� �ִ�. -->�ش������� utf-8��.... �׷��� ������
		//FileReader�� ���ڵ� ������ �ȵ�. default Encoding �� ���.
		
		File file = new File("J:/temp/abc/read.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("������ ������ �� �����ϴ�.");
			}
		}
		
		try (Reader reader= new FileReader(file)){
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		System.out.println();
		
		//�׷� fileInputStream + inpuStreamReader�� �̿��ؼ� ������ �ȱ�������?
		
		try (InputStream is = new FileInputStream(file);
			 InputStreamReader im = new InputStreamReader(is,"UTF-8");	
				){
			int data;
			while((data=im.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println(im.getEncoding()); //���� ���ڵ���Ÿ����?
		} catch (IOException e) {}
		
		
		
		
		// ms�� �Ȱ� ���� ����Ʈ�غ��� --> ����!
		File file1 = new File("J:/temp/abc/read_1.txt");
		
		try (Reader reader1= new FileReader(file1)){
			int data;
			while((data=reader1.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		
		
		
		
		
	}

}
