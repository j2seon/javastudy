package Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ConsoleInput_1 {

	public static void main(String[] args) throws IOException {

		// �ַܼ� ���� �Է��� ���� ���̰��ϴ°� inputstream�� ���ؼ� �д´� .
		//�̷��� ���ڷ��Է������� byte�� ��ȯ�Ǿ�����⶧���� �̸� char�� �ٲ���Ѵ�!
		//1. �迭�� �����°ɷ� �����
		
		InputStream is =System.in;
		
		byte[] b1 =new byte[100];
		int data1= is.read(b1);
		String str= new String(b1,0,data1,Charset.defaultCharset());
		System.out.println(str);
		
		
		
		//reader�� �̿��ؼ� ���ڷ� �ٲ������
		Reader reader= new InputStreamReader(is);
		
		int data;
		while((data=reader.read())!='\r') {
			System.out.print((char)data);
		}
		while((data=reader.read())!='\r') {
			System.out.print((char)data);
		}
		is.close();
	}

}
