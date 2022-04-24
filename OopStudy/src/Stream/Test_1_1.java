package Stream;

import java.util.Scanner;

public class Test_1_1 {

	public static void main(String[] args) {
		int count=0;
		String str;
		System.out.println("문자를 입력하세요>>");
		try {
			while(true) {
			Scanner scanner =new Scanner(System.in);
			str=scanner.nextLine();
			System.out.println(str);
			}
		}catch (Exception e) {}
	}

}
