package Stream1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner scanner =new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("LogIn을 위해서 ID와 비밀번호를 입력해주세요!");
		System.out.println("ID 입력 : ");
		String id = scanner.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pw = scanner.nextLine();
		int pass=0; //로그인 성공하면 1 실패하면 0
		
		File file = new File("J:/temp/aaa/text_1.txt");
		
		try {
			FileReader fileReader = new FileReader(file); //파일을 읽을 것 
			BufferedReader bufferedReader = new BufferedReader(fileReader); //읽은 파일 버퍼에 저장.
			
			String line;
			try {
				while ((line=bufferedReader.readLine())!=null) {
					System.out.println(line.indexOf(id)+"\t"+line.indexOf(pw)); //읽는데이터가 인텍스에 있다면 ? 인덱스를 반환 없을경우 -1이 반환된다!!!
					int passid=line.indexOf(id);//패스되었는지 결과 확인을 위한 변수 (없을 경우 -1)
					int passpw=line.indexOf(pw);
					if(passid!=-1 && passpw!=-1) {
						System.out.println("로그인 되었습니다.");
						pass=1;
					}
				}
				if(pass==0) {
					System.out.println("로그인에 실패했습니다.");
				}
				bufferedReader.close();
			} catch (IOException e) {}
		} catch (FileNotFoundException e) {}  
		
	}

}
