package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws Exception {
		
		
		//���� �����
		File dir = new File("J:/temp");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		//���� �������� �����
		File dir2 = new File("J:/temp/abc");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		//���ϸ����
		File file = new File("J:/temp/text.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//������ ���� �б� -- > ����� ���� �� �ִ� �� �ѱ��� ???????
		InputStream is = new FileInputStream(file);
		
		int readdata ;//���� ����Ʈ��
		while((readdata=is.read())!=-1) {
			System.out.print((char)readdata);
		}is.close();
		
		
		
		
		
	}

}
