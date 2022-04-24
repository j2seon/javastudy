package Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class FileOutputStream_2 {

	public static void main(String[] args) throws IOException {
		//앞에는 한글출력시 깨질수도있다. 파일의 변환 타입에 따라서!
		
		File file = new File("J:/temp/text_5.txt");
		
		OutputStream op = new FileOutputStream(file);
		byte[] b1 ="안녕하세용ms에용".getBytes(Charset.forName("MS949"));
		
		op.write(b1);
		op.flush();
		op.close();
		
		
		//아마깨질거임! 왜냐 파일자체가 MS949 인데 utf로 출력했으니까. 
		OutputStream op2 = new FileOutputStream(file, true);
		byte[] b2 ="안녕하세용utf".getBytes(Charset.forName("UTF-8"));
		
		op2.write(b2);
		op2.flush();
		op2.close();
		
		
		

	}

}
