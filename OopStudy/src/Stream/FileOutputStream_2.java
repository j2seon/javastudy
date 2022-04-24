package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		//�տ��� �ѱ���½� ���������ִ�. ������ ��ȯ Ÿ�Կ� ����!
		
		File file = new File("J:/temp/text_5.txt");
		
		OutputStream op = new FileOutputStream(file);
		byte[] b1 ="�ȳ��ϼ���ms����".getBytes(Charset.forName("MS949"));
		
		op.write(b1);
		op.flush();
		op.close();
		
		
		//�Ƹ���������! �ֳ� ������ü�� MS949 �ε� utf�� ��������ϱ�. 
		OutputStream op2 = new FileOutputStream(file, true);
		byte[] b2 ="�ȳ��ϼ���utf".getBytes(Charset.forName("UTF-8"));
		
		op2.write(b2);
		op2.flush();
		op2.close();
		
		
		

	}

}
