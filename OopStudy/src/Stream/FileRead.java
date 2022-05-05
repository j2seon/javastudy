package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		
		File file = new File("J:/temp/abc/Write.txt");
		
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(file));
			String a=in.readLine();
			while(a!=null) {
			System.out.println("ÀÐÀ½ : "+a);
			a=in.readLine();
			}
			in.close();
		} catch (IOException e) {}
		
		
	}

}
