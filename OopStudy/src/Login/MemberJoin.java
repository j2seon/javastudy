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
				System.out.println("ȸ�������� ���ؼ� ID�� ��й�ȣ�� �Է����ּ���");
				System.out.println("ID �Է� : ");
				fileWriter.append(scanner.nextLine());
				fileWriter.append("\t");
				System.out.println("��й�ȣ �Է� : ");
				fileWriter.append(scanner.nextLine());
				fileWriter.append("\r");
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}
			fileWriter.close(); 
		} catch (IOException e) {}
		

	}

}
