package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Write_1 {

	public static void main(String[] args) {
		
		// �⺻������ ms949��! ���� ������ �� ����!
		File w = new File("J:/temp/abc/read_2.txt");
		
		try (Writer w1 = new FileWriter(w);){
			w1.write("�ȳ��ϼ���".toCharArray());
			w1.write('\r');
			w1.write("jj");
			w1.flush();
			
		} catch (IOException e) {}
		
		
		
		//���� ���� ���� ����� �о�� 
		try (Reader reader =new FileReader(w);){
			int data;
			while((data=reader.read())!=-1) {
				System.out.println((char)data);
			}
		} catch (IOException e) {}
		
		
		// reader�� writer�� �⺻ ������ ms949�� 
		//���� ��ȯ��Ű���� ���� inpustreamreader/impustreamwriter�� �̿��ؾ��Ѵ�.
		//������ ms949�� ������⶧���� ������ ����� �����ϴ�.
	}

}
