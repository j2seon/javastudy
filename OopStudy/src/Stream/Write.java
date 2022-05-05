package Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) {
		File file = new File("J:/temp/abc/Write.txt");
		
		
		try {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter(file,true));
		String a;
			while((a=in.readLine())!=null) {
			out.println(a);
			}
		in.close();
		out.close();
		}catch(IOException e){
			System.out.println("¿À·ù");
		}
		
	}

}
