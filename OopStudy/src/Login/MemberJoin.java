package Login;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	
	static Scanner scanner =new Scanner(System.in);
	
	public static void main(String[] args) {
		
		File file = new File("J:/temp/aaa/text_1.txt");
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			if(file.isFile()&&file.canWrite()) {
				System.out.println("회원가입을 위해서 ID와 비밀번호를 입력해주세요");
				System.out.println("ID 입력 : ");
				fileWriter.append(scanner.nextLine());
				fileWriter.append("\t");
				System.out.println("비밀번호 입력 : ");
				fileWriter.append(scanner.nextLine());
				fileWriter.append("\r");
				System.out.println("회원가입이 완료되었습니다.");
			}
			fileWriter.close(); 
		} catch (IOException e) {}
		

	}

}
