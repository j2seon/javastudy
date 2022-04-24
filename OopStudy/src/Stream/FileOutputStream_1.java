package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_1 {

	public static void main(String[] args) throws IOException {
		//FildOutputStream 은 밖으로 내보내는 것 
		
		File file = new File("J:/temp/text_4.txt");
		
		//byte로 하나씩 쓰기
		OutputStream ops1= new FileOutputStream(file);
		
		ops1.write('j');
		ops1.write('a');
		ops1.write('v');
		ops1.write('a');
		ops1.write('\r');
		
		ops1.flush();
		ops1.close();
		
		//하나씩 말구! 한번에 내보내기
		OutputStream ops2= new FileOutputStream(file, true); //이어쓰기 //false가 덮어씀
		
		byte[] b1 = "진선 the last smile than first laughter".getBytes();
		ops2.write(b1,0,10); //출력되길바라는 길이 조절 가능!!!!!
		ops2.flush();
		ops2.close();

		
		
		
		
	}

}
