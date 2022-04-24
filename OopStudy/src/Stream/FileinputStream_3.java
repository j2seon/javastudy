package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileinputStream_3 {

	public static void main(String[] args) {

		// try with resource 구문이용 --> close가 필요없게된다/
		
		//파일 생성(ms949) -->해당 파일이 ms949
		File file = new File("J:/temp/text_2.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {}
		}
		
		//배열만들고 try 구문에 inputstram 선언
		byte [] b1 = new byte[100];
		int data;
		
		try (InputStream is=new FileInputStream(file)){
			while((data=is.read(b1))!=-1) {
				String str= new String(b1,0,data,Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {}
		
		
		//파일 생성(utf-8) -->해당 파일이 ms949

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
