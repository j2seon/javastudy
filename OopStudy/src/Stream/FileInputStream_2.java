package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException   {

		//입력할 파일 만들기
		File file = new File("J:/temp/text_1.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했습니다.");
			}
		}
		
		//원래 try catch 구문을 사용한다.
		InputStream is1 = null;
//		
//		try {
//			is1= new FileInputStream(file);
//			int data;
//			while((data=is1.read())!=-1) {
//				System.out.print((char)data);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("읽어오지 못했습니다.");
//		}
		
		
		//한글로 읽을 수 있게됌. 해당파일이 지금 utf-8이여서 utf-8타입으로 읽을 수 있다.
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
		
		//정리 ! 영문은 byte 배열에 담지 않고 char로 변환하면 출력이 가능하지만 한글은 아님
		//따라서 byte배열에 저장후 그 테이터를 어떤 문자로 가져올껀지 지정해야한다.
		
		
		
		
		
		
	}

}
