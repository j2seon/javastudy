package Stream;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutput_1 {

	public static void main(String[] args) throws IOException {
		
		//�ֿܼ� ���� ���⿡ �Է��ϴ°� ���̰� �ϱ�
		
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
