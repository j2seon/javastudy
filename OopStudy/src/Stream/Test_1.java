package Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_1 {

	public static void main(String[] args) {
		
		String msg=null;
		//이과정을 자바에서는 스캐너랑 같은 원리
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(is);
		
		try {
			msg=in.readLine();
			while(msg!=null) {
				System.out.println("읽음 : "+msg);
				msg=in.readLine();
			}
			is.close();
			in.close();
		} catch (IOException e) {}
		
		
	}

}
