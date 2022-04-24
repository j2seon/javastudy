package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStream_1 {

	public static void main(String[] args) throws Exception {
		
		
		//폴더 만들기
		File dir = new File("J:/temp");
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		//하위 폴더까지 만들기
		File dir2 = new File("J:/temp/abc");
		if(!dir2.exists()) {
			dir2.mkdirs();
		}
		
		//파일만들기
		File file = new File("J:/temp/text.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		
		//파일의 내용 읽기 -- > 영어는 읽을 수 있는 데 한글은 ???????
		InputStream is = new FileInputStream(file);
		
		int readdata ;//읽을 바이트수
		while((readdata=is.read())!=-1) {
			System.out.print((char)readdata);
		}is.close();
		
		
		
		
		
	}

}
