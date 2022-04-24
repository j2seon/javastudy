package Stream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutput_1 {

	public static void main(String[] args) throws IOException {
		
		//콘솔에 내가 여기에 입력하는거 보이게 하기
		
		OutputStream os = System.out;
		os.write('J');
		os.write('\n');
		os.flush();
		
		
		byte[] b1 = "fggg".getBytes();
		os.write(b1);
		os.write('\n');
		os.flush();
		
		byte[] b2 = "ddddddddddddddddddddddddddddddd".getBytes();
		os.write(b2);
		os.flush();
		os.close();
		
	}

}
