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

		//문자를 읽을 수 있다. -->해당파일이 utf-8임.... 그래서 깨지네
		//FileReader는 인코딩 설정이 안됨. default Encoding 만 사용.
		
		File file = new File("J:/temp/abc/read.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 생성할 수 없습니다.");
			}
		}
		
		try (Reader reader= new FileReader(file)){
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		System.out.println();
		
		//그럼 fileInputStream + inpuStreamReader를 이용해서 읽으면 안깨지겠지?
		
		try (InputStream is = new FileInputStream(file);
			 InputStreamReader im = new InputStreamReader(is,"UTF-8");	
				){
			int data;
			while((data=im.read())!=-1) {
				System.out.print((char)data);
			}
			System.out.println(im.getEncoding()); //현재 인코딩된타입은?
		} catch (IOException e) {}
		
		
		
		
		// ms로 된거 만들어서 프린트해보기 --> 가능!
		File file1 = new File("J:/temp/abc/read_1.txt");
		
		try (Reader reader1= new FileReader(file1)){
			int data;
			while((data=reader1.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {}
		
		
		
		
		
		
	}

}
