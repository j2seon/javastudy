package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Writer_2 {

	public static void main(String[] args) {
		
		File file = new File("J:/temp/abc/writ_2.txt");
		
		//utf로 꺼내기
		
		try (OutputStream os = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
				){
			osw.write("안녕하세요".toCharArray());
			osw.write('\r');
			osw.write("주진선\r입니다");
			osw.flush();
		} catch (IOException e) {}
		
	}

}
