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
			System.out.println("선택하세요 >> 1. 회원 관리 / 2. 렌터카 관리 / 3. 예약관리 / 4. 종료");
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
		
		System.out.println("세부기능을 선택하세요>> 1. 회원등록 2.회원조회 3.회원수정 4.회원삭제 5. 되돌아가기");
		
		Scanner scanner =new Scanner(System.in);
		select=scanner.nextInt();
		switch(select) {
		case 1: 
			String data=null;
			System.out.println("회원정보를 입력하세요");
			memberVo=new MemeberVo();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("아이디를 입력하세요.");
			data=in.readLine();
			memberVo.setId(data);
			System.out.println("비밀번호를 입력하세요.");
			data=in.readLine();
			memberVo.setPassword(data);
			System.out.println("이름을 입력하세요.");
			data=in.readLine();
			memberVo.setName(data);
			System.out.println("주소를 입력하세요.");
			data=in.readLine();
			memberVo.setAddress(data);
			System.out.println("전화번호를 입력하세요.");
			data=in.readLine();
			memberVo.setPhoneNum(data);
			
			member.regMember(memberVo);
			break;
		
		case 2:
			String memdata=member.viewMember(memberVo);
			System.out.println("회원정보를 조회합니다.");
			System.out.println("=======================================");
			System.out.println(memdata);

		case 3:
			String moddata;
			System.out.println("수정하고싶은 인원의 id를 입력하세요");
			String id=scanner.next();
			
			
		}
	}

}
