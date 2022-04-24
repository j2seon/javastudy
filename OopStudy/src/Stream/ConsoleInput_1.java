package Stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class ConsoleInput_1 {

	public static void main(String[] args) throws IOException {

		// 콘솔로 내가 입력한 값을 보이게하는것 inputstream을 통해서 읽는다 .
		//이러면 문자로입력했지만 byte로 변환되어버리기때문에 이를 char로 바꿔야한다!
		//1. 배열에 들어오는걸로 만들기
		
		InputStream is =System.in;
		
		byte[] b1 =new byte[100];
		int data1= is.read(b1);
		String str= new String(b1,0,data1,Charset.defaultCharset());
		System.out.println(str);
		
		
		
		//reader를 이용해서 문자로 바꿔버리기
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
