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
		
		System.out.println("LogIn�� ���ؼ� ID�� ��й�ȣ�� �Է����ּ���!");
		System.out.println("ID �Է� : ");
		String id = scanner.nextLine();
		System.out.println("��й�ȣ �Է� : ");
		String pw = scanner.nextLine();
		int pass=0; //�α��� �����ϸ� 1 �����ϸ� 0
		
		File file = new File("J:/temp/aaa/text_1.txt");
		
		try {
			FileReader fileReader = new FileReader(file); //������ ���� �� 
			BufferedReader bufferedReader = new BufferedReader(fileReader); //���� ���� ���ۿ� ����.
			
			String line;
			try {
				while ((line=bufferedReader.readLine())!=null) {
					System.out.println(line.indexOf(id)+"\t"+line.indexOf(pw)); //�дµ����Ͱ� ���ؽ��� �ִٸ� ? �ε����� ��ȯ ������� -1�� ��ȯ�ȴ�!!!
					int passid=line.indexOf(id);//�н��Ǿ����� ��� Ȯ���� ���� ���� (���� ��� -1)
					int passpw=line.indexOf(pw);
					if(passid!=-1 && passpw!=-1) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						pass=1;
					}
				}
				if(pass==0) {
					System.out.println("�α��ο� �����߽��ϴ�.");
				}
				bufferedReader.close();
			} catch (IOException e) {}
		} catch (FileNotFoundException e) {}  
		
	}

}
