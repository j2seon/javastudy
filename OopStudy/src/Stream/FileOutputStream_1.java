package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		//FildOutputStream �� ������ �������� �� 
		
		File file = new File("J:/temp/text_4.txt");
		
		//byte�� �ϳ��� ����
		OutputStream ops1= new FileOutputStream(file);
		
		ops1.write('j');
		ops1.write('a');
		ops1.write('v');
		ops1.write('a');
		ops1.write('\r');
		
		ops1.flush();
		ops1.close();
		
		//�ϳ��� ����! �ѹ��� ��������
		OutputStream ops2= new FileOutputStream(file, true); //�̾�� //false�� ���
		
		byte[] b1 = "���� the last smile than first laughter".getBytes();
		ops2.write(b1,0,10); //��µǱ�ٶ�� ���� ���� ����!!!!!
		ops2.flush();
		ops2.close();

		
		
		
		
	}

}
