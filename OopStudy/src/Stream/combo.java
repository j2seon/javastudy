package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class combo {

	public static void main(String[] args) {

		File file1 = new File("J:/temp/abc/test.txt");
		File file2 = new File("J:/temp/abc/test01.txt");

		InputStreamReader is;
		InputStreamReader is1;
		int data;
		
		
		//콘솔로 받은 in
		try (OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(file1),"MS949");) {
			
			is = new InputStreamReader(System.in,"MS949");
			
			System.out.println("입력하세요>>>");
			while((data=is.read())!='\r') {
				os.write((char)data);
			}
			
		} catch (Exception e) {}

		try (InputStreamReader ipr= new InputStreamReader(new FileInputStream(file1),"MS949");){
			while((data=ipr.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
	 
		try (OutputStreamWriter os2 = new OutputStreamWriter(new FileOutputStream(file2),"UTF-8");){
				is1= new InputStreamReader(System.in,"UTF-8");
				System.out.println("입력하세요>>>");
			while((data=is1.read())!='\r'){
				os2.write((char)data);
			}
		} catch (Exception e) {} 
		
		
		try (InputStream ip = new FileInputStream(file2);
				InputStreamReader is2= new InputStreamReader(ip, "UTF-8");){
			int data1;
			while((data1=is2.read())!=-1) {
				System.out.println((char)data1);
			}				
		} catch (IOException e) {}
	}

}
