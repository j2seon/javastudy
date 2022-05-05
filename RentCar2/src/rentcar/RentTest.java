package rentcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Member;
import java.util.Scanner;

import common2.RentException;
import mem.MemberImpl;
import mem.MemeberVo;

public class RentTest {

	public static void main(String[] args) {
		String memInfo;
		String carInfo;
		String resInfo;
		int choice;
		
		while(true){
			System.out.println("�����ϼ��� >> 1. ȸ�� ���� / 2. ����ī ���� / 3. ������� / 4. ����");
			Scanner scanner =new Scanner(System.in);
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				try {
					member();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (RentException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	private static void member() throws IOException,RentException{
		MemberImpl member =new MemberImpl();
		MemeberVo memberVo =null;
		int select ;
		
		System.out.println("���α���� �����ϼ���>> 1. ȸ����� 2.ȸ����ȸ 3.ȸ������ 4.ȸ������ 5. �ǵ��ư���");
		
		Scanner scanner =new Scanner(System.in);
		select=scanner.nextInt();
		switch(select) {
		case 1: 
			String data=null;
			System.out.println("ȸ�������� �Է��ϼ���");
			memberVo=new MemeberVo();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("���̵� �Է��ϼ���.");
			data=in.readLine();
			memberVo.setId(data);
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			data=in.readLine();
			memberVo.setPassword(data);
			System.out.println("�̸��� �Է��ϼ���.");
			data=in.readLine();
			memberVo.setName(data);
			System.out.println("�ּҸ� �Է��ϼ���.");
			data=in.readLine();
			memberVo.setAddress(data);
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			data=in.readLine();
			memberVo.setPhoneNum(data);
			
			member.regMember(memberVo);
			break;
		
		case 2:
			String memdata=member.viewMember(memberVo);
			System.out.println("ȸ�������� ��ȸ�մϴ�.");
			System.out.println("=======================================");
			System.out.println(memdata);

		case 3:
			String moddata;
			System.out.println("�����ϰ���� �ο��� id�� �Է��ϼ���");
			String id=scanner.next();
			
			
		}
	}

}
