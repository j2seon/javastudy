package mem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import base.Base;
import common.DataUtil; 

public class MemberImpl extends Base implements Member{
	String memData; //전달받은 데이터를 받는 변수
	
	
	//회원 등록 메소드 // MemeberVo에서 등록하려는 회원의 정보를 MemeberVo타입으로 받기
	public void regMember(MemeberVo vo) throws MemberException, IOException {
		String id=vo.id;
		
		File file = new File("J:/temp/aaa/memberData.txt");
		
		PrintWriter out = new PrintWriter(new FileWriter(file,true));
		
		
		if(id==null || id.equals("")) {
			throw new MemberException("아이디는 필수 입력정보입니다.");
		}else {
		memData =vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
//		DataUtil.encodeData(memData);
		System.out.println("회원등록 시간 : "+showTime());
		out.println(memData);
		out.close();
		System.out.println("회원가입합니다.");
		}
	}
	
	// 기존 회원 조회
	public String viewMember (MemeberVo vo) throws MemberException, IOException {
		File file = new File("J:/temp/aaa/memberData.txt");
	
			BufferedReader in= new BufferedReader(new FileReader(file));
			String memData = "";
			String data = in.readLine();
			while(data!=null) {
				memData+=data+"\n";
				data=in.readLine();
			}
		
//		DataUtil.decodeData(memData); //복호화를 해서 읽을 수 있는 상태를 만들어야한다.
		System.out.println("회원 조회 시간 : "+showTime());
		return memData;
	}
		
	//회원정보수정
	public void modMember(MemeberVo vo) throws MemberException, IOException{
		File file = new File("J:/temp/aaa/memberData.txt");
		
			BufferedReader in= new BufferedReader(new FileReader(file));
			String memData = "";
			String data = in.readLine();
			while(data!=null) {
				StringTokenizer st= new StringTokenizer(data,",");
				 memData= st.nextToken();
//				if(memData.equals()) {
//					memData+=st;
//				}else {
//					in.readLine();
//				}
			}
		
//		DataUtil.encodeData(memData);

		System.out.println("수정한 시간 : "+showTime());
		System.out.println("회원정보를 수정합니다.");

	}
	//회원정보 삭제하는 메서드
	public void delMember(MemeberVo vo) throws MemberException{
		memData = vo.id+","+
				 vo.name+","+
				 vo.password+","+
				 vo.phoneNum+","+
				 vo.address;
		
		DataUtil.decodeData(memData); //복호화를 해서 읽읅 수 있는 상태를 만들어야한다.

		System.out.println("삭제한 시간 : "+showTime());
		System.out.println("회원정보가 삭제합니다.");

	}
	
	
	
	
	

}
