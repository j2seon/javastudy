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
		
		// 기본설정이 ms949임! 따로 설정할 수 없다!
		File w = new File("J:/temp/abc/read_2.txt");
		
		try (Writer w1 = new FileWriter(w);){
			w1.write("안녕하세여".toCharArray());
			w1.write('\r');
			w1.write("jj");
			w1.flush();
			
		} catch (IOException e) {}
		
		
		
		//위에 보낸 파일 여기로 읽어보기 
		try (Reader reader =new FileReader(w);){
			int data;
			while((data=reader.read())!=-1) {
				System.out.println((char)data);
			}
		} catch (IOException e) {}
		
		
		// reader나 writer은 기본 설정이 ms949임 
		//따라서 변환시키려면 따로 inpustreamreader/impustreamwriter를 이용해야한다.
		//지금은 ms949로 만들었기때문에 정상적 출력이 가능하다.
	}

}
